import java.util.*;
/**
 * This class uses java 8 date to create the current date
 * @author (Allan Akanyijuka)
 * @version (version 1)
 */
public class School
{
    // instance variables 
    private HashSet<Pupil> pupils;
    
    /**
     * Constructor for objects of class School
     */
    public School()
    {
        pupils = new HashSet();
    }

    /**
     * Adds the registered pupil into the school
     */
    public void addPupil(Pupil children)
    {
      pupils.add(children);
    }
    
    /**
     * Adds the registered pupil into the primary school
     * if they are under10 and not below 6
     */
    public HashSet<Pupil> primary(){
        HashSet<Pupil> primaryPupils = new HashSet();
        for(Pupil pupil : pupils){
         long pupilAge = pupil.getAge();
         if(pupilAge < 10 && pupilAge >= 6){
             primaryPupils.add(pupil);
            }
        }
        return primaryPupils;
    }
    
     /**
     * Adds the registered pupil into the kindergaten if they are under6 years
     */
    public HashSet<Pupil> kindergaten(){
        HashSet<Pupil> kindergatenPupils = new HashSet();
         
        for(Pupil pupil : pupils){
            long pupilAge = pupil.getAge(); 
         if(pupilAge < 16){
             kindergatenPupils.add(pupil);
            }
        }
        return kindergatenPupils;
    }
    
     /**
     * Adds the registered pupil into the secondary school if they are above 10
     */
    public HashSet<Pupil> secondary(){
        HashSet<Pupil> secondaryPupils = new HashSet();
        for(Pupil pupil : pupils){
         long pupilAge = pupil.getAge();
         if(pupilAge >= 10){
             secondaryPupils.add(pupil);
            }
        }
        return secondaryPupils;
    }
    
    /**
     * Shows the number of pupils added
     */
    public int getNumberOfPupils()
    {
      return pupils.size();
    }
    
    /**
     * Prints the total number of contributions by all pupils in the school
     */
    public void getTotal()
    {
        double totalContribution = 0;
        for(Pupil pupils : pupils){
        totalContribution += pupils.calculateContribution();
        }
        System.out.println("The total contribution is " + "€" + totalContribution);    
    }    
    
    /**
     * gets age of each pupil entered
     */
    public void getAge()
    {
        for(Pupil pupils : pupils){
        long pupilAge = pupils.getAge();
        System.out.println(pupilAge);
        }     
    }
    
     /**
     * The youngest pupil from all the registered pupils
     */
    public Pupil youngest()
    {
       Pupil youngestPupil;
       youngestPupil = Collections.min( pupils, Comparator.comparing( p -> p.getAge()));
       System.out.println("Name: " + youngestPupil.getName());
       System.out.println("Age: " + youngestPupil.getAge());
       return youngestPupil;      
    }
    
    public void setPupils(HashSet<Pupil> pupils){
        this.pupils = pupils;
    }
    
   }
       

