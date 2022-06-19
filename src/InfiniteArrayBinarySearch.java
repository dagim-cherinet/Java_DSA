public class InfiniteArrayBinarySearch {
    public static void main(String[] args) {
        int [] arr = {22,34,34,55,56,77,88,99,100,101,102,144,188,199};
        int target = 199;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        while (target > arr[end]){
            int newStart = end + 1;
           end = end + (end - start + 1) * 2;
          //  end = end * 2;
          //  System.out.println(end);
            start = newStart;
        }
        return binarySearch(arr, start, end, target );
    }
    static int binarySearch(int [] arr, int start, int end, int target){
        while (start <= end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
