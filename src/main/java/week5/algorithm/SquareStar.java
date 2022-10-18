package week5.algorithm;

public class SquareStar {
    public void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*".repeat(n));
        }
    }
    public void printRectangle(int x, int y) {
        // x만큼 가로, y만큼 세로
        for (int i = 0; i < y; i++) {
            System.out.println("*".repeat(x));
        }
    }

    public void printSquare2(int n) {
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                System.out.println("*".repeat(n));
            } else{
                System.out.printf("*%s*\n"," ".repeat(n-2));
            }
        }
    }
    public static void main(String[] args) {
//        new SquareStar().printSquare(4);
//        new SquareStar().printRectangle(5, 7);
        new SquareStar().printSquare2(5);
    }
}
