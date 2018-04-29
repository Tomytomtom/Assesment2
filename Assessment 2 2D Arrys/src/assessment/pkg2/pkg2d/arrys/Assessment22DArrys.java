/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment.pkg2.pkg2d.arrys;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Assessment22DArrys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Customers[][] custArry = new Customers[12][6];
        String top = "      A  B  C  D  E  F "; 
        System.out.println(top);
        String nextRow = "";
        String[] Seats = new String[12];
        for(int i = 0; i < custArry.length; i++ )
        {
            
            for(int j = 0;j < custArry[i].length;j++)
            {
                if (custArry[i][j] == null)
                {
                   Seats[j] = "* ";
                }
                else if (custArry[i][j].GetChild() == true)
                {
                  Seats[j] = "C "; 
                }
                else
                {
                  Seats[j] = "A  ";  
                }
                
            }
           nextRow = "Row " + (i + 1) +" "+ Seats[0] +" " + Seats[1] +" " + Seats[2]
                   +" "+ Seats[3] +" " + Seats[4] +" " + Seats[5]; 
          System.out.println(nextRow);
        }
        System.out.println(" To booking fight please enter 1, To cancel flight enter 2, To search for a fightbooking press 3, to exit the aplication press 4 ");
        String chose = input.nextLine();
        boolean hello = false;
        while(hello == false)
        {
            if (chose == "1")
            {
                System.out.println("Please enter your name");
                
                System.out.println("");
                
                System.out.println("are you a child, please enter yes or no");
                String bum = input.nextLine();
                boolean child; 
                if(bum == "yes")
                {
                    child = true;
                }
                else if (bum == "no")
                {
                    
                }
                else
                {
                    System.err.println("That is not a vaild option");
                }
                
                
                System.out.println("");

            }
            else if(chose == "2") 
            {

            }
            else if(chose == "3") 
            {

            }
            else if(chose == "4") 
            {
               hello = true;
            }
            else
            {
                System.out.println(" that is not a valid input ");    
            }
        }
     
    }
    
}
