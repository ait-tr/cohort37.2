public class EmptyDatasetException extends RuntimeException{
     private int code;

    public EmptyDatasetException(String message, int code) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
