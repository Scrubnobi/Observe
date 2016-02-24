/*
 * This observer sees the subject and records it in a Hexadecimal form.
 */
package patterns02;

/**
 * @author Mark Smith
 * @version 1.0
 * @since 24/02/2016
 */
public class HexObserver extends Observer {    // 2. Concrete class of the "dependent" 

    public HexObserver(Subject s) {    //    hierarchy
        subj = s;
        subj.attach(this);
    }// 4. Observers register themselves

    @Override
    public void update() {
        System.out.print("  " + Integer.toHexString(subj.getState()));
    }
}// 6. Observers "pull" information 
