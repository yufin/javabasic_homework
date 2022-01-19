package homework3;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;


public class Student {
    private String name;
    private int age;

    public Student(String name, int age){
        setName(name);
        setAge(age);
    }


    public void setName(String name){
        this.name = name;
    }


    public void setAge(int age){
        this.age = age;
    }


    public String getName(){
        return this.name;
    }


    public int getAge(){
        return this.age;
    }


    public static void main(String[] args) {
        // Student s = new Student();
        Map<Student, String> m = new LinkedHashMap<>();
        m.put(new Student("Elon", 37), "California");
        m.put(new Student("Trump", 69), "NewYork City");
        m.put(new Student("V", 28), "Night City");

        System.out.println(m);

        // iter method1
        System.out.println("\niter method1");
        Set<Student> s1 = m.keySet();
        for (Student ss : s1) {
            System.out.println(ss + "::" + m.get(ss));
        }

        // iter method2
        System.out.println("\niter method2");
        Set<Map.Entry<Student, String>> entries = m.entrySet();
        for (Map.Entry<Student, String> en : entries) {
            System.out.println(en.getKey() + "::" + en.getValue());
        }

        // iter method3
        System.out.println("\niter method 3");
        Iterator<Map.Entry<Student, String>> stuendtiter = m.entrySet().iterator();
        while (stuendtiter.hasNext()) {
            Map.Entry<Student, String> en = stuendtiter.next();
            System.out.println(en.getKey() + "::" + en.getValue());
        }


        // iter method4
        System.out.println("\niter method4");
        for (Student key : m.keySet()) {
            System.out.println(key);
        }
        for (String v : m.values()) {
            System.out.println(v);
        }

    }
}