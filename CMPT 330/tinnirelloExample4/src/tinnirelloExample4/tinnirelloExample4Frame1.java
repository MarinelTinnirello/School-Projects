package tinnirelloExample4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.awt.event.ActionEvent;

public class tinnirelloExample4Frame1 extends JFrame {

	private JPanel contentPane;
	private final JLabel lblBizzaOrderingSystem = new JLabel("Pizza Ordering System");
	private final JLabel lblSize = new JLabel("Size:");
	private final JComboBox comboBoxSides = new JComboBox();
	private final JLabel lblToppings = new JLabel("Toppings:");
	private final JList listToppings = new JList();
	private final JScrollPane scrollPane = new JScrollPane();
	private final JLabel lblName = new JLabel("Name:");
	private final JTextField textField_name = new JTextField();
	private final JTextArea textArea_order = new JTextArea();
	private final JButton btnOrder = new JButton("Order");
	private final JScrollPane scrollPane_1 = new JScrollPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tinnirelloExample4Frame1 frame = new tinnirelloExample4Frame1();
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
	public tinnirelloExample4Frame1() {
		setTitle("Pizza Ordering System");
		textField_name.setBounds(65, 209, 106, 20);
		textField_name.setColumns(10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblBizzaOrderingSystem.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 20));
		lblBizzaOrderingSystem.setBounds(10, 11, 205, 40);
		
		contentPane.add(lblBizzaOrderingSystem);
		lblSize.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 16));
		lblSize.setBounds(10, 70, 60, 30);
		
		contentPane.add(lblSize);
		comboBoxSides.setModel(new DefaultComboBoxModel(new String[] {"Personal", "Small", "Medium", "Large", "Extra Large"}));
		comboBoxSides.setBounds(65, 76, 84, 22);
		
		contentPane.add(comboBoxSides);
		lblToppings.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 16));
		lblToppings.setBounds(10, 120, 75, 30);
		
		contentPane.add(lblToppings);
		scrollPane.setBounds(95, 130, 120, 70);
		
		contentPane.add(scrollPane);
		scrollPane.setViewportView(listToppings);
		listToppings.setModel(new AbstractListModel() {
			String[] values = new String[] {"Nematoads", "Onions", "Chesse 2", "Pepreonis", "Peppers", "Pinabple", "Bcaon", "Nutella"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		lblName.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 16));
		lblName.setBounds(10, 210, 48, 14);
		
		contentPane.add(lblName);
		
		contentPane.add(textField_name);
		scrollPane_1.setBounds(265, 75, 165, 156);
		
		contentPane.add(scrollPane_1);
		scrollPane_1.setViewportView(textArea_order);
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnOrder_actionPerformed(e);
			}
		});
		btnOrder.setBounds(265, 41, 91, 23);
		
		contentPane.add(btnOrder);
	}
	protected void do_btnOrder_actionPerformed(ActionEvent e) 
	{
		if (textField_name.getText().isEmpty())
		{
			textArea_order.setForeground(Color.RED);
			textArea_order.append("ERROR:  No text has been inputed in NAME.  "
					+ "Please enter data." + "\n");
		} else
		{
			textArea_order.setText("");
			textArea_order.setForeground(Color.BLACK);
			textArea_order.append("Order Name:	" + textField_name.getText() + "\n");
			textArea_order.append("You ordered: " + comboBoxSides.getSelectedItem().toString() + 
					" pizza with  " + "\n");
			
			Object[] toppings = listToppings.getSelectedValues();
			
			if (listToppings.isSelectionEmpty())
			{
				textArea_order.append("With no toppings.  \n");
			} else if(toppings.length > 0)
			{
				textArea_order.append("The following toppings:  \n");
			}
			for (int i = 0; i < toppings.length; i++)
			{
				textArea_order.append(toppings[i].toString() + "\n");
			}
		}
	}
}
