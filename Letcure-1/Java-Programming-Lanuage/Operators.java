public  class Operators{
    public static void main(String[] args) {
        //  Arithmatic Operator 
        int a = 10;
        int b = 40;
        System.out.println("add = "+(a+b));
        System.out.println("add = "+(a-b));
        System.out.println("add = "+(a*b));
        System.out.println("add = "+(a/b));
        System.out.println("add = "+(a%b));


        // Relational Operators
        int n1 = 10;
        int n2 = 10;
        System.err.println(n1 == n2);
        System.err.println(n1 != n2);
        System.err.println(n1 >= n2);
        System.err.println(n1 <= n2);

        // Logical Operators
        System.err.println("AND statment "+((3<2) && (5>0)));
        System.err.println("OR statment" +((3<2) || (5>0)));
        System.err.println("NOT statment "+!(3<2));
        
        

    }
}

/*
Output
add = 50
add = -30
add = 400
add = 0
add = 10
true
false
true
true
AND statment false
OR statmenttrue
NOT statment true
*/