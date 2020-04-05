package tinnirelloTarbucks;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;

public class tinnirelloTarbucksFrameHelp extends JFrame {

	private JPanel contentPane;
	private final JLabel lblHelp = new JLabel("Help");
	private final JLabel lblAddItem = new JLabel("Add Item");
	private final JLabel lblAddItemDesc = new JLabel("<html>\r\nOpens up a popup for the user to add new items into the Database. <br>  \r\nAll fields must be filled out in order to add the new item.  Press the <br>\r\n\"Reset\" button for the new item to appear.\r\n</html>");
	private final JSeparator separator = new JSeparator();
	private final JSeparator separator_1 = new JSeparator();
	private final JLabel lblSort = new JLabel("Sort");
	private final JLabel lblByName = new JLabel("By Name");
	private final JLabel lblSortNameDesc = new JLabel("<html>\r\nSorts the items into alphabetical order.\r\n</html>");
	private final JLabel lblByType = new JLabel("By Type");
	private final JLabel lblSortTypeDesc = new JLabel("<html>\r\nSorts the items by their item types.\r\n</html>");
	private final JLabel lblByPrice = new JLabel("By Price");
	private final JLabel lblSortPriceDesc = new JLabel("<html>\r\nSorts the items by ascending prices.\r\n</html>");
	private final JSeparator separator_2 = new JSeparator();
	private final JLabel lblFilter = new JLabel("Filter");
	private final JLabel lblByName_1 = new JLabel("By Name");
	private final JLabel lblFilterNameDesc = new JLabel("<html>\r\nFilter items by checking their names.\r\n</html>");
	private final JLabel lblByPrice_1 = new JLabel("By Price");
	private final JLabel lblFilterPriceDesc = new JLabel("<html>\r\nFilter items by price, having the option to use prices lower than, <br>\r\ngreater than, or in between the values of those 2 textfields.\r\n</html>");

	/**
	 * Create the frame.
	 */
	public tinnirelloTarbucksFrameHelp() {
		setTitle("tinnirelloTarbucksFrameHelp");
		setType(Type.POPUP);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblHelp.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHelp.setBounds(10, 11, 90, 25);
		
		contentPane.add(lblHelp);
		lblAddItem.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddItem.setBounds(10, 45, 90, 25);
		
		contentPane.add(lblAddItem);
		lblAddItemDesc.setBounds(150, 45, 365, 50);
		
		contentPane.add(lblAddItemDesc);
		separator.setBounds(10, 34, 518, 2);
		
		contentPane.add(separator);
		separator_1.setBounds(10, 100, 350, 1);
		
		contentPane.add(separator_1);
		lblSort.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSort.setBounds(10, 110, 90, 25);
		
		contentPane.add(lblSort);
		lblByName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblByName.setBounds(40, 135, 90, 25);
		
		contentPane.add(lblByName);
		lblSortNameDesc.setBounds(150, 135, 365, 25);
		
		contentPane.add(lblSortNameDesc);
		lblByType.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblByType.setBounds(40, 205, 90, 25);
		
		contentPane.add(lblByType);
		lblSortTypeDesc.setBounds(150, 205, 365, 25);
		
		contentPane.add(lblSortTypeDesc);
		lblByPrice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblByPrice.setBounds(40, 170, 90, 25);
		
		contentPane.add(lblByPrice);
		lblSortPriceDesc.setBounds(150, 170, 365, 25);
		
		contentPane.add(lblSortPriceDesc);
		separator_2.setBounds(10, 240, 350, 2);
		
		contentPane.add(separator_2);
		lblFilter.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFilter.setBounds(10, 250, 90, 25);
		
		contentPane.add(lblFilter);
		lblByName_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblByName_1.setBounds(40, 280, 90, 25);
		
		contentPane.add(lblByName_1);
		lblFilterNameDesc.setBounds(150, 280, 365, 25);
		
		contentPane.add(lblFilterNameDesc);
		lblByPrice_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblByPrice_1.setBounds(40, 315, 90, 25);
		
		contentPane.add(lblByPrice_1);
		lblFilterPriceDesc.setBounds(150, 315, 365, 25);
		
		contentPane.add(lblFilterPriceDesc);
	}
}
