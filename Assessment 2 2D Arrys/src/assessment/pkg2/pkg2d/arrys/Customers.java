/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment.pkg2.pkg2d.arrys;
import java.util.*;
/**
 *
 * @author User
 */
public class Customers implements Comparable<Customers>{
    // private varibles 
    private String CustomerName;
    private boolean Child;
    private String FlightClass;
    private String SeatType;
    private int Row;
    private int Column;
  
    // getters and setters
    public String GetCustomerName()
    {
       return this.CustomerName;
    }
    
    public void SetCustomerName(String customername) 
    {
     this.CustomerName = customername;
    }
    
    public boolean GetChild()
    {
        return this.Child;
    }
    
    public void SetChild(Boolean child)
    {
        this.Child = child;   
    }
    public String GetFlightClass()
    {
        return this.FlightClass;
    }
    public void SetFlightClass(String flightClass)
    {
        this.FlightClass = flightClass;
    }
    
    public String GetSeatType()
    {
        return this.SeatType;
    } 
    
    public void SetSeatType(String seatType)
    { 
        this.SeatType = seatType;
    }
    
    // blank constructer 
    public Customers ()
    {
        
    }
    //constructor with all variables 
    public Customers( String customername, boolean child, String flightclass, String seatype)
    {
      this.CustomerName = customername;
      this.Child = child;
      this.FlightClass = flightclass;
      this.SeatType = seatype;  
    }
    // asin       
    public Customers[][] AllocateSeats (Customers cust, Customers[][] custarry)
    
    
    {
        //swich statement for Allocateing Seats
        switch(cust.FlightClass) 
        {
         // First class start
         case "First class":
         // if the user whants a window seat
         if ("Window".equals(cust.SeatType))  
         {  
          // makes shore that it dosent right it twice
           Boolean Steve = false;
           // looping through the arry but only the first class rows
            for (int i = 0; i < 2; i++) 
             {
               // looping though each row
                for(int j = 0; j < custarry[i].length ; j++ )
                {
                   //this will make sure the seat is a window steat
                   if (j == 0  && Steve == false || j == 5 && Steve == false)
                   {
                      // if there isn't someone sitting in that seat already  
                      if("".equals(custarry[i][j].CustomerName))
                      {
                        //sit them here
                        custarry[i][j] = cust;
                        custarry[i][j].Row = i;
                        custarry[i][j].Column = j;
                                ;
                        Steve = true;
                      }
                      
                   } 
                      
                   
                } 
             }
         }
         // if the user whants a aisle seat
         else if ("Aisle".equals(cust.SeatType)) 
         {
           // makes shore that it dosent right it twice
           Boolean Steve = false;
            // looping through the arry but only the first class rows
            for (int i = 0; i < 2; i++) 
             {
                // looping though each row
                for(int j = 0; j < custarry[i].length ; j++ )
                {
                   //this will make sure the seat is a Aisle steat
                   if (j == 1 && Steve == false || j == 4 && Steve == false)
                   {
                      // if there isnt someone siting there already 
                      if("".equals(custarry[i][j].CustomerName))
                      {
                        //seat them here
                        custarry[i][j] = cust; 
                        custarry[i][j].Row = i;
                        custarry[i][j].Column = j;
                         Steve = true;
                      }
                      
                   } 
                      
                   
                } 
             }
             
         }
          // if the user whants a middle seat
         else
         { 
          // makes shore that it dosent right it twice
           Boolean Steve = false;
           // looping through the arry but only the first class rows
            for (int i = 0; i < 2; i++) 
             {
                // looping though each row
                for(int j = 0; j < custarry[i].length ; j++ )
                {
                    //this will make sure the seat is a Middle steat
                   if (j == 3 && Steve == false || j == 4 && Steve == false)
                   {
                      // if there isnt someone siting there already 
                      if("".equals(custarry[i][j].CustomerName))
                      {
                        //seat them here
                        custarry[i][j] = cust; 
                        custarry[i][j].Row = i;
                        custarry[i][j].Column = j;
                        Steve = true;
                      }
                      
                   } 
                      
                   
                } 
             }
         };
         // First class end 
         break;
         //start of Business class
         case "Business class":
        // if the user whants a window seat   
         if ("Window".equals(cust.SeatType))  
         { 
           // makes shore that it dosent right it twice   
           Boolean Steve = false;
           // looping through the arry but only the first class rows
            for (int i = 2; i < 5 ; i++) 
             {
                for(int j = 0; j < custarry[i].length ; j++ )
                {
                   if (j == 0 && Steve == false|| j == 5 && Steve == false)
                   {
                       // if there isnt someone siting there already 
                      if("".equals(custarry[i][j].CustomerName))
                      {
                        //seat them here
                        custarry[i][j] = cust;  
                        custarry[i][j].Row = i;
                        custarry[i][j].Column = j;
                        Steve = true;
                      }
                      
                   } 
                      
                   
                } 
             }
         }
         else if ("Aisle".equals(cust.SeatType)) 
         {
           Boolean Steve = false;
            for (int i = 2; i < 5 ; i++) 
             {
                for(int j = 0; j < custarry[i].length ; j++ )
                {
                   if (j == 1 && Steve == false || j == 4 && Steve == false)
                   {
                      if("".equals(custarry[i][j].CustomerName))
                      {
                        custarry[i][j] = cust;
                        custarry[i][j].Row = i;
                        custarry[i][j].Column = j;
                        Steve = true;
                      }
                      
                   } 
                      
                   
                } 
             }
             
         }
         else
         { 
           Boolean Steve = false;
            for (int i = 2; i < 5 ; i++) 
             {
                for(int j = 0; j < custarry[i].length ; j++ )
                {
                   if (j == 3 && Steve == false || j == 4 && Steve == false)
                   {
                      if("".equals(custarry[i][j].CustomerName))
                      {
                        custarry[i][j] = cust;
                        custarry[i][j].Row = i;
                        custarry[i][j].Column = j;
                        Steve = true;
                      }
                      
                   } 
                      
                   
                } 
             }
         };
         break;
         
         case "Economy class":    
         if ("Window".equals(cust.SeatType))  
         { 
           Boolean Steve = false;
            for (int i = 5; i < 11; i++) 
             {
                for(int j = 0; j < custarry[i].length ; j++ )
                {
                   if (j == 0 && Steve == false || j == 5 && Steve == false)
                   {
                      if("".equals(custarry[i][j].CustomerName))
                      {
                        custarry[i][j] = cust;
                        custarry[i][j].Row = i;
                        custarry[i][j].Column = j;
                        Steve = true;
                      }
                      
                   } 
                      
                   
                } 
             }
         }
         else if ("Aisle".equals(cust.SeatType)) 
         {
           Boolean Steve = false;
            for (int i = 5; i < 11; i++) 
             {
                for(int j = 0; j < custarry[i].length ; j++ )
                {
                   if (j == 1 && Steve == false || j == 4 && Steve == false)
                   {
                      if("".equals(custarry[i][j].CustomerName))
                      {
                        custarry[i][j] = cust;
                        custarry[i][j].Row = i;
                        custarry[i][j].Column = j;
                        Steve = true;
                      }
                      
                   } 
                      
                   
                } 
             }
             
         }
         else
         { 
           Boolean Steve = false;
            for (int i = 5; i < 11; i++) 
             {
                for(int j = 0; j < custarry[i].length ; j++ )
                {
                   if (j == 3 && Steve == false || j == 4 && Steve == false)
                   {
                      if("".equals(custarry[i][j].CustomerName))
                      {
                        custarry[i][j] = cust;
                        custarry[i][j].Row = i;
                        custarry[i][j].Column = j;
                        Steve = true;
                      }
                      
                   } 
                      
                   
                } 
             }
         }; 
         break;
       }
        // return the updated arry 
        return custarry;
    }
    //sets the selected booking to defult setings. Cancels the booking
    public Customers Cancelbooking(Customers[][] custarry, int row, int  column)
    {
        custarry[row][column].CustomerName = "";
        custarry[row][column].FlightClass = "";
        custarry[row][column].Child = false;
        custarry[row][column].SeatType = "";
        Customers cust = custarry[row][column];
        return cust;  
        
    }
    // method for printing seating plan to users
    public void PrintSeatPlan(Customers[][] custArry)
    {
        //prints the top of the plan
        String top = "      A  B  C  D  E  F "; 
        System.out.println(top);
        //string for the next row of the plan and arry for  each seat
        String nextRow = "";
        String[] Seats = new String[12];
   
        // loop thought the columns of the arry
        for(int i = 0; i < custArry.length; i++ )
        {
            //loop though the rows of the arry 
            for(int j = 0;j < custArry[i].length;j++)
            {   //
                if ("".equals(custArry[i][j].GetCustomerName()))
                {
                   Seats[j] = "* ";
                }
                //
                else if (custArry[i][j].GetChild() == true)
                {
                  Seats[j] = "C "; 
                }
                //
                else
                {
                  Seats[j] = "A  ";  
                }
                
            }
            // conc
           nextRow = "Row " + (i + 1) +" "+ Seats[0] +" " + Seats[1] +" " + Seats[2]
                   +" "+ Seats[3] +" " + Seats[4] +" " + Seats[5]; 
          System.out.println(nextRow);
        }
    }
    //
    public String GenerateFileData  (Customers[][] FlightArry) 
    {  //return string
        String FileData ="";
        // looping through Columns  
        for (int i = 0; i < FlightArry.length;i++)
        {
            // string for the seat status
            String line = "";
            //the letter for the row
            String RowLetter = "";
            // looping through Rows
            for( int j  = 0; j < FlightArry[i].length; j++)
            {  // switch will get the row letter
               switch(i) 
               {
                   case 0: RowLetter = "A" ;
                   break;
                   case 1: RowLetter = "B" ;
                   break;
                   case 2: RowLetter = "C" ;
                   break;
                   case 3: RowLetter = "D" ;
                   break;
                   case 4: RowLetter = "E" ;
                   break;
                   case 5: RowLetter = "F" ;
                   break;
                   
               }
                
               if ("".equals(FlightArry[i][j].GetCustomerName())) 
               {
                   
                   line = RowLetter +" "+ (j+1) + " ,Seat is vacant,- \n";
                   FileData += line;
               }
               else
               {
                   line = RowLetter +" "+ (j+1) + " ,Name: " + FlightArry[i][j].GetCustomerName() + " ,child: " + FlightArry[i][j].GetChild() + ",-\n" ;
                   FileData += line;
               }
                
            }
           
        }
        
       
        return FileData;
        
    }
    // makes sure that the arry has been created 
    public Customers[][] OneFooeBoy(Customers[][] blackBox)
    {
        // loop thought the columns of the arry
        for(int i = 0; i < blackBox.length; i++) 
        {
            //loop though the rows of the arry 
            for(int j = 0; j < blackBox[i].length; j++)        
            {
                // if it has not been initialised 
                if(blackBox[i][j] == null) 
                { 
                    // set it to default values
                    blackBox[i][j] = new Customers("",false,"","");
                    
                }   
            } 
        }
        // return new arry of customers
        return blackBox;
    }
    
    public int GetRow () 
    {
       return this.Row;
    }
    public void SetRow (int row) 
    {
        this.Row = row;
    }
    public int GetColumn () 
    {
        return this.Column;
    }
    public void SetColumn (int column) 
    {
        this.Column = column;
    }
    //this need to return and int other wize i can't deate it from the arry 
    public int BinaySearch (Customers[] NICKISAFURRY)
    {  
        Customers CustomerToBeReturn = new Customers();
        int low = 0;
       int high = NICKISAFURRY.length -1;
       int mid;
        while ( low <= high)
        {
            mid = (low + high)/ 2;
        if (NICKISAFURRY[mid].compareTo(this) < 0)
            {
                low = mid + 1;
            }
            else if (NICKISAFURRY[mid].compareTo(this) > 0)
            {
               low = mid - 1; 
            }
            else 
            {
                return mid; 
            }
            
        }
        return -1;
    }
    public Customers[] AddCustToArry(Customers[] BinarySearchArry ,Customers cust) 
    {  int y =  BinarySearchArry.length;                
        if (y > 1)
        {
            Customers[] nextGenBinarySearchArry = new Customers[y + 1];
            System.arraycopy(BinarySearchArry, 0, nextGenBinarySearchArry, 0, y - 1);
            nextGenBinarySearchArry[y - 1] = cust;
            BinarySearchArry = nextGenBinarySearchArry;
        }
        else{
            BinarySearchArry[y - 1] = cust;
        }
        return BinarySearchArry;
    }
    //
    @Override 
    public int compareTo (Customers cust) 
    {
       return CustomerName.compareTo(cust.GetCustomerName());
    }
  }
