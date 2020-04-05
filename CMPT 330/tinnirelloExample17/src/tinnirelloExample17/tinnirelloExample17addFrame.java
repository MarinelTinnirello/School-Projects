package tinnirelloExample17;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tinnirelloExample17addFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lbl1st = new JLabel("1st");
	private final JLabel lbl2nd = new JLabel("2nd");
	private final JLabel lbl3rd = new JLabel("3rd");
	private final JTextField textField1st = new JTextField();
	private final JTextField textField2nd = new JTextField();
	private final JTextField textField3rd = new JTextField();
	private final JButton btnDone = new JButton("Done");
	private Item myData;

	/**
	 * Create the frame.
	 * @param data 
	 */
	public tinnirelloExample17addFrame(Item data) {
		textField3rd.setBounds(68, 97, 106, 20);
		textField3rd.setColumns(10);
		textField2nd.setBounds(68, 47, 106, 20);
		textField2nd.setColumns(10);
		textField1st.setBounds(68, 8, 106, 20);
		textField1st.setColumns(10);
		
		textField1st.setText(data.getMy1());
		textField2nd.setText(data.getMy2());
		textField3rd.setText(data.getMy3());
		myData = data;
		
		setTitle("tinnirelloExample17addFrame");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lbl1st.setBounds(10, 11, 48, 14);
		
		contentPane.add(lbl1st);
		lbl2nd.setBounds(10, 50, 48, 14);
		
		contentPane.add(lbl2nd);
		lbl3rd.setBounds(10, 90, 48, 14);
		
		contentPane.add(lbl3rd);
		
		contentPane.add(textField1st);
		
		contentPane.add(textField2nd);
		
		contentPane.add(textField3rd);
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnDone_actionPerformed(e);
			}
		});
		btnDone.setBounds(10, 160, 91, 23);
		
		contentPane.add(btnDone);
	}

	protected void do_btnDone_actionPerformed(ActionEvent e) {
		myData.setMy1(textField1st.getText());
		myData.setMy2(textField2nd.getText());
		myData.setMy3(textField3rd.getText());
		
		this.dispose();
	}
}
