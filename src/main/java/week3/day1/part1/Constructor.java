package week3.day1.part1;

public class Constructor {

    private String managerName;
    private String rank;

    public Constructor(String managerName) {
        this.managerName = managerName;
    }

    public Constructor(String managerName, String rank) {
        this.managerName = managerName;
        this.rank = rank;
    }

    public void helloManager() {
        System.out.printf("Hello %s %s!\n", managerName, rank);
    }

    public static void main(String[] args) {
        Constructor constructor = new Constructor("김경록", "차장");
        constructor.helloManager();

    }
}
