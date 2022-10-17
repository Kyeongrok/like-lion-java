package week5.algorithm;

/*
 *               i = 0 별이 1개
 * *             i = 1 별이 2개
 * * *           i = 3 별이 3개
 * * * *         i = 4 별이 4개
 */
public class RightTriangle {
    private String letter = "*";

    public RightTriangle() {
    }

    public RightTriangle(String letter) {
        this.letter = letter;
    }
    public void printStar(int n) {
        for (int i = 0; i < n; i++) {
            // for문을 한개 더 쓰시고
            // println말고 print, printf등을 써서 한줄로 출력 하기
            for (int j = 0; j <= i; j++) {
                System.out.printf(this.letter);
            }
            System.out.printf("\n");
        }
    }
    public static void main(String[] args) {
        RightTriangle rt = new RightTriangle("#");
        rt.printStar(10);
    }
}
