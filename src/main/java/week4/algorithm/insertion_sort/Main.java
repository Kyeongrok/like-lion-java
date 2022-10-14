package week4.algorithm.insertion_sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
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
        Scanner sc = new Scanner(System.in);
        int numCnt = sc.nextInt();
        int[] arr = new int[numCnt];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
//        int[] arr = {8, 5, 6, 2, 4};
        Main is = new Main();
        int[] result = is.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(result[i]);
        }
//        System.out.println(Arrays.toString(result));
    }
}
