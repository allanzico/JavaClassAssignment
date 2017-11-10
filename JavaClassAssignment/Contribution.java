import java.util.*;
/**
 * This class uses java 8 date to create the current date
 * @author (Allan Akanyijuka)
 * @version (version 1)
 */
public class Contribution
{
    // instance variables 
    private double underSix;
    private double underTen;
    private double aboveTen;

    /**
     * Constructor for objects of class Contribution
     */
    public Contribution()
    {
       underSix = 38.0;
       underTen = 50.0;
       aboveTen = 65.0;   
    }

    /**
     * Returns the amount of money contributed by pupils under the age of 6
     */
    public double getUnderSix()
    {
        return underSix;
    }
    
    /**
     * Returns the amount of money contributed by pupils under the age of 10
     * but not below the age of 6
     */
    public double getUnderTen()
    {
        return underTen;
    }
    
    /**
     * Returns the amount of money contributed by pupils from the age of 10 
     * and above
     */
    public double getAboveTen()
    {
        return aboveTen;
    }
    
}
