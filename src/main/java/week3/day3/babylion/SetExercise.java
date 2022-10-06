package week3.day3.babylion;

import java.util.Arrays;
import java.util.HashSet;

public class SetExercise {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[7];
        HashSet<Integer> set1 = new HashSet<>(); //0
        while (set1.size() < 7) { // 7보다 작을 때 까지
            System.out.println(set1.size());
//            set1.add((int)(Math.random() * 10)); // 1 2 3 4
            System.out.println(Math.random() * 10);
        }
        Integer[] arr = set1.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));

    }
}
