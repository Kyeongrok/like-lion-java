package week3.day1.babe_lion;

public class TypeCasting {

    public void divide(int first, int second) {
        float fFirst = (float) first;
        float fSecond = (float) second;
        float result = fFirst / fSecond;
        System.out.println(result);
    }

    public static void main(String[] args) {
        TypeCasting tc = new TypeCasting();
        tc.divide(1, 2);
    }
}
