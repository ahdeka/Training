package hijava.basic;

import java.util.Objects;

public class Student implements Cloneable {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "(" + id + ")";
    }

    @Override
    public boolean equals(Object o) {
        // 동일한 메모리 주소면 true!
        if (this == o) return true;

        // obj가 null이면 false!
        // getClass는 클래스를 반환 즉, 여기선 Student클래스를 반환, obj.getClass는 동일한 클래스 타입인지 확인 아니라면 false!
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student clobj = (Student) super.clone();
        clobj.name = clobj.name + "복제본!";
        return super.clone();
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, InstantiationException, IllegalAccessException {
//        boolean hasCondition = true;
//        String searchStr = "김길동";
//        String s = "select * from Tbl";
//        if (hasCondition) {
//            s = s + " where name like '%" + searchStr + "%";
//        }
//
//        StringBuilder sb = new StringBuilder();
//        sb.append("select * from Tbl");
//        if (hasCondition) {
//            sb.append(" where name like '%").append(searchStr).append("%");
//        }

//        sb.append("aaaaaa");
//        System.out.println("sb1=" + sb.toString());
//        sb.setLength(0);
//        System.out.println("sb2=" + sb.toString());

//        StringBuffer sf = new StringBuffer();
//        sb.append("aaaaaa");
//        System.out.println("sb1=" + sb.toString());
//        sb.setLength(0);
//        System.out.println("sb2=" + sb.toString());

//        String s1 = new String("123abc");
//        String s2 = "123abc";
//        String s3 = "123abc";

//        System.out.println("s1==s2 :" + (s1 == s2) + ", " + s1.equals(s2));
//        System.out.println(s3 == s2);
//        System.out.println(System.identityHashCode(s1) + ", " + System.identityHashCode(s2));
//        System.out.println(s1.hashCode() + " : " + s2.hashCode() + " : " + s3.hashCode());

        Student s = new Student(921234, "홍길동");
        System.out.println(s.getClass() + ", " + s.getClass().getSimpleName());
        String inputStr = "hijava.basic.Student";
        Class cls = Class.forName(inputStr);
        Student s2 = (Student) cls.newInstance();
//        Student s2 = (Student)s.clone();
//        System.out.println(s2);

//        String ss = new String("홍길동2");
//        System.out.println(s);
//        Integer obj = new Integer(s.id);
//        Integer obj2 = new Integer(921234);
//        System.out.println(s.name.hashCode() + "::" + ss.hashCode());
//        System.out.println(obj.hashCode() + "=" + obj2.hashCode());
//        System.out.println(System.identityHashCode(obj2));

//        Student s1 = new Student(123, "Hong");
//        Student s2 = new Student(456, "Kang");
//        Student s3 = new Student(123, "Hong");
//
//        System.out.println("s1 hash=" + s1.hashCode());
//        System.out.println("s2 hash=" + s2.hashCode());
//        System.out.println("s3 hash=" + s3.hashCode());
//        System.out.println(System.identityHashCode(s1));
//
//        System.out.println("s1 equals s2 = " + s1.equals(s2));
//        System.out.println("s1 equals s3 = " + s1.equals(s3));

    }
}
