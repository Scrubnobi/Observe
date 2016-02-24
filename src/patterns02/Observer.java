/*
 * This method creates the base observer class that all observers use and adhere
 * too.
 */
package patterns02;

/**
 * @author Mark Smith
 * @version 1.0
 * @since 24/02/2016
 */
public abstract class Observer {// 2. Root of the "dependent" hierarchy

    protected Subject subj;

    public abstract void update();
}
