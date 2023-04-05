import java.util.Scanner;

public class Bai9 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int soThuNhat;
        int soThuHai;
        String chuoiThuNhat;
        String chuoiThuHai;

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào 2 số nguyên dương từ 10-99: ");

        soThuNhat = Integer.parseInt(input.nextLine());
        soThuHai = Integer.parseInt(input.nextLine());

        chuoiThuNhat = String.valueOf(soThuNhat);
        chuoiThuHai = String.valueOf(soThuHai);

        if (chuoiThuHai.contains(chuoiThuNhat.substring(0, 1)) || chuoiThuHai.contains(chuoiThuNhat.substring(1, 2))) {
            System.out.println("TRUE");

        } else {
            System.out.println("FALSE");
        }
    }
}
