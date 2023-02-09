package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;

import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Formulario_2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario_2 frame = new Formulario_2();
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
	public Formulario_2() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 645);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrEmail = new JTextArea();
		txtrEmail.setText("Email");
		txtrEmail.setBounds(177, 123, 494, 33);
		contentPane.add(txtrEmail);
		
		mousePressed(txtrEmail,txtrEmail_1);
		
		JTextArea txtrEmail_1 = new JTextArea();
		txtrEmail_1.setText("Email");
		txtrEmail_1.setBounds(177, 60, 494, 33);
		contentPane.add(txtrEmail_1);
	}
	


	public void mousePressed(JTextArea txtrEmail, JTextArea txtrEmail2) {
		txtrEmail.setText(""); 
		txtrEmail2.setText(""); 
	}

}
