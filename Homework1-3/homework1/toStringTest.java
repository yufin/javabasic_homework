package homework1;

public class toStringTest {
    public static String toString(int[] arr) {
        if(arr != null){
           StringBuilder sb = new StringBuilder("[");
            int i;
            for(i=0; i<arr.length; i++){
               sb.append(arr[i]);
               sb.append(", ");
           }
           if (arr.length == 0){
               sb.append("]");
           }else {
               sb.replace(sb.length() - 2, sb.length(), "]");

           }
           return sb.toString();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(toStringTest.toString(null));
        System.out.println(toStringTest.toString(new int[]{}));
        System.out.println(toStringTest.toString(new int[]{1, 2, 3}));
    }

}
