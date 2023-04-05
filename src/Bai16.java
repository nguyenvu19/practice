import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nam;
        System.out.print("Nhập năm: ");
        nam = Integer.parseInt(scanner.nextLine());


        if ((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0) {
            System.out.println("Đây là năm nhuận");
        } else
            System.out.println("Đây không phải năm nhuận");
    }
}
