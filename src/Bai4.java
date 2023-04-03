import java.util.Scanner;

public class Bai4 {
    public static Scanner scanner = new Scanner(System.in);
    public static int result;

    public static void main(String[] args) {
        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();
        sum(a, b);
    }

    public static int sum(int a, int b) {
        result = a + b;
        System.out.println(result);
        return result;
    }
}
