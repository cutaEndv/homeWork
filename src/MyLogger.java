import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
    public void log(Level level,String message) {
        String timeStamp = dtf.format(LocalDateTime.now());
        String formatted = "[" + timeStamp + "]" + "[" + level + "]" + "[" + context + "] " + message;

        // Always print to console
        System.out.println(formatted);

        // Log to file if DEBUG or ERROR
        if (level == Level.DEBUG) {
            writeToFile("debug.log", formatted);
        } else if (level == Level.ERROR) {
            writeToFile("error.log", formatted);
        }
    }

    private void writeToFile(String filename, String message) {
        try (PrintWriter out = new PrintWriter(new FileWriter(filename, true))) {
            out.println(message);
        } catch (IOException e) {
            System.err.println("[LOGGER ERROR] Could not write to " + filename + ": " + e.getMessage());
        }
    }
}
