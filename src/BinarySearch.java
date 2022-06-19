public class BinarySearch {
    public static void main(String[] args) {
       int[] myarr = {1,33,934,3434,8980,9999};
       int target = 9999;
int answer = binarySearch(myarr, target);

if(answer != -1){
    System.out.println(target + " is found at index " + answer);
}
else {
    System.out.println(target + " doesn't exist");
}
    }
    // return index
    // return -1 if the target does not exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int middle = 1;
        while (start <= end){
            //find the middle element
            middle = (start + end) / 2;
            if(arr[middle] == target){
             return middle;
            }
           else if(target > arr[middle]){
                start = middle + 1;
            }
           else if(target < arr[middle]){
               end = middle -1;
            }
        }
        return -1;

    }

}
