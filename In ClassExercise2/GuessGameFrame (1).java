import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GuessGameFrame extends JFrame
{
  private JLabel question1;
  private JLabel question2;
  private JLabel lblOutput;
  private JButton newgame;
  private JPanel questionPanel;
  private int theNumber;
  private JTextField txtGuess;
//  private JButton btnGuess;
  
  public GuessGameFrame()
  {
    
    super("Guess The Game");
    
    // lables to show the display message
    question1 = new JLabel("I Have a number between 1 and 1000. Can you guess my number?");
    question2 = new JLabel("Please enter your first number");
   // button for new game and an action listener to clear all the data
    newgame = new JButton("New Game");
    newgame.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    clearAll();
   }
  });
    // label
    lblOutput = new JLabel("Enter a number above and click Guess!");
    lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
    lblOutput.setBounds(42, 229, 352, 16);
    
    // text field and an action listener set to it
   txtGuess = new JTextField("0",3);
   txtGuess.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    checkGuess();
   }
  });
  /*
   btnGuess = new JButton("Guess!");
   btnGuess.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    checkGuess();
   }
  });
  */
  
    questionPanel = new JPanel();
    questionPanel.setLayout(new GridLayout(7,1));
    questionPanel.add(question1);
    questionPanel.add(question2);
    questionPanel.add(txtGuess);
    questionPanel.add(lblOutput);
    //questionPanel.add(btnGuess);
    questionPanel.add(newgame);
    //questionPanel.add(txtGuess);
    
    
    
    setLayout(new FlowLayout(FlowLayout.CENTER,10,5));
    add(questionPanel);
    //add(inputPanel);
   
   }
  // method to clear all the data for a  new game
  public void clearAll()
  {
    txtGuess.setText("0");
    lblOutput.setText("Enter a number above and click Enter!");
  }
  
  // method / function to check too high or too low
 public void checkGuess() 
 { 
  // get the user's guess
  String guessText = txtGuess.getText();
  String message = "";
  
  try {      // handling errors and exceptions 
   
   
   
   // check the guess for too high/ too low
   int guess = Integer.parseInt(guessText);
   
   // too high
   if (guess > theNumber)
   {
    message = guess + " was too high. Guess Again!";
    lblOutput.setText(message);
    getContentPane().setBackground(Color.RED);
   }
   // too low
   else if (guess < theNumber)
   {
    message = guess + " was too low. Guess again!";
    lblOutput.setText(message);
    getContentPane().setBackground(Color.BLUE);
   }
   else // guessed correctly 
   {
    message = guess + " was right! You win! Let's play again!";
    lblOutput.setText(message);
     getContentPane().setBackground(Color.WHITE);
    newGame();
   }
  }
  catch (Exception e){     // handling errors and exceptions 
   lblOutput.setText("Enter a whole number between 1 and 1000.");
  }
 }
 //method to get a random number
   public void newGame()
  {
      theNumber = (int)(Math.random()*1000 + 1);
  }
  
 }
  


                            