import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Nhập số tự nhiên n (1-9): ");
        n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; ++i) {
            for (int y = 1; y <= i; ++y) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
