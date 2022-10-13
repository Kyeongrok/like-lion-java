package week5.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrepareTest {
    public int[] solution(int[] answer) {
        int[] arr1 = {1, 2, 3, 4, 5}; // 5개씩 반복
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5}; //8개씩 반복
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 10개씩 반복

        int[] memo = {0, 0, 0};

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == arr1[i % arr1.length]) memo[0] += 1;
            if (answer[i] == arr2[i % arr2.length]) memo[1] += 1;
            if (answer[i] == arr3[i % arr3.length]) memo[2] += 1;
        }
        return getResult(memo);

    }

    public int[] getResult(int[] memo) {

        int maxValue = Math.max(memo[0], Math.max(memo[1], memo[2]));
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < memo.length; i++) {
            if(memo[i] == maxValue) result.add(i+1);
        }
        int[] r = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            r[i] = result.get(i);
        }
        return r;
    }
    public static void main(String[] args) {

        int[] answer1 = {1, 2, 3, 4, 5};
        int[] answer2 = {1, 3, 2, 4, 2};
        PrepareTest prepareTest = new PrepareTest();
        System.out.println(Arrays.toString(prepareTest.solution(answer1)));
        System.out.println(Arrays.toString(prepareTest.solution(answer2)));

    }

}
