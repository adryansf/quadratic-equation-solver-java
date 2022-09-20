package quadratic_equation_solver;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Window extends JFrame {
	private static final long serialVersionUID = 1L;
	public Listener listener = new Listener();
	
	JButton buttonResolve;
	JButton buttonClear;
	JTextField inputA;
	JTextField inputB;
	JTextField inputC;
	JTextField inputDelta;
	JTextField inputX1;
	JTextField inputX2;
	
	class Listener extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			if(e.getComponent() == buttonResolve) {
				resolve();
			} else if(e.getComponent() == buttonClear) {
				clear();
			}
		}
	}
	
	public Window(){
		// Initial Config
		setSize(350,300);
		setLocation(300,300);
		setTitle("Programa");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container container = this.getContentPane();
		
		container.setBackground(Color.orange);
		container.setLayout(null);
		
		
		JLabel labelA = Form.generateLabel("A", 20, 30);
		inputA = Form.generateInput(labelA, 50, 30, true);
		
		JLabel labelB = Form.generateLabel("B", 20, 70);
		inputB = Form.generateInput(labelB, 50, 70, true);
		
		JLabel labelC = Form.generateLabel("C", 20, 110);
		inputC = Form.generateInput(labelC, 50, 110, true);
		
		JLabel labelDelta = Form.generateLabel("Delta", 180, 30);
		inputDelta = Form.generateInput(labelDelta, 240, 30, false);
		
		JLabel labelX1 = Form.generateLabel("x1", 180, 70);
		inputX1 = Form.generateInput(labelX1, 210, 70, false);
		
		JLabel labelX2 = Form.generateLabel("x2", 180, 110);
		inputX2 = Form.generateInput(labelX2, 210, 110, false);
		
		this.buttonResolve = Form.generateButton("Resolver", 20, 200);
		this.buttonResolve.addMouseListener(listener);
		this.buttonClear = Form.generateButton("Limpar", 200, 200);
		this.buttonClear.addMouseListener(listener);
		
		// Inputs
		container.add(labelA);
		container.add(inputA);
		container.add(labelB);
		container.add(inputB);
		container.add(labelC);
		container.add(inputC);
		
		// Non-Editable
		container.add(labelDelta);
		container.add(inputDelta);
		container.add(labelX1);
		container.add(inputX1);
		container.add(labelX2);
		container.add(inputX2);
		
		// Buttons
		container.add(this.buttonResolve);
		container.add(this.buttonClear);
		
		setVisible(true);
	}
	
	private void resolve() {
		double a = Double.parseDouble(this.inputA.getText());
		double b = Double.parseDouble(this.inputB.getText());
		double c = Double.parseDouble(this.inputC.getText());
		
		double delta = Math.pow(b, 2) - (4*a*c);
		double x1 = (-b + Math.sqrt(delta)) / (2*a);
		double x2 = (-b - Math.sqrt(delta)) / (2*a);
		
		this.inputDelta.setText(Double.toString(delta));
		this.inputX1.setText(Double.toString(x1));
		this.inputX2.setText(Double.toString(x2));
	}
	
	private void clear() {
		this.inputDelta.setText("");
		this.inputX1.setText("");
		this.inputX2.setText("");
		
		this.inputA.setText("");
		this.inputB.setText("");
		this.inputC.setText("");
	}
}
