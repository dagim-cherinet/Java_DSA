import java.util.Arrays;

public class ReverseArrayUsingSwap {
    public static void main(String[] args) {
        int[] myArr = { 19,18,17,16,15,14,13,12,11,10};
        System.out.println(Arrays.toString(myArr));
        reverseBySwapping(myArr);

    }
    static void reverseBySwapping(int[] x){
        int start = 0;
        int end = x.length -1;
        while (end >= start){
            int temp = x[start];
            x[start] = x[end];
            x[end] = temp;
            end --;
            start ++;
        }
        System.out.println(Arrays.toString(x));
    }
}
