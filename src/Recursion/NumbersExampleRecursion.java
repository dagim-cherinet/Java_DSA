package Recursion;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        //write a function that takes in a number and prints it
        //print first 5 numbers 1 2 3 4 5
        print(1);
    }
    static void print(int n){
        //base condition:- the condition that stops further calling of the function(ceases recursion)
            if(n > 5) return;

            System.out.println(n);
        //recursive call
        // if I am calling a functions again and again, I can treat it as a separate call in the stack
            print(n+1);

    }

}
