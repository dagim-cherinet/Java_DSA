public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] my2DArr = {{1,3,4},{34,55},{87,88,89,99,90},{100,101,102,103,104,999,106,107}};
        int max = maximum(my2DArr);
        System.out.println(max);
    }
    static int maximum(int[][] arr){
        int max = arr[0][0];
       // int max = Integer.MIN_VALUE;
        System.out.println(max);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if(arr[i][j] >= max)
                    max = arr[i][j];
            }
        }
        return max;
    }
}
