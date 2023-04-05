import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        System.out.print("Giải phương trình");
        System.out.print("\n1.PT bậc 1 \n2.PT bậc 2");
        System.out.print("\nLựa chọn của bạn: ");
        luaChon = Integer.parseInt(scanner.nextLine());

        switch (luaChon) {
            case 1:
                PTBac1();
                break;
            case 2:
                PTBac2();
                break;
            default:
                System.out.println("Nhập 1 hoặc 2");
                break;
        }
    }

    public static void PTBac1() {
        Scanner input = new Scanner(System.in);
        double a = 1, b = 0, x;
        boolean flag = true;

        System.out.println("Phương trình bậc 1: aX + b = 0 ");
        System.out.print("Nhập a: ");
        a = Double.parseDouble(input.nextLine());
        System.out.print("Nhập b: ");
        b = Double.parseDouble(input.nextLine());
        if (flag && a == 0 && b == 0) {
            System.out.println("Phương trình vô số nghiệm");
            flag = false;
        }
        if (flag && a == 0 && b != 0) {
            System.out.println("Phương trình vô nghiệm");
            flag = false;
        }
        if (a != 0) {
            x = -b / a;
            System.out.println("Nghiệm của phương trình là: " + x);
            flag = false;
        }
    }

    public static void PTBac2() {
        Scanner input = new Scanner(System.in);
        double a = 1, b = 0, c = 0, x, x1, x2, delta;
        delta = b * b - 4 * a * c;
        boolean flag = true;

        System.out.println("Phương trình bậc 1: aXX + bX + c = 0 ");
        System.out.print("Nhập a (a!=0): ");
        a = Double.parseDouble(input.nextLine());
        System.out.print("Nhập b: ");
        b = Double.parseDouble(input.nextLine());
        System.out.print("Nhập c: ");
        c = Double.parseDouble(input.nextLine());

        if (flag && delta < 0) {
            System.out.println("Phương trình vô nghiệm");
            flag = false;
        }
        if (flag && delta == 0) {
            x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép: x1 = x2 = " + x);
            flag = false;
        }
        if (flag && delta == 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm phân biệt");
            System.out.print("x1: " + x1);
            System.out.print("x2: " + x2);
            flag = false;
        }

    }
}
