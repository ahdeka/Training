package hijava.practice;

/**
 * 첫번째 자바 실습
 * @author ahdeka
 * @update say함수 추가 (2022-07-31 by ahdeka)
 */

public class HelloJava {

    public static void main(String[] args){
        String str = "100";
        System.out.println(str + 1);
        HelloJava.say("Hello!!");

    }

    public static void say(String msg){
        System.out.println(msg);
    }

}
