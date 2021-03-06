public class BS_in_rotated_arrya_with_duplicate_values {
    public static void main(String[] args) {
        int[] nums = {19,20,21,22,25,0,5,10,15,17};
        int target = 5;
        int pivot = pivotIndex(nums);
        // System.out.println(pivot);
        System.out.println("the pivot is at index: " + pivot);
        if(pivot == -1) System.out.println(binarySearch(nums, 0, nums.length -1, target));

        if(target == nums[pivot]) System.out.println(pivot);

        if(target >= nums[0])
        {  // the target is definetly left side of the pivot
            System.out.println(binarySearch(nums, 0, pivot, target));
        }
        //  if(target < nums[0]){
        // the target is definetly right side of the pivot where small values are  present
        //    return binarySearch(nums, pivot + 1, nums.length-1, target);
        //  }

        System.out.println(binarySearch(nums, pivot + 1, nums.length-1, target));
        //  return -1;
    }
    //this will work even if there are duplicated elements within an array
    public static int pivotIndex(int[] nums){
        int start = 0;
        int end = nums.length -1;

        int mid = 0;
        while(start <= end){
            mid = start + (end-start)/2;
            // System.out.println(mid);
            // System.out.println(nums[mid]);

            if(mid < end && nums[mid] > nums[mid + 1]){
                // System.out.println(mid);
                return mid;
            }
            else if(mid > start && nums[mid]< nums[mid - 1]){
                return  mid -1;
            }
            //checking if the start, mid, and end elements are equal
          if(nums[mid] == nums[start] && nums[mid] == nums[end]){
              //skip this duplicate values but first check if they are pivot or not
              if(nums[start] > nums[start + 1]){
                  return start;
              }
              start ++;
              if(nums[end] < nums[end -1]){
                  return end-1;
              }
              end --;
          }
          else if (nums[mid] > nums[start]){
              start = mid + 1;
          }
          else if(nums[mid] < nums[start]){
              end = mid -1;
          }

        }
        return mid;
    }
    static int binarySearch(int[] arr, int start, int end, int target){
        while (start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]) return mid;
            else if(target > arr[mid] || (arr[mid] == arr[start] && arr[start] > arr[end])){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }
        }
        return -1;
    }
}
