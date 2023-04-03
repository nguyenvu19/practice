public class Bai1 {
    private static final int ROWS = 15;
    private static final int COLUMNS = 46;
    private static final int R_CHANGE = 10;
    private static final int C_CHANGE = 12;

    public static void main(String[] args) {
        for (var i = 1; i <= ROWS; i++) {
            var str = "";
            if (i < R_CHANGE) {
                for (var j = 1; j <= COLUMNS; j++) {
                    str += j < C_CHANGE ? (j - i) % 2 == 0 ? "*" : " " : j == C_CHANGE ? " " : "=";
                }
            } else {
                for (var j = 1; j <= COLUMNS; j++) {
                    str += "=";
                }
            }
            System.out.println(str);
        }
    }
}
