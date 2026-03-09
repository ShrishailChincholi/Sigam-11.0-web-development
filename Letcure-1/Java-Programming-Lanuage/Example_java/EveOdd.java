import java.util.*;

public class EveOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter an integer: ");
        num = sc.nextInt();

        if (isEven(num)) {
            System.out.println("Number is even");
        } 
        else {
            System.out.println("Number is odd");
        }
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}