public class StringCounterException extends Exception{

    public StringCounterException(){
        super();
    }

    public StringCounterException(String message){
        super(message);
    }

    public StringCounterException(String message, Throwable cause){
        super(message, cause);
    }

    public StringCounterException(Throwable cause){
        super(cause);
    }
}
