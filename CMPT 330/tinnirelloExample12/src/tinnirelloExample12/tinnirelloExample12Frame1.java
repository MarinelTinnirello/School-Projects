package tinnirelloExample12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class tinnirelloExample12Frame1 extends JFrame {

	private JPanel contentPane;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private final JPanel panel1st = new JPanel();
	private final JLabel lblName = new JLabel("Name:");
	private final JTextField textFieldName = new JTextField();
	private final JPanel panel2nd = new JPanel();
	private final JLabel lblAddress = new JLabel("Address:");
	private final JTextField textFieldAddress = new JTextField();
	private final JLabel lblName_1 = new JLabel("Name:");
	private final JLabel lblImportedName = new JLabel("");
	private final JPanel panel3rd = new JPanel();
	private final JLabel lblName_2 = new JLabel("Name:");
	private final JLabel lblAddress_1 = new JLabel("Address:");
	private final JLabel lblSummaryName = new JLabel("");
	private final JLabel lblSummaryAddress = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tinnirelloExample12Frame1 frame = new tinnirelloExample12Frame1();
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
	public tinnirelloExample12Frame1() {
		textFieldAddress.setBounds(95, 41, 106, 20);
		textFieldAddress.setColumns(10);
		textFieldName.setBounds(79, 8, 106, 20);
		textFieldName.setColumns(10);
		setTitle("tinnirelloExample12Frame1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		tabbedPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_tabbedPane_stateChanged(e);
			}
		});
		tabbedPane.setBounds(10, 11, 493, 386);
		
		contentPane.add(tabbedPane);
		
		tabbedPane.addTab("1st", null, panel1st, null);
		panel1st.setLayout(null);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(10, 11, 48, 14);
		
		panel1st.add(lblName);
		
		panel1st.add(textFieldName);
		
		tabbedPane.addTab("2nd", null, panel2nd, null);
		panel2nd.setLayout(null);
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddress.setBounds(10, 42, 74, 14);
		
		panel2nd.add(lblAddress);
		
		panel2nd.add(textFieldAddress);
		lblName_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName_1.setBounds(10, 11, 48, 14);
		
		panel2nd.add(lblName_1);
		lblImportedName.setBounds(95, 13, 106, 14);
		
		panel2nd.add(lblImportedName);
		
		tabbedPane.addTab("3rd", null, panel3rd, null);
		panel3rd.setLayout(null);
		lblName_2.setToolTipText("<p>\r\nA carry over from the <br>\r\n1st tab.\r\n</p>");
		lblName_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName_2.setBounds(10, 11, 48, 14);
		
		panel3rd.add(lblName_2);
		lblAddress_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddress_1.setBounds(10, 50, 68, 14);
		
		panel3rd.add(lblAddress_1);
		lblSummaryName.setBounds(100, 13, 101, 14);
		
		panel3rd.add(lblSummaryName);
		lblSummaryAddress.setBounds(100, 52, 101, 14);
		
		panel3rd.add(lblSummaryAddress);
	}
	protected void do_tabbedPane_stateChanged(ChangeEvent e) {
		lblImportedName.setText(textFieldName.getText());


		if (textFieldName.getText().isEmpty())
		{
			lblName_2.setForeground(Color.RED);
		}
		if (textFieldAddress.getText().isEmpty())
		{
			lblAddress_1.setForeground(Color.RED);
		}
		if (!textFieldName.getText().isEmpty() || !textFieldAddress.getText().isEmpty())
		{
			lblSummaryName.setForeground(Color.BLACK);
			lblSummaryAddress.setForeground(Color.BLACK);
		}
		
		lblSummaryAddress.setText(textFieldAddress.getText());
		lblSummaryName.setText(textFieldName.getText());
	}
}
