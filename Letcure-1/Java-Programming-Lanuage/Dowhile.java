
import java.util.Scanner;




public class Dowhile {

// do while 
/*
    public static void main(String[] args) {
        int counter = 1;
        do {
            System.out.println("Hello world");
            counter++;
        } while (counter <= 10);
    }
    */

//  Break 
/*
public static void main(String[] args) {
    for (int i = 1; i <+5; i++){ 
        if (i == 3){
            break;
        }
    }
    System.out.println(" I am out of the loop ");
    
}
 */

//  Using Break 

/*
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    do{
        System.out.println("Enter Your Number : ");
        int n = sc.nextInt();
        if(n % 10 == 0){
            break;
        }
    }while (true);

    
}
*/

//  Continue Statement

/*
public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
        if(i == 3){
            continue;
        }
        System.out.println(i);
    }
}
*/

//  Continue keyword using example
// Display all number entered by user except multiples of 10
/*
public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    do { 
        System.out.println("Enter Your Number ");
        int n = sc.nextInt();
        if(n % 10 == 0){
            continue;
        }
        System.out.println("Number was : "+ n);
    } while (true);
}
*/


// Check if a number is prime or not
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n == 2){
        System.out.println("n is prime");
    }else{
        boolean isprime = true;
        for(int i = 2; i<=n-1; i++){
            isprime = false;
        }

        if(isprime == true){
            System.out.println(" n is prime number");
        }else{
            System.out.println("n is not prime number");
        }
    }
}

}
