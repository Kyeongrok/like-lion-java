package week4.algorithm;

public class Max05 {

    // arr을 받아서 최대값을 구해서 int로 리턴함
    /*
    return: maxValue, maxIdx
     */
    public int[] getMax(int[] arr) {
        //loop 구성
        int maxIdx = 0;
        int maxValue = arr[0]; // arr이 모두 음수인 경우 0으로 하면 0이 max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIdx = i;
            }
        }
        return new int[]{maxValue, maxIdx};
    }
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {3,23,85,34,17,74,25,52,65}, // alt + j 공백을 ,로
                {}
        };
//        3 23 85 34 17 74 25 52 65
//        10 7 39 42 88 52 14 72 63
//        87 42 18 78 53 45 18 84 53
//        34 28 64 85 12 16 75 36 55
//        21 77 45 35 28 75 90 76 1
//        25 87 65 15 28 11 37 28 74
//        65 27 75 41 7 89 78 64 39
//        47 47 70 45 23 65 3 41 44
//        87 13 82 38 31 12 29 29 80
    }
}
