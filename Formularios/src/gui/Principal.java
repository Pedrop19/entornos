package gui;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Component;

public class Principal extends JFrame {

	JButton btnNewButton = new JButton("Formulario 3");
	JButton btnNewButton_1 = new JButton("Formulario 2");
	JButton btnNewButton_2 = new JButton("Formulario 1");
	final private ButtonsListener bl = new ButtonsListener();
	private JPanel contentPane;
	private static boolean defaultColor = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 818, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("FORMULARIOS");

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton.addActionListener(bl);
		btnNewButton.setBackground(new Color(34, 139, 34));
		btnNewButton.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 23));
		btnNewButton.setBounds(140, 465, 205, 56);
		contentPane.add(btnNewButton);
		
		btnNewButton_1.addActionListener(bl);
		btnNewButton_1.setBackground(new Color(34, 139, 34));
		btnNewButton_1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 23));
		btnNewButton_1.setBounds(140, 285, 205, 56);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2.addActionListener(bl);
		btnNewButton_2.setBackground(new Color(34, 139, 34));
		btnNewButton_2.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 23));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(140, 118, 205, 56);
		contentPane.add(btnNewButton_2);
		
		JTextArea txtrEjerciciosFormulario = new JTextArea();
		txtrEjerciciosFormulario.setForeground(new Color(148, 0, 211));
		txtrEjerciciosFormulario.setBackground(UIManager.getColor("Button.background"));
		txtrEjerciciosFormulario.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 25));
		txtrEjerciciosFormulario.setText("EJERCICIOS FORMULARIO");
		txtrEjerciciosFormulario.setBounds(227, 48, 330, 46);
		contentPane.add(txtrEjerciciosFormulario);
		
		
		JLabel panel = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource("/formulario1.png")).getImage();
		panel.setIcon(new ImageIcon(img));
		panel.setBounds(506, 88, 249, 120);
		contentPane.add(panel);
		
		JLabel panel2 = new JLabel();
		Image img2 = new ImageIcon(this.getClass().getResource("/formulario2.PNG")).getImage();
		panel2.setIcon(new ImageIcon(img2));
		panel2.setBounds(506, 414, 270, 120);
		contentPane.add(panel2);
		
		JLabel panel3 = new JLabel();
		Image img3 = new ImageIcon(this.getClass().getResource("/formulario3.PNG")).getImage();
		panel3.setIcon(new ImageIcon(img3));
		panel3.setBounds(530, 250, 225, 120);
		contentPane.add(panel3);
	}
	
	 class ButtonsListener implements ActionListener {

	       
	        public void actionPerformed( ActionEvent e ) {
	            System.out.println("Button clicked !");
	        }

	    } 
}
