package tinnirelloSACAP;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;

public class tinnirelloSACAPhelpApplicant extends JFrame {

	private JPanel contentPane;
	private final JLabel lblApplicantInformationTab = new JLabel("Applicant Information Tab - Help");
	private final JSeparator separator = new JSeparator();
	private final JLabel lblFirstName = new JLabel("First Name*");
	private final JLabel lblNameInfo = new JLabel("Enter the applicant's first name in the textfield.");
	private final JLabel lblLastName = new JLabel("Last Name*");
	private final JLabel lblLastInfo = new JLabel("Enter the applicant's last name in the textfield.");
	private final JLabel lblAddress = new JLabel("Address");
	private final JLabel lblAddressInfo = new JLabel("<html>\r\nEnter the applicant's street address in the 1st textfield and the postal <br>\r\ncode in the 2nd textfield.\r\n</html>");
	private final JLabel lblNearest = new JLabel("Nearest Location*");
	private final JLabel lblNearInfo = new JLabel("<html>\r\nSelect the Salvation Army dropoff nearest to the applicant in the list. <br>\r\nSelect \"Other\" and enter the nearest location to the applicant in the <br>\r\npopup, if the applicant's nearest location doesn't appear.\r\n</html>");
	private final JLabel lblPhone = new JLabel("Phone");
	private final JLabel lblPhoneInfo = new JLabel("<html>\r\nEnter the applicant's telephone or cell number in the textfield <br>\r\n(it will automatically format).\r\n</html>");
	private final JLabel lblOfAdults = new JLabel("# of Adults");
	private final JLabel lblNumAdultsInfo = new JLabel("<html>\r\nEnter the amount of adults residing in the household currently in the <br>\r\ntextfield (only accepts digits).\r\n</html>");
	private final JLabel lblOfChildren = new JLabel("# of Children 18+");
	private final JLabel lblNum18Info = new JLabel("<html>\r\nEnter the amount of children the applicant has that are over 18 in the<br>\r\ntextfield (only accepts digits).\r\n</html>");
	private final JLabel lblOfChildren_1 = new JLabel("# of Children 0 - 17");
	private final JLabel lblNum17Info = new JLabel("<html>\r\nEnter the amount of children the applicant has that are under 17 in the <br>\r\ntextfield (only accepts digits).\r\n</html>");
	private final JLabel lblConfirm = new JLabel("Confirm*");
	private final JLabel lblConfirmInfo = new JLabel("<html>\r\nPress the button to confim the applicant's information.  Commits the <br>\r\ninformation to the adjacent text area. Hit the button again if a change is made.\r\n</html>");
	private final JLabel lblEmail = new JLabel("Email*");
	private final JLabel lblEmailInfo = new JLabel("Enter the applicant's valid email address, with an \"@\" and \".\", in the textfield.");

	/**
	 * Create the frame.
	 */
	public tinnirelloSACAPhelpApplicant() {
		setType(Type.POPUP);
		setAlwaysOnTop(true);
		setTitle("Tinnirello - SACAP Applicant Help Frame");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 525, 765);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblApplicantInformationTab.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblApplicantInformationTab.setBounds(10, 11, 300, 30);
		
		contentPane.add(lblApplicantInformationTab);
		separator.setBounds(10, 45, 350, 3);
		
		contentPane.add(separator);
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFirstName.setBounds(10, 60, 90, 25);
		
		contentPane.add(lblFirstName);
		lblNameInfo.setBounds(40, 85, 400, 25);
		
		contentPane.add(lblNameInfo);
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLastName.setBounds(10, 110, 90, 25);
		
		contentPane.add(lblLastName);
		lblLastInfo.setBounds(40, 135, 400, 25);
		
		contentPane.add(lblLastInfo);
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAddress.setBounds(10, 160, 90, 25);
		
		contentPane.add(lblAddress);
		lblAddressInfo.setBounds(40, 190, 400, 25);
		
		contentPane.add(lblAddressInfo);
		lblNearest.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNearest.setBounds(10, 225, 110, 25);
		
		contentPane.add(lblNearest);
		lblNearInfo.setBounds(40, 255, 400, 50);
		
		contentPane.add(lblNearInfo);
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhone.setBounds(10, 310, 90, 25);
		
		contentPane.add(lblPhone);
		lblPhoneInfo.setBounds(40, 340, 400, 30);
		
		contentPane.add(lblPhoneInfo);
		lblOfAdults.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOfAdults.setBounds(10, 445, 90, 25);
		
		contentPane.add(lblOfAdults);
		lblNumAdultsInfo.setBounds(40, 470, 400, 40);
		
		contentPane.add(lblNumAdultsInfo);
		lblOfChildren.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOfChildren.setBounds(10, 515, 110, 25);
		
		contentPane.add(lblOfChildren);
		lblNum18Info.setBounds(40, 540, 400, 40);
		
		contentPane.add(lblNum18Info);
		lblOfChildren_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOfChildren_1.setBounds(10, 585, 125, 25);
		
		contentPane.add(lblOfChildren_1);
		lblNum17Info.setBounds(40, 610, 400, 40);
		
		contentPane.add(lblNum17Info);
		lblConfirm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblConfirm.setBounds(10, 655, 90, 25);
		
		contentPane.add(lblConfirm);
		lblConfirmInfo.setBounds(40, 680, 400, 50);
		
		contentPane.add(lblConfirmInfo);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(10, 380, 90, 25);
		
		contentPane.add(lblEmail);
		lblEmailInfo.setBounds(40, 410, 400, 25);
		
		contentPane.add(lblEmailInfo);
	}
}
