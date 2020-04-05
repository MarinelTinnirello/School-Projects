package tinnirelloExample9;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class tinnirelloExample9Frame1 extends JFrame {

	private JPanel contentPane;
	private final JLabel lblSsn = new JLabel("SSN:");
	private final JTextField textFieldSSN = new JTextField();
	private final JFormattedTextField SSNFTF = new JFormattedTextField();
	MaskFormatter ssnMask = createFormatter("xxx-xx-xxxx");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tinnirelloExample9Frame1 frame = new tinnirelloExample9Frame1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public MaskFormatter createFormatter(String s) {
	     MaskFormatter formatter = null;
	     try {
	          formatter = new MaskFormatter(s);
	         } 
	     catch (java.text.ParseException exc) {
		          System.err.println("formatter is bad: " + exc.getMessage());
		          System.exit(-1);
		      }
	      return formatter;
	}//createFormatter

	/**
	 * Create the frame.
	 */
	public tinnirelloExample9Frame1() {
		textFieldSSN.setBounds(55, 12, 106, 20);
		textFieldSSN.setColumns(10);
		setTitle("tinnirelloExample9Frame1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblSsn.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSsn.setBounds(10, 11, 69, 19);
		
		contentPane.add(lblSsn);
		
		// sets up input mask, attach to format
		ssnMask.setPlaceholderCharacter('0');
		ssnMask.install(SSNFTF);
		
		contentPane.add(textFieldSSN);
	}
}
