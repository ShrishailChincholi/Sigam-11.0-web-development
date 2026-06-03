// For - Loop

public class forLoop {

    /* For -loop Syntax
     public static void main(String[] args) {
         for (int  i = 1; i < 10; i++) {
             System.out.println("Hello world");
         }
    }*/
    // Square pattern
    /*
    public static void main(String[] args) {     
        for (int i = 1; i <= 4; i++) {
            System.out.println("****");
        }
    } */

 /*
// Print Reverse of a number
    public static void main(String[] args) {
        int n = 10837;
        while (n>0) { 
            int lastdigit = n % 10;
            System.out.print(lastdigit+" ");
            n = n/10;
        }
        System.out.println();
    }
     */

    //  Reverse the given number
    public static void main(String[] args) {
        int n = 18766;
        int rev = 0;

        while (n >0) { 
            int lastDigit = n %10;
            rev = (rev*10) +lastDigit;
            n = n/10;
        }
        System.out.println(rev);
    }

}
