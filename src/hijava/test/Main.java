package hijava.test;

import hijava.practice.Man;

import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> primeList = new ArrayList<>();

    public static void main(String[] args) {
//        al();
//        calPrime();
//        koreanAndAmerican();
//        drinkTest();
        eatTest();

    }

    private static void eatTest() {
        Man korean = new Korean("홍길동");
        American american = new American("James");

        eat(korean);
        eat(american);
    }

    private static void eat(Man m) {
        if (m instanceof Korean) {
            ((Korean) m).eatRice();
        } else if (m instanceof American) {
            ((American) m).eatBread();
        } else {
            System.out.println("해당하는 인스턴스가 없습니다");
        }
    }

    private static void drink(Mom m) {
        if (m instanceof Son) {
            ((Son) m).drinkMilk();
        } else if (m instanceof Mom) {
            m.drinkBeer();
        } else {
            System.out.println("Who are you?");
        }
    }

    private static void drinkTest() {
        Mom mom = new Mom();
        Mom son = new Son();

        drink(mom);
        drink(son);
    }

    private static void koreanAndAmerican() {
        Man korean = new Korean("홍길동");
        American american = new American("James");

        sayHi(korean);
        sayHi(american);
    }

    private static void sayHi(Man man) {
        man.sayHello();
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
