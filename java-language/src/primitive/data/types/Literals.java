package primitive.data.types;

public class Literals {

    public static void main(String[] args) {
        
//    A literal is the source code representation of a fixed value;
//    literals are represented directly in your code without requiring computation

//    Some examples of literals
        int intLiteral = 2_000_000;
        short shortLiteral = 20_000;
        byte byteLiteral = 120;
        double doubleLiteral = 12_000.233D; // the D or d is opctional
        float floatLiteral = 100.234F; // Note the use of F of f at the end

//    We can use another bases such as 16 and 2
        int hexLiteral = 0x10;
        byte binaryLiteral = 0b10;

//    We can express floating-point literals using E or e for scientific notation
        double someNumber = 1.201e2; // 120.1
        
//        character and string literals
//        char literals are enclosed in single quotes and string literals in double quotes
        char charLiteral = 'X';
        String stringLiteral = "Welcome to Java";
        
        // these both produces the same effect
        char tab = '\t'; 
        String tabString = "\t";  

        // null is a literal that can be used  as a value for any reference type
        // so cannot be used as a value for a primitive
        // int myInteger = null; // this doesn't work.
        String myNullString = null; // this works
        
        // appending .class to a type name will return a class literal
        Class<String> stringClassLiteral = String.class;
        
        
        System.out.println("**** Show literals ****");
        System.out.println("We have numeric literals");
        System.out.println("byte: " + byteLiteral);
        System.out.println("short: " + shortLiteral);
        System.out.println("int: " + intLiteral);
        System.out.println("float: " + floatLiteral);
        System.out.println("double: " + doubleLiteral);
        
        System.out.println("We can write them using base (10), (16) or (2)");
        System.out.println("(10) "+ hexLiteral);
        System.out.println(String.format("(16) 0x%x", hexLiteral));
        System.out.println("---");
        System.out.println("(10) " + binaryLiteral);
        System.out.println("(2) 0b" + Integer.toBinaryString(binaryLiteral));
        System.out.println("And write them using scientific notation E or e");
        System.out.printf( "%f = %6.3e %n",someNumber,someNumber );
        
        System.out.println("---");
        System.out.println("Now some strings and chars");
        System.out.println("A character literal such as: " + charLiteral);
        System.out.println("A string literal --> : " + stringLiteral);
        
        System.out.println("---");
        System.out.println("The next lines include two tabs: one is a char and the other is a string literal");
        System.out.println("This is a"+tab+"line.");
        System.out.println("This is a"+tabString+"line.");
        
        System.out.println("---");
        System.out.println("There is also the null literal");
        System.out.println("A string initialized with null contains: " + myNullString);
        
        System.out.println("---");
        System.out.println("And finally the class literal (this is weird I think)");
        System.out.println("String.class = " + stringClassLiteral);
        
        System.out.println("**** End of program ****");
    }

}
