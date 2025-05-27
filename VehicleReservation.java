import java.util.Date;

/**
 * Write a description of class VehicleReservation here.
 *
 * @author Hannah Macartney
 * @version 21/03/25
 */
public class VehicleReservation
{
    private String reservationNo;
    private String vehID;
    private String customerID;
    private Date startDate;
    private int noOfDays;

    /**
     * Constructor for objects of class VehicleReservation
     */
    public VehicleReservation(String newReservationNo, String newVehID, String newCustomerID, Date newStartDate, int newNoOfDays)
    {
        reservationNo = newReservationNo;
        vehID = newVehID;
        customerID = newCustomerID;
        startDate = newStartDate;
        noOfDays = newNoOfDays;
    }

    /**
     * @returns reservationNo
     */
    public String getReservationNo()
    {
        return reservationNo;
    }
    
    /**
     * @returns vehID
     */
    public String getVehID()
    {
        return vehID;
    }
    
    /**
     * @returns customerID
     */
    public String getCustomerID()
    {
        return customerID;
    }
    
    /**
     * @returns startDate
     */
    public Date getStartDate()
    {
        return startDate;
    }
    
    /**
     * @returns noOfDays
     */
    public int getNoOfDays()
    {
        return noOfDays;
    }
    
    /**
     * prints vehicle details to the terminal
     */
    public void printDetails()
    {
        System.out.println("Reservation Number: " + reservationNo + " Vehicle ID: " + vehID);
        System.out.println("Customer ID: " + customerID);
        System.out.println("Start date: " + startDate + " Number of days: " + noOfDays);
    }
}
