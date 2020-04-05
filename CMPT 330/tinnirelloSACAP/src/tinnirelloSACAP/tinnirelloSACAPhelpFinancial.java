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

public class tinnirelloSACAPhelpFinancial extends JFrame {

	private JPanel contentPane;
	private final JLabel lblFinancialInformationTab = new JLabel("Financial Information Tab - Help");
	private final JSeparator separator = new JSeparator();
	private final JLabel lblEmployment = new JLabel("Employment");
	private final JLabel lblEmploymentInfo = new JLabel("<html>\r\nEnter the applicant's total employment income, if applicable, in the <br>\r\ntextfield (only accepts digits).\r\n</html>");
	private final JLabel lblChildspousalSupport = new JLabel("Child/Spousal Support");
	private final JLabel lblChildSpousalInfo = new JLabel("<html>\r\nEnter the applicant's child or spousal support they're paying, if <br>\r\napplicable, in the textfield (only accepts digits).\r\n</html>");
	private final JLabel lblEiOrDisability = new JLabel("EI or Disability");
	private final JLabel lblOntarioWorks = new JLabel("Ontario Works");
	private final JLabel lblOntarioInfo = new JLabel("<html>\r\nEnter the applicant's Ontario Works they're receiving, if applicable, <br>\r\nin the textfield (only accepts digits).\r\n</html>");
	private final JLabel lblEiInfo = new JLabel("<html>\r\nEnter the applicant's E.I. or Disability they're receiving, if applicable, <br>\r\nin the textfield (only accepts digits).\r\n</html>");
	private final JLabel lblPensionIncome = new JLabel("Pension Income");
	private final JLabel lblPensionInfo = new JLabel("<html>\r\nEnter the applicant's pension income they're receiving, if applicable, <br>\r\nin the textfield (only accepts digits).\r\n</html>");
	private final JLabel lblChildTaxCredits = new JLabel("Child Tax Credits");
	private final JLabel lblChildTaxInfo = new JLabel("<html>\r\nEnter the applicant's Child Tax Credits they're receiving, if applicable, <br>\r\nin the textfield (only accepts digits).\r\n</html>");
	private final JLabel lblRentMortgage = new JLabel("Rent/Mortgage");
	private final JLabel lblRentInfo = new JLabel("<html>\r\nCheck if the applicant pays for a rental or leases a mortgage, if <br>\r\napplicable in the textfield (only accepts digits).\r\n</html>");
	private final JLabel lblGasHydro = new JLabel("Gas + Hydro");
	private final JLabel lblGasInfo = new JLabel("<html>\r\nCheck if the applicant pays for gas or hydro, if applicable, in the <br>\r\ntextfield (only accepts digits).\r\n</html>");
	private final JLabel lblChildCare = new JLabel("Child Care");
	private final JLabel lblChildInfo = new JLabel("<html>\r\nCheck if the applicant pays for child care, if applicable, in the textfield <br>\r\n(only accepts digits).\r\n</html>");
	private final JLabel lblTransitGas = new JLabel("Transit + Gas");
	private final JLabel lblTransitInfo = new JLabel("<html>\r\nCheck if the applicant pays for transit or gas, if applicable, in the <br>\r\ntextfield (only digits accepted).\r\n</html>");
	private final JLabel lblPhoneTv = new JLabel("Phone + TV");
	private final JLabel lblPhoneInfo = new JLabel("<html>\r\nCheck if the applicant pays for phone or TV, if applicable, in the <br>\r\ntextfield (only digits accepted).\r\n</html>");
	private final JLabel lblLoansInsurance = new JLabel("Loans + Insurance");
	private final JLabel lblLoansInfo = new JLabel("<html>\r\nCheck if the applicant pays for loans or insurance, if applicable, <br>\r\n(only accepts digits).\r\n</html>");
	private final JLabel lblConfirm = new JLabel("Confirm");
	private final JLabel lblConfirmInfo = new JLabel("<html>\r\nPress the button to confim the applicant's child's information.  Commits the <br>\r\ninformation to the adjacent text area. Hit the button again if a change is made.\r\n</html>");
	private final JLabel lblAddChild = new JLabel("Add Child");
	private final JLabel lblAddInfo = new JLabel("<html>\r\nPress the button to add another of the applicant's children.  Clears the <br>\r\ninformation in all the fields.\r\n</html>");

	/**
	 * Create the frame.
	 */
	public tinnirelloSACAPhelpFinancial() {
		setAlwaysOnTop(true);
		setType(Type.POPUP);
		setTitle("Tinnirello - SACAP Financial Help Frame");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblFinancialInformationTab.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFinancialInformationTab.setBounds(10, 11, 400, 25);
		
		contentPane.add(lblFinancialInformationTab);
		separator.setBounds(10, 45, 400, 3);
		
		contentPane.add(separator);
		lblEmployment.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmployment.setBounds(10, 60, 90, 25);
		
		contentPane.add(lblEmployment);
		lblEmploymentInfo.setBounds(40, 95, 400, 30);
		
		contentPane.add(lblEmploymentInfo);
		lblChildspousalSupport.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChildspousalSupport.setBounds(10, 135, 150, 25);
		
		contentPane.add(lblChildspousalSupport);
		lblChildSpousalInfo.setBounds(40, 170, 400, 30);
		
		contentPane.add(lblChildSpousalInfo);
		lblEiOrDisability.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEiOrDisability.setBounds(10, 275, 150, 25);
		
		contentPane.add(lblEiOrDisability);
		lblOntarioWorks.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOntarioWorks.setBounds(10, 205, 90, 25);
		
		contentPane.add(lblOntarioWorks);
		lblOntarioInfo.setBounds(40, 240, 400, 30);
		
		contentPane.add(lblOntarioInfo);
		lblEiInfo.setBounds(40, 310, 400, 30);
		
		contentPane.add(lblEiInfo);
		lblPensionIncome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPensionIncome.setBounds(10, 345, 110, 25);
		
		contentPane.add(lblPensionIncome);
		lblPensionInfo.setBounds(40, 380, 400, 30);
		
		contentPane.add(lblPensionInfo);
		lblChildTaxCredits.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChildTaxCredits.setBounds(10, 415, 125, 25);
		
		contentPane.add(lblChildTaxCredits);
		lblChildTaxInfo.setBounds(40, 450, 400, 30);
		
		contentPane.add(lblChildTaxInfo);
		lblRentMortgage.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRentMortgage.setBounds(450, 60, 125, 25);
		
		contentPane.add(lblRentMortgage);
		lblRentInfo.setBounds(480, 95, 400, 30);
		
		contentPane.add(lblRentInfo);
		lblGasHydro.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGasHydro.setBounds(450, 205, 90, 25);
		
		contentPane.add(lblGasHydro);
		lblGasInfo.setBounds(480, 235, 400, 35);
		
		contentPane.add(lblGasInfo);
		lblChildCare.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChildCare.setBounds(450, 275, 90, 25);
		
		contentPane.add(lblChildCare);
		lblChildInfo.setBounds(480, 310, 400, 30);
		
		contentPane.add(lblChildInfo);
		lblTransitGas.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTransitGas.setBounds(450, 345, 90, 25);
		
		contentPane.add(lblTransitGas);
		lblTransitInfo.setBounds(480, 375, 400, 35);
		
		contentPane.add(lblTransitInfo);
		lblPhoneTv.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhoneTv.setBounds(450, 135, 90, 25);
		
		contentPane.add(lblPhoneTv);
		lblPhoneInfo.setBounds(480, 165, 400, 35);
		
		contentPane.add(lblPhoneInfo);
		lblLoansInsurance.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLoansInsurance.setBounds(450, 415, 125, 25);
		
		contentPane.add(lblLoansInsurance);
		lblLoansInfo.setBounds(480, 450, 400, 30);
		
		contentPane.add(lblLoansInfo);
		lblConfirm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblConfirm.setBounds(10, 490, 90, 25);
		
		contentPane.add(lblConfirm);
		lblConfirmInfo.setBounds(40, 526, 400, 30);
		
		contentPane.add(lblConfirmInfo);
		lblAddChild.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAddChild.setBounds(450, 495, 90, 25);
		
		contentPane.add(lblAddChild);
		lblAddInfo.setBounds(480, 525, 400, 30);
		
		contentPane.add(lblAddInfo);
	}
}
