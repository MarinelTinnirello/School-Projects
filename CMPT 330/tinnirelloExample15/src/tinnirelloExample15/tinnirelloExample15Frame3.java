package tinnirelloExample15;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tinnirelloExample15Frame3 extends JFrame {

	private JPanel contentPane;
	private final JButton btnExit = new JButton("Exit");

	/**
	 * Create the frame.
	 */
	public tinnirelloExample15Frame3() {
		setTitle("tinnirelloExample15Frame3");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnExit_actionPerformed(e);
			}
		});
		btnExit.setBounds(150, 120, 91, 23);
		
		contentPane.add(btnExit);
	}

	protected void do_btnExit_actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
