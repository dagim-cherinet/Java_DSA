import java.util.Arrays;

public class Insertion_sort {
    public static  void main(String[] args){
       int[] myArr = new int[] {2,5,22,0,1,4};
       insertionSort(myArr);
        System.out.println(Arrays.toString(myArr));
    }
    static void insertionSort(int[] arr){
        for(int i =0; i< arr.length -1; i++){
            for(int j = i + 1; j > 0; j --){
                if(arr[j-1]> arr[j]){
                    int temp = arr[j-1];
                     arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else {
                    break;
                }
            }
        }
    }
}
