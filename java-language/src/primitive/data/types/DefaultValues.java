package primitive.data.types;

public class DefaultValues {
    byte b;
    char c;
    int i;
    long l;
    float f;
    double d;
    boolean bool;
}

class Main {

    public static void main(String[] args) {

        DefaultValues dv = new DefaultValues();
        
        System.out.println("**** Show default values for primitive data types ****");
        
        System.out.println("byte: "+ dv.b);
        System.out.println("char: "+ dv.c);
        System.out.println("int: "+ dv.i);
        System.out.println("long: "+ dv.l);
        System.out.println("float: "+ dv.f);
        System.out.println("double: "+ dv.d);
        System.out.println("boolean: "+ dv.bool);

    }
}
