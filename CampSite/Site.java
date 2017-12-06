import java.util.ArrayList;
/**
  * 
 * @author Allan Akanyijuka
 * @version 1.0
 */
public class Site
{
   
    private ArrayList<Reservation> reservations;
  

    /**
     * Constructor for objects of class Site
     */
    public Site()
    {
        reservations = new ArrayList<Reservation>();
      
    }

    /**
     *Add new reservation
     */
    public void addReservation(Reservation reserved)
    {
        reservations.add(reserved);
    }
    
    /**
     * Display number of reservations entered on site
     */
    public int numberOfReservations()
    {
        return reservations.size();
    }
    
    /**
     * Display the Total number of people from all reservations
     */
    public int getTotalPeople()
    {  
         int totalNumberOfPeople = 0;
         for (Reservation people : reservations)
         {
             totalNumberOfPeople += people.numberOfPeople();
         }
         return totalNumberOfPeople;
    }
    
    /**
     * Print the sum of all expenses from reservations added to this site
     */
    public void printTotal()
    {
        double total = 0;
        for(Reservation reservations : reservations)
        {
            total += reservations.calculateBill();
        }
        System.out.println("The total cost of all reservations is " + "€" + total);
    }    
    
    /**
     * Return the average number of days reserved from all reservations entered into this site
     */
    public int averageDaysReserved()
    {
      int averageDays=0;
      for (Reservation reservation : reservations){
          averageDays+=reservation.daysDifference();
      }
      averageDays/=reservations.size();
      return averageDays;
    }
}
