package arrays;

public class SimpleArray {

    public static void main(String[] args) {
        // An array is a container object that holds a fixed number of values of a single type

        // declare an array of doubles. The array is not created after this, just declared
        double[] dailyEarnings;
        // allocate memory to contain 7 doubles. Now the array is created
        dailyEarnings = new double[7];
        // initialize each item mannually (index starts at zero)
        dailyEarnings[0] = 100.0;
        dailyEarnings[1] = 100.0;
        dailyEarnings[2] = 100.0;
        dailyEarnings[3] = 100.0;
        dailyEarnings[4] = 100.0;
        dailyEarnings[5] = 100.0;
        dailyEarnings[6] = 0.0;

        // this creates and assign a seven items array in the same line
        double[] dailyEarnings2 = {100, 100, 100, 100, 100, 100, 100};

        // we can access each item using its index
        System.out.println("Day 1 earnings: " + dailyEarnings[0]);
        System.out.println("---");

        //we can loop through the array
        for (int i = 0; i < dailyEarnings.length; i++) {
            System.out.printf("Day %d earnings: %.2f%n", i + 1, dailyEarnings[i]);
        }
        System.out.println("---");

        // creating a multidimensional array
        char[][] multiArray = {
            {'A', 'B', 'C'},
            {'X', 'Y', 'Z'}
        };
//        show its length
        System.out.println("multidimension array's length: " + multiArray.length);
        System.out.println("multiArray[0].length: " + multiArray[0].length);
        // show all the elements
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
