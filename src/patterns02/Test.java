/*
 * This method generates random numbers to allow the program to be tested with
 * a variety of numbers without having to input them.
 */
package patterns02;

import java.util.Random;

/**
 * @author Mark Smith
 * @version 1.0
 * @since 24/02/2016
 */
public class Test {

    int number;

    public Test() {
        number = 0;
    }//initialises number

    public int increment(){
        number++;
        System.out.println(number);
        return number;
    }//add one to the current number
    
    public int random(){
        Random rand = new Random();
        number = rand.nextInt(100);
        System.out.println(number);
        return number;
    }//generates new random number
}
