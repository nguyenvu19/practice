import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        long sum = 0;
        int n;
        Scanner scanner;
        do {
            System.out.println("Input n = ");
            scanner = new Scanner(System.in);
            n = scanner.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);
        scanner.close();
    }
}
