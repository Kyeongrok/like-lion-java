package week4.algorithm.bubblesort;

import java.util.Arrays;

public class BubbleSort03 {
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j < arr.length; j++) {
//                if(arr[i] > arr[i+1]) n-1번
                if (arr[i] > arr[j]) { // 7 vs 2
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};
        // 오름차순 또는 내림차순으로 정렬하는 알고리즘을 짜보세요
        BubbleSort03 bs = new BubbleSort03();
        int[] result = bs.sort(arr);
        System.out.println(Arrays.toString(result));
    }
}
