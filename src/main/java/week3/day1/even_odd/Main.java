package week3.day1.even_odd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 5, 8
        // 2로 나누었을 때 나머지가 0이면
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
