import java.util.Arrays;

public class BinarySearchIn_2D_Array {
    public static void main(String[] args){
        int [][] array = {{0,1,2,3}, {5,7,9,10,11},{12,14,15,16,17},{22,23,25,26,27}};
        int target = 12;
        System.out.println(Arrays.toString(binaryIn_2D_array(array,target)));
    }

    static int[] binaryIn_2D_array(int[][] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if(target == arr[mid][0]) return new int[] {mid, 0};
            if(target > arr[mid][arr[mid].length -1]){
              start = mid + 1;
              }
           else if(target < arr[mid][0]){
              end = mid -1;
              }
            if(target >= arr[mid][0] && target <= arr[mid][arr[mid].length -1]){
                //this implies the target is inside this particular row so perform binary search
               int column_index = binarySearch(arr[mid], target);
               if(column_index != -1) return new int[] {mid, column_index};
               return new int[] {-1, -1};
            }
        }
        return  new int[] {-1,-1};
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]) return mid;
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else if (target < arr[mid]){
                end = mid - 1;
            }
        }
        return -1;
    }
}
