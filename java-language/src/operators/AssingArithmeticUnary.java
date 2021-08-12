package operators;

public class AssingArithmeticUnary {

    public static void main(String[] args) {

        // asignment
        int days = 2000;

        // arithmetic
        System.out.println("*** Showing basic operations ***");
        System.out.println("1 + 2 = " + (1 + 2));
        System.out.println("6 * 2 = " + (6 * 2));
        System.out.println("1 - 2 = " + (1 - 2));
        System.out.println("7 / 2 = " + (7 / 2));
        System.out.println("7.0 / 2.0 = " + (7.0 / 2.0));
        System.out.println("7 % 2 = " + (7 % 2));
        System.out.println("Compound operators");
        System.out.println(days + " += 3 = " + (days += 3));
        System.out.println(days + " -= 3 = " + (days -= 3));
        System.out.println(days + " *= 2 = " + (days *= 2));
        System.out.println(days + " /= 2 = " + (days /= 2));

        // unary
        System.out.println("*** unary operators ***");
        System.out.println("+1 = " + (+1));
        System.out.println("-1 = " + (-1));
        
        System.out.println("First evaluate, then increment");
        System.out.println(days + "++ = " + (days++));
        System.out.println(days);

        System.out.println(days + "-- = " + (days--));
        System.out.println(days);
        
        System.out.println("First increment, then evaluate");

        System.out.println("++" + days + " = " + (++days));
        System.out.println(days);

        System.out.println("--" + days + " = " + (--days));
        System.out.println(days);
        
        System.out.println("Invert boolean value with !");
        System.out.println("!" + true + " = " + (!true));
                
    }
}
