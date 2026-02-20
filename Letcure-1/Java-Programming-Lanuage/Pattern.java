class star{
    static void printpattern(){
        for (int line = 1; line <=4; line++) {
            for (int j = 1; j <=line; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// Output
// *
// **
// ***
// ****


// Inverted-star pattern
class Inverted{
    static void Invertedpattern(){
        int n =4;
        for (int line = 1; line <=n; line++) {
            for (int j = 1; j <=n-line+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// Output
// ****
// ***
// **
// *



public  class  Pattern{
    public static void main(String[] args) {
        System.out.println("Pattern * :-");
        star.printpattern();
        System.out.println();
        System.out.println("Inverted Pattern * :-");
        Inverted.Invertedpattern();
    }
}