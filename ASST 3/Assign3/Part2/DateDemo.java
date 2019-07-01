/************************************************************
 *                                                          *
 *  CSCI 470-1/502-1    Assignment 3    Spring 2019         *
 *                                                          *
 *  Programmer:  Sai Kiran Vunnam   (Z1840993)              *
 *               Gopica Sahiti Damineni  (Z1840906)         *
 *                                                          *
 *  Date Due:    03/06/2019                                 *
 ************************************************************/ 
/*This class tests the Date class.It prompts the user to enter 
 * an integer representing the day, a second prompt to enter an
 * integer representing the month and a third to enter an integer
 * representing the year. */

import java.util.Scanner;

public class DateDemo
{

 public static void main(String[] args) 
 {
   Scanner scan = new Scanner(System.in); //scanner class to take input for date month and year
  System.out.println("Enter Day:");   //Prints the day
  int day= scan.nextInt();
  System.out.println("Enter Month:");  //prints the month
  int month = scan.nextInt();
  System.out.println("Enter Year:");   //prints the years
  int year = scan.nextInt();
  Date d= new Date(day,month,year);  //Creates new object for date class
  int value=d.daysSinceJan1(); 
  System.out.println("Days from Jan 1st : " + value);
  scan.close();
  
 }
}
