/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaservingscalculator;
import javax.swing.JFrame;
/**
 *
 * @author apple
 */
public class PizzaServingsCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pizzacalculator calculate = new pizzacalculator();
        calculate.setTitle("Pizza Servings Calculator");
        calculate.setSize(350, 300);
        calculate.setVisible(true);
        calculate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
