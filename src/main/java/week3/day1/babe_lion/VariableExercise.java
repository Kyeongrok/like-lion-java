package week3.day1.babe_lion;

public class VariableExercise {
    public static void main(String[] args) {
        // 50000 ~ 10 원까지 배열에 넣어보세요.
        int result1 = 0;
        int result2 = 0;

        int[] arr = new int[]{50000, 10000, 5000, 1000, 500, 100, 50, 10};
        // 계산기

        // arr 0번 + arr 1 --- 1  60000
        // arr 2번 * arr 3번 --- 2 50000000
        // 1번 - 2번 --- 3 5000이 나오는게 맞나요?
        // 각 1번 결과, 2번결과, 3번결과 모두 출력 해보세요.
        result1 = arr[0] + arr[1];
        result2 = arr[2] * arr[3];
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result1 - result2);

    }
}
