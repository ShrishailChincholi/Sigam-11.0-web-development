
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

