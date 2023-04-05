import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st;

        System.out.print("Nhập 1 chuỗi: ");
        st = scanner.nextLine();

        System.out.print("Độ dài của chuỗi: " + st.length());
        System.out.print("\nVị trí ký tự: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Ký tự tại vị trí " + n + " là: " + st.charAt(n));
        System.out.println("Chuỗi vừa nhập có hay không chuỗi abcdef: " + st.contains("abcdef"));
    }
}
