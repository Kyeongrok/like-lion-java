package week3.day2.calculator;


public class Calculator2Main {
    public static void main(String[] args) {
        RandomNumberCreator randomNumberCreator = new RandomNumberCreator();
        Calculator2 calculator2 = new Calculator2(10, 9, new SpecificNumberCreator());
        for (int i = 0; i < 100; i++) {
            calculator2.plus();
        }
    }
}
