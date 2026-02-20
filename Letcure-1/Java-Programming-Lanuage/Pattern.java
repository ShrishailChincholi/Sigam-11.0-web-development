class star{
    static void printpattern(){
        for (int line = 1; line <=4; line++) {
            for (int j = 1; j <=line; j++) {
                System.err.print("*");
            }
            System.err.println();
        }
    }
}
// Output
// *
// **
// ***
// ****


public  class  Pattern{
    public static void main(String[] args) {
        star.printpattern();
    }
}