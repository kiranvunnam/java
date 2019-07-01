/****************************************
  *      Name : Vamsidhar Kella         *
  *             Sai Kiran Vunnam        *
  *             Gopika Sahithi Damineni *
  *                                     *
  *       Z-Id: Z1828940                *
  *             Z1840993                * 
  *             Z1840906                *
  *     Course: CSCI 502                *
  *                                     *
  * Assignment: In Class Exercose 3     *
  *                                     *
  *   Due Date: 03-20-2019              *
  * *************************************/

import javax.swing.JFrame;
public class GuessGame
{
  public static void main(String[] args)
  {
    GuessGameFrame guesGameFrame = new GuessGameFrame(); // object for the calculatorFrame class
    guesGameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   // guesGameFrame.getContentPane().setBackground(Color.green);
    guesGameFrame.newGame();
    guesGameFrame.setSize(700,400); // window form size
    guesGameFrame.setVisible(true);
  }
}
