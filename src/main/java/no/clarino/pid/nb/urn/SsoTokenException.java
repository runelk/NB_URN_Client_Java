package no.clarino.pid.nb.urn;

/**
 * Created by rkn083 on 19.05.14.
 */
public class SsoTokenException extends RuntimeException {
    public SsoTokenException(Exception e) {
        super(e);
    }

    public SsoTokenException(String s) {
        super(s);
    }
}
