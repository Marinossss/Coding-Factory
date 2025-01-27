package gr.aueb.cf.ch9;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private static  final Logger INSTANCE = new Logger();

    private Logger() {
    }

    public static Logger getInstance() {
        return INSTANCE;
    }


    public void logMessage(String message) {

        String timestamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd--MM--yyyy HH:mm:ss"));

        System.err.println("[" + timestamp + "]" + message);
    }
}
