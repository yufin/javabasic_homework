package homework1;

public class Coder {
    private String name;
    private int id;
    private int salary;

    public Coder() {
    }

    public Coder(String name, int id, int salary) {
        setName(name);
        setId(id);
        setSalary(salary);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public void work() {
        System.out.printf(" 工号为%d基本工资为%d的程序员%s正在努力的写着代码......%n", id, salary, name);
    }
}
