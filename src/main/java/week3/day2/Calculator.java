package week3.day2;

public class Calculator {
    private int a;
    private int b;

    private NumberCreator numberCreator;

    // alt + insert
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void plus() {
        System.out.println(a + b);
    }
    public void minus() {
        System.out.println(a - b);
    }
    public void multiple() {
        System.out.println(a * b);
    }
    public void divide() {
        System.out.println((float)a / b);
    }
}
