package hijava.basic;

import java.util.*;

public class Coll {

    public static void main(String[] args) {
//        lists();
//        sets();
//        treesets();
        maps();


    }

    private static void maps() {
        Map<Integer, Student> map = new HashMap<>(); // Key는 어떤 인티저타입, 내용은 어떤타입, Student는 서랍장과 같다
        Student s1 = new Student(100, "hong1");
        Student s2 = new Student(200, "hong2");
        Student s3 = new Student(300, "hong3");

        map.put(s1.getId(), s1);
        map.put(s2.getId(), s2);
        map.put(s3.getId(), s3);
        System.out.println(map);

        int searchId = 201;
        if(map.containsKey(searchId)){
            Student s200 = map.get(searchId);
            System.out.println(s200.getName());
        }else{
            System.out.println(searchId + " 학생이 없습니다!");
        }

    }

    private static void treesets() { // Comparable<Student *클래스명>랑 compareTo메소드를 Override해야한다.
        TreeSet<Student> set = new TreeSet<>();
        set.add(new Student(100, "Jordan"));
        set.add(new Student(200, "Henderson"));
        set.add(new Student(50, "Trent"));
        System.out.println(set);
    }

    private static void sets() {
        Set<Student> set = new HashSet<>();
        set.add(new Student(100, "Jordan"));
        set.add(new Student(200, "Henderson"));
        set.add(new Student(50, "Trent"));
        System.out.println(set);
    }

    private static void lists() {
        List<String> lst1 = new ArrayList<>();
        List<String> lst2 = new ArrayList<>();

        lst1.add("111");
        lst1.add("222");
        lst1.add(1, "100");
        lst1.add("333");
        lst1.add("444");
        lst2.add("aaa");
        System.out.println(lst1);
        System.out.println(lst2);

        boolean isPop = lst1.remove("100");
        System.out.println("isPop=" + isPop);
        System.out.println(lst1);
        String pop = lst1.remove(1);
        System.out.println("pop=" + pop);
        System.out.println(lst1);
    }
}
