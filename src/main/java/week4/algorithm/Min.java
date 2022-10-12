package week4.algorithm;

public class Min {

    // arr을 받아서 최대값을 구해서 int로 리턴함
    public int getMin(int[] arr) {
        //loop 구성
        int maxValue = arr[0]; // arr이 모두 음수인 경우 0으로 하면 0이 max
        int maxIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    public int getMax(int[] arr) {
        //loop 구성
        int maxValue = arr[0]; // arr이 모두 음수인 경우 0으로 하면 0이 max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};
        arr = new int[]{-3, -29, -38, -12, -57, -74, -40, -85, -61};
        Min max02 = new Min();
        int result = max02.getMax(arr);
        if (result == -85) {
            System.out.println("테스트 통과 했습니다.");
        } else {
            System.out.println("테스트 실패 입니다. result:" + result);
        }
    }
}
