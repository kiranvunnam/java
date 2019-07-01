/************************************************************
 *                                                          *
 *  CSCI 470-1/502-1    Assignment4   Spring 2019           *
 *                                                          *
 *  Programmer:  :  Sai Kiran Vunnam (Z1840993)             *
 *                  Gopica Sahiti Damineni (Z1840906)       *
 *                                                          *
 *  Date Due:     03/19/2019                                *
 *                                                          *
 ************************************************************/ 
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**/

public class Align extends JFrame implements ActionListener {

 JCheckBox snapGrid, showGrid;//Declaration of Checkbox for Snap to Grid and ShowGrid
 JLabel labelX, labelY;//Declaration of Label X and Label y
 JButton ok,cancel,help;//Declaration of Buttons
 JTextField textFieldX, textFieldY;//Declaration of TextFields
 

 public Align() {
  super("Align");//Header of the GUI
  Container c = getContentPane();//Creation of a Container
  JPanel panel = new JPanel();//Creation of Panel
  JPanel panelX = new JPanel();//Creation of Panels for Buttons
  
  panel.setLayout(new GridLayout(3,3,5,5));//Setting Layout for the Panel as the Grid Layout
  panelX.setLayout(new GridLayout(3,3,5,5));//Setting Layout for the PanelX as the Grid Layout
  
  // Creation of Check boxes for Snap to Grid and ShowGrid           
  
  snapGrid = new JCheckBox("Snap to Grid");
  showGrid = new JCheckBox("Show Grid");
 
  //ActionListener for SnapGrid
  snapGrid.addActionListener(this);
  
  // Method which is used when you need to perform action when checkbox is selected 
   
  Ntext n = new Ntext();
  //Action Listener for ShowGrid
  showGrid.addActionListener(n);
  
  //Creation of Box Layout for the checkboxes
  Box grid = Box.createVerticalBox();
  grid.add(snapGrid);
  grid.add(showGrid);
  
  // Creation of Label X, Y and TextFields for the labels X and Y     
   
  labelX = new JLabel("X: ");
  textFieldX = new JTextField(3);
  
  labelY = new JLabel("Y: ");
  textFieldY = new JTextField(3);
  
  //Adding of ActionListeners to perform required actions
  TextField inp = new TextField();
  textFieldX.addActionListener(inp);
  textFieldY.addActionListener(inp);
  
  //Creation of Box Layout for Labels
  Box labels = Box.createVerticalBox();
  labels.add(labelX);
  //VerticalStrut is used to specify the space between the labels
  labels.add(Box.createVerticalStrut(10));
  
  //Creation of Box Layout for the textfields with respect to X and Y
  Box labelText = Box.createVerticalBox();
  labelText.add(textFieldX);
  labelText.add(Box.createVerticalStrut(10));
  
  labels.add(labelY);
  labelText.add(textFieldY);
  
  Bclick blue = new Bclick();
  
 
  ok = new JButton("OK");
  ok.setMaximumSize(new Dimension(100,30));
  ok.addActionListener(blue);
  
  cancel = new JButton("Cancel");
  cancel.setMaximumSize(new Dimension(100,30));
  cancel.addActionListener(blue);
  
  help = new JButton("Help");
  help.setMaximumSize(new Dimension(100,30));
  help.addActionListener(blue);
  
  //It adds the buttons to the panels
  panelX.add(ok);
  panelX.add(cancel);
  panelX.add(help);
  panelX.setAlignmentX(Component.RIGHT_ALIGNMENT);
  

  
  c.setLayout(new FlowLayout(FlowLayout.LEFT));
  c.add(grid);
  c.add(labels);
  c.add(panel);
  c.add(labelText);
  c.add(panelX);
  
  
  
 }
 
 // This class Gives a popup message of the data which is entered in the textField X and the Text Field Y using JOptionPane          
  
 private class TextField implements ActionListener{
  @Override
  public void actionPerformed(ActionEvent event) {
   
   String string = "";
   if (event.getSource() == textFieldX)
             string = String.format("Data Entered in the Text Field is: %s",
                event.getActionCommand());
   else if(event.getSource() == textFieldY)
    string = String.format("Data Entered in the Text Field is: %s",
                  event.getActionCommand());
          JOptionPane.showMessageDialog(null, string);         
  } 
  
 }
 
 // This class is used it gives a popup message when showGrid checkbox is selected or unselected it gives a message
 public class Ntext implements ActionListener
 {

  @Override
  public void actionPerformed(ActionEvent e) {
   // It checks if it is selected or not
   if(showGrid.isSelected()==true) {
    
    JOptionPane.showMessageDialog(null,"ShowGrid is selected");
   }
   else {
    
    JOptionPane.showMessageDialog(null,"ShowGrid is Deselected");
   }
  }
 }
 
 // This is used to perform action when the button is clicked if the specific button is clicked it prints the message accordingly
  
 public class Bclick implements ActionListener
 {

  @Override
  public void actionPerformed(ActionEvent e) {
   // TODO Auto-generated method stub
   String command = e.getActionCommand();
       if (command.equals("OK")) {
           JOptionPane.showMessageDialog(null,"Button Clicked is ok");
        }
        
        String command1 = e.getActionCommand();
        if(command1.equals("Cancel")) {
          JOptionPane.showMessageDialog(null,"Button Clicked is cancel");
        }
         
        String command2 = e.getActionCommand();
        if(command2.equals("Help")) {
         JOptionPane.showMessageDialog(null,"Button Clicked is help");
        }
  }
  
 }
 @Override
 
 // This checks if the Snap grid is selected or not and accordingly prints the message
 public void actionPerformed(ActionEvent arg0) {
  // TODO Auto-generated method stub
  if(snapGrid.isSelected()==true) {
   
   JOptionPane.showMessageDialog(null,"SnapGrid is selected");
  }
  else {
   
   JOptionPane.showMessageDialog(null,"SnapGrid is Deselected");
  }
 }
 
    

}
