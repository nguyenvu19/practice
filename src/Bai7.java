import java.util.Scanner;

public class Bai7 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập số nguyên bất kỳ:");
        int num = scanner.nextInt();

        System.out.print("Ước của nó là: ");

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
