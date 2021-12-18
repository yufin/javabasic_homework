import java.util.Scanner;
import java.util.Arrays;

public class homework4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入班级人数:");
        int num = sc.nextInt();
        System.out.println(Math.random());
        int[] scores = new int[num];

        for(int i=0; i < scores.length; i++){
            scores[i] = (int)(Math.random()*100) ;
        }
//        System.out.println(Arrays.toString(scores));
        int count = 0;
        int sum = 0;
        for(int k=0; k < scores.length; k++){
            sum += scores[k];
            if(scores[k] < 60){
                count++;
            }
        }
        System.out.println("不及格人数:" + count);
        System.out.println("班级平均分:" + sum/num);
    }
}
