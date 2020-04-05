package tinnirelloExample3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class tinnirelloExample3Frame1 extends JFrame {

	private JPanel contentPane;
	private final JLabel lblName = new JLabel("Name:");
	private final JLabel lblAge = new JLabel("Age:");
	private final JTextField textField_name = new JTextField();
	private final JTextField textField_age = new JTextField();
	private final JButton btnPrint = new JButton("Print");
	private final JTextArea textArea_output = new JTextArea();
	private final JScrollPane scrollPane = new JScrollPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tinnirelloExample3Frame1 frame = new tinnirelloExample3Frame1();
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
	public tinnirelloExample3Frame1() {
		setTitle("tinnirelloExample3Frame1");
		textField_age.setBounds(100, 92, 106, 20);
		textField_age.setColumns(10);
		textField_name.setBounds(100, 56, 106, 20);
		textField_name.setColumns(10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblName.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblName.setBounds(33, 56, 76, 21);
		
		contentPane.add(lblName);
		lblAge.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblAge.setBounds(33, 88, 76, 22);
		
		contentPane.add(lblAge);
		
		contentPane.add(textField_name);
		
		contentPane.add(textField_age);
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnPrint_actionPerformed(e);
			}
		});
		btnPrint.setBounds(115, 160, 91, 23);
		
		contentPane.add(btnPrint);
		scrollPane.setBounds(216, 57, 197, 100);
		
		contentPane.add(scrollPane);
		scrollPane.setViewportView(textArea_output);
	}
	protected void do_btnPrint_actionPerformed(ActionEvent e) {
		/*if (textField_name.getText().isEmpty())
		{
			textArea_output.append("ERROR:  No text has been inputed.  Please enter data." + "\n");
		}else
		{
			textArea_output.append("Name:  " + textField_name.getText() + "\n");
			textArea_output.append("Age:   " + textField_age.getText() + "\n");
		}*/
		
		if (textField_name.getText().isEmpty() && textField_age.getText().isEmpty())
		{
			textArea_output.setForeground(Color.RED);
			textArea_output.append("ERROR:  No text has been inputed in both NAME and AGE.  "
					+ "Please enter data." + "\n");
		} else if (textField_name.getText().isEmpty())
		{
			textArea_output.setForeground(Color.RED);
			textArea_output.append("ERROR:  No text has been inputed in NAME.  "
					+ "Please enter data." + "\n");
		} else if (textField_age.getText().isEmpty())
		{
			textArea_output.setForeground(Color.RED);
			textArea_output.append("ERROR:  No text has been inputed in AGE.  "
					+ "Please enter data." + "\n");
		} else
		{
			textArea_output.setText("");
			textArea_output.setForeground(Color.BLACK);
			textArea_output.append("Name:  " + textField_name.getText() + "\n");
			textArea_output.append("Age:   " + textField_age.getText() + "\n");
		}
	}
}
