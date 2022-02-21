package homework2;

import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class Sort {

//    题目：编写程序，循环接收用户从键盘输入多个字符串，直到输入“end”时循环结束，
//    并将所有已输入的字符串按字典顺序倒序录入到项目下abc.txt中
    FileWriter fw = null;

    public Sort() throws IOException {
        this.fw = new FileWriter("./abc.txt", true);
    }

    public void inputStr() throws IOException {
        Scanner sc = new Scanner(System.in);
        String x ;
        System.out.println("请输入字符串，按会车继续输入,输入end终止输入");
        while (true){
            x = sc.next();

            if(x.equals("end")) {
                fw.close();
                System.out.println("字符串已保存，终止输入");
                break;
            } else {
                this.fw.write(x);
            };

        }
    }

    public static void main(String[] args) {
        try {
            Sort s = new Sort();
            s.inputStr();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
