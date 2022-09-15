package hijava.basic;

import hijava.practice.Man;

public class Person<T> {
    private T person;

    public void setPerson(T person) {
        this.person = person;
    }

    public String getName() {
        return this.person.toString();
    }

    public static void main(String[] args) {
        Man m = new Man("Milner");
        Student stu = new Student(8278, "James");

        Person<Man> mp = new Person<>();
        mp.setPerson(m);
        System.out.println("m=" + mp.getName());

        Person<Student> sp = new Person<>();
        sp.setPerson(stu);
        System.out.println("s=" + sp.getName());
    }

}
