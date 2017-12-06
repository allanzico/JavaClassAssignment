import java.util.Calendar;
/**
 * Write a description of class Date here.
 * 
 * @author Allan Akanyijuka
 * @version 1.0
 */

public class Date
{
    // instance variables - replace the example below with your own
    private int day;
    private int month;
    private int year;
    private int startDate;
    private int endDate;

    /**
     * Constructor for objects of class Date
     */
    public Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
        
    }
    
    public int getDay()
    {
        return day;
    }
    
    public int getMonth()
    {
        return month;
    }
    
    
}
