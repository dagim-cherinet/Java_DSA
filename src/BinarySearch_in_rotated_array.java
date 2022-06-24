public class BinarySearch_in_rotated_array {
    public static void main(String[] args) {
        int[] nums = {19,20,21,22,25,0,5,10,15,17};
        int target = 20;
        int pivot = pivotIndex(nums);
        // System.out.println(pivot);
       System.out.println("the pivot is at index: " + pivot);
        if(pivot == -1) System.out.println(binarySearch(nums, 0, nums.length -1, target));

        if(target == nums[pivot]) System.out.println(pivot);

        if(target >= nums[0])
        {  // the target is definitely left side of the pivot
            System.out.println(binarySearch(nums, 0, pivot, target));
        }
       else
        System.out.println(binarySearch(nums, pivot + 1, nums.length-1, target));

    }
    //this will not work in duplicated values with in an array
    public static int pivotIndex(int[] nums){
        int start = 0;
        int end = nums.length -1;

        int mid = 0;
        while(start <= end){
          mid = start + (end-start)/2;
            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }
            else if(mid > start && nums[mid]< nums[mid - 1]){
               return  mid -1;
            }

            if(nums[mid] > nums[start]){
                    start = mid + 1;
            }
            else if(nums[mid]< nums[start]){
                    end = mid -1;
            }

        }
        return mid;
    }
    static int binarySearch(int[] arr, int start, int end, int target){
        while (start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]) return mid;
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }
        }
        return -1;
    }
}
