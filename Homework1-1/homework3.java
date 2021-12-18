import java.util.Scanner;
import java.util.Arrays;

public class homework3 {
    public static void main(String[] args) {
        int[] list = {2, 31, 0,45, 88};
//        Arrays.sort(list);
        int min = list[0];
        for(int i=0; i<list.length; i++){
            if(min > list[i]){
                min = list[i];
            }
        }
        System.out.println("The min value is "+min);
    }
}
