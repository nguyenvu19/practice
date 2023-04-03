import java.util.Scanner;

public class Bai8 {
    public static Scanner scanner = new Scanner(System.in);

    public static String capitalizeWord(String str) {
        String words[] = str.split("\\s");
        String capitalizeWord = "";
        for (String w : words) {
            String first = w.substring(0, 1);
            String afterFirst = w.substring(1);
            capitalizeWord += first.toUpperCase() + afterFirst + " ";
        }
        return capitalizeWord.trim();
    }

    public static void main(String[] args) {
        System.out.println("Nhập vào một chuỗi");

        System.out.println("Chuỗi sau khi xử lý là: " + capitalizeWord(scanner.nextLine()));
    }
}
