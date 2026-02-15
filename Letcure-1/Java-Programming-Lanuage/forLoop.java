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

}
