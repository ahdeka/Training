package hijava.practice;

public class Man {
    public static final int COFFEE_PRICE = 3000;
    public final static int DONUT_PRICE = 2500;
    private String name;
    private int amount;

    public Man() {
        this.amount = 10000;
    }

    public Man(String name) {
        this();
        this.name = name;
    }

    public void buyCoffee(int count) {
        this.subAmount(COFFEE_PRICE, count);
    }

    public void buyDonut(int count) {
        this.subAmount(DONUT_PRICE, count);
    }

    private void subAmount(int price, int count) {
        this.amount -= price * count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return this.name + "'s change is " + this.amount;
    }

    public static void main(String[] args) {
        Man hong = new Man("Hong");
        Man john = new Man("John");

        hong.buyCoffee(1);
        hong.buyDonut(2);

        john.buyCoffee(2);
        john.buyDonut(1);

        System.out.println(hong);
        System.out.println(john);
    }
}
