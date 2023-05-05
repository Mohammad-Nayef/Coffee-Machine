package course.project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyLogger {
    public static void log(String message) {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            String formattedDateTime = now.format(formatter);
            
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true));
            
            writer.write(formattedDateTime + " | " + message + ".\n");
            
            writer.close();
        } 
        catch (IOException e) {
            System.exit(0);
        }
    }
}