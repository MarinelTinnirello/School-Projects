package tinnirelloExample15;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tinnirelloExample15Frame1 extends JFrame {

	private JPanel contentPane;
	private final JButton btnNewButton = new JButton("New Button");
	private final JButton btnNewButton2 = new JButton("New button 2");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tinnirelloExample15Frame1 frame = new tinnirelloExample15Frame1();
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
	public tinnirelloExample15Frame1() {
		setTitle("tinnirelloExample15Frame1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_actionPerformed(e);
			}
		});
		btnNewButton.setBounds(150, 120, 91, 23);
		
		contentPane.add(btnNewButton);
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton2_actionPerformed(e);
			}
		});
		btnNewButton2.setBounds(145, 160, 100, 23);
		
		contentPane.add(btnNewButton2);
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		//this.dispose();
		tinnirelloExample15Frame2 frame = new tinnirelloExample15Frame2();
		frame.setLocation(this.getX() + 20, this.getY() + 20);
		frame.setVisible(true);
	}
	protected void do_btnNewButton2_actionPerformed(ActionEvent e) {
		tinnirelloExample15Frame3 frame = new tinnirelloExample15Frame3();
		frame.setLocation(this.getX() + 40, this.getY() + 40);
		frame.setVisible(true);
	}
}
