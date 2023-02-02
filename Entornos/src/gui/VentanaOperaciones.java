package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class VentanaOperaciones extends JFrame {

	private JPanel panelPrincipal;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaOperaciones frame = new VentanaOperaciones();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public VentanaOperaciones() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 479);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JTextArea txtrFormulario = new JTextArea();
		txtrFormulario.setEditable(false);
		txtrFormulario.setFont(new Font("Segoe UI Black", Font.PLAIN, 23));
		txtrFormulario.setBackground(SystemColor.control);
		txtrFormulario.setText("Formulario");
		txtrFormulario.setBounds(242, 11, 135, 41);
		panelPrincipal.add(txtrFormulario);
		
		JTextArea txtrNombre = new JTextArea();
		txtrNombre.setForeground(new Color(0, 0, 255));
		txtrNombre.setBackground(SystemColor.control);
		txtrNombre.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 20));
		txtrNombre.setText("Nombre:");
		txtrNombre.setBounds(132, 109, 141, 28);
		panelPrincipal.add(txtrNombre);
		
		JTextArea txtrApellido = new JTextArea();
		txtrApellido.setForeground(new Color(0, 0, 255));
		txtrApellido.setBackground(SystemColor.control);
		txtrApellido.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 20));
		txtrApellido.setText("Apellidos:");
		txtrApellido.setBounds(132, 148, 141, 28);
		panelPrincipal.add(txtrApellido);
		
		JTextArea txtrTelfono = new JTextArea();
		txtrTelfono.setForeground(new Color(0, 0, 255));
		txtrTelfono.setBackground(SystemColor.control);
		txtrTelfono.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 20));
		txtrTelfono.setText("Teléfono:");
		txtrTelfono.setBounds(132, 187, 141, 28);
		panelPrincipal.add(txtrTelfono);
		
		JTextArea txtrEmail = new JTextArea();
		txtrEmail.setForeground(new Color(0, 0, 255));
		txtrEmail.setBackground(SystemColor.control);
		txtrEmail.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 20));
		txtrEmail.setText("Email:");
		txtrEmail.setBounds(132, 226, 141, 28);
		panelPrincipal.add(txtrEmail);
		
		JTextArea txtrSexo = new JTextArea();
		txtrSexo.setForeground(new Color(0, 0, 255));
		txtrSexo.setBackground(SystemColor.control);
		txtrSexo.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 20));
		txtrSexo.setText("Sexo:");
		txtrSexo.setBounds(132, 265, 141, 28);
		panelPrincipal.add(txtrSexo);
		
		textField = new JTextField();
		textField.setBounds(279, 148, 141, 28);
		panelPrincipal.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(279, 109, 141, 28);
		panelPrincipal.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(279, 187, 141, 28);
		panelPrincipal.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(279, 224, 141, 28);
		panelPrincipal.add(textField_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Hombre", "Mujer", "Helicoptero Apache"}));
		comboBox.setBounds(279, 265, 141, 28);
		panelPrincipal.add(comboBox);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(228, 335, 120, 41);
		panelPrincipal.add(btnNewButton);
	}
}
