package week3.day2.calculator;

public class Calculator2 {
    private int firstNum;
    private int randomTo;

    private NumberCreator numberCreator;

    public Calculator2(int firstNum, int randomTo, NumberCreator numberCreator) {
        this.firstNum = firstNum;
        this.randomTo = randomTo;
        this.numberCreator = numberCreator;
    }

    // random한 숫자 생성
    public int getRandomInt() {
        int randomInt = (int)(Math.random() * (this.randomTo+1));
        System.out.printf("생성된 랜덤 숫자:%d\n", randomInt);
        return randomInt;
    }

    public void plus() {
        System.out.println(firstNum + numberCreator.create());
    }
    public void minus() {
        System.out.println(firstNum - getRandomInt());
    }
    public void multiple() {
        System.out.println(firstNum * getRandomInt());
    }
    public void divide() {
        int randomInt = getRandomInt();
        if (randomInt == 0){
            System.out.println("랜덤생성한 숫자가 0입니다.");
        }else{
            float result = (float) firstNum / randomInt;
            System.out.println(":"+result);
        }
    }
}
