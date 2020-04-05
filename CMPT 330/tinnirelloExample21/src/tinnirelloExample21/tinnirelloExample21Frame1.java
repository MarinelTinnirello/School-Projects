package tinnirelloExample21;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tinnirelloExample21Frame1 extends JFrame {

	private JPanel contentPane;
	private final JLabel lblBounce = new JLabel("");
	private final JButton btnStart = new JButton("Start");

	Timer timer = new Timer(100, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
    		boolean hit = false;

        	if (lblBounce.getX() < contentPane.getWidth() - 50 && hit == false) {
            	lblBounce.setLocation(lblBounce.getX() + 10, lblBounce.getY());
            	hit = true;
        	} else if (lblBounce.getX() < contentPane.getWidth() - 50 && hit == true) {
        		lblBounce.setLocation(lblBounce.getX() - 400, lblBounce.getY());
        	} else {
        		timer.stop();
        	}
        }
	}); //brace-paren-semicolon

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tinnirelloExample21Frame1 frame = new tinnirelloExample21Frame1();
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
	public tinnirelloExample21Frame1() {
		setTitle("tinnirelloExample21Frame1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblBounce.setOpaque(true);
		lblBounce.setForeground(Color.BLUE);
		lblBounce.setBackground(Color.BLUE);
		lblBounce.setBounds(10, 11, 49, 49);
		
		contentPane.add(lblBounce);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnStart_actionPerformed(e);
			}
		});
		btnStart.setBounds(10, 351, 91, 23);
		
		contentPane.add(btnStart);
	}
	protected void do_btnStart_actionPerformed(ActionEvent e) {
		timer.start();
	}
}
