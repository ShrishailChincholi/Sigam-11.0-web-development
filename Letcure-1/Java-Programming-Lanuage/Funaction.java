
import java.util.Scanner;


public class Funaction{

    // Funcation Sysntax
    public static void printhelloworld(){
        System.out.println("Hello world");
    }

    public static void calculatsum(int a, int b) {
        int sum = a +b;
        System.out.println("Sum i s: "+sum);
    }


    public static void main(String args[]) {
        printhelloworld();

        // Examples using Parameter
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculatsum(a, b);
    }
}