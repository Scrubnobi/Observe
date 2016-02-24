/*
 * This Obsever sees the subject and records it in a Octodecimal.
 */
package patterns02;

/**
 * @author Mark Smith
 * @version 1.0
 * @since 24/02/2016
 */
public class OctObserver extends Observer {

    public OctObserver(Subject s) {
        subj = s;
        subj.attach(this);
    } // 4. Observers register themselves
    
    @Override
    public void update() {
        System.out.print("  " + Integer.toOctalString(subj.getState()));
    }// 6. Observers "pull" information 
     
}
