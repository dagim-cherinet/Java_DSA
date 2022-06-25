import java.util.Arrays;

public class Bubble_sort_algorithm {
    public static void main(String[] args) {
        int[] unsortedArr = {3,4,5,2,1,0};
        System.out.println(Arrays.toString(bubbleSort(unsortedArr)));
    }
    static int[] bubbleSort(int[] arr){
        boolean nextPass = true;
        for(int i = 0; i< arr.length && nextPass ; i++){
            //if the array is already sorted it doesn't need next pass
            nextPass = false;
            //for each step the max element is sorted in its respective index
            //therefore I shouldn't compare it with the remaining unsorted sub-array
            //so j iterates until arr.length-i i can also say j< arr.length(but its wastage of time)
            for(int j= 1; j< arr.length -i; j++){
                if(arr[j]< arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j -1];
                    arr[j-1] = temp;
                    nextPass = true;
                }
            }
        }
        return arr;
    }
}
