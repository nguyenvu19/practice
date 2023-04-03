import java.util.Scanner;

public class Bai5 {
    public static Scanner scanner = new Scanner(System.in);

    private static double length(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public static void main(String[] args) {
        double xA, yA;
        double xB, yB;

        System.out.println("Nhập tọa độ điểm A: ");
        System.out.println("Nhập hoành độ điểm A:");
        xA = scanner.nextDouble();
        System.out.println("Nhập tung độ điểm A: ");
        yA = scanner.nextDouble();

        System.out.println("\nNhập tọa độ điểm B: ");
        System.out.println("Nhập hoành độ điểm B: ");
        xB = scanner.nextDouble();
        System.out.println("Nhập tung độ điểm B: ");
        yB = scanner.nextDouble();

        System.out.println(length(xA, xB, yA, yB));
    }
}
