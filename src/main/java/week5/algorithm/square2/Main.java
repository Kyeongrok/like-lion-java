package week5.algorithm.square2;


import java.util.Scanner;

public class Main {
    public void printSquare2(int n) {
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("*");
                }
                System.out.println("");
            } else{
//                System.out.println(i);
                System.out.printf("*");
                for (int k = 0; k < n-2; k++) {
                    System.out.printf(" ");
                }
                System.out.printf("*\n");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().printSquare2(sc.nextInt());
    }
}
