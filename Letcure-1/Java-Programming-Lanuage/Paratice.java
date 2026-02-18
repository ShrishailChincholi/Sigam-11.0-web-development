
import java.util.Scanner;

//  que :-1. Inaprogram,input 3 numbers : A, B and C.You have to output
// the average of the se 3 numbers
public class Paratice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = (a + b + c) / 3;
        System.out.println("Avgerage is = "+ avg);
    }
}

// Output
// 10
// 20
// 30
// Avgerage is = 20

//  Question2:In a program,input the side of a square.You have to output the area of the square.

class Areasquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();

        int area = side * side;
        System.err.println("area of the square is : "+area);

    }
}

/*
5
area of the square is : 25
*/


class sloution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float scale = sc.nextFloat();

        float Total = pencil + pen + scale;
        System.err.println("Bill is : - "+Total);

        float newTotal = Total +(0.18f  * Total);

        System.err.println("Bill With 18 % tax");

    }
}

/*
10
20
30
Bill is : - 60.0
Bill With 18 % tax
*/


// CONDITIONAL STATEMENTS QUESTIONS
class solution1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a > 0){
            System.out.println("Posstive Number");
        }else{
            System.out.println("Negative  Number");
        }
    }
}

class solution2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        if(temp > 100){
            System.out.println("You have a fever");
        }else{
            System.out.println("You Don't have fever");
        }
    }
}

class SwitchCase{
    public static void main(String[] args) {
        System.err.println("Enter 1-7 week number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.err.println("Wednesday");
                break;
            case 4:
                System.err.println("Thursday");
                break;
            case 5:
                System.err.println("Friday");
                break;
            case 6:
                System.err.println("Sunday");
                break;
            default:
                System.out.println("Invalid input! Please enter week number between 1-7.");
            break;
        }
    }
}


//  Loop assiganments questions
// Write a program that reads a set of integers,and the n prints the sum of the even and odd integers
class seon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evensum = 0;
        int oddsum = 0;

        do { 
            System.out.println("Enter the number");
            number = sc.nextInt();
            if(number % 2 == 0){
                evensum += number;
            }else{
                oddsum += number;
            }

            System.out.println("Do you want to continue ? press 1 for yes or 0 for exite");
            choice = sc.nextInt();
            System.out.println("Sum of even numbers: "+evensum);
            System.out.println("Sum of odd numbers: "+oddsum);
        } while (choice ==1);
    }
}