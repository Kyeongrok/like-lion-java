package week5.algorithm;

public class Pyramid {
    /*
          *
         * *
        * * *
       * * * *
     */
    public void printStar(int N) {
        // 직각삼각형 - *개수에만 신경 쓰면 됩니다.
        // 피라미드 - *의 위치도 신경 써야 합니다.
        for (int i = 0; i < N; i++) {
            // 공백 출력
//            System.out.printf("N:%d", N);
            for (int j = N - 1 - i; j > 0 ; j--) {
                System.out.printf(" ");
            }
            for (int k = 0; k < 2*i+1; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid();
        pyramid.printStar(5);

    }
}
