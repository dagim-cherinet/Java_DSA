public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] my2DArr = {{1,3,4},{34,55},{87,88,89,99,90},{100,101,102,103,104,105,106,107}};
        int target = 99;
        boolean result = search(my2DArr, target);
        if(result){
            System.out.println("the target is found");
        }
        else {
            System.out.println("the target is not found in the array");
        }
    }
    static boolean search(int[][] arr , int target){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if(arr[i][j] == target){
                    System.out.println("target found at coordinate " + "(" + i + " , " + j + ")");
                    return true;
                }
            }
        }
        return false;
    }
}
