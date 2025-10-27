import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int chon;
        do{
            TinhToan.menu();
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.print("Tổng các phẩn tử trong mảng = ");
                    System.out.println(TinhToan.tinhTong(a));
                    break;
                case 2:
                    System.out.println("Phần tử lớn nhất = " + TinhToan.inMax(a));
                    System.out.println("Phần tử nhỏ nhất = " + TinhToan.inMin(a));
                    break;
                case 3:
                    System.out.println("Mảng sau khi đã được sắp xếp: ");
                    TinhToan.sapXep(a);
                    break;
                case 4:
                    if(TinhToan.primeMax(a) != -1){
                        System.out.println("Số nguyên tố lớn nhất trong mảng = " + TinhToan.primeMax(a));
                    }else
                        System.out.println("Không có");
                    break;
                default:
            }

        }while(chon >= 1 && chon <= 4);
        System.out.println("Chương trình kết thúc!");
    }
}