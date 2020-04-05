package tinnirelloExample13;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tinnirelloExample13Frame1 extends JFrame {

	private JPanel contentPane;
	private final JLabel lblText = new JLabel("text");
	private final JTextField textFieldInput = new JTextField();
	private final JButton btnShow = new JButton("Show");
	private final JLabel lblInput = new JLabel("Input:");
	private final JButton btnExit = new JButton("Exit");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tinnirelloExample13Frame1 frame = new tinnirelloExample13Frame1();
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
	public tinnirelloExample13Frame1() {
		textFieldInput.setBounds(80, 60, 106, 20);
		textFieldInput.setColumns(10);
		setTitle("tinnirelloExample13Frame1");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblText.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblText.setBounds(280, 62, 106, 14);
		
		contentPane.add(lblText);
		
		contentPane.add(textFieldInput);
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnShow_actionPerformed(e);
			}
		});
		btnShow.setBounds(150, 100, 91, 23);
		
		contentPane.add(btnShow);
		lblInput.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblInput.setBounds(22, 62, 48, 14);
		
		contentPane.add(lblInput);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnExit_actionPerformed(e);
			}
		});
		btnExit.setBounds(150, 145, 91, 23);
		
		contentPane.add(btnExit);
	}
	protected void do_btnShow_actionPerformed(ActionEvent e) {
		if(textFieldInput.getText().isEmpty())
		{
			/***showDialogMessage() parameters:
			 * this
			 * text
			 * title
			 * message type***/
			JOptionPane.showMessageDialog(this, "Please enter a value", "ERROR - No text", JOptionPane.ERROR_MESSAGE);
		} else
		{
			lblText.setText("Text: " + textFieldInput.getText());
			
			Object[] options = {"Berhaps", "No", "I do'nt understand the question"};
			
			JOptionPane.showOptionDialog(this, "Do you is are yes", "Simple question", JOptionPane.YES_NO_CANCEL_OPTION, 
					JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
		}
	}
	protected void do_btnExit_actionPerformed(ActionEvent e) {
		int temp = JOptionPane.showConfirmDialog(this, "Computer = over \n Virus = very yes");
		
		if (temp == 0)
		{
			this.dispose();;
		}
	}
}
