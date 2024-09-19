import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi: ");
        String chuoi = sc.nextLine();
        int sokituchuoi = chuoi.length();
        System.out.println("so ki tu chuoi la: " + sokituchuoi);
    }
}
