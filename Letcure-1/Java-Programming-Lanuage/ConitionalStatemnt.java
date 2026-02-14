
import java.util.Scanner;

public class ConitionalStatemnt{

    // If -else
    public static void main(String args[]){
        int age = 22;
        if(age >= 18){
            System.out.println("Adult: Drive, Vote");
        }
        else{
            System.out.println("Not Adult");
        }
    }
}

class largestof2{
    public static void main(String[] args) {
        int a = 34;
        int b = 29;
        if (a>=b) {
            System.out.println("A is largest of 2");
        }else{
            System.out.println("B is largest of 2");
        }
    }
}

class EvenOROdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num %2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}

// Else -if Statment;

class elseifst{
    public static void main(String[] args) {
        int age = 22;
        if (age>=18) {
            System.out.println("Adult");
        }else if(age >=13 && age <18){
            System.out.println("Teenager");
        }else{
            System.out.println("Child");
        }
    }
}