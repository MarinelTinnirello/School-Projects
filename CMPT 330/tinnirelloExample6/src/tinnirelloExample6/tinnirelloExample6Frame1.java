package tinnirelloExample6;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class tinnirelloExample6Frame1 extends JFrame {

	private JPanel contentPane;
	private final JRadioButton rdbt1st = new JRadioButton("1st");
	private final JRadioButton rdbtn2nd = new JRadioButton("2nd");
	private final JRadioButton rdbtn3rd = new JRadioButton("3rd");
	private final JRadioButton rdbtn4th = new JRadioButton("4th");
	private final JCheckBox chckbx1st = new JCheckBox("1st");
	private final JCheckBox chckbx2nd = new JCheckBox("2nd");
	private final JCheckBox chckbx3rd = new JCheckBox("3rd");
	private final JSlider slider = new JSlider();
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final JLabel lblRadioGroupValue = new JLabel("Radio Group Value");
	private final JLabel lblCheckBoxValues = new JLabel("Check Box Values:");
	private final JSpinner spinner = new JSpinner();
	private final JLabel lblSpinnerValue = new JLabel("Spinner Value");
	private final JLabel lblSliderValue = new JLabel("Slider Value");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tinnirelloExample6Frame1 frame = new tinnirelloExample6Frame1();
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
	public tinnirelloExample6Frame1() {
		setTitle("tinnirelloExample6Frame1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		buttonGroup.add(rdbt1st);
		rdbt1st.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_rdbt1st_actionPerformed(e);
			}
		});
		rdbt1st.setBounds(25, 35, 111, 23);
		
		contentPane.add(rdbt1st);
		buttonGroup.add(rdbtn2nd);
		rdbtn2nd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_rdbtn2nd_actionPerformed(e);
			}
		});
		rdbtn2nd.setBounds(25, 65, 111, 23);
		
		contentPane.add(rdbtn2nd);
		buttonGroup.add(rdbtn3rd);
		rdbtn3rd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_rdbtn3rd_actionPerformed(e);
			}
		});
		rdbtn3rd.setBounds(25, 95, 111, 23);
		
		contentPane.add(rdbtn3rd);
		buttonGroup.add(rdbtn4th);
		rdbtn4th.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_rdbtn4th_actionPerformed(e);
			}
		});
		rdbtn4th.setBounds(25, 125, 111, 23);
		
		contentPane.add(rdbtn4th);
		chckbx1st.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_chckbx1st_stateChanged(e);
			}
		});
		chckbx1st.setBounds(226, 35, 101, 23);
		
		contentPane.add(chckbx1st);
		chckbx2nd.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_chckbx2nd_stateChanged(e);
			}
		});
		chckbx2nd.setBounds(226, 65, 101, 23);
		
		contentPane.add(chckbx2nd);
		chckbx3rd.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_chckbx3rd_stateChanged(e);
			}
		});
		chckbx3rd.setBounds(226, 95, 101, 23);
		
		contentPane.add(chckbx3rd);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_slider_stateChanged(e);
			}
		});
		slider.setMinorTickSpacing(10);
		slider.setMajorTickSpacing(10);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setBounds(25, 175, 250, 45);
		
		contentPane.add(slider);
		lblRadioGroupValue.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 16));
		lblRadioGroupValue.setBounds(25, 11, 130, 23);
		
		contentPane.add(lblRadioGroupValue);
		lblCheckBoxValues.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 16));
		lblCheckBoxValues.setBounds(216, 14, 212, 17);
		
		contentPane.add(lblCheckBoxValues);
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_spinner_stateChanged(e);
			}
		});
		spinner.setBounds(320, 175, 65, 20);
		
		contentPane.add(spinner);
		lblSpinnerValue.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 16));
		lblSpinnerValue.setBounds(310, 140, 100, 35);
		
		contentPane.add(lblSpinnerValue);
		lblSliderValue.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 16));
		lblSliderValue.setBounds(36, 230, 100, 20);
		
		contentPane.add(lblSliderValue);
	}
	
	protected void do_rdbt1st_actionPerformed(ActionEvent e) {
		lblRadioGroupValue.setText("1st");
	}
	
	protected void do_rdbtn2nd_actionPerformed(ActionEvent e) {
		lblRadioGroupValue.setText("2nd");
	}
	
	protected void do_rdbtn3rd_actionPerformed(ActionEvent e) {
		lblRadioGroupValue.setText("3rd");
	}
	
	protected void do_rdbtn4th_actionPerformed(ActionEvent e) {
		lblRadioGroupValue.setText("4th");
	}
	
	protected void do_slider_stateChanged(ChangeEvent e) {
		lblSliderValue.setText("" + slider.getValue());
	}
	
	protected void do_spinner_stateChanged(ChangeEvent e) {
		lblSpinnerValue.setText("" + spinner.getValue());
	}
	
	protected void do_chckbx1st_stateChanged(ChangeEvent e) {
		handleCheckBoxes();
	}
	
	protected void do_chckbx2nd_stateChanged(ChangeEvent e) {
		handleCheckBoxes();
	}
	protected void do_chckbx3rd_stateChanged(ChangeEvent e) {
		handleCheckBoxes();
	}
	
	protected void handleCheckBoxes ()
	{
		/***Instead of having 100s of if statements, just make it a separate
		 * method instead
		 * Actually do it and not just think it
		 * Remember to append the strings, use "+=" ***/
		
		String str = "Check Box Values:  ";
		
		if (chckbx1st.isSelected())
		{
			str += "1st ";
		} if (chckbx2nd.isSelected())
		{
			str += "2nd ";
		} if (chckbx3rd.isSelected())
		{
			str += "3rd ";
		}
		
		lblCheckBoxValues.setText(str);
	}
}
