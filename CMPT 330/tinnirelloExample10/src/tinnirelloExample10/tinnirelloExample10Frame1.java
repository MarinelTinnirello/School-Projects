package tinnirelloExample10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JTextField;

public class tinnirelloExample10Frame1 extends JFrame {

	private JPanel contentPane;
	private final JLabel lblPhone = new JLabel("Phone:");
	private final JLabel lblState = new JLabel("State:");
	private final JLabel lblZip = new JLabel("ZIP:");
	private final JLabel lblSsn = new JLabel("SSN:");
	private final JLabel lblDate = new JLabel("Date:");
	private final JFormattedTextField textFieldPhone = new JFormattedTextField();
	private final JFormattedTextField textFieldState = new JFormattedTextField();
	private final JFormattedTextField textFieldZip = new JFormattedTextField();
	private final JFormattedTextField textFieldSSN = new JFormattedTextField();
	private final JFormattedTextField textFieldSSN2 = new JFormattedTextField();
	private final JFormattedTextField textFieldDate= new JFormattedTextField();
	
	MaskFormatter phoneMask = createFormatter("(###) ###-####");
	MaskFormatter stateMask = createFormatter("UU");
	MaskFormatter zipMask= createFormatter("#####");
	MaskFormatter ssnMask= createFormatter("###-##-####");
	MaskFormatter ssnMask2= createFormatter("###-##-####");
	MaskFormatter dateMask= createFormatter("##/##/####");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tinnirelloExample10Frame1 frame = new tinnirelloExample10Frame1();
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
	public tinnirelloExample10Frame1() {
		textFieldDate.setBounds(80, 144, 106, 20);
		textFieldDate.setColumns(10);
		textFieldSSN2.setBounds(196, 113, 106, 20);
		textFieldSSN2.setColumns(10);
		textFieldSSN.setBounds(80, 113, 106, 20);
		textFieldSSN.setColumns(10);
		textFieldZip.setText("");
		textFieldZip.setBounds(80, 81, 106, 20);
		textFieldZip.setColumns(10);
		textFieldState.setBounds(80, 51, 106, 20);
		textFieldState.setColumns(10);
		textFieldPhone.setBounds(80, 25, 106, 20);
		textFieldPhone.setColumns(10);
		setTitle("tinnirelloExample10Frame1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPhone.setBounds(10, 21, 62, 25);
		
		contentPane.add(lblPhone);
		lblState.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblState.setBounds(10, 47, 62, 25);
		
		contentPane.add(lblState);
		lblZip.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblZip.setBounds(10, 77, 62, 25);
		
		contentPane.add(lblZip);
		
		// set the placeholders for each, then install to the textfield
		phoneMask.setPlaceholderCharacter('_');
		phoneMask.install(textFieldPhone);
		
		stateMask.setPlaceholderCharacter('_');
		stateMask.install(textFieldState);
		
		zipMask.setPlaceholderCharacter('_');
		zipMask.install(textFieldZip);
		
		dateMask.setPlaceholderCharacter('_');
		dateMask.install(textFieldDate);
		
		// make them as 2 separate to not run into any issues, as it installs to the last one
		ssnMask.setPlaceholderCharacter('_');
		ssnMask.install(textFieldSSN);
		ssnMask2.setPlaceholderCharacter('_');
		ssnMask2.install(textFieldSSN2);
		
		contentPane.add(textFieldPhone);
		
		contentPane.add(textFieldState);
		
		contentPane.add(textFieldZip);
		lblSsn.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSsn.setBounds(10, 113, 62, 25);
		
		contentPane.add(lblSsn);
		
		contentPane.add(textFieldSSN);
		
		contentPane.add(textFieldSSN2);
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDate.setBounds(10, 149, 62, 25);
		
		contentPane.add(lblDate);
		
		contentPane.add(textFieldDate);
		
		//showDate();
	}

	/*public void showDate()
	{
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/2017");
		
		textFieldDate.setText(sdf.format(date));
	}*/
}
