
/**
 * 
 * 
 * @author Allan Akanyijuka 
 * @version 1.0
 */


public class Reservation
{
    //Number of people to use reservation
    private int numberOfPeople;
    //True or False of whether customer has car
    private boolean car;
    //End date with Date class
    private Date startDate;
    //End date with Date class
    private Date endDate;
   //Sum of all expenseswith car
    private double totalWithCar;
   //Sum of all expenses without car
    private double totalWithOutCar;
    //Surchage of reservations between 11/07 and 15/08
    private double addSurcharge;
    
    /**
     * Constructor for objects of class Reservation
     */
    public Reservation(int numberOfPeople, boolean car, Date startDate, Date endDate)
    {
        this.numberOfPeople = numberOfPeople;
        this.car = car;
        this.startDate = startDate;
        this.endDate = endDate;
        
    }
    
    /**
     * Return whether the customer has a car or not
     */
    public boolean getCar()
    {
        return this.car;
    }
    
    /**
     * Return the number of people registered to this reservation
     */
    public int numberOfPeople()
    {
        return this.numberOfPeople;
    }
    
    /**
     * Return the checkin date of the reservation
     */
    public Date getStartDate()
    {
        return this.startDate;
    }
    
    /**
     * Return the checkout date of the reservation
     */
    public Date getEndDate()
    {
        return this.endDate;
    }
    
    /**
     * Calculate the bill of the reservation
     */
    public double calculateBill ()
    {
        double bill = 0;
        double site= 15;
        double person = 2.5;
        int car = 3;
        
        //The initial bill without surchage
        if (this.car == true)
        {
          totalWithCar = bill += site + person + car * numberOfPeople;
        } else
        {
           totalWithOutCar = bill += site + person * numberOfPeople ;
        }
        
        //Add surcharge if checkin is between 11th July and 31st July
        if (startDate.getDay() >= 11 && startDate.getDay() <= 31 && startDate.getMonth() == 7)
        {   
            addSurcharge = bill += bill * 0.25;
        }
        
        // Add surcharge if checkout is between 1st August and 15th August
        if (endDate.getDay() >= 1 && endDate.getDay() <= 15 && startDate.getMonth() == 8)
        {   
            addSurcharge = bill += bill * 0.25;
        }
        return bill;    
    }
    
    /**
     * Calculate the number of days booked between 2 dates
     */
    
    public int daysDifference(){
        int startDateDays = this.startDate.getDay();
        int endDateDays = this.endDate.getDay();
        int startDateMonth = this.startDate.getMonth();
        int endDateMonth = this.endDate.getMonth();
        int numberOfDays = 0;
        while (startDateDays != endDateDays || startDateMonth !=endDateMonth){
           numberOfDays++;
           startDateDays++;
           switch(startDateMonth){
               case 1:
               case 3:  
               case 5:
               case 7:
               case 8:
               case 10:
                        if(startDateDays == 32){
                            startDateMonth++;
                            startDateDays = 1;
                        }
                        break;
               case 2:  if(startDateDays == 29){
                            startDateMonth++;
                            startDateDays = 1;
                        }
                
               case 4: 
               case 6:
               case 9:
               case 11: if(startDateDays == 31){
                            startDateMonth++;
                            startDateDays = 1;
                        }
                        break;
                        
               case 12:  if(startDateDays == 31){
                            startDateMonth++;
                            startDateDays = 1;
                        }
                        break;
            }
        }
        return numberOfDays;
    }
    
}
