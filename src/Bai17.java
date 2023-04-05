import java.util.Random;
import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soNgauNhien;
        Random rd = new Random();
        int soBanDoan;
        soNgauNhien = rd.nextInt(1000) + 1;
        do {
            System.out.print("Số bạn đoán: ");
            soBanDoan = Integer.parseInt(scanner.nextLine());
            if (soBanDoan == soNgauNhien) {
                System.out.println("Số bạn đoán bằng số ngẫu nhiên");
                break;
            }
            if (soBanDoan < soNgauNhien) {
                System.out.println("Số bạn đoán nhỏ hơn số ngẫu nhiên");
            }
            if (soBanDoan > soNgauNhien) {
                System.out.println("Số bạn đoán lớn hơn số ngẫu nhiên");
            }
        } while (true);
    }
}
