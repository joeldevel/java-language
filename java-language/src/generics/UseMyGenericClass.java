package generics;

public class UseMyGenericClass {
    public static void main(String[] args) {
        MyGenericClass<String> aString = new MyGenericClass<String>();

        aString.setGenericObject("wardrobe");

        System.out.println(aString.getGenericObject());

        MyGenericClass<Person> aPerson = new MyGenericClass<Person>();
        aPerson.setGenericObject(new Person("Michael Jackson"));
        System.out.println(aPerson.getGenericObject().getName());
        aPerson.getGenericObject().sing("Billie Jean is not my lover\n" +
                "She's just a girl who claims that I am the one");
    }
}

class Person {

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void sing(String lyrics) {
        System.out.println("\uD83C\uDFB6 " + lyrics + "\uD83C\uDFB6");
    }

    private String name;
}
