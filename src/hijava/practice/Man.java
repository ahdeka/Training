package hijava.practice;

public class Man {
    private static final int COFFEE_PRICE = 3000;
    private static final int DONUT_PRICE = 2500;
    private String name;
    private int money;

    public Man() {
        this.money = 10000;
    }

    public Man(String name) {
        this();
        this.setName(name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void buyCoffee(int count) {
//        this.money -= COFFEE_PRICE * count;
        this.subMoney(COFFEE_PRICE, count);
    }

    public void buyDonut(int count) {
        this.subMoney(DONUT_PRICE, count);
    }

    private void subMoney(int price, int count) {
        this.money -= price * count;
    }

    public void sayHello() {
        System.out.println("안녕하세요");
        System.out.println("제 이름은 " + this.getName() + "입니다.");
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + getName() + '\'' +
                ", money=" + getMoney() +
                '}';
    }

    public static void main(String[] args) {
        Man hong = new Man("Hong");
        Man dam = new Man("Dam");

        hong.buyCoffee(1);
        hong.buyDonut(2);

        dam.buyCoffee(2);
        dam.buyDonut(1);

        System.out.println(hong);
        System.out.println(dam);
    }
}
