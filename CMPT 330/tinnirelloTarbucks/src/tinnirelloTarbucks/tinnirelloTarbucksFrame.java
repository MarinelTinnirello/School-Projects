package tinnirelloTarbucks;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.InputEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.DefaultComboBoxModel;

public class tinnirelloTarbucksFrame extends JFrame {
	/*** Setup for UI ***/
	private JPanel contentPane;
	private final JTable table = new JTable();
	private final JScrollPane scrollPane = new JScrollPane();
	private final JMenuBar menuBar = new JMenuBar();
	private final JMenu mnFile = new JMenu("File");
	private final JMenuItem mntmExit = new JMenuItem("Exit");
	private final JMenu mnTools = new JMenu("Tools");
	private final JMenuItem mntmAddItem = new JMenuItem("Add Item...");
	private final JSeparator separator = new JSeparator();
	private final JMenu mnHelp = new JMenu("Help");
	private final JMenu mnSetSort = new JMenu("Set Sort");
	private final JMenuItem mntmByNameSort = new JMenuItem("By Name");
	private final JMenuItem mntmByPriceSort = new JMenuItem("By Price");
	private final JMenuItem mntmByTypeSort = new JMenuItem("By Type");
	private final JMenu mnSetFilter = new JMenu("Set Filter");
	private final JMenuItem mntmByPriceFilter = new JMenuItem("By Price...");
	private final JMenuItem mntmByTypeFilter = new JMenuItem("By Type...");
	private final JMenuItem mntmReset = new JMenuItem("Reset");
	private final JSeparator separator_1 = new JSeparator();
	private final JLabel lblCurrentSortSetting = new JLabel("Current Sort Setting:");
	private final JLabel lblCurrentSort = new JLabel("None");
	private final JLabel lblCurrentFilterSetting = new JLabel("Current Filter Setting:");
	private final JLabel lblCurrentFilter = new JLabel("None");
	/*** Add Item pop up window variables ***/
	private JPanel addItems = new JPanel(new GridLayout(0, 1));
	private final JFormattedTextField textfieldID = new JFormattedTextField();
	private final JFormattedTextField textfieldName = new JFormattedTextField();
	private final JComboBox comboBoxAddItemType = new JComboBox();
	private final JFormattedTextField textfieldBrand = new JFormattedTextField();
	private final JFormattedTextField textfieldPrice = new JFormattedTextField();
	private final JFormattedTextField textfieldQuantity = new JFormattedTextField();
	/*** Filter By Price pop up window variables ***/
	private JPanel filterByPrice = new JPanel(new GridLayout(0, 2));
	private final JFormattedTextField textfieldPriceLessThan = new JFormattedTextField();
	private final JFormattedTextField textfieldPriceGreaterThan = new JFormattedTextField();
	private final JFormattedTextField textfieldPriceMin = new JFormattedTextField();
	private final JFormattedTextField textfieldPriceMax = new JFormattedTextField();
	/*** Filter By Type pop up window variables ***/
	private JPanel filterByType = new JPanel(new GridLayout(0, 1));
	private final JCheckBox checkCoffee = new JCheckBox("Coffee");
	private final JCheckBox checkTea = new JCheckBox("Tea");
	private final JCheckBox checkPastry = new JCheckBox("Pastry");
	private final JCheckBox checkSandwich = new JCheckBox("Sandwich");
	private final JCheckBox checkBagel = new JCheckBox("Bagel");
	private final JCheckBox checkCookie = new JCheckBox("Cookie");
	private final JCheckBox checkScone = new JCheckBox("Scone");
	private final JCheckBox checkOther = new JCheckBox("Other");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tinnirelloTarbucksFrame frame = new tinnirelloTarbucksFrame();
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
	public tinnirelloTarbucksFrame() {
		setTitle("tinnirelloTarbucksFrame");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 50, 668, 255);
		
		contentPane.add(scrollPane);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Name", "ItemType", "Brand", "Price", "Quantity"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		table.setFont(new Font("Courier New", Font.PLAIN, 11));
		menuBar.setBounds(0, 0, 688, 22);
		
		contentPane.add(menuBar);
		
		menuBar.add(mnFile);
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmExit_actionPerformed(e);
			}
		});
		mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		
		mnFile.add(mntmExit);
		
		menuBar.add(mnTools);
		mntmAddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmAddItem_actionPerformed(e);
			}
		});
		mntmAddItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		
		mnTools.add(mntmAddItem);
		
		mnTools.add(separator);
		
		mnTools.add(mnSetSort);
		mntmByNameSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmByNameSort_actionPerformed(e);
			}
		});
		mntmByNameSort.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		
		mnSetSort.add(mntmByNameSort);
		mntmByPriceSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmByPriceSort_actionPerformed(e);
			}
		});
		mntmByPriceSort.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
		
		mnSetSort.add(mntmByPriceSort);
		mntmByTypeSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmByTypeSort_actionPerformed(e);
			}
		});
		mntmByTypeSort.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_MASK));
		
		mnSetSort.add(mntmByTypeSort);
		
		mnTools.add(mnSetFilter);
		mntmByPriceFilter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmByPriceFilter_actionPerformed(e);
			}
		});
		mntmByPriceFilter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		
		mnSetFilter.add(mntmByPriceFilter);
		mntmByTypeFilter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmByTypeFilter_actionPerformed(e);
			}
		});
		mntmByTypeFilter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		
		mnSetFilter.add(mntmByTypeFilter);
		
		mnTools.add(separator_1);
		
		mnTools.add(mntmReset);
		
		mnTools.add(separator_1);
		mntmReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmReset_actionPerformed(e);
			}
		});
		
		mnTools.add(mntmReset);
		mnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mnHelp_actionPerformed(e);
			}
		});
		
		menuBar.add(mnHelp);
		lblCurrentSortSetting.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCurrentSortSetting.setBounds(20, 315, 150, 30);
		
		contentPane.add(lblCurrentSortSetting);
		lblCurrentSort.setBounds(20, 355, 150, 25);
		
		contentPane.add(lblCurrentSort);
		lblCurrentFilterSetting.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCurrentFilterSetting.setBounds(225, 315, 160, 30);
		
		contentPane.add(lblCurrentFilterSetting);
		lblCurrentFilter.setBounds(225, 355, 150, 25);
		
		contentPane.add(lblCurrentFilter);
		
		ResultSet rs = null;
		Statement stat = null;
		
		try {
			try {
				Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			Connection conn = DriverManager.getConnection("jdbc:ucanaccess:///Users/Public/TinnirelloTarBucks.accdb");
			
			stat = conn.createStatement();	
			
			String query = "SELECT ID, ITEMNAME, ITEMTYPE, BRAND, PRICE, QUANTITY FROM ITEMS";
			
			rs = stat.executeQuery(query);
			
			/*** remove any previously added rows ***/
			while(table.getRowCount() > 0) {
				((DefaultTableModel)table.getModel()).removeRow(0);
			}
			
			/*** to process results, get the number of columns ***/
			int numColumns = rs.getMetaData().getColumnCount();
			
			while(rs.next()) {
				/*** Object array holds 1 record ***/
				Object[] row = new Object[numColumns];
				
				for (int i = 0; i < numColumns; i++) {
					row[i] = rs.getObject(i+1);
				}
				
				((DefaultTableModel)table.getModel()).insertRow(rs.getRow()-1, row);
			}
			
			rs.close();
			conn.close();
		}
		catch (SQLException ex) {
			System.out.println("SQL Exception: " + ex.getMessage());
			System.out.println("SQL State: " + ex.getSQLState());
			System.out.println("Vendor Error: " + ex.getErrorCode());
			ex.printStackTrace();
		}
		
		/*** content for Add Items window ***/
		addItems.add(new JLabel("(Please hit the reset button to see the new item)"));
		addItems.add(new JLabel(""));
		
		addItems.add(new JLabel("ID:"));
		addItems.add(textfieldID);
		textfieldID.addKeyListener(new KeyAdapter() {
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
		
		addItems.add(new JLabel("Name:"));
		addItems.add(textfieldName);
		
		addItems.add(new JLabel("Item Type:"));
		comboBoxAddItemType.setModel(new DefaultComboBoxModel(new String[] {"Coffee", "Tea", "Pastry", "Sandwich", "Bagel", "Cookie", "Scone", "Other"}));
		addItems.add(comboBoxAddItemType);
		
		addItems.add(new JLabel("Brand:"));
		addItems.add(textfieldBrand);
		
		addItems.add(new JLabel("Price:"));
		addItems.add(textfieldPrice);
		textfieldPrice.addKeyListener(new KeyAdapter() {
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
		
		addItems.add(new JLabel("Quantity:"));
		addItems.add(textfieldQuantity);
		textfieldQuantity.addKeyListener(new KeyAdapter() {
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
		
		/*** content for Filter By Price window ***/
		filterByPrice.add(new JLabel("Items must be less than, or are a min value"));
		filterByPrice.add(textfieldPriceLessThan);
		
		filterByPrice.add(new JLabel("Items must be greater than, or are a max value"));
		filterByPrice.add(textfieldPriceGreaterThan);
		
		/*filterByPrice.add(new JLabel("Items must be between (min, max)"));
		filterByPrice.add(new JLabel(""));
		filterByPrice.add(textfieldPriceMin);
		filterByPrice.add(textfieldPriceMax);*/
		
		/*** content for Filter BY Type window ***/
		filterByType.add(checkCoffee);
		filterByType.add(checkTea);
		filterByType.add(checkPastry);
		filterByType.add(checkSandwich);
		filterByType.add(checkBagel);
		filterByType.add(checkCookie);
		filterByType.add(checkScone);
		filterByType.add(checkOther);
	}
	protected void do_mntmExit_actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	protected void do_mntmAddItem_actionPerformed(ActionEvent e) {
		int result = JOptionPane.showConfirmDialog(null, addItems, "Please enter all information on the new item", JOptionPane.OK_CANCEL_OPTION);
		
		if (textfieldID.getText().isEmpty() && textfieldName.getText().isEmpty() && textfieldBrand.getText().isEmpty() && 
				textfieldPrice.getText().isEmpty() && textfieldQuantity.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(this, "ID, Name, Brand, Price, and Quantity are missing", "ERROR - ID, NAME, BRAND, PRICE, QUANTITY "
					+ "missing", JOptionPane.ERROR_MESSAGE);
			textfieldID.setForeground(Color.RED);
			textfieldID.grabFocus();
			textfieldName.setForeground(Color.RED);
			textfieldName.grabFocus();
			textfieldBrand.setForeground(Color.RED);
			textfieldBrand.grabFocus();
			textfieldPrice.setForeground(Color.RED);
			textfieldPrice.grabFocus();
			textfieldQuantity.setForeground(Color.RED);
			textfieldQuantity.grabFocus();
		} else if (textfieldID.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "ID is missing", "ERROR - ID missing", JOptionPane.ERROR_MESSAGE);
			textfieldID.setForeground(Color.RED);
			textfieldID.grabFocus();
		} else if (textfieldName.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Name is missing", "ERROR - NAME missing", JOptionPane.ERROR_MESSAGE);
			textfieldName.setForeground(Color.RED);
			textfieldName.grabFocus();
		} else if (textfieldBrand.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Brand is missing", "ERROR - BRAND missing", JOptionPane.ERROR_MESSAGE);
			textfieldBrand.setForeground(Color.RED);
			textfieldBrand.grabFocus();
		} else if (textfieldPrice.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Price is missing", "ERROR - PRICE missing", JOptionPane.ERROR_MESSAGE);
			textfieldPrice.setForeground(Color.RED);
			textfieldPrice.grabFocus();
		} else if (textfieldQuantity.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Quantity is missing", "ERROR - QUANTITY missing", JOptionPane.ERROR_MESSAGE);
			textfieldQuantity.setForeground(Color.RED);
			textfieldQuantity.grabFocus();
		} else {
			Statement insertStat = null;
			Statement stat = null;
			String insertQuery = null;
			ResultSet rs = null;
			
			try {
				Connection conn = DriverManager.getConnection("jdbc:ucanaccess:///Users/Public/TinnirelloTarBucks.accdb");
				
				/*** made so that we have permissions to edit the database ***/
				insertStat = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
				stat = conn.createStatement();
				
				insertQuery = "INSERT INTO ITEMS (ID, ITEMNAME, ITEMTYPE, BRAND, PRICE, QUANTITY) VALUES ('";
				insertQuery += textfieldID.getText().trim() + "','";
				insertQuery += textfieldName.getText().trim() + "','";
				insertQuery += comboBoxAddItemType.getSelectedItem() + "','";
				insertQuery += textfieldBrand.getText().trim() + "',";
				insertQuery += textfieldPrice.getText().trim() + ",";
				insertQuery += textfieldQuantity.getText().trim() + ");";
				insertStat.executeUpdate(insertQuery);
				
				rs.close();
				conn.close();
					
			} 
			catch (SQLException ex) {
				System.out.println("SQL Exception: " + ex.getMessage());
				System.out.println("SQL State: " + ex.getSQLState());
				System.out.println("Vendor Error: " + ex.getErrorCode());
				ex.printStackTrace();
			}

		}
		
	}
	protected void do_mntmReset_actionPerformed(ActionEvent e) {
		lblCurrentSort.setText("None");
		lblCurrentFilter.setText("None");
		
		ResultSet rs = null;
		Statement stat = null;
		
		try {
			try {
				Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			Connection conn = DriverManager.getConnection("jdbc:ucanaccess:///Users/Public/TinnirelloTarBucks.accdb");
			
			stat = conn.createStatement();	
			
			String query = "SELECT ID, ITEMNAME, ITEMTYPE, BRAND, PRICE, QUANTITY FROM ITEMS";
			
			rs = stat.executeQuery(query);
			
			/*** remove any previously added rows ***/
			while(table.getRowCount() > 0) {
				((DefaultTableModel)table.getModel()).removeRow(0);
			}
			
			/*** to process results, get the number of columns ***/
			int numColumns = rs.getMetaData().getColumnCount();
			
			while(rs.next()) {
				/*** Object array holds 1 record ***/
				Object[] row = new Object[numColumns];
				
				for (int i = 0; i < numColumns; i++) {
					row[i] = rs.getObject(i+1);
				}
				
				((DefaultTableModel)table.getModel()).insertRow(rs.getRow()-1, row);
			}
			
			rs.close();
			conn.close();
		}
		catch (SQLException ex) {
			System.out.println("SQL Exception: " + ex.getMessage());
			System.out.println("SQL State: " + ex.getSQLState());
			System.out.println("Vendor Error: " + ex.getErrorCode());
			ex.printStackTrace();
		}
	}
	
	/*** Sort functions ***/
	protected void do_mntmByNameSort_actionPerformed(ActionEvent e) {
		lblCurrentSort.setText("Name");
		
		ResultSet rs = null;
		Statement stat = null;
		
		try {
			try {
				Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			Connection conn = DriverManager.getConnection("jdbc:ucanaccess:///Users/Public/TinnirelloTarBucks.accdb");
			
			stat = conn.createStatement();	
			
			String query = "SELECT ID, ITEMNAME, ITEMTYPE, BRAND, PRICE, QUANTITY FROM ITEMS ORDER BY ITEMNAME";
			
			rs = stat.executeQuery(query);
			
			/*** remove any previously added rows ***/
			while(table.getRowCount() > 0) {
				((DefaultTableModel)table.getModel()).removeRow(0);
			}
			
			/*** to process results, get the number of columns ***/
			int numColumns = rs.getMetaData().getColumnCount();
			
			while(rs.next()) {
				/*** Object array holds 1 record ***/
				Object[] row = new Object[numColumns];
				
				for (int i = 0; i < numColumns; i++) {
					row[i] = rs.getObject(i+1);
				}
				
				((DefaultTableModel)table.getModel()).insertRow(rs.getRow()-1, row);
			}
			
			rs.close();
			conn.close();
		}
		catch (SQLException ex) {
			System.out.println("SQL Exception: " + ex.getMessage());
			System.out.println("SQL State: " + ex.getSQLState());
			System.out.println("Vendor Error: " + ex.getErrorCode());
			ex.printStackTrace();
		}
	}
	protected void do_mntmByPriceSort_actionPerformed(ActionEvent e) {
		lblCurrentSort.setText("Price");

		ResultSet rs = null;
		Statement stat = null;
		
		try {
			try {
				Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			Connection conn = DriverManager.getConnection("jdbc:ucanaccess:///Users/Public/TinnirelloTarBucks.accdb");
			
			stat = conn.createStatement();	
			
			String query = "SELECT ID, ITEMNAME, ITEMTYPE, BRAND, PRICE, QUANTITY FROM ITEMS ORDER BY PRICE";
			
			rs = stat.executeQuery(query);
			
			/*** remove any previously added rows ***/
			while(table.getRowCount() > 0) {
				((DefaultTableModel)table.getModel()).removeRow(0);
			}
			
			/*** process results, get number of columns ***/
			int numColumns = rs.getMetaData().getColumnCount();
			
			while(rs.next()) {
				/*** Object array holds 1 record ***/
				Object[] row = new Object[numColumns];
				
				for (int i = 0; i < numColumns; i++) {
					row[i] = rs.getObject(i+1);
				}
				
				((DefaultTableModel)table.getModel()).insertRow(rs.getRow()-1, row);
			}
			
			rs.close();
			conn.close();
		}
		catch (SQLException ex) {
			System.out.println("SQL Exception: " + ex.getMessage());
			System.out.println("SQL State: " + ex.getSQLState());
			System.out.println("Vendor Error: " + ex.getErrorCode());
			ex.printStackTrace();
		}
	}
	protected void do_mntmByTypeSort_actionPerformed(ActionEvent e) {
		lblCurrentSort.setText("Item type");

		ResultSet rs = null;
		Statement stat = null;
		
		try {
			try {
				Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			Connection conn = DriverManager.getConnection("jdbc:ucanaccess:///Users/Public/TinnirelloTarBucks.accdb");
			
			stat = conn.createStatement();	
			
			String query = "SELECT ID, ITEMNAME, ITEMTYPE, BRAND, PRICE, QUANTITY FROM ITEMS ORDER BY ITEMTYPE";
			
			rs = stat.executeQuery(query);
			
			/*** remove any previously added rows ***/
			while(table.getRowCount() > 0) {
				((DefaultTableModel)table.getModel()).removeRow(0);
			}
			
			/*** process results, get number of columns ***/
			int numColumns = rs.getMetaData().getColumnCount();
			
			while(rs.next()) {
				/*** Object array holds 1 record ***/
				Object[] row = new Object[numColumns];
				
				for (int i = 0; i < numColumns; i++) {
					row[i] = rs.getObject(i+1);
				}
				
				((DefaultTableModel)table.getModel()).insertRow(rs.getRow()-1, row);
			}
			
			rs.close();
			conn.close();
		}
		catch (SQLException ex) {
			System.out.println("SQL Exception: " + ex.getMessage());
			System.out.println("SQL State: " + ex.getSQLState());
			System.out.println("Vendor Error: " + ex.getErrorCode());
			ex.printStackTrace();
		}
	}
	
	/*** Filter functions ***/
	protected void do_mntmByPriceFilter_actionPerformed(ActionEvent e) {
		int result = JOptionPane.showConfirmDialog(null, filterByPrice, "Please write the prices to be filtered", JOptionPane.OK_CANCEL_OPTION);

		lblCurrentFilter.setText("Price");
		
		ResultSet rs = null;
		Statement stat = null;
		
		/*** Price for less than (<) minimum ***/
		try {
			try {
				Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			Connection conn = DriverManager.getConnection("jdbc:ucanaccess:///Users/Public/TinnirelloTarBucks.accdb");
			
			stat = conn.createStatement();	
			
			String query = "SELECT ID, ITEMNAME, ITEMTYPE, BRAND, PRICE, QUANTITY FROM ITEMS WHERE PRICE < ";
			
			query += textfieldPriceLessThan.getText();
			query += " ORDER BY PRICE ASC;";
			rs = stat.executeQuery(query);
			
			/*** remove any previously added rows ***/
			while(table.getRowCount() > 0) {
				((DefaultTableModel)table.getModel()).removeRow(0);
			}
			
			/*** process results, get number of columns ***/
			int numColumns = rs.getMetaData().getColumnCount();
			
			while(rs.next()) {
				/*** Object array holds 1 record ***/				
				Object[] row = new Object[numColumns];
				for (int i = 0; i < numColumns; i++) {
					row[i] = rs.getObject(i+1);
				}
				((DefaultTableModel)table.getModel()).insertRow(rs.getRow()-1, row);
			
			}
			
			rs.close();
			conn.close();
			
			lblCurrentFilter.setText("Price, less than ");

		}
		catch (SQLException ex) {
			System.out.println("SQL Exception: " + ex.getMessage());
			System.out.println("SQL State: " + ex.getSQLState());
			System.out.println("Vendor Error: " + ex.getErrorCode());
			ex.printStackTrace();
		}
		
		/*** Price for greater than (>) maximum ***/
		try {
			try {
				Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			Connection conn = DriverManager.getConnection("jdbc:ucanaccess:///Users/Public/TinnirelloTarBucks.accdb");
			
			stat = conn.createStatement();	
			
			String query = "SELECT ID, ITEMNAME, ITEMTYPE, BRAND, PRICE, QUANTITY FROM ITEMS WHERE PRICE > ";
			
			query += textfieldPriceGreaterThan.getText();
			query += " ORDER BY PRICE ASC;";
			rs = stat.executeQuery(query);
			
			/*** remove any previously added rows ***/
			while(table.getRowCount() > 0) {
				((DefaultTableModel)table.getModel()).removeRow(0);
			}
			
			/*** process results, get number of columns ***/
			int numColumns = rs.getMetaData().getColumnCount();
			
			while(rs.next()) {
				/*** Object array holds 1 record ***/				
				Object[] row = new Object[numColumns];
				for (int i = 0; i < numColumns; i++) {
					row[i] = rs.getObject(i+1);
				}
				((DefaultTableModel)table.getModel()).insertRow(rs.getRow()-1, row);
			
			}
			
			rs.close();
			conn.close();
			
			lblCurrentFilter.setText("Price, greater than ");

		}
		catch (SQLException ex) {
			System.out.println("SQL Exception: " + ex.getMessage());
			System.out.println("SQL State: " + ex.getSQLState());
			System.out.println("Vendor Error: " + ex.getErrorCode());
			ex.printStackTrace();
		}
		
		/*** Price for greater than (>) maximum ***/
		try {
			try {
				Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			Connection conn = DriverManager.getConnection("jdbc:ucanaccess:///Users/Public/TinnirelloTarBucks.accdb");
			
			stat = conn.createStatement();	
			
			String query = "SELECT ID, ITEMNAME, ITEMTYPE, BRAND, PRICE, QUANTITY FROM ITEMS WHERE PRICE BETWEEN ";
			
			query += textfieldPriceLessThan.getText();
			query += " AND ";
			query += textfieldPriceGreaterThan.getText();

			query += " ORDER BY PRICE ASC;";
			rs = stat.executeQuery(query);
			
			/*** remove any previously added rows ***/
			while(table.getRowCount() > 0) {
				((DefaultTableModel)table.getModel()).removeRow(0);
			}
			
			/*** process results, get number of columns ***/
			int numColumns = rs.getMetaData().getColumnCount();
			
			while(rs.next()) {
				/*** Object array holds 1 record ***/				
				Object[] row = new Object[numColumns];
				for (int i = 0; i < numColumns; i++) {
					row[i] = rs.getObject(i+1);
				}
				((DefaultTableModel)table.getModel()).insertRow(rs.getRow()-1, row);
			
			}
			
			rs.close();
			conn.close();
			
			lblCurrentFilter.setText("Price, between ");

		}
		catch (SQLException ex) {
			System.out.println("SQL Exception: " + ex.getMessage());
			System.out.println("SQL State: " + ex.getSQLState());
			System.out.println("Vendor Error: " + ex.getErrorCode());
			ex.printStackTrace();
		}
	}
	protected void do_mntmByTypeFilter_actionPerformed(ActionEvent e) {
		int result = JOptionPane.showConfirmDialog(null, filterByType, "Please check all items to be filtered", JOptionPane.OK_CANCEL_OPTION);
		
		lblCurrentFilter.setText("Item Type");
		
		ResultSet rs = null;
		Statement stat = null;
		
		try {
			try {
				Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			Connection conn = DriverManager.getConnection("jdbc:ucanaccess:///Users/Public/TinnirelloTarBucks.accdb");
			
			stat = conn.createStatement();	
			
			String query = "SELECT ID, ITEMNAME, ITEMTYPE, BRAND, PRICE, QUANTITY FROM ITEMS WHERE ITEMTYPE = ";
			
			/*if (checkCoffee.isSelected()) {
				query += checkCoffee.isSelected();
				query += " AND ";
			}
			if (checkTea.isSelected()) {
				query += checkTea.isSelected();
				query += " AND ";
			}
			if (checkPastry.isSelected()) {
				query += checkPastry.isSelected();
				query += " AND ";
			}
			if (checkSandwich.isSelected()) {
				query += checkSandwich.isSelected();
				query += " AND ";
			}
			if (checkBagel.isSelected()) {
				query += checkBagel.isSelected();
				query += " AND ";
			}
			if (checkCookie.isSelected()) {
				query += checkCookie.isSelected();
				query += " AND ";
			}
			if (checkScone.isSelected()) {
				query += checkScone.isSelected();
				query += " AND ";
			}
			if (checkOther.isSelected()) {
				query += checkOther.isSelected();
			}*/
			query += checkCoffee.isSelected();
			query += " AND ";
			query += checkTea.isSelected();
			query += " AND ";
			query += checkPastry.isSelected();
			query += " AND ";
			query += checkSandwich.isSelected();
			query += " AND ";
			query += checkBagel.isSelected();
			query += " AND ";
			query += checkCookie.isSelected();
			query += " AND ";
			query += checkScone.isSelected();
			query += " AND ";
			query += checkOther.isSelected();

			query += " ORDER BY PRICE ASC;";
			rs = stat.executeQuery(query);
			
			/*** remove any previously added rows ***/
			while(table.getRowCount() > 0) {
				((DefaultTableModel)table.getModel()).removeRow(0);
			}
			
			/*** process results, get number of columns ***/
			int numColumns = rs.getMetaData().getColumnCount();
			
			while(rs.next()) {
				/*** Object array holds 1 record ***/				
				Object[] row = new Object[numColumns];
				for (int i = 0; i < numColumns; i++) {
					row[i] = rs.getObject(i+1);
				}
				((DefaultTableModel)table.getModel()).insertRow(rs.getRow()-1, row);
			
			}
			
			System.out.println(query);
			
			rs.close();
			conn.close();
			
			lblCurrentFilter.setText("Price, between ");

		}
		catch (SQLException ex) {
			System.out.println("SQL Exception: " + ex.getMessage());
			System.out.println("SQL State: " + ex.getSQLState());
			System.out.println("Vendor Error: " + ex.getErrorCode());
			ex.printStackTrace();
		}
	}
	protected void do_mnHelp_actionPerformed(ActionEvent e) {
		tinnirelloTarbucksFrameHelp frame = new tinnirelloTarbucksFrameHelp();
	    frame.setLocation(this.getX() + 20, this.getY() + 20);
	    frame.setVisible(true);
	}
}
