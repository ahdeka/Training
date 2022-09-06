package hijava.oop;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException, IOException {
//        weight();
//        AbstSuper sp = new AbstChild();
//        int i = 5;
//        int j = 10;
//        System.out.println("min = " + sp.min(i, j) + ", max = " + sp.max(i, j));
//        calculator();
//        testinterface();
//        calOper();
        scanner();

    }

    private static void scanner() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = inputScan(scanner, "계산합니까?(계산:enter, 종료:quit)");
            if (str.equalsIgnoreCase("quit"))
                break;

            int x = inputScanNumber(scanner, "첫번째 숫자(x)를 입력하세요>> ");
            int y = inputScanNumber(scanner, "두번째 숫자(y)를 입력하세요>> ");
            String s = inputScan(scanner, "연산자 * 또는 / 를 입력하세요>> ");

            CalcOper co = new CalcOper();
            System.out.print(x + " " + s + " " + y + " = ");
            if (s.equals("*")) {
                co.mul(x, y);

            } else if (s.equals("/")) {
                co.div(x, y);

            } else {
                System.out.println("연산자를 잘못 입력하셨습니다.");
            }
        }

        scanner.close();
    }

    private static int inputScanNumber(Scanner scanner, String msg) {
        int x = Integer.parseInt(inputScan(scanner, msg));
        return x;
    }

    private static String inputScan(Scanner scanner, String msg) {
        System.out.print(msg);
        return scanner.nextLine();
    }

    private static void calOper() {
        int x = 10, y = 5;
        CalcOper op = new CalcOper();
        int a = op.add(x, y);
        int s = op.sub(x, y);
        System.out.println(a + ", " + s);
        op.mul(x, y);
        op.div(x, y);
    }

    private static void testinterface() throws SQLException, IOException {
        TestInterface ti = new TestImpl();
        ti.select("select * interface");
        TestInterface.out(100);
    }

    private static void calculator() {
        Calculator calc = new CalculatorImpl();
        int x = 10, y = 5;
        calc.add(x, y);
        calc.sub(x, y);
        calc.mul(x, y);
        calc.div(x, y);
        calc.div(x, 0);
    }

    private static void weight() {
        Weight guen = new Guen();
        Weight pound = new Pound();

        int g = 5;
        System.out.println("Guen = " + guen.getGram(g));
        System.out.println("Pound = " + pound.getGram(g));
    }
}
