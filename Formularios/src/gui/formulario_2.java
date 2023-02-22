package gui;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class formulario_2 extends JFrame {
	private JTextField txtEmail;
	private JTextField txtNombre;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formulario_2 frame = new formulario_2();
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
	public formulario_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 466);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		txtEmail = new JTextField();
		txtEmail.setBackground(new Color(249, 249, 249));
		txtEmail.setForeground(new Color(128, 128, 128));
		txtEmail.setFont(new Font("Calibri", Font.BOLD, 19));
		txtEmail.setText("Email");
		txtEmail.setBounds(25, 24, 759, 48);
		getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		txtNombre.setForeground(new Color(105, 105, 105));
		txtNombre.setFont(new Font("Calibri", Font.BOLD, 19));
		txtNombre.setColumns(10);
		txtNombre.setBackground(new Color(249, 249, 249));
		txtNombre.setBounds(25, 82, 759, 48);
		getContentPane().add(txtNombre);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("He le\u00EDdo y acepto la politica de privacidad y condiciones de uso de mowomo.com");
		rdbtnNewRadioButton.setFont(new Font("Calibri", Font.PLAIN, 19));
		rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setBounds(25, 136, 663, 33);
		getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnAceptoRecibirEl = new JRadioButton("Acepto recibir el newsletter por email con art\u00EDculos, promociones y noticias de mowomo.com\r\n");
		rdbtnAceptoRecibirEl.setFont(new Font("Calibri", Font.PLAIN, 19));
		rdbtnAceptoRecibirEl.setBackground(Color.WHITE);
		rdbtnAceptoRecibirEl.setBounds(25, 171, 759, 33);
		getContentPane().add(rdbtnAceptoRecibirEl);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("    No soy un robot\r\n");
		chckbxNewCheckBox.setBackground(new Color(249, 249, 249));
		chckbxNewCheckBox.setFont(new Font("Calibri", Font.PLAIN, 19));
		chckbxNewCheckBox.setBounds(25, 235, 192, 87);
		getContentPane().add(chckbxNewCheckBox);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(821, 24, 17, 384);
		getContentPane().add(scrollBar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/img/Captcha.png"));
		lblNewLabel.setBounds(212, 235, 148, 87);
		getContentPane().add(lblNewLabel);
	}

}