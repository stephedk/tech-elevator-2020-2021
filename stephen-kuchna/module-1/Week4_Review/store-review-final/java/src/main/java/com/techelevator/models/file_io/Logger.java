package com.techelevator.models.file_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Responsibilities:
 *      log messages to a log file
 * 
 * Details:
 *      All log files have the name of the current date (i.e. 2021-01-06) end with a .log extension
 *      The constructor requires the name of a directory which will determine where the log file is created.
 */
public class Logger 
{
    private static final String FILE_EXTENSION = ".log";

    private String directory;

    public Logger(String directory)
    {
        this.directory = directory;
    }

    public void logMessage(String message)
    {
        String fileName = LocalDate.now().format(DateTimeFormatter.ISO_DATE); //YYYY-MM-DD
        String logFilePath = directory + "/" + fileName + FILE_EXTENSION;
        File logFile = new File(logFilePath);

        String currentTime = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);

        // open the log file to append 
        try(FileOutputStream outputStream = new FileOutputStream(logFile, true);
            PrintWriter writer = new PrintWriter(outputStream);)
        {
            String line = String.format("%s %s", currentTime, message);
            writer.println(line);
        }
        catch(Exception ex)
        {
            //swallow
        }
        

    }
    
    
}
