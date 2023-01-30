package graficos;

import java.awt.Color;
import javax.swing.JFrame;


import javax.swing.*;
import java.awt.*;

public class BanderaExtremadura {

    public static void main(String[] args) {
    	
        JFrame frame = new JFrame("Bandera de Extremadura");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.setBackground(Color.white);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.green);
        panel.add(panel1);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.white);
        panel.add(panel2);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.black);
        panel.add(panel3);

        frame.add(panel);
    }
}

    

