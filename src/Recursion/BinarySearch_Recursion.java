package Recursion;

public class BinarySearch_Recursion {
    public static void main(String[] args) {
        int[] myarr =  {1,2,3,4,5,6,7,8,9,11,12,13,14,15,17,99};
       // System.out.println(binarySearch(myarr, 1, 0, myarr.length-1));
        int ans = binarySearch(myarr, 1, 0, myarr.length-1);
        System.out.println(ans);
    }
    static int binarySearch( int[] arr ,int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end-start) / 2;

        if(target == arr[mid]){
            return mid;
        }

        if(target < arr[mid]){
            return  binarySearch(arr, target, start, mid -1);
        }
        return binarySearch(arr, target, mid+ 1, end);
    }
}
