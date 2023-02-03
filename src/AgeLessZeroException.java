public class AgeLessZeroException  extends  Exception{

    public AgeLessZeroException(String message) {
        super(message);
    }

    public AgeLessZeroException(Throwable cause) {
        super(cause);
    }

    public AgeLessZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}
