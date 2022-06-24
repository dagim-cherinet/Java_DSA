import java.util.Arrays;

public class BinarySearchIn_2D_Array {
    public static void main(String[] args){
        int [][] array = {{0,1,2,3}, {5,7,9,10,11},{12,14,15,16,17},{22,23,25,26,27}};
        int target = 2;
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
                int inner_start = 0;
                int inner_end = arr[mid].length -1;
                while (inner_start <= inner_end){
                    int inner_mid = inner_start + (inner_end - inner_start)/2;
                    if(target == arr[mid][inner_mid]) return new int[] {mid, inner_mid};
                    else if(target > arr[mid][inner_mid]){
                        inner_start = inner_mid + 1;
                    }
                    else if (target < arr[mid][inner_mid]){
                        inner_end = inner_mid -1;
                    }
                }
                return new int[] {-1, -1};
            }
        }
        return  new int[] {-1,-1};
    }
}
