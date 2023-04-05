import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TInhTien {
    public static void main(String[] args) {
        int price = 30000;
        int water = 10000;

        System.out.println("Nhập giờ bắt đầu và kết thúc:");


        Scanner scanner = new Scanner(System.in);

        int startTime =  scanner.nextInt();
        int endTIme =  scanner.nextInt();

        int total = price * (endTIme-startTime);

        if(startTime >= 9 && endTIme <= 24 && ((endTIme-startTime)<24)){
            total = 1;
        }

        System.out.println(startTime);
        System.out.println(endTIme);
    }



}
