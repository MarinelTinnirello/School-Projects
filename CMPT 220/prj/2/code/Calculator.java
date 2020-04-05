import java.lang.Math;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

    private JFrame frame;
    private JTextField textField_0;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_6;
    private JTextField textField_5;
    private JTextField textField_7;
    private JTextField textField_8;

    /**
     * Launch the application.
     */
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    Calculator window = new Calculator();
                    window.frame.setVisible(true);
                } catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Calculator()
    {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize()
    {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        textField_0 = new JTextField();
        textField_0.setBounds(10, 11, 175, 55);
        frame.getContentPane().add(textField_0);
        textField_0.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(253, 11, 175, 55);
        frame.getContentPane().add(textField_1);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(155, 170, 175, 55);
        frame.getContentPane().add(textField_2);

        JLabel lblAns = new JLabel("Ans:");
        lblAns.setFont(new Font("Source Sans Pro", Font.BOLD, 25));
        lblAns.setBounds(77, 170, 108, 55);
        frame.getContentPane().add(lblAns);

        JButton buttonAddition = new JButton("+");
        buttonAddition.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    int num1, num2, ans;

                    num1 = Integer.parseInt(textField_0.getText());
                    num2 = Integer.parseInt(textField_1.getText());

                    ans = num1 + num2;
                    textField_2.setText(Integer.toString(ans));
                }catch (Exception e1)
                {
                    JOptionPane.showMessageDialog(null, "ENTER VALID NUMBER.");
                }
            }
        });
        buttonAddition.setFont(new Font("Tahoma", Font.BOLD, 25));
        buttonAddition.setBounds(10, 95, 75, 55);
        frame.getContentPane().add(buttonAddition);

        JButton buttonSubtraction = new JButton("-");
        buttonSubtraction.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    int num1, num2, ans;

                    num1 = Integer.parseInt(textField_0.getText());
                    num2 = Integer.parseInt(textField_1.getText());

                    ans = num1 - num2;
                    textField_2.setText(Integer.toString(ans));
                }catch (Exception e1)
                {
                    JOptionPane.showMessageDialog(null, "ENTER VALID NUMBER.");
                }
            }
        });
        buttonSubtraction.setFont(new Font("Tahoma", Font.BOLD, 25));
        buttonSubtraction.setBounds(95, 95, 75, 55);
        frame.getContentPane().add(buttonSubtraction);

        JButton buttonMultiplication = new JButton("*");
        buttonMultiplication.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    int num1, num2, ans;

                    num1 = Integer.parseInt(textField_0.getText());
                    num2 = Integer.parseInt(textField_1.getText());

                    ans = num1 * num2;
                    textField_2.setText(Integer.toString(ans));
                }catch (Exception e1)
                {
                    JOptionPane.showMessageDialog(null, "ENTER VALID NUMBER.");
                }
            }
        });
        buttonMultiplication.setFont(new Font("Tahoma", Font.BOLD, 25));
        buttonMultiplication.setBounds(180, 95, 75, 55);
        frame.getContentPane().add(buttonMultiplication);

        JButton buttonDivision = new JButton("/");
        buttonDivision.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    int num1, num2, ans;

                    num1 = Integer.parseInt(textField_0.getText());
                    num2 = Integer.parseInt(textField_1.getText());

                    ans = num1 / num2;
                    textField_2.setText(Integer.toString(ans));
                }catch (Exception e1)
                {
                    JOptionPane.showMessageDialog(null, "ENTER VALID NUMBER.");
                }
            }
        });
        buttonDivision.setFont(new Font("Tahoma", Font.BOLD, 25));
        buttonDivision.setBounds(265, 95, 75, 55);
        frame.getContentPane().add(buttonDivision);

        JButton buttonExponent = new JButton("^");
        buttonExponent.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    int num1, num2, ans;

                    num1 = Integer.parseInt(textField_0.getText());
                    num2 = Integer.parseInt(textField_1.getText());

                    ans = (int) Math.pow(num1, num2);
                    textField_2.setText(Integer.toString(ans));
                }catch (Exception e1)
                {
                    JOptionPane.showMessageDialog(null, "ENTER VALID NUMBER.");
                }
            }
        });
        buttonExponent.setFont(new Font("Tahoma", Font.BOLD, 25));
        buttonExponent.setBounds(353, 95, 75, 55);
        frame.getContentPane().add(buttonExponent);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(10, 265, 130, 55);
        frame.getContentPane().add(textField_3);

        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(155, 265, 130, 55);
        frame.getContentPane().add(textField_4);

        JButton btnCircleArea = new JButton("Circle");
        btnCircleArea.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    double num1, ans;

                    num1 = Double.parseDouble(textField_3.getText());

                    Area area = new Area(num1, 0);
                    ans = area.Circle();

                    textField_6.setText(Double.toString(ans));
                }catch (Exception e1)
                {
                    JOptionPane.showMessageDialog(null, "ENTER VALID NUMBER.");
                }
            }
        });
        btnCircleArea.setFont(new Font("Source Sans Pro", Font.BOLD, 16));
        btnCircleArea.setBounds(123, 342, 91, 49);
        frame.getContentPane().add(btnCircleArea);

        JButton btnTriangleArea = new JButton("Triangle");
        btnTriangleArea.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    double num1, num2, ans;

                    num1 = Double.parseDouble(textField_3.getText());
                    num2 = Double.parseDouble(textField_4.getText());

                    Area area = new Area(num1, num2);
                    ans = area.Triangle();

                    textField_6.setText(Double.toString(ans));
                }catch (Exception e1)
                {
                    JOptionPane.showMessageDialog(null, "ENTER VALID NUMBER.");
                }
            }
        });
        btnTriangleArea.setFont(new Font("Source Sans Pro", Font.BOLD, 16));
        btnTriangleArea.setBounds(224, 342, 91, 49);
        frame.getContentPane().add(btnTriangleArea);

        JButton btnRectangleArea = new JButton("Rectangle");
        btnRectangleArea.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    double num1, num2, ans;

                    num1 = Double.parseDouble(textField_3.getText());
                    num2 = Double.parseDouble(textField_4.getText());

                    Area area = new Area(num1, num2);
                    ans = area.Rectangle();

                    textField_6.setText(Double.toString(ans));
                }catch (Exception e1)
                {
                    JOptionPane.showMessageDialog(null, "ENTER VALID NUMBER.");
                }
            }
        });
        btnRectangleArea.setFont(new Font("Source Sans Pro", Font.BOLD, 16));
        btnRectangleArea.setBounds(325, 342, 103, 49);
        frame.getContentPane().add(btnRectangleArea);

        JLabel lblArea = new JLabel("Area");
        lblArea.setFont(new Font("Source Sans Pro", Font.BOLD, 20));
        lblArea.setBounds(10, 341, 67, 49);
        frame.getContentPane().add(lblArea);

        JLabel lblVolume = new JLabel("Volume");
        lblVolume.setFont(new Font("Source Sans Pro Black", Font.BOLD, 20));
        lblVolume.setBounds(10, 401, 91, 49);
        frame.getContentPane().add(lblVolume);

        JButton btnCircleVolume = new JButton("Circle");
        btnCircleVolume.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    double num1, ans;

                    num1 = Double.parseDouble(textField_3.getText());

                    Volume volume = new Volume(num1, 0, 0);
                    ans = volume.Circle();

                    textField_6.setText(Double.toString(ans));
                }catch (Exception e1)
                {
                    JOptionPane.showMessageDialog(null, "ENTER VALID NUMBER.");
                }
            }
        });
        btnCircleVolume.setFont(new Font("Source Sans Pro", Font.BOLD, 16));
        btnCircleVolume.setBounds(123, 401, 91, 49);
        frame.getContentPane().add(btnCircleVolume);

        JButton btnTriangleVolume = new JButton("Triangle");
        btnTriangleVolume.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    double num1, num2, num3, ans;

                    num1 = Double.parseDouble(textField_3.getText());
                    num2 = Double.parseDouble(textField_4.getText());
                    num3 = Double.parseDouble(textField_5.getText());

                    Volume volume = new Volume(num1, num2, num3);
                    ans = volume.Triangle();

                    textField_6.setText(Double.toString(ans));
                }catch (Exception e1)
                {
                    JOptionPane.showMessageDialog(null, "ENTER VALID NUMBER.");
                }
            }
        });
        btnTriangleVolume.setFont(new Font("Source Sans Pro", Font.BOLD, 16));
        btnTriangleVolume.setBounds(224, 401, 91, 49);
        frame.getContentPane().add(btnTriangleVolume);

        JButton btnRectangleVolume = new JButton("Rectangle");
        btnRectangleVolume.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    double num1, num2, num3, ans;

                    num1 = Double.parseDouble(textField_3.getText());
                    num2 = Double.parseDouble(textField_4.getText());
                    num3 = Double.parseDouble(textField_5.getText());

                    Volume volume = new Volume(num1, num2, num3);
                    ans = volume.Rectangle();

                    textField_6.setText(Double.toString(ans));
                }catch (Exception e1)
                {
                    JOptionPane.showMessageDialog(null, "ENTER VALID NUMBER.");
                }
            }
        });
        btnRectangleVolume.setFont(new Font("Source Sans Pro", Font.BOLD, 16));
        btnRectangleVolume.setBounds(325, 402, 103, 48);
        frame.getContentPane().add(btnRectangleVolume);

        textField_6 = new JTextField();
        textField_6.setColumns(10);
        textField_6.setBounds(155, 474, 175, 55);
        frame.getContentPane().add(textField_6);

        JLabel label = new JLabel("Ans:");
        label.setFont(new Font("Source Sans Pro", Font.BOLD, 25));
        label.setBounds(77, 474, 108, 55);
        frame.getContentPane().add(label);

        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(298, 265, 130, 55);
        frame.getContentPane().add(textField_5);

        textField_7 = new JTextField();
        textField_7.setColumns(10);
        textField_7.setBounds(155, 560, 175, 55);
        frame.getContentPane().add(textField_7);

        textField_8 = new JTextField();
        textField_8.setColumns(10);
        textField_8.setBounds(155, 692, 175, 55);
        frame.getContentPane().add(textField_8);

        JLabel lblDydx = new JLabel("dY /dX:");
        lblDydx.setFont(new Font("Source Sans Pro", Font.BOLD, 25));
        lblDydx.setBounds(62, 692, 108, 55);
        frame.getContentPane().add(lblDydx);

        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    String polynomial, ans;

                    polynomial = textField_7.getText();
                    Derivative derivative = new Derivative(polynomial);

                    ans = derivative.readDerivative();
                    textField_8.setText(ans);
                }catch (Exception e1)
                {
                    JOptionPane.showMessageDialog(null, "ENTER VALID NUMBER.");
                }
            }
        });
        btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnCalculate.setBounds(180, 626, 130, 55);
        frame.getContentPane().add(btnCalculate);
    }
}
