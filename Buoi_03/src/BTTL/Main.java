package BTTL;

public class Main {
    // 5. Hàm chuyển tiền giữa 2 user
    public static void transferMoney(User from, User to, double amount) {
        System.out.println("\n" + from.getName() + " đang chuyển " + amount + " cho " + to.getName());
        if (from.withDraw(amount)) {
            to.deposit(amount);
            System.out.println("✅ Giao dịch thành công!");
        } else {
            System.out.println("❌ Số dư không đủ, giao dịch thất bại!");
        }
    }

    public static void main(String[] args) {
        // 1. Khởi tạo mảng 3 User
        User[] users = new User[3];
        users[0] = new User("Hải", 5000);
        users[1] = new User("Bách", 3000);
        users[2] = new User("Nam", 2000);

        // 2. In thông tin ban đầu
        System.out.println("=== Danh sách tài khoản ban đầu ===");
        for (User u : users) {
            System.out.println(u);
        }

        // 3. Thực hiện chuyển tiền
        transferMoney(users[0], users[1], 1000);
        transferMoney(users[1], users[2], 500);
        transferMoney(users[2], users[0], 10000);

        // 4. In thông tin sau khi chuyển
        System.out.println("\n=== Sau khi chuyển tiền ===");
        for (User u : users) {
            System.out.println(u);
        }
    }
}
