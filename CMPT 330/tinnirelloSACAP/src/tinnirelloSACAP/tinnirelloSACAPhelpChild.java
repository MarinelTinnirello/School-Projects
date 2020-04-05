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

public class tinnirelloSACAPhelpChild extends JFrame {

	private JPanel contentPane;
	private final JLabel lblChildInformation = new JLabel("Child Information Tab - Help");
	private final JSeparator separator = new JSeparator();
	private final JLabel lblChildsFirstName = new JLabel("Child's First Name");
	private final JLabel lblChildInfo = new JLabel("Enter the applicant's child's first name in the textfield.");
	private final JLabel lblGender = new JLabel("Gender");
	private final JLabel lblGenderInfo = new JLabel("Select the child's gender in the drop-down list.");
	private final JLabel lblBirthday = new JLabel("Birthday");
	private final JLabel lblBirthInfo = new JLabel("Enter the child's birthday in the textfield (it will automatically format).");
	private final JLabel lblAge = new JLabel("Age");
	private final JLabel lblAgeInfo = new JLabel("Enter the child's age in the textfield (only accepts digits).");
	private final JLabel lblClothingSize = new JLabel("Clothing Size");
	private final JLabel lblClothingInfo = new JLabel("<html>\r\nSelect the child's clothing size in the drop-down list. Select \"Other\" <br>\r\nand enter the clothing in the popup, if the child's clothing size <br>\r\ndoesn't appear.\r\n</html>");
	private final JLabel lblShoeSize = new JLabel("Shoe Size");
	private final JLabel lblShoeInfo = new JLabel("Enter the child's shoe size in the textfield (only accepts digits).");
	private final JLabel lblCoatSize = new JLabel("Coat Size");
	private final JLabel lblCoatInfo = new JLabel("Enter the child's coat size in the textfield (only accepts digits).");
	private final JLabel lblGameSystemsOwned = new JLabel("Game Systems Owned");
	private final JLabel lblGamesInfo = new JLabel("<html>\r\nSelect the game systems the child owns in the list. Select \"Other\" <br>\r\nand enter the system in the popup, if the child's game system <br>\r\ndoesn't appear.\r\n</html>");
	private final JLabel lblInterests = new JLabel("Interests");
	private final JLabel lblInterestsInfo = new JLabel("<html>\r\nSelect the child's interests in the list. Select \"Other\" and enter their <br>\r\ninterests in the popup, if the child's clothing size doesn't appear.<br>\r\n</html>");
	private final JLabel lblConfirm = new JLabel("Confirm");
	private final JLabel lblConfirmInfo = new JLabel("<html>\r\nPress the button to confim the child's information before going <br>\r\nto the next tab.  Commits the information to the adjacent text area. <br>\r\nHit the button again if a change is made.\r\n</html>");

	/**
	 * Create the frame.
	 */
	public tinnirelloSACAPhelpChild() {
		setTitle("Tinnirello - SACAP Child Help Frame");
		setType(Type.POPUP);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 525, 790);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblChildInformation.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblChildInformation.setBounds(10, 11, 300, 30);
		
		contentPane.add(lblChildInformation);
		separator.setBounds(10, 45, 350, 3);
		
		contentPane.add(separator);
		lblChildsFirstName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChildsFirstName.setBounds(10, 60, 110, 25);
		
		contentPane.add(lblChildsFirstName);
		lblChildInfo.setBounds(20, 90, 400, 25);
		
		contentPane.add(lblChildInfo);
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGender.setBounds(10, 120, 90, 25);
		
		contentPane.add(lblGender);
		lblGenderInfo.setBounds(20, 150, 400, 25);
		
		contentPane.add(lblGenderInfo);
		lblBirthday.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBirthday.setBounds(10, 180, 90, 25);
		
		contentPane.add(lblBirthday);
		lblBirthInfo.setBounds(20, 210, 400, 25);
		
		contentPane.add(lblBirthInfo);
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAge.setBounds(10, 240, 90, 25);
		
		contentPane.add(lblAge);
		lblAgeInfo.setBounds(20, 270, 400, 25);
		
		contentPane.add(lblAgeInfo);
		lblClothingSize.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblClothingSize.setBounds(10, 300, 110, 25);
		
		contentPane.add(lblClothingSize);
		lblClothingInfo.setBounds(20, 330, 400, 50);
		
		contentPane.add(lblClothingInfo);
		lblShoeSize.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblShoeSize.setBounds(10, 390, 90, 25);
		
		contentPane.add(lblShoeSize);
		lblShoeInfo.setBounds(20, 420, 400, 25);
		
		contentPane.add(lblShoeInfo);
		lblCoatSize.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCoatSize.setBounds(10, 450, 90, 25);
		
		contentPane.add(lblCoatSize);
		lblCoatInfo.setBounds(20, 480, 400, 25);
		
		contentPane.add(lblCoatInfo);
		lblGameSystemsOwned.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGameSystemsOwned.setBounds(10, 510, 150, 25);
		
		contentPane.add(lblGameSystemsOwned);
		lblGamesInfo.setBounds(20, 540, 400, 50);
		
		contentPane.add(lblGamesInfo);
		lblInterests.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblInterests.setBounds(10, 600, 90, 25);
		
		contentPane.add(lblInterests);
		lblInterestsInfo.setBounds(20, 630, 400, 30);
		
		contentPane.add(lblInterestsInfo);
		lblConfirm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblConfirm.setBounds(10, 670, 90, 25);
		
		contentPane.add(lblConfirm);
		lblConfirmInfo.setBounds(20, 700, 400, 50);
		
		contentPane.add(lblConfirmInfo);
	}
}
