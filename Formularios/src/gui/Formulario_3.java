package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Box;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Formulario_3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario_3 frame = new Formulario_3();
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
	public Formulario_3() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 546);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrInformacinObligatoria = new JTextArea();
		txtrInformacinObligatoria.setForeground(new Color(0, 0, 0));
		txtrInformacinObligatoria.setText("Informaci\u00F3n obligatoria");
		txtrInformacinObligatoria.setFont(new Font("Microsoft YaHei", Font.BOLD, 14));
		txtrInformacinObligatoria.setBounds(35, 42, 186, 22);
		contentPane.add(txtrInformacinObligatoria);
		
		JTextArea txtrNombre = new JTextArea();
		txtrNombre.setText("Nombre");
		txtrNombre.setForeground(new Color(0, 0, 0));
		txtrNombre.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		txtrNombre.setBounds(35, 74, 167, 22);
		contentPane.add(txtrNombre);
		
		textField = new JTextField();
		textField.setBounds(35, 97, 303, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(35, 163, 303, 27);
		contentPane.add(textField_1);
		
		JTextArea txtrEmail = new JTextArea();
		txtrEmail.setText("E-Mail\r\n");
		txtrEmail.setForeground(new Color(0, 0, 0));
		txtrEmail.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		txtrEmail.setBounds(35, 140, 167, 22);
		contentPane.add(txtrEmail);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(377, 97, 303, 27);
		contentPane.add(textField_2);
		
		JTextArea txtrPlanReenvo = new JTextArea();
		txtrPlanReenvo.setText("Plan reenv\u00EDo");
		txtrPlanReenvo.setForeground(new Color(0, 0, 0));
		txtrPlanReenvo.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		txtrPlanReenvo.setBounds(377, 74, 167, 22);
		contentPane.add(txtrPlanReenvo);
		
		JTextArea txtrInformacinObligatoria_1 = new JTextArea();
		txtrInformacinObligatoria_1.setText("Informaci\u00F3n opcional");
		txtrInformacinObligatoria_1.setForeground(new Color(0, 0, 0));
		txtrInformacinObligatoria_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 14));
		txtrInformacinObligatoria_1.setBounds(377, 43, 198, 22);
		contentPane.add(txtrInformacinObligatoria_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(377, 163, 303, 27);
		contentPane.add(textField_3);
		
		JTextArea txtrEmpresaNombre = new JTextArea();
		txtrEmpresaNombre.setText("Empresa - Nombre");
		txtrEmpresaNombre.setForeground(Color.BLACK);
		txtrEmpresaNombre.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		txtrEmpresaNombre.setBounds(377, 140, 167, 22);
		contentPane.add(txtrEmpresaNombre);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(377, 238, 303, 27);
		contentPane.add(textField_4);
		
		JTextArea txtrTelfonoMvil = new JTextArea();
		txtrTelfonoMvil.setText("Tel\u00E9fono M\u00F3vil");
		txtrTelfonoMvil.setForeground(Color.BLACK);
		txtrTelfonoMvil.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		txtrTelfonoMvil.setBounds(377, 215, 167, 22);
		contentPane.add(txtrTelfonoMvil);
		
		JTextArea txtrFechaDeNacimiento = new JTextArea();
		txtrFechaDeNacimiento.setText("Fecha de Nacimiento");
		txtrFechaDeNacimiento.setForeground(Color.BLACK);
		txtrFechaDeNacimiento.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		txtrFechaDeNacimiento.setBounds(35, 214, 167, 22);
		contentPane.add(txtrFechaDeNacimiento);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox.setBounds(35, 238, 72, 27);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"}));
		comboBox_1.setBounds(117, 238, 104, 27);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990"}));
		comboBox_1_1.setBounds(234, 238, 104, 27);
		contentPane.add(comboBox_1_1);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBounds(35, 321, 673, 1);
		contentPane.add(horizontalBox);
		
		JButton btnNewButton = new JButton("Contactar");
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Microsoft YaHei", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(50, 205, 50));
		btnNewButton.setBounds(319, 426, 116, 32);
		contentPane.add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Acepto el env\u00EDo de comunicaciones comerciales");
		rdbtnNewRadioButton.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setBounds(32, 341, 487, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnAceptoElAnalisis = new JRadioButton("Acepto el an\u00E1lisis de mi perfil para mejorar las comunicaciones comerciales");
		rdbtnAceptoElAnalisis.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		rdbtnAceptoElAnalisis.setBackground(Color.WHITE);
		rdbtnAceptoElAnalisis.setBounds(32, 364, 487, 21);
		contentPane.add(rdbtnAceptoElAnalisis);
		
		JRadioButton rdbtnAceptoLas = new JRadioButton("Acepto las");
		rdbtnAceptoLas.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		rdbtnAceptoLas.setBackground(Color.WHITE);
		rdbtnAceptoLas.setBounds(32, 387, 92, 21);
		contentPane.add(rdbtnAceptoLas);
		
		JTextArea txtrCondicionesDeUso = new JTextArea();
		txtrCondicionesDeUso.setEditable(false);
		txtrCondicionesDeUso.setText("condiciones de uso y pol\u00EDtica de privacidad.");
		txtrCondicionesDeUso.setForeground(new Color(30, 144, 255));
		txtrCondicionesDeUso.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		txtrCondicionesDeUso.setBounds(130, 387, 409, 22);
		contentPane.add(txtrCondicionesDeUso);
	}
}

