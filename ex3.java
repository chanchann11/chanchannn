import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu rong hinh chu nhat: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("nhap chieu dai hinh chu nhat: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("chu vi hinh chu nhat la: " + (double)(a+b)*2);
        System.out.println("dien tich hinh chu nhat: " + a*b);
    }
}
