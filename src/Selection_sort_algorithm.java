import java.util.Arrays;

public class Selection_sort_algorithm {
    public static void main(String[] args) {
        int[] myArr = {3,4,5,2,1,0,-1};
        selection_sort(myArr);
        System.out.println(Arrays.toString(myArr));

    }
    static void selection_sort(int[] arr){

        for (int i = 0; i < arr.length ; i++) {
            int maxIndex = 0;
            int temp;
//the inner for-loop used to search the max with in the sub-array
            for (int j = 0; j < arr.length - i; j++) {
                int max = arr[0];
                if(arr[j] >= max){
                    max = arr[j];
                    maxIndex = j;
                }
            }
           temp = arr[arr.length - 1 - i];
            arr[arr.length -1 -i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }
    //used to find max with in a given sub-array
   /* static int[] findMax(int[] arr, int end){
        int max = -1000;
        int index = 0;
        for (int i = 0; i< end; i++){
            if(arr[i] >= max){
                max = arr[i];
                index = i;
            }
        }
     //   System.out.println(Arrays.toString(new int[] {max, index}));
        return new int[] {max, index};
    }

    */
}
