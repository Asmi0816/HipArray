package hip.view;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import hip.controller.HipController;

import java.awt.Color;

public class HipPanel extends JPanel
{
 private HipController baseController;
 private JButton myButton;
 private JComboBox dropDown;
 private JLabel wordsLabel;
 private SpringLayout baseLayout;
 
 public HipPanel(HipController baseController)
 {
	 super();
	 this.baseController = baseController;
	 myButton = new JButton("Click me!");
	 wordsLabel = new JLabel("Words here");
	 dropDown = new JComboBox(baseController.getHipsters());
	 baseLayout = new SpringLayout();

	 
	 
	 setupPanel();
	 setupLayout();
	 setupListeners();
 }
 private void setupPanel()
 {
	 this.setLayout(baseLayout);
	 this.setBackground(Color.BLUE);
	 this.add(myButton);
	 this.add(dropDown);
	 this.add(wordsLabel);
	 
 }
 private void setupLayout()
 {
	 baseLayout.putConstraint(SpringLayout.NORTH, wordsLabel, 148, SpringLayout.NORTH, this);
	 baseLayout.putConstraint(SpringLayout.NORTH, myButton, 72, SpringLayout.NORTH, this);
	 baseLayout.putConstraint(SpringLayout.WEST, myButton, 83, SpringLayout.WEST, this);
	 baseLayout.putConstraint(SpringLayout.WEST, wordsLabel, 189, SpringLayout.WEST, this);
	 baseLayout.putConstraint(SpringLayout.NORTH, dropDown, 61, SpringLayout.NORTH, this);
	 baseLayout.putConstraint(SpringLayout.EAST, dropDown, -90, SpringLayout.EAST, this);
	 
	 
 }
 private void setupListeners()
 {
	 dropDown.addActionListener(new ActionListener()
	 {
		 public void actionPerformed(ActionEvent selection)
		 {
			 String selectedText = baseController.getHipsters()[dropDown.getSelectedIndex()].toString();
			 wordsLabel.setText(selectedText);
			 repaint();
		 }
	 });
	 
	 myButton.addActionListener(new ActionListener()
	 {
		 public void actionPerformed(ActionEvent click)
		 {
			baseController.impactHipsters();
			repaint();
		 }
	 });
 }
}
