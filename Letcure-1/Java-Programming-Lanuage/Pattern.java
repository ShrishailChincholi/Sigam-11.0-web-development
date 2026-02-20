
class star {

    static void printpattern() {
        for (int line = 1; line <= 4; line++) {
            for (int j = 1; j <= line; j++) {
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
class Inverted {

    static void Invertedpattern() {
        int n = 4;
        for (int line = 1; line <= n; line++) {
            for (int j = 1; j <= n - line + 1; j++) {
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

// Print half-pyramid pattern
class HPP {

    static void halfppattern() {
        int n = 4;
        for (int line = 1; line <= n; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}

// Output
// 1
// 12
// 123
// 1234
// Inverted Print half-pyramid pattern
class HPPI {

    static void halfppatternInvorted() {
        int n = 4;
        for (int line = 1; line <= n; line++) {
            for (int number = 1; number <= n - line + 1; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
// Output
// 1234
// 123
// 12
// 1


public class Pattern {

    public static void main(String[] args) {
        System.out.println("Pattern * :-");
        star.printpattern();
        System.out.println();

        System.out.println("Inverted Pattern * :-");
        Inverted.Invertedpattern();
        System.out.println();

        System.out.println("half-pyramid  Pattern * :-");
        HPP.halfppattern();
        System.out.println();

        System.out.println(" Inverted half-pyramid  Pattern * :-");
        HPPI.halfppatternInvorted();
        System.out.println();

    }
}
