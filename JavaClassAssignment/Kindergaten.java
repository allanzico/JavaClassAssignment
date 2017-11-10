
import java.time.*;
import java.util.*;
import java.time.temporal.ChronoUnit;
/**
 * This class uses java 8 date to create the current date
 * @author (Allan Akanyijuka)
 * @version (version 1)
 */
public class Kindergaten extends School
{
    private School school;
      
    /**
     * Constructor for objects of class Primary
     */
    public Kindergaten(School school)
    {
        super();
        this.school = school;
        addPupils(); 
    }
    
    public void addPupils()
    {
     setPupils(school.kindergaten());
    }

}
