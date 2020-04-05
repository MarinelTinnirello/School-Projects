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

public class tinnirelloExample17Frame1 extends JFrame {

	private JPanel contentPane;
	private final JLabel lblValue1 = new JLabel("Value 1");
	private final JLabel lblValue2 = new JLabel("Value 2");
	private final JLabel lblValue3 = new JLabel("Value 3");
	private final JTextField textFieldValue1 = new JTextField();
	private final JTextField textFieldValue2 = new JTextField();
	private final JTextField textFieldValue3 = new JTextField();
	private final JButton btnAdd = new JButton("Add");
	Item theData = new Item();
	private final JButton btnUpdate = new JButton("Update");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tinnirelloExample17Frame1 frame = new tinnirelloExample17Frame1();
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
	public tinnirelloExample17Frame1() {
		textFieldValue3.setBounds(62, 77, 106, 20);
		textFieldValue3.setColumns(10);
		textFieldValue2.setBounds(62, 42, 106, 20);
		textFieldValue2.setColumns(10);
		textFieldValue1.setBounds(62, 8, 106, 20);
		textFieldValue1.setColumns(10);
		setTitle("tinnirelloExample17Frame1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblValue1.setBounds(10, 11, 48, 14);
		
		contentPane.add(lblValue1);
		lblValue2.setBounds(10, 45, 48, 14);
		
		contentPane.add(lblValue2);
		lblValue3.setBounds(10, 77, 48, 14);
		
		contentPane.add(lblValue3);
		
		contentPane.add(textFieldValue1);
		
		contentPane.add(textFieldValue2);
		
		contentPane.add(textFieldValue3);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnAdd_actionPerformed(e);
			}
		});
		btnAdd.setBounds(10, 140, 91, 23);
		
		contentPane.add(btnAdd);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnUpdate_actionPerformed(e);
			}
		});
		btnUpdate.setBounds(111, 140, 91, 23);
		
		contentPane.add(btnUpdate);
	}
	protected void do_btnAdd_actionPerformed(ActionEvent e) {
		tinnirelloExample17addFrame frame = new tinnirelloExample17addFrame(theData);
		
		theData = new Item(textFieldValue1.getText(), textFieldValue2.getText(), textFieldValue3.getText());
		
		frame.setLocation(this.getX() + 20, this.getY() + 20);
		frame.setVisible(true);
	}
	protected void do_btnUpdate_actionPerformed(ActionEvent e) {
		textFieldValue1.setText(theData.getMy1());
		textFieldValue2.setText(theData.getMy2());
		textFieldValue3.setText(theData.getMy3());
	}
}