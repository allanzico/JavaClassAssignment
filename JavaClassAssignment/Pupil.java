import java.time.*;
import java.util.*;
import java.time.temporal.ChronoUnit;
/**
 * This class uses java 8 date to create the current date
 * @author (Allan Akanyijuka)
 * @version (version 1)
 */
public class Pupil
{
    // instance variables 
    private String name;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private long  age;
    

    /**
     * Constructor for objects of class Pupil
     * @param args
     */
    public static void main(String[] args){
    
    Main m = new Main();
    
    }
    
    public Pupil(String name, int birthDay, int birthMonth, int birthYear)
    {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        LocalDate birthday = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate now = LocalDate.now(); 
        age = ChronoUnit.YEARS.between(birthday, now);
    }


    /**
     * Returns the age of the pupil based on the current date and date of birth
     * @return 
     */
    public long getAge()
    { 
       return age;
    }
    
    /**
     * Returns the name of the pupil 
     * @return 
     */
    public String getName()
    { 
        return name;
    }
    
    /**
     * This method calculates the contribution of the parent based on how old
     * the pupil is
     * @return 
     */
    public double calculateContribution()
    {
        double bill = 0;
        Contribution myContribution = new Contribution();
        if(age < 6){
            bill += myContribution.getUnderSix();
        }
        else if (age < 10 && age > 6){
            bill += myContribution.getUnderTen();
        }
        else {
            bill += myContribution.getAboveTen();
        }
        return bill;
    }
    
    /**
     * Prints details of the pupil; name, age and contribution
     */
    public void printDetails()
    { 
       System.out.println("Name: " + name);
       System.out.println("Age: " + age);
       System.out.println("Contribution: " + calculateContribution());       
       
    }
    
}
