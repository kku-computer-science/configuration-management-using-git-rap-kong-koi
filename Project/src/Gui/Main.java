package Gui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {
	public static void main(String[] arg) {
		JFrame frame = new JFrame();
		frame.setTitle("Sorting Algorithms");
		frame.setSize(600, 420);
		frame.setLayout(null);
		frame.setResizable(false);
		
		//label
		JLabel lb1 = new JLabel("Input Numbers");
		lb1.setBounds(30,30,150,30);
		frame.add(lb1);
		
		//text field 
		JTextField txt = new JTextField();
		txt.setBounds(150, 30, 200, 30);
		frame.add(txt);
		
		//button
		JButton button = new JButton("ENTER");
		button.setBounds(150, 80, 120, 30);
		frame.add(button);
		
		//drop down
		String[] Algorithms = {"Quick Sort","Bubble Sort"};
		JComboBox<String> box  = new JComboBox<>(Algorithms);
		box.setBounds(350, 30, 80, 30);
		frame.add(box);
		
		
		frame.setVisible(true);
		
		
	}
}
