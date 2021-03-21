package com.techelevator.models.data;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger
{
    private static PrintWriter writer;

    static
    {
        try
        {
            File file = new File( "log.txt" ).getAbsoluteFile();
            if ( !file.exists() )
            {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter( file, true );
            writer = new PrintWriter( fileWriter );
        }
        catch (Exception ex)
        {

        }
    }

    public static void log( String action, BigDecimal begin, BigDecimal end )
    {
        Date time = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");

        String line = String.format( "%-22s %-22s $%-10s $%-10s", dateFormat.format( time ), action, begin, end );

        writer.println( line );
        writer.flush();
    }
}
