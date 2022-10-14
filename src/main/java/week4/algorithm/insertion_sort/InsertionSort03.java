package week4.algorithm.insertion_sort;

import java.util.Arrays;

public class InsertionSort03 {
    // 재귀(recursive) -- 반복문(while) 없이 반복해야 할 때
    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
//                System.out.printf("i:%d j:%d j-1:%d\n", i, j, j-1);
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        // 5에서 출발을 합니다. idx = 1
        int[] arr = {8, 5, 6, 2, 4};
        InsertionSort03 is = new InsertionSort03();
        int[] result = is.sort(arr);
        System.out.println(Arrays.toString(result));
    }
}
