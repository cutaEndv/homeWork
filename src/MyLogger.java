import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyLogger {
    private final String context;
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public enum Level{
        INFO, DEBUG, ERROR
    }

    public MyLogger(String context){
        this.context = context;
    }
    public void log(Level level,String message){
        String timeStamp = dtf.format(LocalDateTime.now());
        System.out.println("["+ timeStamp +"]"+"["+ level + "]" + "["+ context +"]" + message);
    }

}
