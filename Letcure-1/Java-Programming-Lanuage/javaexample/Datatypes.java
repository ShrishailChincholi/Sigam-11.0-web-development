
import java.util.Scanner;

// DataType in  Java
public class Datatypes {

    public static void main(String[] args) {
        byte b = 8;
        System.out.println(b);
        char ch = 'a';
        System.out.println(ch);
        boolean var = true;
        System.out.println(var);
        float price = 10.5f;
        int num = 89;
        System.out.println(price);
        System.out.println(num);
    }
}

// Sum of Number
class SumofTwo {

    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        int sum = a + b;
        System.out.println(sum);
    }
}


// Sum of TwoNumber
class inputsumofAandB{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}


//  Product of a & b 
class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a * b;
        System.out.println(product);
    }
}


// Area of Circule
class  AreaoofCircule{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        float radius = 3.14f * r*r;
        System.out.println(radius);
    }
}