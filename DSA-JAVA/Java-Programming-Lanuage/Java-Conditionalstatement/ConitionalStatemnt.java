
import java.util.Scanner;

public class ConitionalStatemnt {

    // If -else
    public static void main(String args[]) {
        int age = 22;
        if (age >= 18) {
            System.out.println("Adult: Drive, Vote");
        } else {
            System.out.println("Not Adult");
        }
    }
}

class largestof2 {

    public static void main(String[] args) {
        int a = 34;
        int b = 29;
        if (a >= b) {
            System.out.println("A is largest of 2");
        } else {
            System.out.println("B is largest of 2");
        }
    }
}

class EvenOROdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}

// Else -if Statment;
class elseifst {

    public static void main(String[] args) {
        int age = 22;
        if (age >= 18) {
            System.out.println("Adult");
        } else if (age >= 13 && age < 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("Child");
        }
    }
}

class taxcalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        
        if(income < 500000){
            tax = 0;
        }else if(income >= 500000 && income < 1000000){
            tax = (int) (income *0.2f);
        }
        else{
            tax = (int) (income *0.3f);
        }
        System.out.println("Your tax is : "+tax);
    }
}

class ternaryoperator{
    public static void main(String[] args) {
        int number = 4;

        String type = ((number%2)==0) ? "Even" :"Odd";
        System.out.println(type);

        // Student pass or fail
        int Marks = 4;

        String result = Marks >= 33 ? "Even" :"Odd";
        System.out.println(result);
    }
}


// Switch Statement

class SwitchCase{
    public static void main(String[] args) {
        int num = 2;
        switch (num) {
            case 1:
                System.out.println("Samosa");
                break;
            case 2:
                System.out.println("Burger");
                break;
            case 3:
                System.err.println("Mango Shake");
            default:
                System.out.println("We Wake Up");
            break;
        }
    }
}

class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        System.out.println("Enter Operator :");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.err.println(a * b);
                break;
            case '/':
                System.err.println(a / b);
                break;
            case '%':
                System.err.println(a % b);
                break;
            default:
                System.out.println("wrong Operator");
            break;
        }
    }
}

