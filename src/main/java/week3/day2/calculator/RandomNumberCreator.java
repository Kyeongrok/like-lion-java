package week3.day2.calculator;

public class RandomNumberCreator implements NumberCreator{

    @Override
    public int create() {
        return (int)(Math.random()*9);
    }
}
