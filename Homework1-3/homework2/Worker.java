package homework2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Worker {
    private String name;
    private int age;
    private double salary;

    public void setName(String name){
        this.name = name;
    }


    public String getName(){
        return this.name;
    }


    public void setAge(int age){
        this.age = age;
    }


    public int getAge(){
        return this.age;
    }


    public void setSalary(double salary){
        this.salary = salary;
    }


    public double getSalary(){
        return this.salary;
    }


    public Worker(String name,int age, double salary) {
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
    }


    public Worker() {
        // this("", 0, 0.0);
    }


    @Override
    public String toString(){
        return "{name:"+this.name+", age:"+this.age+", salary:"+this.salary+"}";
    }


    @Override
    public int hashCode() {
        char[] charArr = this.toString().toCharArray();
        int hash = 0;
        for(char c : charArr) {
            hash = hash * 131 + c;
        }
        return hash;
    }


    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj instanceof Worker){
            if (obj.hashCode() == this.hashCode()){
                return true;
            }
        }
        return false;
    }

    public void work(){
        System.out.println(this.name+" 正在工作");
    }

    public static void main(String[] args) {
        List<Worker> workers = new LinkedList<>();
        workers.add(new Worker("凤姐", 18, 20000));
        workers.add(new Worker("欧阳峰", 60, 8000));
        workers.add(new Worker("刘德华", 40, 30000));

        int i = workers.indexOf(new Worker("欧阳峰", 60, 8000));
        workers.add(i, new Worker("张柏芝",35, 3300));
        workers.remove(new Worker("刘德华", 40, 30000));

        for (Worker w: workers){
            System.out.println(w);
        }

        Iterator<Worker> workeriter = workers.iterator();
        while (workeriter.hasNext()){
            Worker w = workeriter.next();
            w.work();
        }
    }
}




