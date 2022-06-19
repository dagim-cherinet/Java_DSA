public class MaxFromArray {

    public static void main(String[] args) {
        int[] numArr = {1,33,23,55,66,33,99, 999};

        int maxNum = check(numArr);
        System.out.println(maxNum);
    }

    static int check (int[] arr){
            int max = 0;
            for (int x : arr){
                if(x> max) max = x;

            }
        return max;
    }
}
