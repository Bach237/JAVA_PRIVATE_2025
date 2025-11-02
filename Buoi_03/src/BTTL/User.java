package BTTL;

import java.util.UUID;

public class User {
    private String id;
    private String name;
    private double balance;

    public User( String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.balance = 0; // mặc định nếu không truyền vào
    }

    public User(String name, double balance) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public boolean withDraw(double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return String.format("id: %s - name: %s - balance: %.2f", id, name, balance);
    }
}
