import java.util.ArrayList;

public class ReverseArray {
    public static void main(String[] args) {
        int[] myArr = {9,8,7,6,5,4,3,2,1,0};

        reverseArr(myArr);
    }
    static void reverseArr(int[] x){
        ArrayList<Integer> reverse = new ArrayList<>(10);
        for(int i = x.length -1; i>=0; i--){
            reverse.add(x[i]);
        }
        System.out.println(reverse);
    }
}
