package week3.day1.even_odd2;

public class Refacto {
    private int multipleTargetNum = 2;

    public Refacto(int multipleTargetNum) {
        this.multipleTargetNum = multipleTargetNum;
    }

    public String isMultiple(int num) {
        // 숫자를 받아서 짝수면 '짝수'리턴 홀수면 '홀수'리턴
        if ( num % this.multipleTargetNum == 0 ){
            return "multiple";
        } else {
            return "not multiple";
        }
    }
    public static void main(String[] args) {
        Refacto refacto = new Refacto(7);
        System.out.println(refacto.isMultiple(345));

    }
}
