package HomeTask;

public class taskChess {
    public static void main(String[] args) {
        int rook1X = 2;
        int rook1Y = 9;
        int rook2X = 5;
        int rook2Y = 7;
        int kingX = 6;
        int kingY = 7;
        if ((kingX == rook1X || kingY == rook1Y) && (kingX == rook2X || kingY == rook2Y)) {
            System.out.println("3");
        } else if (kingX == rook1X || kingY == rook1Y) {
            System.out.println("1");
        } else if (kingX == rook2X || kingY == rook2Y) {
            System.out.println("2");
        } else {
            System.out.println("0");
        }
    }
}
