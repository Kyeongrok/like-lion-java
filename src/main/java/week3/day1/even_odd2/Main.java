package week3.day1.even_odd2;

import java.util.Scanner;

public class Main {

    private String getEvenOdd(int num) {
        if (num % 2 == 0){
            return "짝수";
        }else {
            return "홀수";
        }
    }
    public void printEvenOddStatement(int first, int second) {
        System.out.printf("%s+%s=%s",
                getEvenOdd(first),
                getEvenOdd(second),
                getEvenOdd(first+second));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        Main main = new Main();
        main.printEvenOddStatement(first, second);
    }
}
