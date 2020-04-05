package tinnirelloSACAP;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.InternalFrameUI;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.InputEvent;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JInternalFrame;
import javax.swing.ScrollPaneConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JSpinner;

public class tinnirelloSACAPframe extends JFrame {
	/***Sets up changes in lists, if need be***/
	DefaultListModel d = new DefaultListModel();
	
	/***Sets up number format for currency***/
	private double num1 = 0;
	private double num2 = 0;
	private double num3 = 0;
	private double num4 = 0;
	private double num5 = 0;
	private double num6 = 0;
	private double sum = 0;
	private String str = "";
	
	/***Sets up the string if "Other" is selected on any of the lists***/
	private String listLoc1;
	private String listLoc2;
	private String listLoc3;
	private String listLoc4;
	
	/***Set of general variables***/
	private JPanel contentPane;
	private final JLabel lblSalvationArmyTitle = new JLabel("Salvation Army Christmas Assistance Program");
	private final JMenuBar menuBar = new JMenuBar();
	private final JMenu mnFile = new JMenu("File");
	private final JMenu mnHelp = new JMenu("Help");
	private final JMenuItem mntmApplicantInformation = new JMenuItem("Applicant Information");
	private final JMenuItem mntmChildInformation = new JMenuItem("Child Information");
	private final JMenuItem mntmFinancialInformation = new JMenuItem("Financial Information");
	private final JMenuItem mntmStartNewForm = new JMenuItem("Start new form");
	private final JMenuItem mntmExit = new JMenuItem("Exit");
	private final JSeparator separator = new JSeparator();
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private final JPanel panelApplicant = new JPanel();
	private final JPanel panelChild = new JPanel();
	private final JPanel panelFinancial = new JPanel();
	
	/***Set of variables for the 1st tab, Applicant Information***/
	private final JLabel lblFirstName = new JLabel("*First Name:");
	private final JTextField textFieldFirstName = new JTextField();
	private final JLabel lblLastName = new JLabel("*Last Name:");
	private final JTextField textFieldLastName = new JTextField();
	private final JLabel lblAddress = new JLabel("Address:");
	private final JTextField textFieldAddress = new JTextField();
	private final JFormattedTextField textFieldPostal = new JFormattedTextField();
	private final JLabel lblNearestLocation = new JLabel("<html>\r\nNearest <br>\r\nLocation*:\r\n</html>");
	private final JList listNearestLocation = new JList(d);
	private final JScrollPane scrollPane = new JScrollPane();
	private final JLabel lblPhone = new JLabel("Phone:");
	private final JFormattedTextField textFieldPhone = new JFormattedTextField();
	private final JLabel lblEmail = new JLabel("Email*:");
	private final JTextField textFieldEmail = new JTextField();
	private final JLabel lblNumOfAdults = new JLabel("# of Adults:");
	private final JLabel lblNumOfChildren18 = new JLabel("<html>\r\n# of <br>\r\nChildren 18+:\r\n</html>");
	private final JLabel lblNumOfChildren17 = new JLabel("<html>\r\n# of <br>\r\nChildren 0-17:\r\n</html>");
	private final JLabel lblPostalCode = new JLabel("Postal Code:");
	private final JSpinner spinnerAdults = new JSpinner();
	private final JSpinner spinnerChildren18 = new JSpinner();
	private final JSpinner spinnerChildren17 = new JSpinner();
	private final JTextArea textAreaApplicant = new JTextArea();
	private final JButton btnConfirmApplicant = new JButton("Confirm");
	private final JLabel lblApplicantsInformation = new JLabel("Applicant's Information");
	private final JSeparator separatorApplicant = new JSeparator();
	
	/***Set of variables for the 2nd tab, Child Information***/
	private final JInternalFrame internalFrame = new JInternalFrame() {
        @Override
        public void setUI(InternalFrameUI ui) {
            super.setUI(ui);
            BasicInternalFrameUI frameUI = (BasicInternalFrameUI) getUI();
            if (frameUI != null) frameUI.setNorthPane(null);
        }
     };
 	private final JSeparator separatorFinancial = new JSeparator();
 	private final JScrollPane scrollPaneChild = new JScrollPane();
 	private final JLabel lblChildsFirstName = new JLabel("<html>\r\n*Child's First <br>\r\nName:\r\n</html>");
 	private final JTextField textFieldChildsFirstName = new JTextField();
 	private final JLabel lblGender = new JLabel("Gender:");
 	private final JComboBox comboBoxGender = new JComboBox();
 	private final JLabel lblBirthday = new JLabel("Birthday:");
 	private final JFormattedTextField textFieldBirthday = new JFormattedTextField();
 	private final JLabel lblAge = new JLabel("Age:");
 	private final JTextField textFieldAge = new JTextField();
 	private final JLabel lblClothingSize = new JLabel("Clothing Size:");
 	private final JComboBox comboBoxClothingSize = new JComboBox();
 	private final JLabel lblShoeSize = new JLabel("Shoe Size:");
 	private final JTextField textFieldShoeSize = new JTextField();
 	private final JLabel lblCoatSize = new JLabel("Coat Size:");
 	private final JTextField textFieldCoatSize = new JTextField();
 	private final JLabel lblGameSystemsOwned = new JLabel("<html>\r\n*Game <br>\r\nSystems <br>\r\nOwned:\r\n</html>");
 	private final JList listGameSystemsOwned = new JList();
 	private final JScrollPane scrollPaneGameSystemsOwned = new JScrollPane();
 	private final JLabel lblInterests = new JLabel("*Interests:");
 	private final JList listInterests = new JList();
 	private final JScrollPane scrollPaneInterests = new JScrollPane();
	private final JLabel lblImportedName1 = new JLabel("");
	private final JButton btnAddChild = new JButton("Add child");
	private final JButton btnConfirmChild = new JButton("Confirm");
	private final JTextArea textAreaChild = new JTextArea();
	private final JScrollPane scrollPaneTextAreaChild = new JScrollPane();
	private final JLabel lblChildsInformation = new JLabel("Child's Information");
	private final JSeparator separatorChild = new JSeparator();
	
	/***Set of variables for the 3rd tab, Financial Information***/
	private final JLabel lblIncome = new JLabel("Income:");
	private final JLabel lblEmploymentTotal = new JLabel("<html>\r\nEmployment <br>\r\n(total):\r\n</html>");
	private final JFormattedTextField textFieldEmployment = new JFormattedTextField();
	private final JLabel lblChildSpousalSupport = new JLabel("<html>\r\nChild/Spousal <br>\r\nSupport:\r\n</html>");
	private final JFormattedTextField textFieldChildSpousalSupport = new JFormattedTextField();
	private final JLabel lblOntarioWorks = new JLabel("<html>\r\nOntario <br>\r\nWorks:\r\n</html>");
	private final JFormattedTextField textFieldOntarioWorks = new JFormattedTextField();
	private final JLabel lblEiOrDisability = new JLabel("<html>\r\nE.I. or <br>\r\nDisability:\r\n</html>");
	private final JFormattedTextField textFieldEiOrDisability = new JFormattedTextField();
	private final JLabel lblPensionIncome = new JLabel("<html>\r\nPension <br>\r\nIncome:\r\n</html>");
	private final JFormattedTextField textFieldPensionIncome = new JFormattedTextField();
	private final JLabel lblChildTaxCredits = new JLabel("<html>\r\nChild Tax <br>\r\nCredits:\r\n</html>");
	private final JFormattedTextField textFieldChildTaxCredits = new JFormattedTextField();
	private final JLabel lblTotalIncome = new JLabel("<html>\r\nTotal <br>\r\nIncome:\r\n</html>");
	private final JFormattedTextField textFieldTotalIncome = new JFormattedTextField();
	private final JLabel lblExpenses = new JLabel("Expenses:");
	private final JCheckBox chckbxRent = new JCheckBox("Rent");
	private final JCheckBox chckbxMortgage = new JCheckBox("Mortgage");
	private final JFormattedTextField textFieldRentMortgage = new JFormattedTextField();
	private final JLabel lblGasHydro = new JLabel("Gas + Hydro:");
	private final JFormattedTextField textFieldGasHydro = new JFormattedTextField();
	private final JLabel lblPhoneTv = new JLabel("Phone + TV:");
	private final JFormattedTextField textFieldPhoneTv = new JFormattedTextField();
	private final JLabel lblChildCare = new JLabel("Child Care:");
	private final JFormattedTextField textFieldChildCare = new JFormattedTextField();
	private final JCheckBox chckbxTransit = new JCheckBox("Transit");
	private final JCheckBox chckbxGas = new JCheckBox("Gas");
	private final JFormattedTextField textFieldTransitGas = new JFormattedTextField();
	private final JLabel lblLoansInsurance = new JLabel("<html>\r\nLoans + <br>\r\nInsurance:\r\n</html>");
	private final JFormattedTextField textFieldLoansInsurance = new JFormattedTextField();
	private final JLabel lblTotalExpenses = new JLabel("<html>\r\nTotal <br>\r\nExpenses:\r\n</html>");
	private final JFormattedTextField textFieldTotalExpenses = new JFormattedTextField();
	private final JLabel lblNetIncome = new JLabel("<html>\r\nNet <br>\r\nIncome:\r\n</html>");
	private final JTextField textFieldNetIncome = new JTextField();
	private final JLabel lblImportedName2 = new JLabel("");
	private final JLabel label$1 = new JLabel("$");
	private final JLabel label$2 = new JLabel("$");
	private final JLabel label$3 = new JLabel("$");
	private final JLabel label$4 = new JLabel("$");
	private final JLabel label$5 = new JLabel("$");
	private final JLabel label$6 = new JLabel("$");
	private final JLabel label$Total1 = new JLabel("$");
	private final JLabel label$Total2 = new JLabel("$");
	private final JLabel label$7 = new JLabel("$");
	private final JLabel label$8 = new JLabel("$");
	private final JLabel label$9 = new JLabel("$");
	private final JLabel label$10 = new JLabel("$");
	private final JLabel label$11 = new JLabel("$");
	private final JLabel label$12 = new JLabel("$");
	private final JLabel lblTotal$3 = new JLabel("$");
	
	/***Gets all components from the panels to clear them***/
	Component[] components1 = panelApplicant.getComponents();
	Component[] components2 = panelChild.getComponents();
	Component[] components3 = panelFinancial.getComponents();

	/***Sets up input mask formats***/
	MaskFormatter postalMask= createFormatter("#####");
	MaskFormatter phoneMask = createFormatter("(###) ###-####");
	MaskFormatter birthdayMask = createFormatter("##/##/####");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tinnirelloSACAPframe frame = new tinnirelloSACAPframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public MaskFormatter createFormatter(String s) {
		MaskFormatter formatter = null;
		try {
          formatter = new MaskFormatter(s);
         	} 
		catch (java.text.ParseException exc) {
	          System.err.println("formatter is bad: " + exc.getMessage());
	          System.exit(-1);
	      	}
		return formatter;
	}//createFormatter

	/**
	 * Create the frame.
	 */
	public tinnirelloSACAPframe() {
		textFieldNetIncome.setBounds(430, 375, 150, 25);
		textFieldNetIncome.setColumns(10);
		/***Set of initialized variables in the 2nd tab, Child Information***/
		textFieldCoatSize.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if (!((c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE) 
		                ||  (c== KeyEvent.VK_ENTER) || (c == KeyEvent.VK_TAB) 
		                ||  (Character.isDigit(c))))
				{
					e.consume();
				}
			}
		});
		textFieldCoatSize.setBounds(100, 305, 106, 25);
		textFieldCoatSize.setColumns(10);
		textFieldShoeSize.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if (!((c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE) 
		                ||  (c== KeyEvent.VK_ENTER) || (c == KeyEvent.VK_TAB) 
		                ||  (Character.isDigit(c))))
				{
					e.consume();
				}
			}
		});
		textFieldShoeSize.setBounds(100, 270, 106, 25);
		textFieldShoeSize.setColumns(10);
		textFieldAge.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if (!((c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE) 
		                ||  (c== KeyEvent.VK_ENTER) || (c == KeyEvent.VK_TAB) 
		                ||  (Character.isDigit(c))))
				{
					e.consume();
				}
			}
		});
		textFieldAge.setBounds(100, 200, 106, 25);
		textFieldAge.setColumns(10);
		textFieldBirthday.setBounds(100, 165, 125, 25);
		textFieldBirthday.setColumns(10);
		textFieldChildsFirstName.setBounds(100, 90, 125, 25);
		textFieldChildsFirstName.setColumns(10);
		
		/***Set of initialized variables in the 3rd tab, Financial Information***/
		textFieldTotalExpenses.setBounds(430, 300, 150, 25);
		textFieldTotalExpenses.setColumns(10);
		textFieldLoansInsurance.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if (!((c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE) 
		                ||  (c== KeyEvent.VK_ENTER) || (c == KeyEvent.VK_TAB) 
		                ||  (Character.isDigit(c))))
				{
					e.consume();
				}
			}
		});
		textFieldLoansInsurance.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_textFieldLoansInsurance_focusLost(e);
			}
		});
		textFieldLoansInsurance.setBounds(135, 555, 130, 25);
		textFieldLoansInsurance.setValue(new Double(0));
		textFieldLoansInsurance.setColumns(10);
		textFieldTransitGas.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if (!((c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE) 
		                ||  (c== KeyEvent.VK_ENTER) || (c == KeyEvent.VK_TAB) 
		                ||  (Character.isDigit(c))))
				{
					e.consume();
				}
			}
		});
		textFieldTransitGas.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_textFieldTransitGas_focusLost(e);
			}
		});
		textFieldTransitGas.setBounds(135, 520, 130, 25);
		textFieldTransitGas.setValue(new Double(0));
		textFieldTransitGas.setColumns(10);
		textFieldChildCare.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if (!((c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE) 
		                ||  (c== KeyEvent.VK_ENTER) || (c == KeyEvent.VK_TAB) 
		                ||  (Character.isDigit(c))))
				{
					e.consume();
				}
			}
		});
		textFieldChildCare.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_textFieldChildCare_focusLost(e);
			}
		});
		textFieldChildCare.setBounds(135, 480, 130, 25);
		textFieldChildCare.setValue(new Double(0));
		textFieldChildCare.setColumns(10);
		textFieldPhoneTv.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if (!((c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE) 
		                ||  (c== KeyEvent.VK_ENTER) || (c == KeyEvent.VK_TAB) 
		                ||  (Character.isDigit(c))))
				{
					e.consume();
				}
			}
		});
		textFieldPhoneTv.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_textFieldPhoneTv_focusLost(e);
			}
		});
		textFieldPhoneTv.setBounds(135, 445, 130, 25);
		textFieldPhoneTv.setValue(new Double(0));
		textFieldPhoneTv.setColumns(10);
		textFieldGasHydro.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if (!((c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE) 
		                ||  (c== KeyEvent.VK_ENTER) || (c == KeyEvent.VK_TAB) 
		                ||  (Character.isDigit(c))))
				{
					e.consume();
				}
			}
		});
		textFieldGasHydro.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_textFieldGasHydro_focusLost(e);
			}
		});
		textFieldGasHydro.setBounds(135, 410, 130, 25);
		textFieldGasHydro.setValue(new Double(0));
		textFieldGasHydro.setColumns(10);
		textFieldRentMortgage.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if (!((c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE) 
		                ||  (c== KeyEvent.VK_ENTER) || (c == KeyEvent.VK_TAB) 
		                ||  (Character.isDigit(c))))
				{
					e.consume();
				}
			}
		});
		textFieldRentMortgage.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_textFieldRentMortgage_focusLost(e);
			}
		});
		textFieldRentMortgage.setBounds(135, 375, 130, 25);
		textFieldRentMortgage.setValue(new Double(0));
		textFieldRentMortgage.setColumns(10);
		textFieldTotalIncome.setBounds(430, 225, 150, 25);
		textFieldTotalIncome.setColumns(10);
		textFieldChildTaxCredits.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if (!((c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE) 
		                ||  (c== KeyEvent.VK_ENTER) || (c == KeyEvent.VK_TAB) 
		                ||  (Character.isDigit(c))))
				{
					e.consume();
				}
			}
		});
		textFieldChildTaxCredits.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_textFieldChildTaxCredits_focusLost(e);
			}
		});
		textFieldChildTaxCredits.setBounds(135, 250, 130, 25);
		textFieldChildTaxCredits.setValue(new Double(0));
		textFieldChildTaxCredits.setColumns(10);
		textFieldPensionIncome.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if (!((c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE) 
		                ||  (c== KeyEvent.VK_ENTER) || (c == KeyEvent.VK_TAB) 
		                ||  (Character.isDigit(c))))
				{
					e.consume();
				}
			}
		});
		textFieldPensionIncome.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_textFieldPensionIncome_focusLost(e);
			}
		});
		textFieldPensionIncome.setBounds(135, 215, 130, 25);
		textFieldPensionIncome.setValue(new Double(0));
		textFieldPensionIncome.setColumns(10);
		textFieldEiOrDisability.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if (!((c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE) 
		                ||  (c== KeyEvent.VK_ENTER) || (c == KeyEvent.VK_TAB) 
		                ||  (Character.isDigit(c))))
				{
					e.consume();
				}
			}
		});
		textFieldEiOrDisability.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				do_textFieldEiOrDisability_focusGained(e);
			}
		});
		textFieldEiOrDisability.setBounds(135, 180, 130, 25);
		textFieldEiOrDisability.setValue(new Double(0));
		textFieldEiOrDisability.setColumns(10);
		textFieldOntarioWorks.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if (!((c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE) 
		                ||  (c== KeyEvent.VK_ENTER) || (c == KeyEvent.VK_TAB) 
		                ||  (Character.isDigit(c))))
				{
					e.consume();
				}
			}
		});
		textFieldOntarioWorks.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_textFieldOntarioWorks_focusLost(e);
			}
		});
		textFieldOntarioWorks.setBounds(135, 145, 130, 25);
		textFieldOntarioWorks.setValue(new Double(0));
		textFieldOntarioWorks.setColumns(10);
		textFieldChildSpousalSupport.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if (!((c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE) 
		                ||  (c== KeyEvent.VK_ENTER) || (c == KeyEvent.VK_TAB) 
		                ||  (Character.isDigit(c))))
				{
					e.consume();
				}
			}
		});
		textFieldChildSpousalSupport.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_textFieldChildSpousalSupport_focusLost(e);
			}
		});
		textFieldChildSpousalSupport.setBounds(135, 110, 130, 25);
		textFieldChildSpousalSupport.setValue(new Double(0));
		textFieldChildSpousalSupport.setColumns(10);
		textFieldEmployment.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldEmployment.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if (!((c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE) 
		                ||  (c== KeyEvent.VK_ENTER) || (c == KeyEvent.VK_TAB) 
		                ||  (Character.isDigit(c))))
				{
					e.consume();
				}
			}
		});
		textFieldEmployment.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_textFieldEmployment_focusLost(e);
			}
		});
		textFieldEmployment.setBounds(135, 75, 130, 25);
		textFieldEmployment.setValue(new Double(0));
		textFieldEmployment.setColumns(10);
		
		/***Set of initialized variables for the 1st tab, Applicant Information***/
		textFieldEmail.setText("");
		textFieldEmail.setBounds(90, 335, 170, 25);
		textFieldEmail.setColumns(10);
		textFieldPhone.setBounds(90, 300, 106, 25);
		textFieldPhone.setColumns(10);
		textFieldPostal.setToolTipText("<html>\r\nEnter the applicant's 5 <br>\r\ndigit zip code here.\r\n</html>");
		textFieldPostal.setBounds(90, 130, 106, 25);
		textFieldPostal.setColumns(10);
		textFieldAddress.setToolTipText("<html>\r\nEnter the applicant's <br>\r\nstreet address here.\r\n</html>");
		textFieldAddress.setBounds(90, 95, 170, 25);
		textFieldAddress.setColumns(10);
		textFieldLastName.setBounds(90, 51, 125, 25);
		textFieldLastName.setColumns(10);
		textFieldFirstName.setBounds(90, 11, 125, 25);
		textFieldFirstName.setColumns(10);
		
		/***Beginning of the 
		 * menus & titles***/
		setTitle("Tinnirello - Salvation Army Christmas Assistance Program");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 800);
		
		setJMenuBar(menuBar);
		
		menuBar.add(mnFile);
		mntmStartNewForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmStartNewForm_actionPerformed(e);
			}
		});
		mntmStartNewForm.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		
		mnFile.add(mntmStartNewForm);
		
		mnFile.add(separator);
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmExit_actionPerformed(e);
			}
		});
		mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		
		mnFile.add(mntmExit);
		
		menuBar.add(mnHelp);
		mntmApplicantInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmApplicantInformation_actionPerformed(e);
			}
		});
		
		mnHelp.add(mntmApplicantInformation);
		mntmChildInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmChildInformation_actionPerformed(e);
			}
		});
		
		mnHelp.add(mntmChildInformation);
		mntmFinancialInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmFinancialInformation_actionPerformed(e);
			}
		});
		
		mnHelp.add(mntmFinancialInformation);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblSalvationArmyTitle.setBounds(10, 11, 340, 30);
		lblSalvationArmyTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		contentPane.add(lblSalvationArmyTitle);
		tabbedPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_tabbedPane_stateChanged(e);
			}
		});
		tabbedPane.setBounds(20, 50, 610, 680);
		
		/***Beginning of the 1st tab, 
		 * Applicant Information***/
		contentPane.add(tabbedPane);
		panelApplicant.setToolTipText("<html>\r\nEnter the applicant's <br>\r\ninformation here.\r\n</html>");
		
		tabbedPane.addTab("Applicant Information", null, panelApplicant, null);
		panelApplicant.setLayout(null);
		lblFirstName.setToolTipText("<html>\r\nEnter the applicant's <br>\r\nfirst name here.\r\n</html>");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFirstName.setBounds(10, 11, 90, 25);
		
		panelApplicant.add(lblFirstName);
		
		panelApplicant.add(textFieldFirstName);
		lblLastName.setToolTipText("<html>\r\nEnter the applicant's <br>\r\nlast name here.\r\n</html>");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLastName.setBounds(10, 50, 90, 25);
		
		panelApplicant.add(lblLastName);
		
		panelApplicant.add(textFieldLastName);
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAddress.setBounds(10, 95, 90, 25);
		
		panelApplicant.add(lblAddress);
		
		panelApplicant.add(textFieldAddress);
		
		panelApplicant.add(textFieldPostal);
		lblNearestLocation.setToolTipText("<html>\r\nSelect the Salvation<br>\r\nArmy dropoff <br>\r\nnearest to the applicant.\r\n</html>");
		lblNearestLocation.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNearestLocation.setBounds(10, 170, 90, 25);
		
		panelApplicant.add(lblNearestLocation);
		scrollPane.setBounds(90, 170, 170, 110);
		
		panelApplicant.add(scrollPane);
		listNearestLocation.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (listNearestLocation.getSelectedValue() == "Other")
				{
					int i = listNearestLocation.locationToIndex(e.getPoint());
					listLoc1 = JOptionPane.showInputDialog(null, "Nearest Location:");
				}
			}
		});
		listNearestLocation.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listNearestLocation.setModel(new AbstractListModel() {
			String[] values = new String[] {"Newmarket", "Aurora", "Markham", "Queensville", "Sharon", "Stouffville", "Mount Albert", "Schomberg", "Richmond Hill", "Holland Landing", "Bradford", "Vaughan", "East Gwillimbury", "Georgina/Keswick", "Other"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(listNearestLocation);
		lblPhone.setToolTipText("<html>\r\nEnter the applicant's <br>\r\ntelephone or cell number.\r\n</html>");
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhone.setBounds(10, 300, 90, 25);
		
		panelApplicant.add(lblPhone);
		
		panelApplicant.add(textFieldPhone);
		lblEmail.setToolTipText("<html>\r\nEnter the applicant's <br>\r\nvalid email address here.\r\n</html>");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(10, 335, 90, 25);
		
		panelApplicant.add(lblEmail);
		
		panelApplicant.add(textFieldEmail);
		lblNumOfAdults.setToolTipText("<html>\r\nEnter the amount of <br>\r\nadults residing in the <br>\r\nhousehold currently.\r\n</html>");
		lblNumOfAdults.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNumOfAdults.setBounds(10, 370, 90, 30);
		
		panelApplicant.add(lblNumOfAdults);
		
		lblNumOfChildren18.setToolTipText("<html>\r\nEnter the amount of children <br>\r\nthe applicant has that are over 18.<br>\r\n</html>");
		lblNumOfChildren18.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNumOfChildren18.setBounds(10, 445, 90, 30);
		
		panelApplicant.add(lblNumOfChildren18);
		
		lblNumOfChildren17.setToolTipText("<html>\r\nEnter the amount of children <br>\r\nthe applicant has that are under 17.<br>\r\n</html>");
		lblNumOfChildren17.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNumOfChildren17.setBounds(10, 520, 90, 30);
		
		panelApplicant.add(lblNumOfChildren17);
		
		panelChild.setToolTipText("<html>\r\nEnter the applicant's <br>\r\nchild(ren)'s information.\r\n</html>");
		
		/***Sets up the input masks on panelApplicant***/
		phoneMask.setPlaceholderCharacter('_');
		phoneMask.install(textFieldPhone);
		
		postalMask.setPlaceholderCharacter('_');
		postalMask.install(textFieldPostal);
		textAreaApplicant.setEditable(false);
		textAreaApplicant.setBounds(380, 50, 175, 590);
		
		panelApplicant.add(textAreaApplicant);
		btnConfirmApplicant.setToolTipText("<html>\r\nConfim the applicant's information <br>\r\nbefore going to the next tab.  Commits <br>\r\nthe information to the adjacent text area.  \r\n</html>");
		btnConfirmApplicant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnConfirmApplicant_actionPerformed(e);
			}
		});
		btnConfirmApplicant.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConfirmApplicant.setBounds(10, 610, 100, 25);
		
		panelApplicant.add(btnConfirmApplicant);
		lblApplicantsInformation.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblApplicantsInformation.setBounds(380, 15, 175, 25);
		
		panelApplicant.add(lblApplicantsInformation);
		separatorApplicant.setForeground(Color.LIGHT_GRAY);
		separatorApplicant.setOrientation(SwingConstants.VERTICAL);
		separatorApplicant.setBounds(340, 15, 5, 625);
		
		panelApplicant.add(separatorApplicant);
		lblPostalCode.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPostalCode.setBounds(10, 130, 90, 25);
		
		panelApplicant.add(lblPostalCode);
		spinnerAdults.setBounds(10, 400, 65, 25);
		
		panelApplicant.add(spinnerAdults);
		spinnerChildren18.setBounds(10, 485, 65, 25);
		
		panelApplicant.add(spinnerChildren18);
		spinnerChildren17.setBounds(10, 560, 65, 25);
		
		panelApplicant.add(spinnerChildren17);
		
		/***Beginning of the 2nd tab, 
		 * Child Information***/
		tabbedPane.addTab("Child Information", null, panelChild, null);
		panelChild.setLayout(null);
		scrollPaneChild.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPaneChild.setBounds(0, 0, 605, 652);
		
		panelChild.add(scrollPaneChild);
		scrollPaneChild.setViewportView(internalFrame);
		internalFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		internalFrame.setBorder(null);
		internalFrame.setVisible(true);
		internalFrame.getContentPane().setLayout(null);
		lblChildsFirstName.setToolTipText("<html>\r\nEnter the applicant's <br>\r\nchild's first name here.\r\n</html>");
		lblChildsFirstName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChildsFirstName.setBounds(10, 90, 90, 25);
		
		internalFrame.getContentPane().add(lblChildsFirstName);
		
		internalFrame.getContentPane().add(textFieldChildsFirstName);
		lblGender.setToolTipText("<html>\r\nEnter the child's <br>\r\ngender here.\r\n</html>");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGender.setBounds(10, 130, 90, 25);
		
		internalFrame.getContentPane().add(lblGender);
		comboBoxGender.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Do not wish to disclose"}));
		comboBoxGender.setBounds(100, 130, 125, 25);
		
		internalFrame.getContentPane().add(comboBoxGender);
		lblBirthday.setToolTipText("<html>\r\nEnter the child's <br>\r\nbirthday here.\r\n</html>");
		lblBirthday.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBirthday.setBounds(10, 165, 90, 25);
		
		internalFrame.getContentPane().add(lblBirthday);
		
		internalFrame.getContentPane().add(textFieldBirthday);
		lblAge.setToolTipText("<html>\r\nEnter the child's <br>\r\nage here.\r\n</html>");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAge.setBounds(10, 200, 90, 25);
		
		internalFrame.getContentPane().add(lblAge);
		
		internalFrame.getContentPane().add(textFieldAge);
		lblClothingSize.setToolTipText("<html>\r\nEnter the child's <br>\r\nclothing size here.\r\n</html>");
		lblClothingSize.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblClothingSize.setBounds(10, 235, 90, 25);
		
		internalFrame.getContentPane().add(lblClothingSize);
		comboBoxClothingSize.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (comboBoxClothingSize.getSelectedItem() == "Other")
				{
					listLoc2 = JOptionPane.showInputDialog(null, "Clothing size:");
				}
			}
		});
		comboBoxClothingSize.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL", "2XL", "Other"}));
		comboBoxClothingSize.setBounds(100, 235, 125, 25);
		
		internalFrame.getContentPane().add(comboBoxClothingSize);
		lblShoeSize.setToolTipText("<html>\r\nEnter the child's <br>\r\nshoe size here.\r\n</html>");
		lblShoeSize.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblShoeSize.setBounds(10, 270, 90, 25);
		
		internalFrame.getContentPane().add(lblShoeSize);
		
		internalFrame.getContentPane().add(textFieldShoeSize);
		lblCoatSize.setToolTipText("<html>\r\nEnter the child's <br>\r\ncoat size here.\r\n</html>");
		lblCoatSize.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCoatSize.setBounds(10, 305, 90, 25);
		
		internalFrame.getContentPane().add(lblCoatSize);
		
		internalFrame.getContentPane().add(textFieldCoatSize);
		lblGameSystemsOwned.setToolTipText("<html>\r\nEnter how many game <br>\r\nsystems the child has here.\r\n</html>");
		lblGameSystemsOwned.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGameSystemsOwned.setBounds(10, 345, 90, 45);
		
		internalFrame.getContentPane().add(lblGameSystemsOwned);
		scrollPaneGameSystemsOwned.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPaneGameSystemsOwned.setBounds(100, 340, 130, 100);
		
		internalFrame.getContentPane().add(scrollPaneGameSystemsOwned);
		listGameSystemsOwned.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//do_listNearestLocation_mouseClicked(e);
				if (listGameSystemsOwned.getSelectedValue() == "Other")
				{
					int i = listGameSystemsOwned.locationToIndex(e.getPoint());
					listLoc3 = JOptionPane.showInputDialog(null, "Game Systems owned:");
				}
			}
		});
		listGameSystemsOwned.setModel(new AbstractListModel() {
			String[] values = new String[] {"Xbox 360", "Xbox One", "Computer", "PS3", "PS4", "PSP", "PS Vita", "Wii", "Wii U", "Nintendo DS", "Nintendo 3DS", "Other"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPaneGameSystemsOwned.setViewportView(listGameSystemsOwned);
		lblInterests.setToolTipText("<html>\r\nEnter the child's <br>\r\ninterests here.\r\n</html>");
		lblInterests.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblInterests.setBounds(10, 450, 90, 25);
		
		internalFrame.getContentPane().add(lblInterests);
		scrollPaneInterests.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPaneInterests.setBounds(100, 450, 130, 100);
		
		internalFrame.getContentPane().add(scrollPaneInterests);
		listInterests.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//do_listNearestLocation_mouseClicked(e);
				if (listInterests.getSelectedValue() == "Other")
				{
					int i = listInterests.locationToIndex(e.getPoint());
					listLoc4 = JOptionPane.showInputDialog(null, "Interests:");
				}
			}
		});
		listInterests.setModel(new AbstractListModel() {
			String[] values = new String[] {"Arts/Crafts", "Drawing", "Action", "Heroes", "Cars/Trucks", "Planes/Trains", "Music", "Construction", "Lego/Duplo", "Outdoors", "Dolls", "Sports", "Other"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPaneInterests.setViewportView(listInterests);
		panelFinancial.setToolTipText("<html>\r\nEnter the applicant's <br>\r\nfinancial information.\r\n</html>");
		
		/***Sets up the input masks on panelChild***/
		birthdayMask.setPlaceholderCharacter('_');
		birthdayMask.install(textFieldBirthday);
		lblImportedName1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblImportedName1.setBounds(10, 25, 300, 30);
		
		internalFrame.getContentPane().add(lblImportedName1);
		btnAddChild.setToolTipText("<html>\r\nAdds another one of the applicant's <br>\r\nchildren to the adjacent text area.\r\n</html");
		btnAddChild.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnAddChild_actionPerformed(e);
			}
		});
		btnAddChild.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAddChild.setBounds(0, 590, 150, 30);
		
		internalFrame.getContentPane().add(btnAddChild);
		btnConfirmChild.setToolTipText("<html>\r\nConfim the applicant's child's information <br>\r\nbefore going to the next tab.  Commits <br>\r\nthe information to the adjacent text area. <br>\r\n(Hit before you add another child)  \r\n</html>");
		btnConfirmChild.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnConfirmChild_actionPerformed(e);
			}
		});
		btnConfirmChild.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConfirmChild.setBounds(150, 590, 150, 30);
		
		internalFrame.getContentPane().add(btnConfirmChild);
		scrollPaneTextAreaChild.setBounds(380, 120, 205, 430);
		
		internalFrame.getContentPane().add(scrollPaneTextAreaChild);
		textAreaChild.setEditable(false);
		scrollPaneTextAreaChild.setViewportView(textAreaChild);
		lblChildsInformation.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblChildsInformation.setBounds(380, 90, 205, 30);
		
		internalFrame.getContentPane().add(lblChildsInformation);
		separatorChild.setForeground(Color.LIGHT_GRAY);
		separatorChild.setOrientation(SwingConstants.VERTICAL);
		separatorChild.setBounds(310, 90, 5, 500);
		
		internalFrame.getContentPane().add(separatorChild);
		
		/***Beginning of the 3rd tab, 
		 * Financial Information***/
		tabbedPane.addTab("Financial Information", null, panelFinancial, null);
		panelFinancial.setLayout(null);
		lblIncome.setToolTipText("<html>\r\nEnter the applicant's <br>\r\nincome data.\r\n</html>");
		lblIncome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIncome.setBounds(10, 40, 90, 25);
		
		panelFinancial.add(lblIncome);
		lblEmploymentTotal.setToolTipText("<html>\r\nEnter the applicant's <br>\r\ntotal employment income, <br>\r\nif applicable.\r\n</html>");
		lblEmploymentTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmploymentTotal.setBounds(10, 75, 90, 25);
		
		panelFinancial.add(lblEmploymentTotal);
		
		panelFinancial.add(textFieldEmployment);
		lblChildSpousalSupport.setToolTipText("<html>\r\nEnter the applicant's <br>\r\nchild or spousal support <br>\r\nthey're paying, if applicable.\r\n</html>");
		lblChildSpousalSupport.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChildSpousalSupport.setBounds(10, 110, 90, 25);
		
		panelFinancial.add(lblChildSpousalSupport);
		
		panelFinancial.add(textFieldChildSpousalSupport);
		lblOntarioWorks.setToolTipText("<html>\r\nEnter the applicant's <br>\r\nOntario Works they're <br>\r\nreceiving, if applicable.\r\n</html>");
		lblOntarioWorks.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOntarioWorks.setBounds(10, 145, 90, 25);
		
		panelFinancial.add(lblOntarioWorks);
		
		panelFinancial.add(textFieldOntarioWorks);
		lblEiOrDisability.setToolTipText("<html>\r\nEnter the applicant's <br>\r\nE.I or Disability support <br>\r\nthey're receiving, if applicable.\r\n</html>");
		lblEiOrDisability.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEiOrDisability.setBounds(10, 180, 90, 25);
		
		panelFinancial.add(lblEiOrDisability);
		
		panelFinancial.add(textFieldEiOrDisability);
		lblPensionIncome.setToolTipText("<html>\r\nEnter the applicant's <br>\r\npension income they're<br>\r\nreceiving, if applicable.\r\n</html>");
		lblPensionIncome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPensionIncome.setBounds(10, 215, 90, 25);
		
		panelFinancial.add(lblPensionIncome);
		
		panelFinancial.add(textFieldPensionIncome);
		lblChildTaxCredits.setToolTipText("<html>\r\nEnter the applicant's <br>\r\nchild tax credits they're <br>\r\nreceiving, if applicable.\r\n</html>");
		lblChildTaxCredits.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChildTaxCredits.setBounds(10, 250, 90, 25);
		
		panelFinancial.add(lblChildTaxCredits);
		
		panelFinancial.add(textFieldChildTaxCredits);
		lblTotalIncome.setToolTipText("<html>\r\nThe applicant's total <br>\r\ncalculated income.\r\n</html>");
		lblTotalIncome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTotalIncome.setBounds(330, 225, 90, 30);
		
		panelFinancial.add(lblTotalIncome);
		
		panelFinancial.add(textFieldTotalIncome);
		lblExpenses.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblExpenses.setBounds(10, 345, 90, 25);
		
		panelFinancial.add(lblExpenses);
		chckbxRent.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxRent.setToolTipText("<html>\r\nCheck if the applicant <br>\r\npays for a rental.\r\n</html>");
		chckbxRent.setBounds(10, 365, 85, 20);
		
		panelFinancial.add(chckbxRent);
		chckbxMortgage.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxMortgage.setToolTipText("<html>\r\nCheck if the applicant <br>\r\nleased for a mortgage.\r\n</html>");
		chckbxMortgage.setBounds(10, 385, 85, 20);
		
		panelFinancial.add(chckbxMortgage);
		
		panelFinancial.add(textFieldRentMortgage);
		lblGasHydro.setToolTipText("<html>\r\nEnter if the applicant <br>\r\npays for gas and/or water.\r\n</html>");
		lblGasHydro.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGasHydro.setBounds(10, 410, 90, 25);
		
		panelFinancial.add(lblGasHydro);
		
		panelFinancial.add(textFieldGasHydro);
		lblPhoneTv.setToolTipText("<html>\r\nEnter if the applicant <br>\r\npays for phone and/or TV.\r\n</html>");
		lblPhoneTv.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhoneTv.setBounds(10, 445, 90, 25);
		
		panelFinancial.add(lblPhoneTv);
		
		panelFinancial.add(textFieldPhoneTv);
		lblChildCare.setToolTipText("<html>\r\nEnter if the applicant <br>\r\npays for child care.\r\n</html>");
		lblChildCare.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChildCare.setBounds(10, 480, 90, 25);
		
		panelFinancial.add(lblChildCare);
		
		panelFinancial.add(textFieldChildCare);
		chckbxTransit.setToolTipText("<html>\r\nCheck if the applicant <br>\r\npays for transit.\r\n</html>");
		chckbxTransit.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxTransit.setBounds(10, 510, 85, 20);
		
		panelFinancial.add(chckbxTransit);
		chckbxGas.setToolTipText("<html>\r\nCheck if the applicant <br>\r\npays for gas.\r\n</html>");
		chckbxGas.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxGas.setBounds(10, 530, 85, 20);
		
		panelFinancial.add(chckbxGas);
		
		panelFinancial.add(textFieldTransitGas);
		lblLoansInsurance.setToolTipText("<html>\r\nEnter if the applicant <br>\r\npays for loans and/or insurance.\r\n</html>");
		lblLoansInsurance.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLoansInsurance.setBounds(10, 555, 90, 25);
		
		panelFinancial.add(lblLoansInsurance);
		
		panelFinancial.add(textFieldLoansInsurance);
		lblTotalExpenses.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTotalExpenses.setBounds(330, 300, 90, 30);
		
		panelFinancial.add(lblTotalExpenses);
		
		panelFinancial.add(textFieldTotalExpenses);
		separatorFinancial.setBounds(10, 310, 270, 3);
		
		panelFinancial.add(separatorFinancial);
		lblImportedName2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblImportedName2.setBounds(10, 11, 300, 30);
		
		panelFinancial.add(lblImportedName2);
		label$1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label$1.setBounds(120, 80, 48, 14);
		
		panelFinancial.add(label$1);
		label$2.setFont(new Font("Tahoma", Font.BOLD, 18));
		label$2.setBounds(120, 115, 48, 14);
		
		panelFinancial.add(label$2);
		label$3.setFont(new Font("Tahoma", Font.BOLD, 18));
		label$3.setBounds(120, 150, 48, 14);
		
		panelFinancial.add(label$3);
		label$4.setFont(new Font("Tahoma", Font.BOLD, 18));
		label$4.setBounds(120, 185, 48, 14);
		
		panelFinancial.add(label$4);
		label$5.setFont(new Font("Tahoma", Font.BOLD, 18));
		label$5.setBounds(120, 220, 48, 14);
		
		panelFinancial.add(label$5);
		label$6.setFont(new Font("Tahoma", Font.BOLD, 18));
		label$6.setBounds(120, 255, 48, 14);
		
		panelFinancial.add(label$6);
		label$Total1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label$Total1.setBounds(410, 225, 48, 25);
		
		panelFinancial.add(label$Total1);
		label$Total2.setFont(new Font("Tahoma", Font.BOLD, 18));
		label$Total2.setBounds(410, 300, 48, 25);
		
		panelFinancial.add(label$Total2);
		label$7.setFont(new Font("Tahoma", Font.BOLD, 18));
		label$7.setBounds(120, 380, 48, 14);
		
		panelFinancial.add(label$7);
		label$8.setFont(new Font("Tahoma", Font.BOLD, 18));
		label$8.setBounds(120, 415, 48, 14);
		
		panelFinancial.add(label$8);
		label$9.setFont(new Font("Tahoma", Font.BOLD, 18));
		label$9.setBounds(120, 450, 48, 14);
		
		panelFinancial.add(label$9);
		label$10.setFont(new Font("Tahoma", Font.BOLD, 18));
		label$10.setBounds(120, 485, 48, 14);
		
		panelFinancial.add(label$10);
		label$11.setFont(new Font("Tahoma", Font.BOLD, 18));
		label$11.setBounds(120, 525, 48, 14);
		
		panelFinancial.add(label$11);
		label$12.setFont(new Font("Tahoma", Font.BOLD, 18));
		label$12.setBounds(120, 560, 48, 14);
		
		panelFinancial.add(label$12);
		lblNetIncome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNetIncome.setBounds(330, 375, 90, 30);
		
		panelFinancial.add(lblNetIncome);
		lblTotal$3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTotal$3.setBounds(410, 375, 48, 25);
		
		panelFinancial.add(lblTotal$3);
		
		panelFinancial.add(textFieldNetIncome);
	}
	
	/***Functions for the program***/
	
	/***General functions***/
	/***Clears the pages so there can be a new form altogether***/
	protected void do_mntmStartNewForm_actionPerformed(ActionEvent e) {
		for (Component c : panelApplicant.getComponents()) {
		    if (c instanceof JTextField) { 
		       ((JTextField)c).setText("");
		    }
		    if (c instanceof JTextArea) { 
			   ((JTextArea)c).setText("");
			}
		    if (c instanceof JList) { 
		    	((JList)c).clearSelection();
			}
		}
		for (Component c : panelChild.getComponents()) {
		    /*if (c instanceof JTextField) { 
		       ((JTextField)c).setText("");
		    }
		    if (c instanceof JTextArea) { 
			   ((JTextArea)c).setText("");
			}
		    if (c instanceof JComboBox)
		    {
		    	((JComboBox)c).setSelectedIndex(0);
		    }
			if (c instanceof JList)
			{
				((JList)c).clearSelection();
			}*/
			
			// It wouldn't let me clear it the nice way :(
			// Only reason I could think of why is cause it's in an Internal Frame, but that doesn't make sense
			textFieldChildsFirstName.setText("");
			comboBoxGender.setSelectedIndex(0);
			textFieldBirthday.setText("");
			textFieldAge.setText("");
			comboBoxClothingSize.setSelectedIndex(0);
			textFieldShoeSize.setText("");
			textFieldCoatSize.setText("");
			listGameSystemsOwned.clearSelection();
			listInterests.clearSelection();
			textAreaChild.setText("");
		}
		for (Component c : panelFinancial.getComponents()) {
		    if (c instanceof JTextField) { 
		       ((JTextField)c).setText("0");
		    }
		}
	}
	/***Exits the program***/
	protected void do_mntmExit_actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	/***Opens Applicant Help Frame***/
	protected void do_mntmApplicantInformation_actionPerformed(ActionEvent e) {
		tinnirelloSACAPhelpApplicant frame = new tinnirelloSACAPhelpApplicant();
		frame.setLocation(this.getX() + 20, this.getY() + 20);
		frame.setVisible(true);
	}
	/***Opens Child Help Frame***/
	protected void do_mntmChildInformation_actionPerformed(ActionEvent e) {
		tinnirelloSACAPhelpChild frame = new tinnirelloSACAPhelpChild();
		frame.setLocation(this.getX() + 20, this.getY() + 20);
		frame.setVisible(true);
	}
	/***Opens Financial Help Frame***/
	protected void do_mntmFinancialInformation_actionPerformed(ActionEvent e) {
		tinnirelloSACAPhelpFinancial frame = new tinnirelloSACAPhelpFinancial();
		frame.setLocation(this.getX() + 20, this.getY() + 20);
		frame.setVisible(true);
	}
	/***Puts the applicant's name each tab***/
	protected void do_tabbedPane_stateChanged(ChangeEvent e) {
		lblImportedName1.setText(textFieldFirstName.getText() + " " + textFieldLastName.getText() + " Child's Information");
		lblImportedName2.setText(textFieldFirstName.getText() + " " + textFieldLastName.getText() + " Financial's Information");
	}
	
	/***1st tab functions***/
	/***Checks if the email is valid***/
	/***Confirms the applicant's information by displaying their information in the text area***/
	protected void do_btnConfirmApplicant_actionPerformed(ActionEvent e) {
		if (textFieldFirstName.getText().isEmpty() && textFieldLastName.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(this, "First and Last names are missing", "ERROR - FIRST and LAST NAMES missing", JOptionPane.ERROR_MESSAGE);
			lblFirstName.setForeground(Color.RED);
			textFieldFirstName.grabFocus();
			lblLastName.setForeground(Color.RED);
			textFieldLastName.grabFocus();
		} else if (textFieldFirstName.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(this, "First name is missing", "ERROR - FIRST NAME missing", JOptionPane.ERROR_MESSAGE);
			lblFirstName.setForeground(Color.RED);
			textFieldFirstName.grabFocus();
			lblLastName.setForeground(Color.BLACK);
		} else if (textFieldLastName.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(this, "Last name is missing", "ERROR - LAST NAME missing", JOptionPane.ERROR_MESSAGE);
			lblLastName.setForeground(Color.RED);
			textFieldLastName.grabFocus();
			lblFirstName.setForeground(Color.BLACK);
		} else if (!textFieldEmail.getText().contains("@") && !textFieldEmail.getText().contains("."))
		{
			JOptionPane.showMessageDialog(this, "Missing the '@' and '.' that would make this a valid email", "ERROR - NOT A VALID EMAIL", JOptionPane.ERROR_MESSAGE);
			lblEmail.setForeground(Color.RED);
			textFieldEmail.grabFocus();
		} else if (listNearestLocation.isSelectionEmpty())
		{
			JOptionPane.showMessageDialog(this, "Nearest location is missing", "ERROR - NEAREST LOCATION MISSING", JOptionPane.ERROR_MESSAGE);
			lblNearestLocation.setForeground(Color.RED);
			listNearestLocation.grabFocus();
		}
		else
		{
			lblFirstName.setForeground(Color.BLACK);
			lblLastName.setForeground(Color.BLACK);
			lblEmail.setForeground(Color.BLACK);
			lblNearestLocation.setForeground(Color.BLACK);
			
			textAreaApplicant.setText("");
			textAreaApplicant.append("Name: \n" + textFieldFirstName.getText() + " " + textFieldLastName.getText() + "\n");
			textAreaApplicant.append("Address: \n" + textFieldAddress.getText() + "\n" + textFieldPostal.getText() + "\n");
			textAreaApplicant.append("Nearest Location: \n");
			
			if (listNearestLocation.getSelectedValue() != "Other")
			{
				textAreaApplicant.append(listNearestLocation.getSelectedValue().toString() + "\n");
			} else if (listNearestLocation.getSelectedValue() == "Other")
			{
				textAreaApplicant.append(listLoc1 + "\n");
			}
			
			textAreaApplicant.append("Phone: \n" + textFieldPhone.getText() + "\n");
			textAreaApplicant.append("Email: \n" + textFieldEmail.getText() + "\n");
			textAreaApplicant.append("# of Adults: \n" + spinnerAdults.getValue() + "\n");
			textAreaApplicant.append("# of Children 18+: \n" + spinnerChildren18.getValue() + "\n");
			textAreaApplicant.append("# of Children 0 - 17: \n" + spinnerChildren17.getValue() + "\n");
		}
	}
	
	/***2nd tab functions***/
	/***Confirms the applicant's child's information by displaying their information in the text area***/
	protected void do_btnConfirmChild_actionPerformed(ActionEvent e) {
		if (textFieldChildsFirstName.getText().isEmpty()) 
		{
			JOptionPane.showMessageDialog(this, "First name is missing", "ERROR - FIRST NAME missing", JOptionPane.ERROR_MESSAGE);
			lblChildsFirstName.setForeground(Color.RED);
			textFieldChildsFirstName.grabFocus();
		} else if (listGameSystemsOwned.getSelectedValue() == null)
		{
			JOptionPane.showMessageDialog(this, "Game System(s) are missing", "ERROR - GAME SYSTEM(s) missing", JOptionPane.ERROR_MESSAGE);
			lblGameSystemsOwned.setForeground(Color.RED);
			listGameSystemsOwned.grabFocus();
		}
		else if (listInterests.getSelectedValue() == null)
		{
			JOptionPane.showMessageDialog(this, "Interest(s) are missing", "ERROR - INTEREST(s) missing", JOptionPane.ERROR_MESSAGE);
			lblInterests.setForeground(Color.RED);
			listInterests.grabFocus();
		} else
		{
			lblChildsFirstName.setForeground(Color.BLACK);
			lblGameSystemsOwned.setForeground(Color.BLACK);
			lblInterests.setForeground(Color.BLACK);
		
			textAreaChild.append("Name: \n" + textFieldChildsFirstName.getText() + "\n");
			textAreaChild.append("Gender: \n" + comboBoxGender.getSelectedItem() + "\n");
			textAreaChild.append("Birthday: \n" + textFieldBirthday.getText() + "\n");
			textAreaChild.append("Age: \n" + textFieldAge.getText() + "\n");
			textAreaChild.append("Clothing Size: \n");
			
			if (comboBoxClothingSize.getSelectedItem() != "Other")
			{
				textAreaChild.append(comboBoxClothingSize.getSelectedItem().toString() + "\n");
			} else if (comboBoxClothingSize.getSelectedItem() == "Other")
			{
				textAreaChild.append(listLoc2 + "\n");
			}
			
			textAreaChild.append("Shoe Size: \n" + textFieldShoeSize.getText() + "\n");
			textAreaChild.append("Coat Size: \n" + textFieldCoatSize.getText() + "\n");
			textAreaChild.append("Game Systems Owned: \n");
			
			Object[] gameSystemsOwned = listGameSystemsOwned.getSelectedValues();
			for (int i = 0; i < gameSystemsOwned.length; i++)
			{				
				if (gameSystemsOwned[i].toString() != "Other")
				{
					textAreaChild.append(gameSystemsOwned[i].toString() + "\n");
				} else if (gameSystemsOwned[i].toString() == "Other")
				{
					textAreaChild.append(listLoc3 + "\n");
				}
			}
			
			textAreaChild.append("Interests: \n");
			
			Object[] interests = listInterests.getSelectedValues();
			for (int i = 0; i < interests.length; i++)
			{				
				if (interests[i].toString() != "Other")
				{
					textAreaChild.append(interests[i].toString() + "\n");
				} else if (interests[i].toString() == "Other")
				{
					textAreaChild.append(listLoc4 + "\n");
				}
			}
		}
	}
	/***Adds a new child by clearing the fields***/
	protected void do_btnAddChild_actionPerformed(ActionEvent e) {
		/*for (Component c : panelChild.getComponents()) {
		    if (c instanceof JTextField) { 
		       ((JTextField)c).setText("");
		       
		       System.out.println("It works");
		    }
		}*/
		
		// have the same problem here
		textFieldChildsFirstName.setText("");
		textFieldBirthday.setText("");
		textFieldAge.setText("");
		textFieldShoeSize.setText("");
		textFieldCoatSize.setText("");
		
		textAreaChild.append("\n ------------------------------------- \n\n");
	}
	
	/***3rd tab functions***/
	/***Sums the Total Income***/
	private void totalIncomeValueSet()
	{
		// getting an error when no values are initially set up before adding to the Net Income, but it does seem to work
		num1 = Double.parseDouble(textFieldEmployment.getText().replaceAll(",", "").trim());
		num2 = Double.parseDouble(textFieldChildSpousalSupport.getText().replaceAll(",", "").trim());
		num3 = Double.parseDouble(textFieldOntarioWorks.getText().replaceAll(",", "").trim());
		num4 = Double.parseDouble(textFieldEiOrDisability.getText().replaceAll(",", "").trim());
		num5 = Double.parseDouble(textFieldPensionIncome.getText().replaceAll(",", "").trim());
		num6 = Double.parseDouble(textFieldChildTaxCredits.getText().replaceAll(",", "").trim());
		sum = 0;
		str = "";
		
		sum = num1 + num2 + num3 + num4 + num5 + num6;
		str = Double.toString(sum);
		str = String.format("%.2f", sum);
		textFieldTotalIncome.setText(str);
		
		netIncomeValueSet();
	}
	/***Sums the Total Expenses***/
	private void totalExpensesValueSet()
	{
		// getting an error when no values are initially set up before adding to the Net Income, but it does seem to work
		num1 = Double.parseDouble(textFieldRentMortgage.getText().replaceAll(",", "").trim());
		num2 = Double.parseDouble(textFieldGasHydro.getText().replaceAll(",", "").trim());
		num3 = Double.parseDouble(textFieldPhoneTv.getText().replaceAll(",", "").trim());
		num4 = Double.parseDouble(textFieldChildCare.getText().replaceAll(",", "").trim());
		num5 = Double.parseDouble(textFieldTransitGas.getText().replaceAll(",", "").trim());
		num6 = Double.parseDouble(textFieldLoansInsurance.getText().replaceAll(",", "").trim());
		sum = 0;
		str = "";
		
		sum = num1 + num2 + num3 + num4 + num5 + num6;
		str = Double.toString(sum);
		str = String.format("%.2f", sum);
		textFieldTotalExpenses.setText(str);
		
		netIncomeValueSet();
	}
	/***Sums the 2 Totals together***/
	private void netIncomeValueSet()
	{
		double income = Double.parseDouble(textFieldTotalIncome.getText().replaceAll(",", "").trim());
		double expenses = Double.parseDouble(textFieldTotalExpenses.getText().replaceAll(",", "").trim());
		sum = 0;
		str = "";
		
		sum = income - expenses;
		
		if (expenses > income)
		{
			textFieldNetIncome.setForeground(Color.RED);
			str = Double.toString(sum);
			str = String.format("%.2f", sum);
			textFieldNetIncome.setText(str);
		} else 
		{
			textFieldNetIncome.setForeground(Color.BLACK);
			str = Double.toString(sum);
			str = String.format("%.2f", sum);
			textFieldNetIncome.setText(str);
		}
	}
	/***Adds the Employment***/
	protected void do_textFieldEmployment_focusLost(FocusEvent e) {
		totalIncomeValueSet();
	}
	/***Adds the Child Support***/
	protected void do_textFieldChildSpousalSupport_focusLost(FocusEvent e) {
		totalIncomeValueSet();
	}
	/***Adds the Ontario Works***/
	protected void do_textFieldOntarioWorks_focusLost(FocusEvent e) {
		totalIncomeValueSet();
	}
	/***Adds the EI or Disability***/
	protected void do_textFieldEiOrDisability_focusGained(FocusEvent e) {
		totalIncomeValueSet();
	}
	/***Adds the Pension Income***/
	protected void do_textFieldPensionIncome_focusLost(FocusEvent e) {
		totalIncomeValueSet();
	}
	/***Adds the Child Tax Credits***/
	protected void do_textFieldChildTaxCredits_focusLost(FocusEvent e) {
		totalIncomeValueSet();
	}
	/***Adds the Rent / Mortgage***/
	protected void do_textFieldRentMortgage_focusLost(FocusEvent e) {
		totalExpensesValueSet();
	}
	/***Adds the Gas + Hydro***/
	protected void do_textFieldGasHydro_focusLost(FocusEvent e) {
		totalExpensesValueSet();
	}
	/***Adds the Phone + TV***/
	protected void do_textFieldPhoneTv_focusLost(FocusEvent e) {
		totalExpensesValueSet();
	}
	/***Adds the Child Care***/
	protected void do_textFieldChildCare_focusLost(FocusEvent e) {
		totalExpensesValueSet();
	}
	/***Adds the Transit + Gas***/
	protected void do_textFieldTransitGas_focusLost(FocusEvent e) {
		totalExpensesValueSet();
	}
	/***Adds the Loans + Insurance***/
	protected void do_textFieldLoansInsurance_focusLost(FocusEvent e) {
		totalExpensesValueSet();
	}
}

