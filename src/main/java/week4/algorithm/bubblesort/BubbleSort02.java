package week4.algorithm.bubblesort;

import java.util.Arrays;

public class BubbleSort02 {
    public int[] sort(int[] arr, int i) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] > arr[j]) { // 7 vs 2
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};
        // 오름차순 또는 내림차순으로 정렬하는 알고리즘을 짜보세요
        BubbleSort02 bs = new BubbleSort02();
        int[] result = bs.sort(arr, 0);
        result = bs.sort(new int[]{2, 7, 3, 9, 28, 11}, 1);
        System.out.println(Arrays.toString(result));
        result = bs.sort(new int[]{2, 3, 7, 9, 28, 11}, 2);
        System.out.println(Arrays.toString(result));
        result = bs.sort(new int[]{2, 3, 7, 9, 28, 11}, 3);
        System.out.println(Arrays.toString(result));
        result = bs.sort(new int[]{2, 3, 7, 9, 28, 11}, 4);
        System.out.println(Arrays.toString(result));
    }
}
