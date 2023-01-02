/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_first_calculator;

/**
 *
 * @author Hp
 */
import javax.swing.JFrame;
import java.awt.Color;
public class My_First_Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame a1 = new Frame();
        a1.setTitle("My First Calculator");
        a1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a1.setLayout(null);
        a1.setSize(590,470);
        a1.getContentPane().setBackground(Color.DARK_GRAY);
        a1.intitialize();
        a1.setLocationRelativeTo(null);
        a1.setVisible(true);
        
    }
    
    
}
