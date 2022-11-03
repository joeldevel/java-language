package generics;

import java.util.ArrayList;

public class GenericsInArrayList {


    public static void main(String[] args) {
        // An ArrayList can hold different types, in this case strings
        ArrayList<String> cats = new ArrayList<>();
        cats.add("Fluffy");
        cats.add("Whisker");
        cats.add("Sparkle");

//        cats.stream().forEach(System.out::println);
        for (String cat : cats) {
            System.out.println(cat);
        }

        // And this contains Fruits
        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Banana"));
        fruits.add(new Fruit("Apple"));
        fruits.add(new Fruit("Tangerine"));

//        fruits.stream().forEach(f -> System.out.println(f.getName()));

        for (Fruit fruit : fruits) {
            if (fruit.getName() == "Banana") {
                System.out.println("Found a Banana");
            }
        }
    }
}

class Fruit {
    private String name;

    Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
