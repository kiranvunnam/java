/*
  CSCI 470-1/502-1    ASSIGNMENT - 1                          
                                                                                                              
   Programmer:           Sai Kiran Vunnam  (Z1840993)                                    
                                  Damineni Sahiti      (Z1840906)      
                          
   Date Due:                02-13-2019                                 
                                                                                   */ 


import java.util.*;
public class TipApp 
{
     TipCalculator tc = new TipCalculator(); //object declaration for TipCalculator class
     
     public static void main(String [] args)
     {
          TipApp ta = new TipApp(); //object declaration for TipApp class
          ta.calculateTips(); //calling calculateTips method
     }
     
     public void calculateTips()
     {
          boolean h = true; 
          while (h == true) //loop to calculate repeatedly
          {
               Scanner sc = new Scanner(System.in); //scanner object to read data from keyboard
               System.out.println();
               System.out.println(" ***  Tip Calculator  *** ");
               System.out.println();
               System.out.print(" Enter the bill amount: ");
               String a;
               double input;
               
                  try
                  {
                      a = sc.nextLine();
                      input = Double.parseDouble(a); //to convert the entered string to double
                      if( input <= 0)
                      {
                           System.out.println("Please enter a valid Bill Amount.");
                           System.out.println();
                           System.out.print(" Enter the bill amount: ");
                           a = sc.nextLine();
                           input = Double.parseDouble(a);
                      }
                   }
                  
                  catch (NumberFormatException e) //if any error occurs in try block catch block will handle it
                  {
                        System.out.println("Please enter a valid Bill Amount.");
                        System.out.println();
                        System.out.print(" Enter the bill amount: ");
                        a = sc.nextLine();
                        input = Double.parseDouble(a);
                   }
                  
               tc.setBillAmount(input); //to set the bill amount with the value entered by the user
               System.out.print(" Enter your desired tip percentage  (20 equals 20%) : ");
               String b;
               int input1;
               
                  try
                  {
                       b = sc.nextLine();
                       input1 = Integer.parseInt(b);
                       if(input1 <  0)
                       {
                             System.out.println("Please enter a valid tip percentage. ");
                             System.out.println();
                             System.out.print(" Enter your desired tip percentage  (20 equals 20%) : ");
                             b = sc.nextLine();
                             input1 = Integer.parseInt(b);
                       }
                  }
                  
               catch (NumberFormatException e)
               {
                    System.out.println("Please enter a valid tip percentage. ");
                    System.out.println();
                    System.out.print(" Enter your desired tip percentage  (20 equals 20%) : ");
                    b = sc.nextLine();
                    input1 = Integer.parseInt(b);
               }
               tc.setTipPercentage(input1);
               System.out.print(" Enter the size of your party: ");
               String c;
               int input2;
               
               try
               {
                    c = sc.nextLine();
                    input2 = Integer.parseInt(c);
                    if (input2 <= 0)
                    {
                         System.out.println("Please enter a valid party size. ");
                         System.out.println();
                         System.out.print(" Enter the size of your party: ");
                         c = sc.nextLine();
                         input2 = Integer.parseInt(c);
                    }
               }
               
               catch (NumberFormatException e)
               {
                    System.out.println("Please enter a valid party size. ");
                    System.out.println();
                    System.out.print(" Enter the size of your party: ");
                    c = sc.nextLine();
                    input2 = Integer.parseInt(c);
               }
               
               tc.setPartySize(input2);
               System.out.println();
               System.out.println(" ***  Your Bill  *** ");
               System.out.println();
               System.out.print("Bill Amount:  $"+ a);
               System.out.println();
               System.out.print("Tip Percentage:  "+ b+"%");
               System.out.println();
               System.out.print("Party Size:  "+ c);
               System.out.println();
               double d = tc.getTotalBill(); //calling method getTotalBill to calculate the total bill amount
               double e = tc.getIndividualShare(d); // calling method getIndividualShare to calculate the individual share
               double f = Math.round(d*100.0)/100.0;
               double g = Math.round(e*100.0)/100.0; // to round off the resultant decimal value to 2 digits
               System.out.println();
               System.out.println("Total Bill  (with Tip) :  $" + f);
               System.out.print("Share for Each Individual :  $" + g);
               System.out.println();
               System.out.println();
               System.out.print("Another bill? (y/n/Y/N): "); //asking user to quit or continue again
               String i = sc.next();
               if(i.equals("n") || i.equals("N"))
               {
                    h = false;
                    System.out.println();
                    System.out.println("Goodbye!");
               }
               else if(i.equals("y") || i.equals("Y"))
               {
                    h = true;
               }
          }
     }
}

