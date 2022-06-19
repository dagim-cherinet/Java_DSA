public class OrderAgnosticEnhancedBinarySearch {
    public static void main(String[] args) {
        int[] ascArr = {1,23,43,43,55,58,99,102,888};
        int[] desArr = {99, 55,33,22,11,10, 2,-1, -4};
        int target = -4;
        int answer = orderAgnosticEnhanced(desArr, target);
        System.out.println(answer);
    }
    static int orderAgnosticEnhanced(int [] arr, int target){
        boolean isAsc = true;
        if(arr[0] < arr[arr.length -1]){
            isAsc = true;
        }
        else {
            isAsc = false;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if (target > arr[mid]){
                if(isAsc){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            else if (target < arr[mid]){
                if(isAsc){
                    end = mid -1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
