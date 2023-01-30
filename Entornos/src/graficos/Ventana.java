package graficos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{

	 public static void main(String[] args) {
	    	
	        JFrame frame = new JFrame("Ventana 1");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400,200);
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	 }
}
