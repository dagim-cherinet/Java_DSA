package Recursion;

public class BS_rotatedArray {
    public static void main(String[] args) {
        int[] nums = {19,20,21,22,25,0,5,10,15,17};
        int target = 20;
        int pivot =pivotIndex(nums);
        System.out.println(pivot);
    }
    static int pivotIndex(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid -1]){
                return mid -1;
            }
            if(arr[mid] < arr[start]){
                end = mid -1;
            }
            else if(arr[mid] > arr[start]) {
                start = mid + 1;
            }
        }
        return  -1;
    }
  //  static int binarySearch(int[] arr,int target, int start, int end){

 //   }
}
