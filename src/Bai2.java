import java.util.Scanner;

public class Bai2 {

    public void convertBinary(int num) {
        int binary[] = new int[100];
        int index = 0;
        while (num > 0) {
            binary[index++] = num % 2;
            num = num / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }

    public int convertDecimal(int binaryNumber) {
        int decimal = 0;
        int p = 0;
        while (true) {
            if (binaryNumber == 0) {
                break;

            } else {
                int temp = binaryNumber % 10;
                decimal += temp * Math.pow(2, p);
                binaryNumber = binaryNumber / 10;
                p++;
            }
        }
        System.out.println(decimal);
        return decimal;
    }

    public static void main(String a[]) {
        Bai2 obj = new Bai2();
        System.out.println("Giá trị nhị phân của 10 là: ");
        obj.convertBinary(10);

        System.out.println("\nGiá trị nhị phân của 1010 là: ");
        obj.convertDecimal(1010);
    }
}
