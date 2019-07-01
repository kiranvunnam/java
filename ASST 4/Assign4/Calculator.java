/************************************************************
 *                                                          *
 *  CSCI 470-1/502-1    Assignment4    Spring 2019          *
 *                                                          *
 *  Programmer:  :  Sai Kiran Vunnam (Z1840993)             *
 *                   Gopica Sahiti Damineni (Z1840906)      *                                                          *
 *  Date Due:        03/19/2019                             *
 *                                                          *
 ************************************************************/  
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class Calculator extends JFrame implements ActionListener{

     JPanel button;//Declaration of JButton
  JTextField textfield;//Declaration of JTextField
 
 //Constructor
 public Calculator() {
  super("Calculator");//Header of the application
  Container c = getContentPane();//Creation of Container 
  
  //Creation of Panel for a button
  button = new JPanel();
  //Creation of layout for the buttons using GridLayout
  button.setLayout(new GridLayout(4,4,5,5));
  //Sets the font size of buttons
  Font f1 = new Font("TimesNewRoman", Font.PLAIN,20);
  
  //Creation of button 7
  JButton b1=new JButton("7");
  button.add(b1);
     b1.setFont(f1);
     b1.addActionListener(this);
    
   //Creation of button 8
  JButton b2=new JButton("8");
  button.add(b2);
  b2.setFont(f1);
  b2.addActionListener(this);
   
  //Creation of button 9
  JButton b3=new JButton("9");
  button.add(b3);
  b3.setFont(f1);
  b3.addActionListener(this);
   
  //Creation of button /
  JButton b4=new JButton("/");
  button.add(b4);
  b4.setFont(f1);
  b4.addActionListener(this);
  
  //Creation of button 4
  JButton b5=new JButton("4");
  button.add(b5);
  b5.setFont(f1);
  b5.addActionListener(this);
  
  //Creation of button 5
  JButton b6=new JButton("5");
  button.add(b6);
  b6.setFont(f1);
  b6.addActionListener(this);
   
  //Creation of button 6
  JButton b7=new JButton("6");
  button.add(b7);
  b7.setFont(f1);
  b7.addActionListener(this);
  
  //Creation of button *
  JButton b8=new JButton("*");
  button.add(b8);
  b8.setFont(f1);
  b8.addActionListener(this);
  
  //Creation of button 1
  JButton b9=new JButton("1");
  button.add(b9);
  b9.setFont(f1);
  b9.addActionListener(this);
  
  //Creation of button 2
  JButton b10=new JButton("2");
  button.add(b10);
  b10.setFont(f1);
  b10.addActionListener(this);
  
  //Creation of button 3
  JButton b11=new JButton("3");
  button.add(b11);
  b11.setFont(f1);
  b11.addActionListener(this);
  
  //Creation of button -
  JButton b12=new JButton("-");
  button.add(b12);  
  b12.setFont(f1);
  b12.addActionListener(this);
  
  //Creation of button 0
  JButton b13=new JButton("0");
  button.add(b13);
  b13.setFont(f1);
  b13.addActionListener(this); 
  
  //Creation of button .
  JButton b14=new JButton(".");
  button.add(b14);
  b14.setFont(f1);
  b14.addActionListener(this);
  
  //Creation of button =
  JButton b15=new JButton("=");
  button.add(b15);
  b15.setFont(f1);
  b15.addActionListener(this);
  
  //Creation of button +
  JButton b16=new JButton("+");
  button.add(b16);  
  b16.setFont(f1);
  b16.addActionListener(this);
  
  //Creation of Jpanel
  JPanel p1 = new JPanel();
  
  //Creation of TextField
  textfield = new JTextField();
  //Setting the preferred Size
  textfield.setPreferredSize(new Dimension(45,45));
     //Setting the font for the Textbox
  Font f = new Font("TimesNewRoman", Font.ITALIC,20);
     textfield.setFont(f);
     
     //Adds the textfields and buttons into the container
     c.add(textfield, BorderLayout.NORTH);
     c.add(button, BorderLayout.CENTER);
     
     TextField input = new TextField();
     textfield.addActionListener(input);
    
 }
 
 /******************************************************
  * This class Gives a popup message of the data which *
  * is entered in the textField using JOptionPane   *
  ******************************************************/
 private class TextField implements ActionListener{
  @Override
  public void actionPerformed(ActionEvent event) {
   
   String string = "";
         if (event.getSource() == textfield)
             string = String.format("Data Entered in the Text Field is: %s",
                event.getActionCommand());
          JOptionPane.showMessageDialog(null, string);         
  } 
  
 }
  
     /***********************************************
      * This checks if the button is clicked or not *
      * If the button is clicked it gives a message *
      * which button is clicked                     *
      ***********************************************/
  public void actionPerformed(ActionEvent e) {
   // TODO Auto-generated method stub
    String command = e.getActionCommand();
    
    /*********************************************
     * Checks if 7 button is clicked and         * 
     * prints a message that button 7 is clicked *
     *********************************************/ 
       if (command.equals("7")) {
           JOptionPane.showMessageDialog(null,"Button Clicked is 7");
        }
        
       /*********************************************
     * Checks if 8 button is clicked and         * 
     * prints a message that button 8 is clicked *
     *********************************************/ 
        String command1 = e.getActionCommand();
        if(command1.equals("8")) {
          JOptionPane.showMessageDialog(null,"Button Clicked is 8");
        }
        
        /*********************************************
      * Checks if 9 button is clicked and         * 
      * prints a message that button 9 is clicked *
      *********************************************/
        String command2 = e.getActionCommand();
        if(command2.equals("9")) {
         JOptionPane.showMessageDialog(null,"Button Clicked is 9");
        }
        
        //It checks if / is clicked and prints a message that this button is clicked
        String command3 = e.getActionCommand();
        if(command3.equals("/")) {
         JOptionPane.showMessageDialog(null,"Button Clicked is /");
        }
        
        //It checks if 4 is clicked and prints a message that this button is clicked
        String command4 = e.getActionCommand();
        if(command4.equals("4")) {
         JOptionPane.showMessageDialog(null,"Button Clicked is 4");
        }
        
        //It checks if 5 is clicked and prints a message that this button is clicked
        String command5 = e.getActionCommand();
        if(command5.equals("5")) {
         JOptionPane.showMessageDialog(null,"Button Clicked is 5");
        }
        
        //It checks if 6 is clicked and prints a message that this button is clicked
        String command6 = e.getActionCommand();
        if(command6.equals("6")) {
         JOptionPane.showMessageDialog(null,"Button Clicked is 6");
        }
        
        //It checks if * is clicked and prints a message that this button is clicked
        String command7 = e.getActionCommand();
        if(command7.equals("*")) {
         JOptionPane.showMessageDialog(null,"Button Clicked is *");
        }
        
        //It checks if 1 is clicked and prints a message that this button is clicked
        String command8 = e.getActionCommand();
        if(command8.equals("1")) {
         JOptionPane.showMessageDialog(null,"Button Clicked is 1");
        }
        
        //It checks if 2 is clicked and prints a message that this button is clicked
        String command9 = e.getActionCommand();
        if(command9.equals("2")) {
         JOptionPane.showMessageDialog(null,"Button Clicked is 2");
        }
        
        //It checks if 3 is clicked and prints a message that this button is clicked
        String command10 = e.getActionCommand();
        if(command10.equals("3")) {
         JOptionPane.showMessageDialog(null,"Button Clicked is 3");
        }
        
        //It checks if - is clicked and prints a message that this button is clicked
        String command11 = e.getActionCommand();
        if(command11.equals("-")) {
         JOptionPane.showMessageDialog(null,"Button Clicked is -");
        }
        
        //It checks if 0 is clicked and prints a message that this button is clicked
        String command12 = e.getActionCommand();
        if(command12.equals("0")) {
         JOptionPane.showMessageDialog(null,"Button Clicked is 0");
        }
        
        //It checks if . is clicked and prints a message that this button is clicked
        String command13 = e.getActionCommand();
        if(command13.equals(".")) {
         JOptionPane.showMessageDialog(null,"Button Clicked is .");
        }
        
        //It checks if = is clicked and prints a message that this button is clicked
        String command14 = e.getActionCommand();
        if(command14.equals("=")) {
         JOptionPane.showMessageDialog(null,"Button Clicked is =");
        }
        
        //It checks if + is clicked and prints a message that this button is clicked
        String command15 = e.getActionCommand();
        if(command15.equals("+")) {
         JOptionPane.showMessageDialog(null,"Button Clicked is +");
        }
 }
}
