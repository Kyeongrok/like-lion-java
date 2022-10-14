package week4.algorithm.insertion_sort;

import java.util.Arrays;

public class InsertionSort01 {
    public int[] sort(int[] arr) {
        int i = 1;
        if (arr[i] < arr[i - 1]) { // arr[1] vs arr[0]
            // swap
            int temp = arr[i-1];
            arr[i-1] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
    public static void main(String[] args) {
        // 5에서 출발을 합니다. idx = 1
        int[] arr = {8, 5, 6, 2, 4};
        InsertionSort01 is = new InsertionSort01();
        int[] result = is.sort(arr);

        System.out.println(Arrays.toString(result));
    }
}
