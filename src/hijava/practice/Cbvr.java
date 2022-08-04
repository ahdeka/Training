package hijava.practice;

public class Cbvr {
    int x=10, y=20;


    public static void main(String[] args) {
        Cbvr cb1 = new Cbvr();

        System.out.println(cb1.x + " " + cb1.y);
        cb1.swap();
        System.out.println(cb1.x + " " + cb1.y);
    }

    public void swap(){
        int tmp;
        tmp = x;
        x = y;
        y = tmp;
    }
}
