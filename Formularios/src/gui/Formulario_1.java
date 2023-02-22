package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.Box;
import javax.swing.JSeparator;
import java.awt.Canvas;
import java.awt.Component;

public class Formulario_1 extends JFrame {

	private JPanel contentPane;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;
	private JTable table_6;
	private JTable table_7;
	private JCheckBox chckbxMujer;
	private JTable table_8;
	private JTable table_9;
	private JTable table_10;
	private JTable table_11;
	private JTable table_12;
	private JTable table_13;
	private JTable table_14;
	private JTable table_15;
	private JTable table_16;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxMujer_1;
	private JTable table_17;
	private JTable table_18;
	private JTable table_19;
	private JTable table_20;
	private JTable table_21;
	private JTable table_22;
	private JTable table_23;
	private JTable table_24;
	private JTextArea txtrIdioma;
	private JTextField textField;
	private JCheckBox chckbxNewCheckBox_2;
	private JCheckBox chckbxNewCheckBox_3;
	private JTextArea txtrTurno;
	private JCheckBox chckbxNewCheckBox_4;
	private JCheckBox chckbxNewCheckBox_5;
	private JTextArea txtrNivel;
	private JCheckBox chckbxNewCheckBox_6;
	private JCheckBox chckbxNewCheckBox_7;
	private JCheckBox chckbxNewCheckBox_8;
	private JCheckBox chckbxNewCheckBox_9;
	private JCheckBox chckbxNewCheckBox_10;
	private JCheckBox chckbxNewCheckBox_11;
	private JTextArea txtrCurso;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario_1 frame = new Formulario_1();
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
	public Formulario_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 901, 668);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		setBackground(new Color(255, 255, 255));
		contentPane.setLayout(null);
		
		JTextArea txtrAdasdasdaas = new JTextArea();
		txtrAdasdasdaas.setEditable(false);
		txtrAdasdasdaas.setBounds(10, 10, 548, 24);
		txtrAdasdasdaas.setForeground(new Color(0, 128, 0));
		txtrAdasdasdaas.setFont(new Font("Segoe UI Historic", Font.BOLD, 14));
		txtrAdasdasdaas.setText("ADMISI\u00D3N EN ESCUELAS OFICIALES DE IDIOMAS. (C\u00F3digo procedimiento: 5580)");
		txtrAdasdasdaas.setTabSize(50);
		getContentPane().add(txtrAdasdasdaas);
		
		JTable table = new JTable();
		table.setFont(new Font("Segoe UI", Font.BOLD, 14));
		table.setToolTipText("1");
		table.setBorder(new LineBorder(new Color(0, 128, 0)));
		table.setForeground(new Color(0, 128, 0));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"   1"},
			},
			new String[] {
				"New column"
			}
		));
		table.setBounds(10, 34, 36, 16);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"DATOS DEL/DE LA SOLICITANTE"},
			},
			new String[] {
				"New column"
			}
		));
		table_1.setToolTipText("1");
		table_1.setForeground(new Color(0, 128, 0));
		table_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		table_1.setBorder(new LineBorder(new Color(0, 128, 0)));
		table_1.setBounds(46, 34, 696, 16);
		contentPane.add(table_1);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"PRIMER APELLIDO:"},
				{null},
			},
			new String[] {
				"New column"
			}
		));
		table_2.setToolTipText("1");
		table_2.setForeground(new Color(0, 128, 0));
		table_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		table_2.setBorder(new LineBorder(new Color(0, 128, 0)));
		table_2.setBounds(10, 50, 370, 29);
		contentPane.add(table_2);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{"SEGUNDO APELLIDO:"},
				{null},
			},
			new String[] {
				"New column"
			}
		));
		table_3.setToolTipText("1");
		table_3.setForeground(new Color(0, 128, 0));
		table_3.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		table_3.setBorder(new LineBorder(new Color(0, 128, 0)));
		table_3.setBounds(378, 50, 364, 29);
		contentPane.add(table_3);
		
		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
			new Object[][] {
				{"NOMBRE: "},
				{null},
			},
			new String[] {
				"New column"
			}
		));
		table_4.setToolTipText("1");
		table_4.setForeground(new Color(0, 128, 0));
		table_4.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		table_4.setBorder(new LineBorder(new Color(0, 128, 0)));
		table_4.setBounds(10, 79, 370, 29);
		contentPane.add(table_4);
		
		table_5 = new JTable();
		table_5.setOpaque(false);
		table_5.setModel(new DefaultTableModel(
			new Object[][] {
				{"SEXO:"},
			},
			new String[] {
				"New column"
			}
		));
		table_5.setToolTipText("1");
		table_5.setForeground(new Color(0, 128, 0));
		table_5.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		table_5.setBorder(new LineBorder(new Color(0, 128, 0)));
		table_5.setBounds(378, 79, 132, 16);
		contentPane.add(table_5);
		
		table_6 = new JTable();
		table_6.setModel(new DefaultTableModel(
			new Object[][] {
				{"DNI/NIE:"},
				{null},
			},
			new String[] {
				"New column"
			}
		));
		table_6.setToolTipText("1");
		table_6.setForeground(new Color(0, 128, 0));
		table_6.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		table_6.setBorder(new LineBorder(new Color(0, 128, 0)));
		table_6.setBounds(509, 79, 117, 29);
		contentPane.add(table_6);
		
		table_7 = new JTable();
		table_7.setModel(new DefaultTableModel(
			new Object[][] {
				{"FECHA NACIMIENTO:"},
				{null},
			},
			new String[] {
				"New column"
			}
		));
		table_7.setToolTipText("1");
		table_7.setForeground(new Color(0, 128, 0));
		table_7.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		table_7.setBorder(new LineBorder(new Color(0, 128, 0)));
		table_7.setBounds(625, 79, 117, 29);
		contentPane.add(table_7);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Hombre");
		chckbxNewCheckBox.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		chckbxNewCheckBox.setForeground(new Color(0, 128, 0));
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBounds(378, 98, 61, 10);
		contentPane.add(chckbxNewCheckBox);
		
		chckbxMujer = new JCheckBox("Mujer\r\n");
		chckbxMujer.setForeground(new Color(0, 128, 0));
		chckbxMujer.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		chckbxMujer.setBackground(Color.WHITE);
		chckbxMujer.setBounds(449, 98, 61, 10);
		contentPane.add(chckbxMujer);
		
		table_8 = new JTable();
		table_8.setModel(new DefaultTableModel(
			new Object[][] {
				{"DOMICILIO: CALLE PLAZA O AVDA. Y N\u00DAMERO:"},
				{null},
			},
			new String[] {
				"New column"
			}
		));
		table_8.setToolTipText("1");
		table_8.setForeground(new Color(0, 128, 0));
		table_8.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		table_8.setBorder(new LineBorder(new Color(0, 128, 0)));
		table_8.setBounds(10, 108, 472, 29);
		contentPane.add(table_8);
		
		table_9 = new JTable();
		table_9.setModel(new DefaultTableModel(
			new Object[][] {
				{"LOCALIDAD:"},
				{null},
			},
			new String[] {
				"New column"
			}
		));
		table_9.setToolTipText("1");
		table_9.setForeground(new Color(0, 128, 0));
		table_9.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		table_9.setBorder(new LineBorder(new Color(0, 128, 0)));
		table_9.setBounds(481, 108, 261, 29);
		contentPane.add(table_9);
		
		table_10 = new JTable();
		table_10.setModel(new DefaultTableModel(
			new Object[][] {
				{"PROVINCIA:"},
				{null},
			},
			new String[] {
				"New column"
			}
		));
		table_10.setToolTipText("1");
		table_10.setForeground(new Color(0, 128, 0));
		table_10.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		table_10.setBorder(new LineBorder(new Color(0, 128, 0)));
		table_10.setBounds(10, 136, 117, 29);
		contentPane.add(table_10);
		
		table_11 = new JTable();
		table_11.setModel(new DefaultTableModel(
			new Object[][] {
				{"CODIGO POSTAL:"},
				{null},
			},
			new String[] {
				"New column"
			}
		));
		table_11.setToolTipText("1");
		table_11.setForeground(new Color(0, 128, 0));
		table_11.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		table_11.setBorder(new LineBorder(new Color(0, 128, 0)));
		table_11.setBounds(126, 136, 132, 29);
		contentPane.add(table_11);
		
		table_12 = new JTable();
		table_12.setModel(new DefaultTableModel(
			new Object[][] {
				{"TELEFONO/S:"},
				{null},
			},
			new String[] {
				"New column"
			}
		));
		table_12.setToolTipText("1");
		table_12.setForeground(new Color(0, 128, 0));
		table_12.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		table_12.setBorder(new LineBorder(new Color(0, 128, 0)));
		table_12.setBounds(258, 136, 132, 29);
		contentPane.add(table_12);
		
		table_13 = new JTable();
		table_13.setModel(new DefaultTableModel(
			new Object[][] {
				{"CORREO ELECTRONICO:"},
				{null},
			},
			new String[] {
				"New column"
			}
		));
		table_13.setToolTipText("1");
		table_13.setForeground(new Color(0, 128, 0));
		table_13.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		table_13.setBorder(new LineBorder(new Color(0, 128, 0)));
		table_13.setBounds(390, 136, 352, 29);
		contentPane.add(table_13);
		
		table_14 = new JTable();
		table_14.setModel(new DefaultTableModel(
			new Object[][] {
				{"NOMBRE DEL PADRE O TUTOR LEGAL: ( s\u00F3lo para solicitantes menores de edad):"},
				{null},
			},
			new String[] {
				"New column"
			}
		));
		table_14.setToolTipText("1");
		table_14.setForeground(new Color(0, 128, 0));
		table_14.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		table_14.setBorder(new LineBorder(new Color(0, 128, 0)));
		table_14.setBounds(10, 164, 472, 32);
		contentPane.add(table_14);
		
		table_15 = new JTable();
		table_15.setModel(new DefaultTableModel(
			new Object[][] {
				{"DNI/NIE:"},
				{null},
			},
			new String[] {
				"New column"
			}
		));
		table_15.setToolTipText("1");
		table_15.setForeground(new Color(0, 128, 0));
		table_15.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		table_15.setBorder(new LineBorder(new Color(0, 128, 0)));
		table_15.setBounds(481, 164, 137, 32);
		contentPane.add(table_15);
		
		table_16 = new JTable();
		table_16.setModel(new DefaultTableModel(
			new Object[][] {
				{"SEXO:"},
			},
			new String[] {
				"New column"
			}
		));
		table_16.setToolTipText("1");
		table_16.setForeground(new Color(0, 128, 0));
		table_16.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		table_16.setBorder(new LineBorder(new Color(0, 128, 0)));
		table_16.setBounds(618, 164, 124, 16);
		contentPane.add(table_16);
		
		chckbxNewCheckBox_1 = new JCheckBox("Hombre");
		chckbxNewCheckBox_1.setForeground(new Color(0, 128, 0));
		chckbxNewCheckBox_1.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		chckbxNewCheckBox_1.setBackground(Color.WHITE);
		chckbxNewCheckBox_1.setBounds(625, 183, 61, 10);
		contentPane.add(chckbxNewCheckBox_1);
		
		chckbxMujer_1 = new JCheckBox("Mujer\r\n");
		chckbxMujer_1.setForeground(new Color(0, 128, 0));
		chckbxMujer_1.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		chckbxMujer_1.setBackground(Color.WHITE);
		chckbxMujer_1.setBounds(687, 183, 49, 10);
		contentPane.add(chckbxMujer_1);
		
		table_17 = new JTable();
		table_17.setModel(new DefaultTableModel(
			new Object[][] {
				{"NOMBRE DE LA MADRE O TUTORA LEGAL: ( s\u00F3lo para solicitantes menores de edad):"},
				{null},
			},
			new String[] {
				"New column"
			}
		));
		table_17.setToolTipText("1");
		table_17.setForeground(new Color(0, 128, 0));
		table_17.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		table_17.setBorder(new LineBorder(new Color(0, 128, 0)));
		table_17.setBounds(10, 196, 472, 32);
		contentPane.add(table_17);
		
		table_18 = new JTable();
		table_18.setModel(new DefaultTableModel(
			new Object[][] {
				{"DNI/NIE:"},
				{null},
			},
			new String[] {
				"New column"
			}
		));
		table_18.setToolTipText("1");
		table_18.setForeground(new Color(0, 128, 0));
		table_18.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		table_18.setBorder(new LineBorder(new Color(0, 128, 0)));
		table_18.setBounds(481, 195, 137, 33);
		contentPane.add(table_18);
		
		table_19 = new JTable();
		table_19.setModel(new DefaultTableModel(
			new Object[][] {
				{"SEXO:"},
			},
			new String[] {
				"New column"
			}
		));
		table_19.setToolTipText("1");
		table_19.setForeground(new Color(0, 128, 0));
		table_19.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		table_19.setBorder(new LineBorder(new Color(0, 128, 0)));
		table_19.setBounds(618, 195, 124, 16);
		contentPane.add(table_19);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("Hombre");
		chckbxNewCheckBox_1_1.setForeground(new Color(0, 128, 0));
		chckbxNewCheckBox_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		chckbxNewCheckBox_1_1.setBackground(Color.WHITE);
		chckbxNewCheckBox_1_1.setBounds(625, 217, 61, 10);
		contentPane.add(chckbxNewCheckBox_1_1);
		
		JCheckBox chckbxMujer_1_1 = new JCheckBox("Mujer\r\n");
		chckbxMujer_1_1.setForeground(new Color(0, 128, 0));
		chckbxMujer_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		chckbxMujer_1_1.setBackground(Color.WHITE);
		chckbxMujer_1_1.setBounds(687, 217, 49, 10);
		contentPane.add(chckbxMujer_1_1);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBorder(new LineBorder(new Color(0, 128, 0)));
		verticalBox.setBackground(new Color(0, 128, 0));
		verticalBox.setBounds(741, 175, 1, 53);
		contentPane.add(verticalBox);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBorder(new LineBorder(new Color(0, 128, 0)));
		horizontalBox.setBackground(new Color(0, 128, 0));
		horizontalBox.setBounds(618, 227, 124, 1);
		contentPane.add(horizontalBox);
		
		table_20 = new JTable();
		table_20.setModel(new DefaultTableModel(
			new Object[][] {
				{"   2"},
			},
			new String[] {
				"New column"
			}
		));
		table_20.setToolTipText("1");
		table_20.setForeground(new Color(0, 128, 0));
		table_20.setFont(new Font("Segoe UI", Font.BOLD, 14));
		table_20.setBorder(new LineBorder(new Color(0, 128, 0)));
		table_20.setBounds(10, 238, 36, 16);
		contentPane.add(table_20);
		
		table_21 = new JTable();
		table_21.setModel(new DefaultTableModel(
			new Object[][] {
				{"SOLICITA"},
			},
			new String[] {
				"New column"
			}
		));
		table_21.setToolTipText("1");
		table_21.setForeground(new Color(0, 128, 0));
		table_21.setFont(new Font("Segoe UI", Font.BOLD, 14));
		table_21.setBorder(new LineBorder(new Color(0, 128, 0)));
		table_21.setBounds(46, 238, 696, 16);
		contentPane.add(table_21);
		
		table_22 = new JTable();
		table_22.setModel(new DefaultTableModel(
			new Object[][] {
				{"Que sea admitido para el curso:              /                como alumno/a de la Escuela Oficial de Idiomas:"},
			},
			new String[] {
				"New column"
			}
		));
		table_22.setToolTipText("1");
		table_22.setForeground(new Color(0, 128, 0));
		table_22.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		table_22.setBorder(new LineBorder(new Color(0, 128, 0)));
		table_22.setBounds(10, 253, 732, 16);
		contentPane.add(table_22);
		
		table_23 = new JTable();
		table_23.setModel(new DefaultTableModel(
			new Object[][] {
				{"DENOMINACION DEL CENTRO:"},
				{null},
			},
			new String[] {
				"New column"
			}
		));
		table_23.setToolTipText("1");
		table_23.setForeground(new Color(0, 128, 0));
		table_23.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		table_23.setBorder(new LineBorder(new Color(0, 128, 0)));
		table_23.setBounds(10, 269, 505, 32);
		contentPane.add(table_23);
		
		table_24 = new JTable();
		table_24.setModel(new DefaultTableModel(
			new Object[][] {
				{"LOCALIDAD:"},
				{null},
			},
			new String[] {
				"New column"
			}
		));
		table_24.setToolTipText("1");
		table_24.setForeground(new Color(0, 128, 0));
		table_24.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		table_24.setBorder(new LineBorder(new Color(0, 128, 0)));
		table_24.setBounds(513, 269, 229, 32);
		contentPane.add(table_24);
		
		txtrIdioma = new JTextArea();
		txtrIdioma.setText("IDIOMA:");
		txtrIdioma.setTabSize(50);
		txtrIdioma.setForeground(new Color(0, 128, 0));
		txtrIdioma.setFont(new Font("Segoe UI Historic", Font.BOLD, 14));
		txtrIdioma.setBounds(20, 311, 61, 24);
		contentPane.add(txtrIdioma);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 0));
		textField.setBounds(88, 316, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		chckbxNewCheckBox_2 = new JCheckBox("PRESENCIAL\r\n");
		chckbxNewCheckBox_2.setForeground(new Color(0, 128, 0));
		chckbxNewCheckBox_2.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox_2.setBounds(215, 314, 91, 21);
		contentPane.add(chckbxNewCheckBox_2);
		
		chckbxNewCheckBox_3 = new JCheckBox("SEMIPRESENCIAL\r\n");
		chckbxNewCheckBox_3.setForeground(new Color(0, 128, 0));
		chckbxNewCheckBox_3.setBackground(Color.WHITE);
		chckbxNewCheckBox_3.setBounds(322, 314, 117, 21);
		contentPane.add(chckbxNewCheckBox_3);
		
		txtrTurno = new JTextArea();
		txtrTurno.setText("TURNO:");
		txtrTurno.setTabSize(50);
		txtrTurno.setForeground(new Color(0, 128, 0));
		txtrTurno.setFont(new Font("Segoe UI Historic", Font.BOLD, 14));
		txtrTurno.setBounds(480, 311, 63, 24);
		contentPane.add(txtrTurno);
		
		chckbxNewCheckBox_4 = new JCheckBox("MA\u00D1ANA");
		chckbxNewCheckBox_4.setForeground(new Color(0, 128, 0));
		chckbxNewCheckBox_4.setBackground(Color.WHITE);
		chckbxNewCheckBox_4.setBounds(549, 314, 69, 21);
		contentPane.add(chckbxNewCheckBox_4);
		
		chckbxNewCheckBox_5 = new JCheckBox("TARDE");
		chckbxNewCheckBox_5.setForeground(new Color(0, 128, 0));
		chckbxNewCheckBox_5.setBackground(Color.WHITE);
		chckbxNewCheckBox_5.setBounds(635, 314, 69, 21);
		contentPane.add(chckbxNewCheckBox_5);
		
		txtrNivel = new JTextArea();
		txtrNivel.setText("NIVEL:");
		txtrNivel.setTabSize(50);
		txtrNivel.setForeground(new Color(0, 128, 0));
		txtrNivel.setFont(new Font("Segoe UI Historic", Font.BOLD, 14));
		txtrNivel.setBounds(18, 334, 49, 22);
		contentPane.add(txtrNivel);
		
		chckbxNewCheckBox_6 = new JCheckBox("B\u00C1SICO A1");
		chckbxNewCheckBox_6.setForeground(new Color(0, 128, 0));
		chckbxNewCheckBox_6.setBackground(Color.WHITE);
		chckbxNewCheckBox_6.setBounds(73, 340, 73, 16);
		contentPane.add(chckbxNewCheckBox_6);
		
		chckbxNewCheckBox_7 = new JCheckBox("B\u00C1SICO A2\r\n");
		chckbxNewCheckBox_7.setForeground(new Color(0, 128, 0));
		chckbxNewCheckBox_7.setBackground(Color.WHITE);
		chckbxNewCheckBox_7.setBounds(149, 340, 73, 16);
		contentPane.add(chckbxNewCheckBox_7);
		
		chckbxNewCheckBox_8 = new JCheckBox("INTERMEDIO B1");
		chckbxNewCheckBox_8.setForeground(new Color(0, 128, 0));
		chckbxNewCheckBox_8.setBackground(Color.WHITE);
		chckbxNewCheckBox_8.setBounds(224, 340, 104, 16);
		contentPane.add(chckbxNewCheckBox_8);
		
		chckbxNewCheckBox_9 = new JCheckBox("INTERMEDIO B2");
		chckbxNewCheckBox_9.setForeground(new Color(0, 128, 0));
		chckbxNewCheckBox_9.setBackground(Color.WHITE);
		chckbxNewCheckBox_9.setBounds(330, 340, 96, 16);
		contentPane.add(chckbxNewCheckBox_9);
		
		chckbxNewCheckBox_10 = new JCheckBox("AVANZADO C1");
		chckbxNewCheckBox_10.setForeground(new Color(0, 128, 0));
		chckbxNewCheckBox_10.setBackground(Color.WHITE);
		chckbxNewCheckBox_10.setBounds(426, 340, 96, 16);
		contentPane.add(chckbxNewCheckBox_10);
		
		chckbxNewCheckBox_11 = new JCheckBox("AVANZADO C2");
		chckbxNewCheckBox_11.setForeground(new Color(0, 128, 0));
		chckbxNewCheckBox_11.setBackground(Color.WHITE);
		chckbxNewCheckBox_11.setBounds(522, 340, 91, 16);
		contentPane.add(chckbxNewCheckBox_11);
		
		txtrCurso = new JTextArea();
		txtrCurso.setText("CURSO:");
		txtrCurso.setTabSize(50);
		txtrCurso.setForeground(new Color(0, 128, 0));
		txtrCurso.setFont(new Font("Segoe UI Historic", Font.BOLD, 14));
		txtrCurso.setBounds(618, 336, 61, 20);
		contentPane.add(txtrCurso);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.BLACK);
		textField_1.setColumns(10);
		textField_1.setBounds(687, 339, 49, 19);
		contentPane.add(textField_1);
		
		Box verticalBox_1 = Box.createVerticalBox();
		verticalBox_1.setBorder(new LineBorder(new Color(0, 128, 0)));
		verticalBox_1.setBackground(new Color(0, 128, 0));
		verticalBox_1.setBounds(741, 291, 1, 71);
		contentPane.add(verticalBox_1);
		
		Box verticalBox_1_1 = Box.createVerticalBox();
		verticalBox_1_1.setBorder(new LineBorder(new Color(0, 128, 0)));
		verticalBox_1_1.setBackground(new Color(0, 128, 0));
		verticalBox_1_1.setBounds(10, 291, 1, 71);
		contentPane.add(verticalBox_1_1);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		horizontalBox_1.setAlignmentX(Component.LEFT_ALIGNMENT);
		horizontalBox_1.setBorder(new LineBorder(new Color(0, 128, 0)));
		horizontalBox_1.setBackground(new Color(0, 128, 0));
		horizontalBox_1.setBounds(10, 361, 732, 1);
		contentPane.add(horizontalBox_1);

	}
}

