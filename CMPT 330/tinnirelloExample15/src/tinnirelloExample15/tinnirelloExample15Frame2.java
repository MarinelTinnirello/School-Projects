package tinnirelloExample15;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tinnirelloExample15Frame2 extends JFrame {

	private JPanel contentPane;
	private final JButton btnClose = new JButton("Close");
	private final JButton btnNewButton2 = new JButton("New button 2");

	/**
	 * Create the frame.
	 */
	public tinnirelloExample15Frame2() {
		setTitle("tinnirelloExampleFrame2");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnClose_actionPerformed(e);
			}
		});
		btnClose.setBounds(150, 120, 91, 23);
		
		contentPane.add(btnClose);
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton2_actionPerformed(e);
			}
		});
		btnNewButton2.setBounds(145, 69, 100, 23);
		
		contentPane.add(btnNewButton2);
	}

	protected void do_btnClose_actionPerformed(ActionEvent e) {
		//this.setVisible(false);
		this.dispose();
	}
	protected void do_btnNewButton2_actionPerformed(ActionEvent e) {
		tinnirelloExample15Frame3 frame = new tinnirelloExample15Frame3();
		frame.setVisible(true);
	}
}
