package Recursion;

public class Fibonacci_numbers {
    public static void main(String[] args) {
      int ans = fiboFormula(6);
      System.out.println(ans);
      //  printFiboSeires(6);
    }

    static void printFiboSeires(int n){
        for (int i = 0; i <=n ; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    static int fibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

         return fibonacci(n -1) + fibonacci(n-2);

    }
    static int fiboFormula(int n){
        return (int) (1/Math.sqrt(5)*((Math.pow((1+Math.sqrt(5))/2,n))-(Math.pow((1-Math.sqrt(5))/2,n))));
    }
}
