/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment.pkg2.pkg2d.arrys;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Assessment22DArrys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Customers cust = new Customers();    
        Customers Customer = new Customers();
        Customers[][] custArry = new Customers[12][6];
        custArry = cust.OneFooeBoy(custArry);
        Customer.PrintSeatPlan(custArry);
        FileService Service = new FileService();
        String FileParth = "FlightSeating.txt";
        System.out.println(" To booking fight please enter 1, To cancel flight enter 2, To search for a fightbooking press 3, to exit the aplication press 4 ");
        
        boolean hello = false;
        String bum;
        while(hello == false)
        {
          String chose = input.nextLine();
            if ("1".equals(chose))
            {
                System.out.println("Please enter your name");
                String name = input.nextLine();
                
                System.out.println("Please choose a seat class, for a First class seat Press 1, for a Business class Press 2, for a Economy class seat Press 3 ");
                String Class = "";
                while( hello == false) 
                {
                    bum = input.nextLine();
                    
                    if ("1".equals(bum))
                    {
                       Class = "First class";
                       hello = true;
                    }
                    else if ("2".equals(bum))
                    {
                       Class = "Business class";
                       hello = true;
                    }
                     else if ("3".equals(bum) )
                    {
                       Class = "Economy class";
                       hello = true;
                    }
                    else
                    {
                        System.err.println("That is not a vaild option");
                    }
                }
               
                System.out.println("are you a child, please enter yes or no");
                hello = false;
                boolean child = false; 
                while (hello == false) 
                {
                       bum = input.nextLine();
                    
                    if("yes".equals(bum))
                    {
                        child = true;
                        hello = true;
                    
                    }
                    
                    else if("no".equals(bum))
                    {
                        child = false;
                        hello = true;
                    }
                    else
                    {
                        System.err.println("That is not a vaild option");
                    }
                }
                
                System.out.println("Please choose a seat position, for a  window seat press 1, for a aisle seat press 2, for a middle seat press 3");
                String SeatType = "";
                hello = false;
                while( hello == false) 
                {
                    bum = input.nextLine();
                    
                    if("1".equals(bum))
                    {
                       SeatType = "Window";
                       hello = true;
                    }
                    else if ("2".equals(bum))
                    {
                       SeatType = "Aisle";
                       hello = true;
                    }
                     else if ("3".equals(bum))
                    {
                       SeatType = "Middle";
                       hello = true;
                    }
                    else
                    {
                        System.err.println("That is not a vaild option");
                    }
                }
                Customers AddCustomer = new Customers(name,child,Class,SeatType); 
                custArry = AddCustomer.AllocateSeats(AddCustomer, custArry);
                String Data = cust.GenerateFileData(custArry);
                
                Service.WriteDataToFile(FileParth, Data, 0);
                
                
                System.out.println("thank you for useing power hungry flight center please continue to use the app. if you wish to quit please press 4");
               hello = false; 
               
            }
            else if("2".equals(chose)) 
            {
                Customers CancelCus = new Customers();
                System.out.println("Please enter the name for the booking");
                String SearchItem = input.nextLine();
                int i = 0;
                int j = 0;
                boolean found = false;
                boolean almostFound = false;
                
                while (i < custArry.length && found == false  )
                {
                  while (j < custArry[i].length && almostFound == false) 
                  {
                    if ( custArry[i][j].GetCustomerName().equals(SearchItem)  )
                    {
                        CancelCus = custArry[i][j];
                        almostFound = true;
                        found = true;
                    }
                    else
                    {
                       j++; 
                    }
                      
                  }
                  if (almostFound == true)
                  {
                    System.out.println("The booking found has the folowing details:\n" +"Name: " + CancelCus.GetCustomerName() +"\n"
                    + "Child Ticket: " + CancelCus.GetChild() + "\n" + "Seat Class: " + CancelCus.GetFlightClass() 
                    +"\n" + "Seat Position" + CancelCus.GetSeatType() +"\n" + "is this the booking you wish to cancel Please answer yes or no."  );
                    String YesOrNo = input.nextLine();
                    if ( "yes".equals(YesOrNo))
                    {
                     
                      CancelCus = Customer.Cancelbooking(custArry, i, j);                
                      custArry[i][j] = CancelCus;  
                      
                      String Data = cust.GenerateFileData(custArry);
                      Service.WriteDataToFile(FileParth, Data, 0);
                      
                      System.err.println("Your booking has been cancled");
                    }
                    
                    else if ("no".equals(YesOrNo))
                    {
                      almostFound = false;
                      found = false;
                    }
                    else 
                    {
                        
                    System.out.println("That is not a valid input");
                    
                    }
                     
                  }
                  else
                  {
                     i++;
                  }  
               }
                if (found == false) 
                {
                     System.err.println("Sorry that Booking could not be found could not be found"); 
                }
                       
               hello = false;
               found = false;
            }
            else if("3".equals(chose)) 
            {
                Customers CancelCus = new Customers();
                System.out.println("Please enter the name for the booking");
                String SearchItem = input.nextLine();
                int i = 0;
                int j = 0;
                boolean found = false;
                boolean almostFound = false;
                
                while (i < custArry.length && found == false  )
                {
                  while (j < custArry[i].length && almostFound == false) 
                  {
                    if ( custArry[i][j].GetCustomerName().equals(SearchItem)  )
                    {
                        CancelCus = custArry[i][j];
                        almostFound = true;
                        found = true;
                    }
                    else
                    {
                       j++; 
                    }
                      
                  }
                  if (almostFound == true)
                  {
                    System.out.println("The booking found has the folowing details:\n" +"Name: " + CancelCus.GetCustomerName() +"\n"
                    + "Child Ticket: " + CancelCus.GetChild() + "\n" + "Seat Class: " + CancelCus.GetFlightClass() 
                    +"\n" + "Seat Position" + CancelCus.GetSeatType() +"\n" + "is this the booking you wher looking for."  );
                    String YesOrNo = input.nextLine();
                    if ( "yes".equals(YesOrNo))
                    {
                     System.out.println("thank you for useing power hungry flight center please continue to use the app. if you wish to quit please press 4"); 
                    }
                    
                    else if ("no".equals(YesOrNo))
                    {
                      almostFound = false;
                      found = false;
                    }
                    else 
                    {
                        
                    System.out.println("That is not a valid input");
                    
                    }
                     
                  }
                  else
                  {
                     i++;
                  }  
               }
                if (found == false) 
                {
                     System.err.println("Sorry that Booking could not be found could not be found"); 
                }
                       
               hello = false;
               found = false;
                 
            }
            else if("4".equals(chose)) 
            {
               hello = true;
               System.out.println("thank you");
            }
            else
            {
                System.out.println(" that is not a valid input ");    
            }
        }
     
    }
    
}
