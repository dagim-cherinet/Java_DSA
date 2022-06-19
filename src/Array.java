import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] myarr = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < myarr.length ; i++) {
            myarr[i] = in.nextInt();
        }

//        for (int j : myarr) {
//            System.out.print(j + ", ");
//        }
        System.out.println(Arrays.toString(myarr));
    }
}
