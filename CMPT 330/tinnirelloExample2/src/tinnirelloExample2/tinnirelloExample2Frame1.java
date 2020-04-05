package tinnirelloExample2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class tinnirelloExample2Frame1 extends JFrame {

	private JPanel contentPane;
	private final JLabel lblCmptIs = new JLabel("CMPT 330 is radical");
	private final JButton btnBlease = new JButton("Blease");
	private final JLabel lblWhomElseQuantum = new JLabel("Whom else quantum jumping");
	private final JButton btnFancier = new JButton("Fancier");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tinnirelloExample2Frame1 frame = new tinnirelloExample2Frame1();
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
	public tinnirelloExample2Frame1() {
		setTitle("tinnirelloExample2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblCmptIs.setForeground(Color.BLUE);
		lblCmptIs.setFont(new Font("Source Sans Pro", Font.BOLD | Font.ITALIC, 15));
		lblCmptIs.setBounds(37, 55, 135, 50);
		
		/***Add visibility after the generated code, but before the object is added
		 * to the contentPane***/
		lblCmptIs.setVisible(!lblCmptIs.isVisible());
		
		contentPane.add(lblCmptIs);
		
		btnBlease.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnNewButton_actionPerformed(arg0);
			}
		});
		btnBlease.setBounds(170, 144, 91, 23);
		contentPane.add(btnBlease);
		lblWhomElseQuantum.setBounds(244, 64, 160, 32);
		
		contentPane.add(lblWhomElseQuantum);
		btnFancier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnFancier_actionPerformed(arg0);
			}
		});
		btnFancier.setBounds(170, 190, 91, 23);
		
		contentPane.add(btnFancier);
	}
	
	protected void do_btnNewButton_actionPerformed(ActionEvent arg0)
	{
		/***With if statements***/
		/*if (lblCmptIs.isVisible() == false) {
			lblCmptIs.setVisible(true);
		}else
		{
			lblCmptIs.setVisible(false);
		}*/
		
		/***Nesting the boolean by setting it opposite to what its current value is***/
		lblCmptIs.setVisible(!lblCmptIs.isVisible());
	}
	
	protected void do_btnFancier_actionPerformed(ActionEvent arg0)
	{
		lblCmptIs.setVisible(!lblCmptIs.isVisible());
		lblWhomElseQuantum.setVisible(!lblWhomElseQuantum.isVisible());
	}
}
