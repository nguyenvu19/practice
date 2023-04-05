public class Bai18 {
    public static void main(String[] args) {
        double soTienBanDau = 550000000;
        double soTienMuonCo = 1200000000;
        double laiSuat = 0.1;
        int soNam;

        soNam = (int) ((soTienMuonCo - soTienBanDau) / (soTienBanDau * laiSuat));

        System.out.println("Số năm tối thiểu phải chờ: " + soNam + " năm");
    }
}
