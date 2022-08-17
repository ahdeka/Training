package hijava.practice;

public class Problem{
    public static void main(String[] args) {
        Score s1 = new Score();
        s1.setSubject("English");
        s1.setScore(90);
        s1.prof = "Hipo";

        Score s2 = new Score("Math", 85);

        Score s3 = new Score("Science");

        System.out.println(s1);
        System.out.println(s1.prof);
        System.out.println(s2);
        System.out.println(s3);
    }
}
