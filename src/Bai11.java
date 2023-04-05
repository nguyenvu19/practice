import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        double log2n;

        System.out.print("Nhập số tự nhiên n: ");
        n = Integer.parseInt(scanner.nextLine());
        log2n = (double) (Math.log(n) / Math.log(2));

        System.out.print("Số tự nhiên nhỏ lơn log2(n) là: " + (int) log2n);
    }
}
