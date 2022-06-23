public class Rotation_count_of_rotated_sorted_array {
        public static void main(String[] args) {
            int[] nums = {19,20,21,22,25,0,5,10,15,17};
            int target = 5;
            int pivot = pivotIndex(nums);
            // System.out.println(pivot);
            System.out.println("the pivot is at index: " + pivot);
          System.out.println("The sorted array is rotated " + (pivot + 1) + " times from the original array");
        }
        //this will not work in duplicated values with in an array
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

                if(nums[mid] > nums[start]){
                    start = mid + 1;
                }
                else if (nums[mid]< nums[start]){
                    end = mid -1;
                }

            }
            return mid;
        }

    }

