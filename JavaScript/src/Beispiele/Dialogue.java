package Beispiele;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Dialogue extends JFrame {
	final ButtonLogic logic;
	
	final JButton button;
	final JTextField inputField = new JTextfiel(20);
	final JTextField outputField = new JTextfiel(20);
	final JPanel p = new JPanel();
	
	Dialogue(ButtonLogic 1) {
		logic = 1;
		button = new JButton(logic.getDescription());
		button.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent _) {
										outputField.setText(logic.eval(inputField.getText().trim()));
									}
		});
		p.setLayout(new BorderLayout());
		p.add(inputField, BorderLayout.NORTH);
		p.add(button,  BorderLayout.SOUTH);
		getContentPane().add(p);
		
	}
}