package primitive.data.types;

public class PrimitiveTypes {

//    byte  has a minimum value of -128 and a maximum value of 127 (inclusive)
    byte johnAge = 90;

//    short has a minimum value of -32,768 and a maximum value of 32,767 (inclusive)
    short amountOfShoesInShop = 20000;

//    int has a minimum value of -2**31 and a maximum value of 2**31 -1
    int chinaPopulation = 1000_000_000;

//    long has a minimum value of -2**63 and a maximum value of 2**63 -1
    long distanceToSunInMeters = 149_668_992_000L;

//    float The float data type is a single-precision 32-bit IEEE 754 floating point
    float poundsInKilos = 2.2f;

//    double is a double-precision 64-bit IEEE 754 floating point
    double someFigureAreaInCm = 12.15;

//    boolean  has only two possible values: true and false
    boolean isRaining = true;

//    char is a single 16-bit Unicode character. 
//    It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff'
    char grade = 'A';

    
    public static void main(String[] args) {
        
        System.out.println("**** Show min and max numeric values ****");
        
        System.out.println("min short value: " + Short.MIN_VALUE);
        System.out.println("max short value: " + Short.MAX_VALUE);
        
        System.out.println("---");
        System.out.println("min integer value: " + Integer.MIN_VALUE);
        System.out.println("max integer value: " + Integer.MAX_VALUE);
        
        System.out.println("---");
        System.out.println("min long value: " + Long.MIN_VALUE);
        System.out.println("max long value: " + Long.MAX_VALUE);
        
        System.out.println("---");
        System.out.println("min float value: " + Float.MIN_VALUE);
        System.out.println("max float value: " + Float.MAX_VALUE);
    
        System.out.println("---");
        System.out.println("min double value: " + Double.MIN_VALUE);
        System.out.println("max double value: " + Double.MAX_VALUE);
    
    }

}
