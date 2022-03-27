package com.javaAssignment;
import java.util.Scanner;
/*
Use case – Check Swiggy delivery to your area.
*/
public class deliveryTracking
{
    //Method to check if entered zip code is matching with deliverable zip codes.
    //Method throws custom exception invalidZipCodeException if zip code non-deliverable

    void nonDeliverable(int zipcode)
    {
        boolean check = false;
        int[] nonDeliverableZipCodes = new int[]{123, 456, 789};           //Non-deliverable zip code array
        //Try block for exception
        try
        {
            for(int i=0;i<nonDeliverableZipCodes.length;i++)
            {
                if(zipcode==nonDeliverableZipCodes[i])
                {
                    check = true;
                }
            }
            if(check)
            {
                throw new invalidZipCodeException();                       //custom exception thrown
            }
            else
            {
                System.out.println("Delivery available in your area!!");   //If zip code deliverable
            }
        }
        //Catch block
        catch(invalidZipCodeException izp)
        {
            System.out.println(izp.displayMsg());                           //Display error message
        }
    }
    //Custom exception created using Exception class
    public static class invalidZipCodeException extends Exception
    {
        String displayMsg()
        {
            return("\n ATTENTION!! Delivery not available in area having entered zipcode. Please re enter zipcode "); //Error message
        }
    }

    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("\n Enter zip code of your area :");
      int zipc = sc.nextInt();
      deliveryTracking trackObj = new deliveryTracking();   //Class object
      trackObj.nonDeliverable(zipc);                          //Method calling using class object
    }
}
