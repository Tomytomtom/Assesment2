/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment.pkg2.pkg2d.arrys;

/**
 *
 * @author User
 */
public class Customers {
    private String CustomerName;
    private boolean Child;
    private String FightClass;
    private String SeatType;
    
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
        return this.FightClass;
    }
    public void SetFlightClass(String flightClass)
    {
        this.FightClass = flightClass;
    }
    
    public String GetSeatType()
    {
        return this.SeatType;
    } 
    
    public void SetSeatType(String seatType)
    {
        this.SeatType = seatType;
    }
    
    
    public Customers ()
    {
        
    }
    
    public Customers( String customername, boolean child, String flightclass, String seatype)
    {
      this.CustomerName = customername;
      this.Child = child;
      this.FightClass = flightclass;
      this.SeatType = seatype;  
    }
              
    public Customers AucateAeats ( Customers Cust)
    {
        return Cust;
    }
    
    public void Cancelbooking(Customers[][] custarry, int row, int  column)
    {
        custarry[row][column].CustomerName = "";
        custarry[row][column].FightClass = "";
        custarry[row][column].Child = false;
        custarry[row][column].SeatType = "";
        
    }
  
}
