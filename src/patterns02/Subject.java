/*
 * This is the Subject class and method and has certain qualities such as a 
 * state and when this state changes the obsevers get notified and 
 * change accordingly. 
 */
package patterns02;

import java.util.ArrayList;

/**
 * @author Mark Smith
 * @version 1.0
 * @since 24/02/2016
 */
public class Subject {                                     // 1. The "independent" abs

    ArrayList<Observer> observers = new ArrayList<>();  // 3. Coupled to base class

    private int totalObs = 0;
    private int state;

    public void attach(Observer o) {
        observers.add(o);
        totalObs++;
    } // 3. Coupled

    public int getState() {
        return state;
    }//returns the status

    public void setState(int in) {
        state = in;
        notifyObservers();
    }//it sets the states then calls the notify method.

    private void notifyObservers() {
        for (int i = 0; i < totalObs; i++) {
            observers.get(i).update();
        }
    }        // 3. Coupled to base class

}                                  
// Enter a number: 15
//   f  17  1111
// Enter a number: 17
//   11  21  10001
// Enter a number: 31
//   1f  37  11111
