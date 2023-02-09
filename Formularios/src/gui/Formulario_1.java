package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTabbedPane;
import java.awt.Font;

public class Formulario_1 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

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
		setBounds(100, 100, 833, 675);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setEnabled(false);
		table.setRowHeight(25);
		table.setBorder(new LineBorder(new Color(0, 128, 0)));
		table.setForeground(new Color(0, 100, 0));
		table.setFont(new Font("Arial", Font.BOLD, 13));
		table.setRowSelectionAllowed(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"     1", "DATOS DEL/DE LA SOLICITANTE"},
			},
			new String[] {
				"1", "DATOS DEL/DE LA SOLICITANTE"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(50);
		table.getColumnModel().getColumn(0).setMaxWidth(50);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(105);
		table.getColumnModel().getColumn(1).setMinWidth(39);
		table.setBounds(59, 105, 688, 25);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setShowHorizontalLines(false);
		table_1.setEnabled(false);
		table_1.setBackground(new Color(255, 255, 255));
		table_1.setFont(new Font("Arial", Font.PLAIN, 13));
		table_1.setForeground(new Color(0, 128, 0));
		table_1.setBorder(new LineBorder(new Color(0, 128, 0)));
		table_1.setRowHeight(20);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"PRIMER APELLIDO:", "SEGUNDO APELLIDO:"},
			},
			new String[] {
				"PRIMER APELLIDO:", "SEGUNDO APELLIDO:"
			}
		));
		table_1.setBounds(59, 129, 688, 20);
		contentPane.add(table_1);
		
		table_2 = new JTable();
		table_2.setShowHorizontalLines(false);
		table_2.setBorder(null);
		table_2.setRowHeight(20);
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"New column", "New column"
			}
		));
		table_2.setBounds(59, 148, 688, 20);
		contentPane.add(table_2);
	}
}
