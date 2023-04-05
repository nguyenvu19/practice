import java.util.ArrayList;
import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> arr = new ArrayList<Double>();
        ArrayList<Double> arrTemp = new ArrayList<Double>();

        int n;
        double giaTri;
        System.out.print("Nhập số phần tử của mảng: ");
        n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Giá trị phần tử thứ " + i + " là: ");
            giaTri = Double.parseDouble(scanner.nextLine());
            arr.add(giaTri);
        }
        System.out.print("Mảng mới nhập là: " + arr);

        for (int i = 0; i < arr.size(); i++) {
            if (!arrTemp.contains(arr.get(i))) {
                arrTemp.add(arr.get(i));
            }
        }

        System.out.println("\nMảng mới là: " + arrTemp);
    }
}
