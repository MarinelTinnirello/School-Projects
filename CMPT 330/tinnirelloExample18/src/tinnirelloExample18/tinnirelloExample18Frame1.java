package tinnirelloExample18;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class tinnirelloExample18Frame1 extends JFrame {

	private JPanel contentPane;
	private final JLabel lblMemeboy = new JLabel("memeboy");
	private final JButton btnColorize = new JButton("Colorize");
	private final JButton btnMoveLef = new JButton("Move lef");
	private final JButton btnMoveRight = new JButton("Move right");
	private final JButton btnMoveUp = new JButton("Move up");
	private final JButton btnMoveDown = new JButton("Move down");
	private final JButton btnMoveNe = new JButton("Move NE");
	private final JButton btnMoveNw = new JButton("Move NW");
	private final JButton btnMoveSe = new JButton("Move SE");
	private final JButton btnMoveSw = new JButton("Move SW");
	private final JFormattedTextField formattedTextField = new JFormattedTextField();
	private final JLabel lblMoveByHow = new JLabel("Move by how much");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tinnirelloExample18Frame1 frame = new tinnirelloExample18Frame1();
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
	public tinnirelloExample18Frame1() {
		setTitle("tinnirelloExampleFrame1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblMemeboy.setOpaque(true);
		lblMemeboy.setBackground(Color.CYAN);
		lblMemeboy.setForeground(Color.CYAN);
		lblMemeboy.setBounds(10, 11, 111, 80);
		
		contentPane.add(lblMemeboy);
		btnColorize.setBounds(10, 120, 91, 23);
		
		contentPane.add(btnColorize);
		btnMoveLef.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnMoveLef_actionPerformed(e);
			}
		});
		btnMoveLef.setBounds(10, 192, 91, 23);
		
		contentPane.add(btnMoveLef);
		btnMoveRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnMoveRight_actionPerformed(e);
			}
		});
		btnMoveRight.setBounds(193, 192, 91, 23);
		
		contentPane.add(btnMoveRight);
		btnMoveUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnMoveUp_actionPerformed(e);
			}
		});
		btnMoveUp.setBounds(101, 168, 91, 23);
		
		contentPane.add(btnMoveUp);
		btnMoveDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnMoveDown_actionPerformed(e);
			}
		});
		btnMoveDown.setBounds(101, 217, 91, 23);
		
		contentPane.add(btnMoveDown);
		btnMoveNe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnMoveNe_actionPerformed(e);
			}
		});
		btnMoveNe.setBounds(193, 168, 91, 23);
		
		contentPane.add(btnMoveNe);
		btnMoveNw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnMoveNw_actionPerformed(e);
			}
		});
		btnMoveNw.setBounds(10, 168, 91, 23);
		
		contentPane.add(btnMoveNw);
		btnMoveSe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnMoveSe_actionPerformed(e);
			}
		});
		btnMoveSe.setBounds(193, 217, 91, 23);
		
		contentPane.add(btnMoveSe);
		btnMoveSw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnMoveSw_actionPerformed(e);
			}
		});
		btnMoveSw.setBounds(10, 217, 91, 23);
		
		contentPane.add(btnMoveSw);
		formattedTextField.setBounds(295, 231, 133, 23);
		
		contentPane.add(formattedTextField);
		lblMoveByHow.setBounds(294, 201, 104, 14);
		
		contentPane.add(lblMoveByHow);
	}
	protected void do_btnMoveRight_actionPerformed(ActionEvent e) {
		lblMemeboy.setLocation(lblMemeboy.getX() + 5, lblMemeboy.getY());
	}
	protected void do_btnMoveLef_actionPerformed(ActionEvent e) {
		lblMemeboy.setLocation(lblMemeboy.getX() - 5, lblMemeboy.getY());
	}
	protected void do_btnMoveUp_actionPerformed(ActionEvent e) {
		lblMemeboy.setLocation(lblMemeboy.getX(), lblMemeboy.getY() + 5);
	}
	protected void do_btnMoveDown_actionPerformed(ActionEvent e) {
		lblMemeboy.setLocation(lblMemeboy.getX(), lblMemeboy.getY() - 5);
	}
	protected void do_btnMoveNe_actionPerformed(ActionEvent e) {
		lblMemeboy.setLocation(lblMemeboy.getX() + 5, lblMemeboy.getY() + 5);
	}
	protected void do_btnMoveNw_actionPerformed(ActionEvent e) {
		lblMemeboy.setLocation(lblMemeboy.getX() - 5, lblMemeboy.getY() + 5);
	}
	protected void do_btnMoveSe_actionPerformed(ActionEvent e) {
		lblMemeboy.setLocation(lblMemeboy.getX() + 5, lblMemeboy.getY() - 5);
	}
	protected void do_btnMoveSw_actionPerformed(ActionEvent e) {
		lblMemeboy.setLocation(lblMemeboy.getX() - 5, lblMemeboy.getY() - 5);
	}
}
