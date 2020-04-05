package tinnirelloExample20;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class tinnirelloExample20Frame1 extends JFrame {

	private JPanel contentPane;
	private final JButton btnPlay = new JButton("Play");
	private final JButton btnStop = new JButton("Stop");
	private final JComboBox comboBox = new JComboBox();
	
	Class metaObject = this.getClass();						// for setup
	URL url = metaObject.getResource("Success.wav");
	AudioClip audio = Applet.newAudioClip(url);
	URL url1 = metaObject.getResource("22 - Psychedelic.wav");
	URL url2 = metaObject.getResource("Sanctuary (PLanitT).wav");
	
	
	/*Desktop desktop = null;
	File file = new File(System.getenv("programfiles"));*/

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tinnirelloExample20Frame1 frame = new tinnirelloExample20Frame1();
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
	public tinnirelloExample20Frame1() {
		setTitle("tinnirelloExample20Frame1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnPlay_actionPerformed(e);
			}
		});
		btnPlay.setBounds(10, 295, 91, 23);
		
		contentPane.add(btnPlay);
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnStop_actionPerformed(e);
			}
		});
		btnStop.setBounds(111, 295, 91, 23);
		
		contentPane.add(btnStop);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Success.wav", "22 - Psychedelic", "Sanctuary (PLanitT)"}));
		comboBox.setBounds(10, 11, 192, 22);
		
		contentPane.add(comboBox);
	}
	protected void do_btnPlay_actionPerformed(ActionEvent e) {
		if (comboBox.getSelectedIndex() == 0) {
			audio.play();
		}
		if (comboBox.getSelectedIndex() == 1) {
			audio = Applet.newAudioClip(url1);
			audio.play();
		} 
		if (comboBox.getSelectedIndex() == 2) {
			audio = Applet.newAudioClip(url2);
			audio.play();
		}

	}
	protected void do_btnStop_actionPerformed(ActionEvent e) {
		audio.stop();
	}
}
