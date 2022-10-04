package week3.day1.babe_lion;

import java.util.Arrays;

public class ArrExercise {
    public static void main(String[] args) {
        int[] arr = new int[]{50000, 10000, 5000, 1000, 500, 100, 50, 10};
        // new int[8] ==> 자동으로 해줌
        // 배열 arr에 5만원~10원까지

        for (int i = 0; i < 8; i++) {
            System.out.printf("%d번에는 %d가 들어있습니다.\n", i, arr[i]);
        }


    }
}
