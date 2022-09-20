package quadratic_equation_solver;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Form {
	public static JLabel generateLabel(String name, int x, int y) {
		JLabel label = new JLabel(name);
		label.setLocation(x,y);
		label.setSize(50,20);
		return label;
	}
	
	public static JTextField generateInput(JLabel label, int x, int y, boolean editable) {
		JTextField input = new JTextField();
		input.setLocation(x,y);
		input.setSize(90,25);
		label.setLabelFor(input);
		input.setEditable(editable);
		return input;
	}
	
	public static JButton generateButton(String label, int x, int y) {
		JButton button = new JButton();
		button.setText(label);
		button.setLocation(x,y);
		button.setSize(100,30);

		
		
		return button;
	}
}
