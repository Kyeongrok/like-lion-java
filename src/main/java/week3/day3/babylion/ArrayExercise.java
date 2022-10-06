package week3.day3.babylion;

import java.util.Arrays;

public class ArrayExercise {
    public static void main(String[] args) {
        int[] arr = new int[7];
        int rnd1 = 5;
        // i = 0
        arr[0] = rnd1;
        System.out.println(Arrays.toString(arr));
        // i = 1
        int rnd2 = 3;
        if (arr[0] == rnd2) {
            // rnd2 = random()
        }else {
            arr[0] = rnd2;
        }
        System.out.println(Arrays.toString(arr));

    }
}
