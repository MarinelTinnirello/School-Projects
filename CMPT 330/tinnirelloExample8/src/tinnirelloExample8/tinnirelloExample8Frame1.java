package tinnirelloExample8;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.Color;

public class tinnirelloExample8Frame1 extends JFrame {

	private JPanel contentPane;
	private final JMenuBar menuBar = new JMenuBar();
	private final JMenu mnFile = new JMenu("File");
	private final JMenuItem mntmOpenFile = new JMenuItem("Open File");
	private final JMenuItem mntmExit = new JMenuItem("Exit");
	private final JMenu mnNew = new JMenu("New");
	private final JMenu mnEdit = new JMenu("Edit");
	private final JMenuItem mntmUndoTyping = new JMenuItem("Undo typing");
	private final JMenuItem mntmClose = new JMenuItem("Close");
	private final JSeparator separator = new JSeparator();
	private final JSeparator separator_1 = new JSeparator();
	private final JMenuItem mntmRedoTyping = new JMenuItem("Redo typing");
	private final JLabel lblUsername = new JLabel("Username: ");
	private final JLabel lblPassword = new JLabel("Password:");
	private final JTextField textFieldUsername = new JTextField();
	private final JPasswordField passwordField = new JPasswordField();
	private final JButton btnLogin = new JButton("Login");
	private final JLabel lblYourChoice = new JLabel("Your choice:");
	private final JLabel lblChoice = new JLabel("choice");
	private final JProgressBar progressBar = new JProgressBar();
	private final JButton btnRun = new JButton("Run");
	private final JButton btnTurbo = new JButton("Turbo");
	private final JButton btnReset = new JButton("Reset");
	private final JMenuItem mntmNewProject = new JMenuItem("New project");
	private final JMenuItem mntmProject = new JMenuItem("Project 1");
	private final JLabel lblUsernamePassword = new JLabel("username || password");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tinnirelloExample8Frame1 frame = new tinnirelloExample8Frame1();
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
	public tinnirelloExample8Frame1() {
		setTitle("tinnirelloExample8Frame1");
		textFieldUsername.setBounds(90, 94, 106, 20);
		textFieldUsername.setColumns(10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		setJMenuBar(menuBar);
		
		menuBar.add(mnFile);
		mnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mnNew_actionPerformed(e);
			}
		});
		
		mnFile.add(mnNew);
		mntmNewProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmNewProject_actionPerformed(e);
			}
		});
		mntmNewProject.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		
		mnNew.add(mntmNewProject);
		mntmProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmProject_actionPerformed(e);
			}
		});
		mntmProject.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
		
		mnNew.add(mntmProject);
		mntmOpenFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmOpenFile_actionPerformed(e);
			}
		});
		mntmOpenFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		
		mnFile.add(mntmOpenFile);
		
		mnFile.add(separator_1);
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmExit_actionPerformed(e);
			}
		});
		
		mnFile.add(mntmExit);
		
		menuBar.add(mnEdit);
		mntmUndoTyping.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmUndoTyping_actionPerformed(e);
			}
		});
		mntmUndoTyping.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_MASK));
		
		mnEdit.add(mntmUndoTyping);
		mntmRedoTyping.setForeground(Color.GRAY);
		mntmRedoTyping.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, InputEvent.CTRL_MASK));
		
		mnEdit.add(mntmRedoTyping);
		
		mnEdit.add(separator);
		
		mnEdit.add(mntmClose);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUsername.setBounds(10, 89, 90, 25);
		
		contentPane.add(lblUsername);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(10, 125, 90, 25);
		
		contentPane.add(lblPassword);
		
		contentPane.add(textFieldUsername);
		passwordField.setBounds(90, 129, 106, 20);
		
		contentPane.add(passwordField);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnLogin_actionPerformed(e);
			}
		});
		btnLogin.setBounds(70, 161, 91, 23);
		
		contentPane.add(btnLogin);
		lblYourChoice.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblYourChoice.setBounds(225, 11, 90, 32);
		
		contentPane.add(lblYourChoice);
		lblChoice.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblChoice.setBounds(235, 42, 106, 20);
		
		contentPane.add(lblChoice);
		progressBar.setStringPainted(true);
		progressBar.setBounds(225, 89, 203, 25);
		
		contentPane.add(progressBar);
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnRun_actionPerformed(e);
			}
		});
		btnRun.setBounds(225, 128, 91, 23);
		
		contentPane.add(btnRun);
		btnTurbo.setBounds(337, 128, 91, 23);
		
		contentPane.add(btnTurbo);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnReset_actionPerformed(e);
			}
		});
		btnReset.setBounds(275, 161, 91, 23);
		
		contentPane.add(btnReset);
		lblUsernamePassword.setBounds(10, 218, 186, 14);
		
		contentPane.add(lblUsernamePassword);
	}
	protected void do_mnNew_actionPerformed(ActionEvent e) {
		lblChoice.setText("New");
	}
	protected void do_mntmNewProject_actionPerformed(ActionEvent e) {
		lblChoice.setText("New > New Project");
	}
	protected void do_mntmProject_actionPerformed(ActionEvent e) {
		lblChoice.setText("New > Project 1");
	}
	protected void do_mntmOpenFile_actionPerformed(ActionEvent e) {
		lblChoice.setText("Open file");
	}
	protected void do_mntmExit_actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	protected void do_mntmUndoTyping_actionPerformed(ActionEvent e) {
		lblChoice.setText("Edit > Undo typing");
	}
	protected void do_btnLogin_actionPerformed(ActionEvent e) {
		lblUsernamePassword.setText(textFieldUsername.getText().toString() + " || " + 
				passwordField.getText().toString()); 
	}
	protected void do_btnRun_actionPerformed(ActionEvent e) {
		progressBar.setValue(progressBar.getValue() + (btnTurbo.isSelected() ? 10 : 5));
	}
	protected void do_btnReset_actionPerformed(ActionEvent e) {
		progressBar.setValue(0);
	}
}
