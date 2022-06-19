public class EvenDigitsEnhanced {
    public static void main(String[] args) {
        int[] arr = {12,4,4,876, 1020};
        checkEven(arr);
    }
    static void checkEven(int[] arr){
       int count = 0;
        for (int i = 0; i < arr.length ; i++) {
         if(checkDigits(arr[i])){
            count++;}
        }
        System.out.println(count);

    }
    static boolean checkDigits(int num){
        int count = 0;
        int checkNum = num;
        while (checkNum>0){
           count ++;
           checkNum /= 10;
        }
        if (count % 2 ==0){
            System.out.println(num + " has even number of digits");
            return true;
        }
        else {
            return false;
        }
    }
}

