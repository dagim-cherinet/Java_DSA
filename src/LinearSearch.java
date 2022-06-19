public class LinearSearch {
    public static void main(String[] args) {
        int[] myarr = {2,33,13,442,42,23};
        int target = 42;
        if(linearSearch(myarr, target, 2, 5) != -1){
            System.out.println("yes the target " + target + " is found in the array at " + linearSearch(myarr, target, 2, 5));
        }
    }
    static int linearSearch(int[] arr, int target, int start, int end){
        for(int i =start; i <= end; i++){
            if(arr[i] == target){
                return i;
            }

        }
        return -1;
    }
}
