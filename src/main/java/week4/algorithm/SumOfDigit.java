package week4.algorithm;

import java.util.Scanner;

public class SumOfDigit {
    public int solutionB(int n) {
        // n 을 String으로 변경
        String str = String.valueOf(n);
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            result += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        // string을 loop돌면서 parseInt후 더한다.

        return result;
    }
    public int solution(int n) {
        // % 연산 이용 몫, 나머지
        int result = 0;
        // while문
        while (n > 0) { result += n % 10; n = n / 10; }
        return result;
    }
    public static void main(String[] args) {
        // 687 = 6 + 8 + 7 = 21
        SumOfDigit sod = new SumOfDigit();
        int result1 = sod.solution(1234);

        if (result1 == 10) {
            System.out.println("테스트 통과 했습니다.");
        } else {
            System.out.printf("테스트 실패 result:%d \n", result1);
        }
    }
}
