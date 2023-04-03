import java.util.Scanner;

public class Bai6 {
    public static Scanner scanner = new Scanner(System.in);
    public static String keyword;
    public static void main(String[] args) {
        System.out.print("Nhập một chuỗi: ");
        keyword = scanner.nextLine();
        System.out.println("Chuỗi ban đầu: " + keyword);

        String reverseString = new StringBuffer(keyword).reverse().toString();

        System.out.println("Chuỗi đảo ngược: " + reverseString);
    }
}
