package Gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import algorithms.BubbleSort;
import algorithms.QuickSort;

public class Main {
	public static void main(String[] arg) {
		JFrame frame = new JFrame();
		frame.setTitle("Sorting Algorithms");
		frame.setSize(600, 420);
		frame.setLayout(null);
		frame.setResizable(false);
		
		//label input
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
		
		//label result
		JLabel lb2 = new JLabel("Result");
		lb2.setBounds(30,160,200,30);
		frame.add(lb2);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = txt.getText(); 
				String[] t = text.trim().split("\\s+");
				
				int[] numbers = new int[t.length];
                for (int i = 0; i < t.length; i++) {
                    numbers[i] = Integer.parseInt(t[i]); 
                }
//                String algorithm = (String) box.getSelectedItem();
//                if(algorithm.equals("Bubble Sort")){
//                	new BubbleSort().sort(numbers);
//                }
///                	else {
//             	new QuickSort().quickSort(numbers);
//               }
//                String result = "";
//                for(int i:numbers) {
//                	result += i + "  ";
//                }
//                lb2.setText("result: " + result);
//			}
		});
		
		
		
		frame.setVisible(true);
		
		
	}
}
