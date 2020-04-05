package tinnirelloExample11;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.NumberFormat;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class tinnirelloExample11Frame1 extends JFrame {

	NumberFormat numFormat = NumberFormat.getNumberInstance();
	NumberFormat numFormat2 = NumberFormat.getCurrencyInstance();
	NumberFormat numFormat3 = NumberFormat.getPercentInstance();
	
	private JPanel contentPane;
	private final JFormattedTextField aftf = new JFormattedTextField(numFormat);
	private final JFormattedTextField bftf = new JFormattedTextField(numFormat2);
	private final JFormattedTextField cftf = new JFormattedTextField(numFormat3);
	private final JLabel num1text = new JLabel("text");
	private final JLabel num1value = new JLabel("value");

	//declare our variables
	private double num1 = 1;
	private double num2 = 2;
	private double num3 = 3;
	private double sum1 = 0;
	private final JLabel num2text = new JLabel("text");
	private final JLabel num2value = new JLabel("value");
	private final JLabel num3text = new JLabel("text");
	private final JLabel num3value = new JLabel("value");
	private final JFormattedTextField sum = new JFormattedTextField();
	private final JLabel lblSum = new JLabel("Sum:");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tinnirelloExample11Frame1 frame = new tinnirelloExample11Frame1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public tinnirelloExample11Frame1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		aftf.setBounds(107, 27, 149, 20);
		
		aftf.setValue(new Double(num1));
		contentPane.add(aftf);
		bftf.setBounds(107, 69, 149, 20);
		
		bftf.setValue(new Double(num2));
		contentPane.add(bftf);
		cftf.setBounds(107, 110, 149, 20);
		
		cftf.setValue(new Double(num3));
		contentPane.add(cftf);
		num1text.setBounds(266, 30, 73, 14);
		
		contentPane.add(num1text);
		num1value.setBounds(349, 30, 60, 14);
		
		contentPane.add(num1value);
		num2text.setBounds(266, 72, 73, 14);
		
		contentPane.add(num2text);
		num2value.setBounds(342, 72, 46, 14);
		
		contentPane.add(num2value);
		num3text.setBounds(266, 113, 46, 14);
		
		contentPane.add(num3text);
		num3value.setBounds(342, 113, 46, 14);
		
		contentPane.add(num3value);
		sum.setBounds(107, 141, 149, 20);
		
		contentPane.add(sum);
		lblSum.setBounds(36, 144, 46, 14);
		
		contentPane.add(lblSum);
		aftf.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_aftf_propertyChange(arg0);
			}
		});setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		aftf.setBounds(107, 27, 149, 20);
		
		aftf.setValue(new Double(num1));
		contentPane.add(aftf);
		bftf.setBounds(107, 69, 149, 20);
		
		bftf.setValue(new Double(num2));
		contentPane.add(bftf);
		cftf.setBounds(107, 110, 149, 20);
		
		cftf.setValue(new Double(num3));
		contentPane.add(cftf);
		num1text.setBounds(266, 30, 73, 14);
		
		contentPane.add(num1text);
		num1value.setBounds(349, 30, 60, 14);
		
		contentPane.add(num1value);
		num2text.setBounds(266, 72, 73, 14);
		
		contentPane.add(num2text);
		num2value.setBounds(342, 72, 46, 14);
		
		contentPane.add(num2value);
		num3text.setBounds(266, 113, 46, 14);
		
		contentPane.add(num3text);
		num3value.setBounds(342, 113, 46, 14);
		
		contentPane.add(num3value);
		sum.setBounds(107, 141, 149, 20);
		
		contentPane.add(sum);
		lblSum.setBounds(36, 144, 46, 14);
		
		contentPane.add(lblSum);
		aftf.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_aftf_propertyChange(arg0);
			}
		});
	}
	protected void do_aftf_propertyChange(PropertyChangeEvent arg0) {
		num1text.setText(aftf.getText());
		num1value.setText(aftf.getValue().toString());
		num2text.setText(bftf.getText());
		num2value.setText(bftf.getValue().toString());
		num3text.setText(cftf.getText());
		num3value.setText(cftf.getValue().toString());
		
		//sum
		num1 = ((Number)aftf.getValue()).doubleValue();
		num2 = ((Number)bftf.getValue()).doubleValue();
		num3 = ((Number)cftf.getValue()).doubleValue();
		sum1 = num1+num2+num3;
		sum.setValue(sum1);
	}
}
