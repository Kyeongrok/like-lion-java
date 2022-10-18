package week5.algorithm;

public class RecursiveStar {
    public void printARow(int n, String now) {
        if (n == now.length() - 1) {
            return;
        }
        System.out.println(now);

        printARow(n, now + "*");
    }
    public static void main(String[] args) {
        new RecursiveStar().printARow(5, "*");
    }
}
