package tinnirelloExample5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class tinnirelloExample5Frame1 extends JFrame {

	private JPanel contentPane;
	private final JRadioButton rdbtn1st = new JRadioButton("1st");
	private final JRadioButton rdbtn2nd = new JRadioButton("2nd");
	private final JRadioButton rdbtn3rd = new JRadioButton("3rd");
	private final JRadioButton rdbtn4th = new JRadioButton("4th");
	private final JLabel lblSelected = new JLabel("Selected:");
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final JLabel lblSelectedOutput = new JLabel("New label");
	private final JSlider slider = new JSlider();
	private final JLabel lblValue = new JLabel("Value:");
	private final JLabel lblValueOutput = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tinnirelloExample5Frame1 frame = new tinnirelloExample5Frame1();
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
	public tinnirelloExample5Frame1() {
		setTitle("tinnirelloExample5Frame1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		buttonGroup.add(rdbtn1st);
		rdbtn1st.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_rdbtn1st_actionPerformed(e);
			}
		});
		rdbtn1st.setBounds(31, 32, 111, 23);
		
		contentPane.add(rdbtn1st);
		buttonGroup.add(rdbtn2nd);
		rdbtn2nd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_rdbtn2nd_actionPerformed(e);
			}
		});
		rdbtn2nd.setBounds(31, 60, 111, 23);
		
		contentPane.add(rdbtn2nd);
		buttonGroup.add(rdbtn3rd);
		rdbtn3rd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_rdbtn3rd_actionPerformed(e);
			}
		});
		rdbtn3rd.setBounds(31, 86, 111, 23);
		
		contentPane.add(rdbtn3rd);
		buttonGroup.add(rdbtn4th);
		rdbtn4th.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_rdbtn4th_actionPerformed(e);
			}
		});
		rdbtn4th.setBounds(31, 112, 111, 23);
		
		contentPane.add(rdbtn4th);
		lblSelected.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 18));
		lblSelected.setBounds(31, 190, 89, 28);
		
		contentPane.add(lblSelected);
		lblSelectedOutput.setBounds(145, 200, 89, 14);
		
		contentPane.add(lblSelectedOutput);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_slider_stateChanged(e);
			}
		});
		slider.setMajorTickSpacing(10);
		slider.setPaintLabels(true);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		slider.setBounds(160, 32, 250, 51);
		
		contentPane.add(slider);
		lblValue.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 18));
		lblValue.setBounds(160, 116, 74, 23);
		
		contentPane.add(lblValue);
		lblValueOutput.setBounds(244, 123, 48, 14);
		
		contentPane.add(lblValueOutput);
	}
	protected void do_rdbtn1st_actionPerformed(ActionEvent e) {
		lblSelectedOutput.setText("1st");
	}
	protected void do_rdbtn2nd_actionPerformed(ActionEvent e) {
		lblSelectedOutput.setText("2nd");
	}
	
	protected void do_rdbtn3rd_actionPerformed(ActionEvent e) {
		lblSelectedOutput.setText("3rd");
	}
	
	protected void do_rdbtn4th_actionPerformed(ActionEvent e) {
		lblSelectedOutput.setText("4th");
	}
	protected void do_slider_stateChanged(ChangeEvent e) {
		lblValueOutput.setText("" + slider.getValue());;
	}
}
