package tinnirelloExample19;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class tinnirelloTinnirello19Frame1 extends JFrame {

	private JPanel contentPane;
	private final JButton btnFlash = new JButton("Flash");
	private final JLabel lblMasters = new JLabel("Masters of the Universe");
	Timer timer = new Timer(100, new ActionListener() {
        
        public void actionPerformed(ActionEvent e) {
              lblMasters.setVisible(!lblMasters.isVisible());
        }
	}); //brace-paren-semicolon
	private final JSlider slider = new JSlider();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tinnirelloTinnirello19Frame1 frame = new tinnirelloTinnirello19Frame1();
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
	public tinnirelloTinnirello19Frame1() {
		setTitle("tinnirelloExample19Frame1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		btnFlash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnFlash_actionPerformed(e);
			}
		});
		btnFlash.setBounds(10, 63, 91, 23);
		
		contentPane.add(btnFlash);
		lblMasters.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMasters.setForeground(Color.RED);
		lblMasters.setBounds(10, 11, 158, 14);
		
		contentPane.add(lblMasters);
		slider.setPaintTicks(true);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_slider_stateChanged(e);
			}
		});
		slider.setBounds(111, 63, 200, 23);
		
		contentPane.add(slider);
	}
	protected void do_btnFlash_actionPerformed(ActionEvent e) {
		//timer.start();
		
		if (timer.isRunning()) {
			lblMasters.setVisible(!lblMasters.isVisible());
		} else {
			timer.stop();
		}
	}
	protected void do_slider_stateChanged(ChangeEvent e) {
		timer.setDelay(slider.getValue());
	}
}
