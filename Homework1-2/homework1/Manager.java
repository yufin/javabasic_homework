package homework1;

public class Manager {
    private String name;
    private int id;
    private int salary;
    private int bonus;

    public Manager() {
    }

    public Manager(String name, int id, int salary, int bonus) {
        setName(name);
        setId(id);
        setSalary(salary);
        setBonus(bonus);
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

    public double getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void work() {
        System.out.printf(" 工号为%d基本工资为%d奖金为%d的项目经理%s正在努力的做着管理工作," +
                "分配任务,检查员工提交上来的代码.....%n", id, salary, bonus, name);
    }
}