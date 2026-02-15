
import java.util.Scanner;

// While loops work with Infinate and 1- n number print
public class Loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter u r choice (while) & (Infinate) & (Print1-n) & (SUM-N)");
        String choice = sc.next();
        System.out.println("Enter Your Range");
        int range = sc.nextInt();
        int count = 0;
        int num = 1;
        int sum = 0;
        int i = 1;
        switch (choice) {
            case "while":
                while (count < range) {
                    System.out.println("Hello Loop");
                    count++;
                }
                break;
            case "Infinate":
                while (true) {
                    System.out.println("Hello Loop");
                }

            case "Print1-n":
                while(num <= range) {
                System.out.print(" " + num);
                num++;
            }
            break;
            case "SUM-N":
                while(i <= range) {
                    sum = sum+i;
                    i++;
            }
            System.out.println("sum = "+sum);
            break;
            default:
                System.out.println("Wrong Choice");
                throw new AssertionError();
        }

    }

}
