public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] ascArr = {1,23,43,43,54,58,99,102,888};
        int[] desArr = {99, 55,33,22,11,10, 2,-1, -4};
        int target = 99;


       int answer = orderAgnosticBinarySearch(desArr, target);
        System.out.println(answer);
    }

    static int orderAgnosticBinarySearch(int[] arr, int target){
        if(arr[0] < arr[arr.length -1]){
         return    ascBinarySearch(arr, target);
        }
         return   descBinarySearch(arr, target);

    }

    static int ascBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
        }
        return -1;
    }
    static int descBinarySearch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target >= arr[mid]){
                end = mid -1;
            }
            else if (target <= arr[mid]){
                start = mid + 1;
            }
        }
        return -1;
    }
}
