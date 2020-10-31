import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        /*TODO: add other methods, etc

        ideas:
        - random number generator
        - random letter
        - random item from array


         */
        System.out.println("Hello World");


        System.out.println("Testing:");
        System.out.println(randomInt());
        testRandChar();


        Scanner s = new Scanner(System.in);
        System.out.println("Enter the amount of random integers you want.");
        int numOfRandChars = s.nextInt();
        getRandCharAmount(numOfRandChars);


        System.out.println("Enter the ceiling for your random numbers.");
        int ceiling = s.nextInt();
        randNumCeil(ceiling);



    }

    /**
     * returns a random number from 0 to 100.
     * uses java.util.Random
     *
     * @return
     */
    public static int randomInt() {
        Random r = new Random();
        int randInt = r.nextInt(100);
        return randInt;
    }


    // random number from 0 to ceil
    public static int randNumCeil(int ceil) {
        Random r = new Random();
        int randInt = r.nextInt(ceil);
        return randInt;
    }

    public static char randChar() {
        Random r = new Random();
        return (char) (r.nextInt(26) + 'a');
    }

    // it works!!!
    public static void testRandChar() {
        System.out.print(randChar());
    }


    public static void randCharLoop() {
        for (int i = 0; i < 99; i++) {
            testRandChar();
        }
    }


    public static void getRandCharAmount(int amount) {
        for (int i = 0; i < amount; i++) {
            testRandChar();
        }
    }
}






}