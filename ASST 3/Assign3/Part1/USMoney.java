/************************************************************
 *                                                          *
 *  CSCI 470-1/502-1    Assignment 3    Spring 2019         *
 *                                                          *
 *  Programmer:  Sai Kiran Vunnam (Z1840993)                *
 *               Gopica Sahiti Damineni  (Z1840906)         *
 *                                                          *
 *  Date Due:    03/06/2019                                 *
 ************************************************************/ 



public class USMoney
{

 private int dollars;                 
 private int cents;                
/*Constructor with two parameters for initializing a USMoney object.  
 * The constructor checks that the cents value is between 0 and 99
 * and, if not, transfer some of the cents to the dollars variable to make
 * it between 0 and 99.
 */
 public USMoney(int cents, int dollars) 
 
 {  
  if ( cents >=0 && cents < 100 && dollars >= 0)
  {    
   this.setCents(cents);           
   this.setDollars(dollars);         
  } 
  else if (cents >= 100 && dollars >= 0) 
  {       
   this.setCents(cents % 100);          
   this.setDollars((cents / 100)+dollars);       
  }
  else
  {
   System.err.println("Either of the dollars or cents cannot be negative");  
   System.exit(-1);               
  }

 }  

 /*method to the class that takes a USMoney object as its parameter.  
 It creates and returns a new USMoney object representing the sum of 
 the object whose plus() method is being invoked and the parameter.*/

 public USMoney plus(USMoney money)
 {

  money.setCents(cents + money.getCents());
  money.setDollars(dollars + money.getDollars());

  USMoney result = new USMoney(money.getCents(), money.getDollars()); 
  return result;

 }

 //Get methods and set methods for dollars and cents
  public int getDollars()
 {
  return dollars;
 }

 public void setDollars(int dollars)
 {
  this.dollars = dollars;
 }

 public int getCents()
 {
  return cents;
 }

 public void setCents(int cents)
 {
  this.cents = cents;
 }

}
