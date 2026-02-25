// Funcation :-Function is a block of code that is executed when it is called.

import java.util.Scanner;

public class Funaction {

    // Funcation Sysntax
    public static void printhelloworld() {
        System.out.println("Hello world");
    }

    // Funaction with paramter or formal parameter
    public static void calculatsum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum i s: " + sum);
    }

    // Find Product 
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    // Factorail 
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    // Binomial Coefficient
    public static int Binomial(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        int binceff = fact_n / (fact_r * fact_nmr);
        return binceff;
    }

    // if number is prime or not
    // public static boolean isPrime(int n){
    //     boolean isPrime = false;
    //     for(int i = 2; i<=n-1; i++){
    //         if(n % i == 0){
    //             isPrime = false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }
    public static boolean isPrime(int n) {
    
        if(n == 2){
            return  true;
        }
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
                
            }
        }
        return true;
    }

    // Print all prime in a range
    public static void  PrimesinRange(int n) {
        for(int i = 2; i<= n ; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
    }

    public static void main(String args[]) {
        printhelloworld();

        // Examples using Parameter
        Scanner sc = new Scanner(System.in);
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
        System.out.println("Number of fact:- " + factorial(f));

        // Binomial Coefficient
        System.out.println("Enter a n value and r value");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int BC = Binomial(n, r);
        System.out.println(" Binomial Cofficient :- " + BC);

        // if a number is prime or not in funcation
        System.out.println("if a number is prime or not in funcation");
        System.out.println(isPrime(6));

        // Print all prime in a range
        System.out.println("Print all prime in a range");
        PrimesinRange(10);
    }
}
