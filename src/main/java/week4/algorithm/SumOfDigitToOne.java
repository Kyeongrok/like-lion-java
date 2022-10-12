package week4.algorithm;

public class SumOfDigitToOne {
    public static int solution(int n) {
        // % 연산 이용 몫, 나머지
        int result = 0;
        // while문
        while (n > 0) { result += n % 10; n = n / 10; }
        return result;
    }

    public static void main(String[] args) {
        int n1 = 1234567;

        // 1234567 = 28
        // 28 = 10
        // 1
        while (n1 / 10 > 0) {
            n1 = solution(n1);
            System.out.println(n1);
        }

        if (n1 == 1) {
            System.out.println("테스트 통과 했습니다.");
        } else {
            System.out.printf("테스트 실패 result:%d \n", n1);
        }
    }
}
