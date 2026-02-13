
import java.util.Scanner;
public class  JavaBasic {
    public static void main(String[] args) {
        System.out.print("Hello World \n");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
}


// Output:-1 
// Hello World

// OutPut2
// Hello World
// Hello World
// Hello World
// Hello World


//  Input in Java
//  Scanner sc = new Scanner(System.in);
// import java.util.Scanner;


class Input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); // sc.next() cannot read spaces in input

        System.out.println(input);

        String FullName = sc.nextLine();  // sc.nextLine() reads the entire line of text and allows spaces between words

        System.out.println(FullName);
    }
}

