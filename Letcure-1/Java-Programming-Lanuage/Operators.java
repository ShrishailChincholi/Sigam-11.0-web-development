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
        System.out.println(n1 != n2);
        System.out.println(n1 == n2);
        System.out.println(n1 >= n2);
        System.out.println(n1 <= n2);

        // Logical Operators
        System.out.println("AND statment "+((3<2) && (5>0)));
        System.out.println("OR statment" +((3<2) || (5>0)));
        System.out.println("NOT statment "+!(3<2));
        
        // Assignment Operators
        int n3 = 10;
        n3 += 10;
        System.out.println("Assignment Operators"+n1);

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
20
*/