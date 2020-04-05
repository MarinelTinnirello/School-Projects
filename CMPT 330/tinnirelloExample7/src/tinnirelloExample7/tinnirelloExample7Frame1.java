package tinnirelloExample7;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;

public class tinnirelloExample7Frame1 extends JFrame {

	private JPanel contentPane;
	private final JMenuBar menuBar = new JMenuBar();
	private final JMenu mnFile = new JMenu("File");
	private final JMenuItem mntmNew = new JMenuItem("New");
	private final JMenuItem mntmOpen = new JMenuItem("Open");
	private final JMenu mnMore = new JMenu("More");
	private final JMenuItem mntm1st = new JMenuItem("1st");
	private final JMenuItem mntm2nd = new JMenuItem("2nd");
	private final JMenuItem mntmExit = new JMenuItem("Exit");
	private final JLabel lblYourChoice = new JLabel("Your Choice:");
	private final JSeparator separator = new JSeparator();
	private final JLabel lblChoice = new JLabel("choice");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tinnirelloExample7Frame1 frame = new tinnirelloExample7Frame1();
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
	public tinnirelloExample7Frame1() {
		setTitle("tinnirelloExample7Frame1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		setJMenuBar(menuBar);
		
		menuBar.add(mnFile);
		mntmNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmNew_actionPerformed(e);
			}
		});
		
		mnFile.add(mntmNew);
		mntmOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmOpen_actionPerformed(e);
			}
		});
		
		mnFile.add(mntmOpen);
		mnMore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mnMore_actionPerformed(e);
			}
		});
		
		mnFile.add(mnMore);
		
		mnMore.add(mntm1st);
		
		mnMore.add(mntm2nd);
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmExit_actionPerformed(e);
			}
		});
		
		mnFile.add(separator);
		
		mnFile.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblYourChoice.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblYourChoice.setBounds(80, 40, 80, 40);
		
		contentPane.add(lblYourChoice);
		lblChoice.setBounds(170, 54, 48, 14);
		
		contentPane.add(lblChoice);
	}
	protected void do_mntmExit_actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	protected void do_mntmNew_actionPerformed(ActionEvent e) {
		lblChoice.setText("New");
	}
	protected void do_mntmOpen_actionPerformed(ActionEvent e) {
		lblChoice.setText("Open");
	}
	protected void do_mnMore_actionPerformed(ActionEvent e) {
		lblChoice.setText("More");
	}
}
