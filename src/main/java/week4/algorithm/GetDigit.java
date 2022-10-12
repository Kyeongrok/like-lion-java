package week4.algorithm;

import java.util.Scanner;
public class GetDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 0;
        while(n > 0){
            n = n / 10;
            cnt += 1;
        }

        System.out.println(cnt);
    }
}
