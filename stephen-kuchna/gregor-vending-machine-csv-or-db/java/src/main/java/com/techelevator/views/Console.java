package com.techelevator.views;

import com.techelevator.views.menus.Color;
import com.techelevator.views.menus.Colors;

import java.io.PrintWriter;
import java.util.Scanner;

public class Console
{

    private final PrintWriter out;
    private final Scanner in;

    public Console()
    {
        this(new PrintWriter( System.out ),new Scanner( System.in ));
    }

    public Console(PrintWriter out, Scanner in)
    {
        this.out = out;
        this.in = in;
    }

    public void printLine()
    {
        printLine("");
    }

    public void printLine ( String line )
    {
        out.println( line );
        out.flush();
    }

    public void printLine ( String line, Color color )
    {
        out.println( color + line + Colors.RESET);
        out.flush();
    }

    public void printLine ( String line, Color color, Object... args )
    {
        String msg = String.format( line, args );
        out.println( color + msg + Colors.RESET);
        out.flush();
    }

    public void print ( String line )
    {
        out.print( line );
        out.flush();
    }

    public void print ( String line, Color color )
    {
        out.print( color + line + Colors.RESET);
        out.flush();
    }

    public void printf ( String line, Object... args )
    {
        out.printf( line, args );
        out.flush();
    }

    public void printf ( String line, Color color, Object... args )
    {
        String msg = String.format( line, args );
        out.print( color + msg + Colors.RESET);
        out.flush();
    }

    //endregion

    //region Print With Colors
    public void printWhite( String line)
    {
        print(line,Colors.WHITE);
    }

    public void printWhiteLine( String line)
    {
        printLine(line,Colors.WHITE);
    }

    public void printCyan( String line)
    {
        print(line,Colors.CYAN);
    }

    public void printCyanLine( String line)
    {
        printLine(line,Colors.CYAN);
    }

    public void printPurple( String line)
    {
        print(line,Colors.PURPLE);
    }

    public void printPurpleLine( String line)
    {
        printLine(line,Colors.PURPLE);
    }

    public void printBlue( String line)
    {
        print(line,Colors.BLUE);
    }

    public void printBlueLine( String line)
    {
        printLine(line,Colors.BLUE);
    }

    public void printGreen( String line)
    {
        print(line,Colors.GREEN);
    }

    public void printGreenLine( String line)
    {
        printLine(line,Colors.GREEN);
    }

    public void printRed( String line)
    {
        print(line,Colors.RED);
    }

    public void printRedLine( String line)
    {
        printLine(line,Colors.RED);
    }

    public void printBlack( String line)
    {
        print(line,Colors.BLACK);
    }

    public void printBlackLine( String line)
    {
        printLine(line,Colors.BLACK);
    }

    public void printYellow( String line)
    {
        print(line,Colors.YELLOW);
    }

    public void printYellowLine( String line)
    {
        printLine(line,Colors.YELLOW);
    }

    //endregion

    //region input

    public String nextLine()
    {
        return in.nextLine();
    }

    public String nextVendingSlot()
    {
        String input = in.nextLine().trim().toUpperCase();
        if(input.length() > 2)
        {
            return input.substring( 0,2 );
        }
        return input;
    }

    //endregion

    public final void clear()
    {
        final String ANSI_CLS = "\u001b[2J";
        final String ANSI_HOME = "\u001b[H";
        System.out.print(ANSI_CLS + ANSI_HOME);
        System.out.flush();
    }

}
