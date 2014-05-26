package no.clarino.pid.nb.urn;

/**
 * Created by rkn083 on 19.05.14.
 */
public class NbUrnException extends Exception {
    public NbUrnException(Exception e) {
        super(e);
    }

    public NbUrnException(String s) {
        super(s);
    }
}
