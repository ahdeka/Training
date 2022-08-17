package hijava.test;

import hijava.practice.Man;

import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> primeList = new ArrayList<>();

    public static void main(String[] args) {
//        al();
        calPrime();
    }

    private static void calPrime() {
        int total = 0;
        for (int num = 2; num <= 100; num++) {
            if (isPrime(num)) {
                total += num;
                primeList.add(num);
            }
        }
        System.out.println("Total is " + total);
    }

    private static boolean isPrime(int num) {
        for (Integer i : primeList) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void al() {
        ArrayList<Man> peopleList = new ArrayList<>(9);

        for (int i = 0; i < 9; i++) {
            Man m = new Man("김" + (i + 1) + "수");
            m.buyCoffee(1);
            peopleList.add(m);
        }

        int size = peopleList.size();
        for (int i = 0; i < size; i++)
            System.out.println(peopleList.get(i));
    }
}
