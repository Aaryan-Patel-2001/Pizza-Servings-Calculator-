/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaservingscalculator;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel; 
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author apple
 */
public class pizzacalculator extends JFrame{
    private final GridLayout gridLayout;
    private final JLabel label1;
    private JPanel line2;
    private JLabel label2;
    private final JTextField textField1;
    private final JButton button;
    private JLabel label3;
    
    public pizzacalculator() {
        super("Pizza Servings Calculator");
        gridLayout = new GridLayout(4,1);
        setLayout(gridLayout);
        
        label1 = new JLabel("Pizza Servings Calculator");
        label1.setForeground(Color.red);
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setVerticalAlignment(SwingConstants.CENTER);
        Font f = new Font(label1.getFont().getName(), Font.BOLD, 20);
        label1.setFont(f);
        add(label1);
        
        line2 = new JPanel();
        label2 = new JLabel("Enter the size of the pizza in inches:");
        Font g = new Font(label2.getFont().getName(), Font.BOLD, label2.getFont().getSize());
        label2.setFont(g);
        line2.add(label2);
        textField1 = new JTextField(4);
        line2.add(textField1);
        add(line2);
        
        button = new JButton("Calculate Servings");
        Font l = new Font(button.getFont().getName(), Font.BOLD, button.getFont().getSize());
        button.setFont(l);
        add(button);
        
        ButtonHandler handler = new ButtonHandler();
        button.addActionListener(handler);
        
        label3 = new JLabel();
        Font h = new Font(label3.getFont().getName(), Font.BOLD, label3.getFont().getSize());
        label3.setFont(h);
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        label3.setVerticalAlignment(SwingConstants.CENTER);
        add(label3);                              
    }
    
    private class ButtonHandler implements ActionListener
    {
        @Override 
        public void actionPerformed(ActionEvent event) {
            double serving;
            serving = (((Double.parseDouble(textField1.getText()))/8))*(((Double.parseDouble(textField1.getText()))/8));
            label3.setText(String.format("A %s inch pizza will serve %.2f people.", textField1.getText(), serving));
        }
    }
            
}
