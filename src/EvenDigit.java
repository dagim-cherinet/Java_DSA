public class EvenDigit {
    public static void main(String[] args) {
        int[] myarr = { 12,0,5,44, 1000,123,55};
int count = 0;

        for (int i = 0; i <myarr.length ; i++) {
            String num = Integer.toString(myarr[i]);
            //char[] digitChar = num.toCharArray();
            if(num.length() % 2 ==0){
                System.out.println(myarr[i] + " has even number of digits");
                count ++;
            }
            else{
                System.out.println(myarr[i] + " has odd number of digits");
            }
        }
        //System.out.println("no number in the list has even digit");
        System.out.println("the total numbers of numbers with even digit is " + count);
    }
}
