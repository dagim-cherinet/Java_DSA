public class SearchString {
    public static void main(String[] args) {
        String str = "dagim cherinet";
        char target = 'c';
       if(search2(str, target)){
           System.out.println("yes the letter " + target +" is found in the string " + str);
       }
       else {
           System.out.println("no the letter " + target + " is Not found in the string " + str);
       }
    }

    static boolean search(String text, char target){
        for (int i = 0; i <text.length() -1 ; i++) {
            if (text.charAt(i) == target) return true;
        }

        return false;
    }
    static boolean search2(String text, char target){
        for(char element: text.toCharArray()){
            if (element == target) return true;
        }
        return false;
    }
}
