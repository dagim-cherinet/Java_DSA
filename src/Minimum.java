public class Minimum {
    public static void main(String[] args) {
        int[] arr = {1,23,43,53,0,6,7,9,10};
        minimum(arr);
    }
    static void minimum(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min){
                min = arr[i];
            }
        }
        System.out.println("the minimum num is " + min);
    }
}
