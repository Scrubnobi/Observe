/*
 * This observer sees the subject and records it in a Binary form.
 */
package patterns02;

/**
 * @author Mark Smith
 * @version 1.0
 * @since 24/02/2016
 */
public class BinObserver extends Observer {

    public BinObserver(Subject s) {
        subj = s;
        subj.attach(this);
    } // 4. Observers register themselves
    
    @Override
    public void update() {
        System.out.print("  " + Integer.toBinaryString(subj.getState()));
    }
}// 6. Observers "pull" information 

