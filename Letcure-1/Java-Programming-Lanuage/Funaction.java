// Funcation :-Function is a block of code that is executed when it is called.


import java.util.Scanner;


public class Funaction{

    // Funcation Sysntax
    public static void printhelloworld(){
        System.out.println("Hello world");
    }

    // Funaction with paramter or formal parameter
    public static void calculatsum(int a, int b) {
        int sum = a +b;
        System.out.println("Sum i s: "+sum);
    }

    // Find Product 
    public static int multiply(int a, int b){
        int product = a* b;
        return product;
    }

    // Factorail 
    public static int factorial(int n){
        int f=1;
        for(int i = 1; i<=n; i++){
            f = f*i;
        }
        return f;
    }

    // Binomial Coefficient
    public static int Binomial(int n , int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int binceff = fact_n / (fact_r * fact_nmr);
        return binceff;
    }


    public static void main(String args[]) {
        printhelloworld();

        // Examples using Parameter
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculatsum(a, b);

        // Product Example
        System.out.println("Product Example ");
        int prod = multiply(a, b);
        System.out.println("a * b = " + prod);

        // Factorial Example
        System.out.println("Enter factoirla Number ");
        int f = sc.nextInt();
        System.out.println("Number of fact:- "+factorial(f));

        // Binomial Coefficient
        System.out.println("Enter a n value and r value");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int BC= Binomial(n, r);
        System.out.println(" Binomial Cofficient :- "+BC);
    }
}

