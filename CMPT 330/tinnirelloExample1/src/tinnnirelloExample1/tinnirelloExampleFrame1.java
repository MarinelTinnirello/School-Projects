package tinnnirelloExample1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tinnirelloExampleFrame1 extends JFrame {

	private JPanel contentPane;
	private final JLabel lblHello = new JLabel("Hello");
	private final JLabel lblGoodbye = new JLabel("Goodbye");
	private final JButton btnSwitch = new JButton("SWITCH!!!");
	private final JLabel lblBeastieBois = new JLabel("Beastie Bois");
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tinnirelloExampleFrame1 frame = new tinnirelloExampleFrame1();
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
	public tinnirelloExampleFrame1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblHello.setForeground(Color.CYAN);
		lblHello.setBackground(Color.BLACK);
		lblHello.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 18));
		lblHello.setBounds(25, 60, 120, 45);
		contentPane.add(lblHello);
		btnSwitch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnNewButton_actionPerformed(arg0);
			}
		});
		
		lblGoodbye.setFont(new Font("Calibri Light", Font.BOLD, 18));
		lblGoodbye.setForeground(Color.MAGENTA);
		lblGoodbye.setBounds(310, 60, 120, 45);
		contentPane.add(lblGoodbye);
		
		btnSwitch.setBounds(155, 166, 91, 23);
		contentPane.add(btnSwitch);
		lblBeastieBois.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblBeastieBois.setForeground(Color.GREEN);
		lblBeastieBois.setBounds(155, 60, 120, 45);
		
		contentPane.add(lblBeastieBois);
	}
	
	protected void do_btnNewButton_actionPerformed(ActionEvent arg0)
	{
		/***Original***/
		/*String temp = lblHello.getText();
		String temp2 = lblBeastieBois.getText();
		
		lblHello.setText(lblGoodbye.getText());
		lblGoodbye.setText(temp);*/
		
		
		/***Add a 3rd JLabel to cycle through, change the color and font***/
		/**Method on how to do:
		 * b = temp
		 * 
		 * b = a
		 * a = c
		 * c = temp
		 * **/
		
		String temp = lblBeastieBois.getText();
		
		lblBeastieBois.setText(lblHello.getText());
		lblHello.setText(lblGoodbye.getText());
		lblGoodbye.setText(temp);
	}
}
