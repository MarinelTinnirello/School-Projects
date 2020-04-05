package tinnirelloExample14;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class tinnirelloExample14Frame1 extends JFrame {

	private JPanel contentPane;
	private final JLabel lblPositiveValue = new JLabel("Positive Value:");
	private final JLabel lblNegativeValue = new JLabel("Negative Value:");
	private final JTextField textFieldPositive = new JTextField();
	private final JTextField textFieldNegative = new JTextField();
	private final JLabel lblSum = new JLabel("Sum:");
	private final JTextField textFieldSum = new JTextField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tinnirelloExample14Frame1 frame = new tinnirelloExample14Frame1();
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
	public tinnirelloExample14Frame1() {
		textFieldSum.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_textFieldSum_focusLost(e);
			}
		});
		textFieldSum.setBounds(105, 84, 106, 20);
		textFieldSum.setColumns(10);
		textFieldNegative.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_textFieldNegative_focusLost(e);
			}
		});
		textFieldNegative.setBounds(105, 50, 106, 20);
		textFieldNegative.setColumns(10);
		textFieldPositive.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_textFieldPositive_focusLost(e);
			}
		});
		textFieldPositive.setBounds(105, 15, 106, 20);
		textFieldPositive.setColumns(10);
		setTitle("tinnirelloExample14Frame1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblPositiveValue.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPositiveValue.setBounds(10, 11, 95, 25);
		
		contentPane.add(lblPositiveValue);
		lblNegativeValue.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNegativeValue.setBounds(10, 50, 95, 25);
		
		contentPane.add(lblNegativeValue);
		
		contentPane.add(textFieldPositive);
		
		contentPane.add(textFieldNegative);
		lblSum.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSum.setBounds(10, 86, 48, 14);
		
		contentPane.add(lblSum);
		
		contentPane.add(textFieldSum);
	}
	protected void do_textFieldPositive_focusLost(FocusEvent e) {
		if(Integer.parseInt(textFieldPositive.getText()) <= 0)
		{
			JOptionPane.showMessageDialog(this, "Not a positive #", "ERROR - Not a positive", JOptionPane.ERROR_MESSAGE);
			textFieldPositive.grabFocus();
		}
	}
	protected void do_textFieldNegative_focusLost(FocusEvent e) {
		if(Integer.parseInt(textFieldNegative.getText()) >= 0)
		{
			JOptionPane.showMessageDialog(this, "Not a negative #", "ERROR - Not a negative", JOptionPane.ERROR_MESSAGE);
			textFieldNegative.grabFocus();
		}
	}
	protected void do_textFieldSum_focusLost(FocusEvent e) {
		int sum = Integer.parseInt(textFieldPositive.getText()) + Integer.parseInt(textFieldNegative.getText());
		String sumStr= "";
		
		sumStr = Integer.toString(sum);
		textFieldSum.setText(sumStr);
	}
}
