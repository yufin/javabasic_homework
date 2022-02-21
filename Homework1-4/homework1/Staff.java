package homework1;

public class Staff {
    private String name;
    private int age;
    

    public Staff(String name, int age) throws Exception {
        setName(name);
        setAge(age);

    }

    public void setName(String name) {
        this.name = name;
        if(this.name == null || this.name.equals("")){
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    public void setAge(int age) {
        this.age = age;
        if(this.age <18 || this.age > 150){
            try {
                throw new AgeException("年龄不合理!!!");
            } catch (AgeException e) {
                e.printStackTrace();
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

//        try {
//            Staff s = new Staff("", 1);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try {
            Staff s = new Staff("", 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}


