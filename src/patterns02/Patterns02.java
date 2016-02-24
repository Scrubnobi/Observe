/*
 * This Program is an example of the Observer Pattern.
 * The Subject is created and the observers are attached and when the subject 
 * changes the obsevers get notified and change accordingly. at every point the 
 * subject changes the program also prints out the subject followed but the 
 * outputs of the diffrent observers.
 */
package patterns02;

import java.util.Scanner;

/**
 * @author Mark Smith
 * @version 1.0
 * @since 24/02/2016
 */
public class Patterns02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        Scanner in = new Scanner(System.in);
        Test proto = new Test();
        Subject sub = new Subject();
        // 7. Client configures the number and type of Observers
        new HexObserver(sub);
        new OctObserver(sub);
        new BinObserver(sub);
        while (i < 100) {
            System.out.print("\nEnter a number: ");
            sub.setState(proto.random());
            i++;
        }
        System.out.print("\n");
    }

}
