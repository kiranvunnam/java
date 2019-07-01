/************************************************************
 *                                                          *
 *  CSCI 470-1/502-1    Assignment 3    Spring 2019         *
 *                                                          *
 *  Programmer:  Sai Kiran Vunnam   (Z1840993)              *
 *               Gopica Sahiti Damineni  (Z1840906)         *
 *                                                          *
 *  Date Due:    03/06/2019               
 *  
 ************************************************************/ 

/*This class has a constructor with three parameters for 
 * initializing the instance variables, and it has a method named
 * daysSinceJan1()*/
public class Date 
{
 private int day;
 private int month;
 private int year;
 
public Date(int day, int month, int year)
 {
 
  this.day=day;
  this.month=month;
  this.year=year;
  
 }
 
/*The daysSinceJan1() method computes and returns the number of days since
 * January 1 of the same year, including January 1 and the day in the Date
 * object itself.
 */
 public  int daysSinceJan1()
 {
  
  int days = day;
  int mon = month-1;
  while(mon > 0) {
   days += daysInMonth(mon);
   mon--;
  }
  return days;
  
 } 
 
 /*It checks if the month is even or odd and give the
 number of days in a month*/
 private int daysInMonth(int mon)
 {
  if(mon == 4 || mon == 6 || mon == 9 || mon ==11) {
   return 30;
  }
  if(mon == 2) {
   if(leapYear()) {
    return 29;
   }
   else 
    return 28;
  }
  return 31;
 }
 
/*This method checks if the year is leap year or not*/
 private boolean leapYear()
 {
 
  if(year%400==0 || (year%4==0 && year%100!=0))
   return true;
  else return false;
 }
}
