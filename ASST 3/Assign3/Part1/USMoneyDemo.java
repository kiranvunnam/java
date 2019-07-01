/************************************************************
 *                                                          *
 *  CSCI 470-1/502-1    Assignment 3    Spring 2019         *
 *                                                          *
 *  Programmer:  Sai Kiran Vunnam   (Z1840993)              *
 *               Gopica Sahiti Damineni  (Z1840906)         *
 *                                                          *
 *  Date Due:    03/06/2019                                 *
 ************************************************************/ 

/*This class tests the USMoney class. It prompts the user twice.
 * The first to enter an integer representing dollars and the
 * second to enter an integer representing cents.  
 */

import java.util.Scanner;

public class USMoneyDemo {

 public static void main(String[] args) {

  Scanner input = new Scanner(System.in);   
  int cents1,
   dollars1,
   cents2,
   dollars2;
  
  System.out.println("How many cents is it for first one: ");
  cents1 = input.nextInt();
  
  System.out.println("How many dollars is it for first one ");
  dollars1 = input.nextInt();
  
  System.out.println("How many cents is it for second one: ");
  cents2 = input.nextInt();
  
  System.out.println("How many dollars is it for second one ");
  dollars2 = input.nextInt();
  
  USMoney money1 = new USMoney(cents1, dollars1);     //constructor for object1
  USMoney money2 = new USMoney(cents2, dollars2);     //cosntructor for object2
  
  USMoney result = money1.plus(money2);    
   
  System.out.printf("The amount is %d dollars and %d cents",result.getDollars(),result.getCents());   
  
  input.close();                       
 }
}
