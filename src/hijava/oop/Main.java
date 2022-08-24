package hijava.oop;

public class Main {

    public static void main(String[] args) {
        weight();

//        AbstSuper sp = new AbstChild();
//        int i = 5;
//        int j = 10;
//        System.out.println("min = " + sp.min(i, j) + ", max = " + sp.max(i, j));
    }

    private static void weight(){
        Weight guen = new Guen();
        Weight pound = new Pound();

        int g = 5;
        System.out.println("Guen = " + guen.getGram(g));
        System.out.println("Pound = " + pound.getGram(g));
    }
}
