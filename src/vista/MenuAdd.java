package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import datos.DatosDesplegables;

public class MenuAdd extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAdd frame = new MenuAdd();
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
	public MenuAdd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblDate = new JLabel("Fecha");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblDate, 22, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblDate, 26, SpringLayout.WEST, contentPane);
		contentPane.add(lblDate);
		
		JLabel lblTime = new JLabel("Hora");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblTime, 30, SpringLayout.SOUTH, lblDate);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblTime, 0, SpringLayout.WEST, lblDate);
		contentPane.add(lblTime);
		
		JLabel lblFrom = new JLabel("De:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblFrom, 36, SpringLayout.SOUTH, lblTime);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblFrom, 0, SpringLayout.WEST, lblDate);
		contentPane.add(lblFrom);
		
		JLabel lblTo = new JLabel("Para:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblTo, 31, SpringLayout.SOUTH, lblFrom);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblTo, 0, SpringLayout.EAST, lblDate);
		contentPane.add(lblTo);
		
		JLabel lblSubject = new JLabel("Asunto:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblSubject, 41, SpringLayout.SOUTH, lblTo);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblSubject, 0, SpringLayout.WEST, lblDate);
		contentPane.add(lblSubject);
		
		JLabel lblContent = new JLabel("Contenido");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblContent, 40, SpringLayout.SOUTH, lblSubject);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblContent, 0, SpringLayout.WEST, lblDate);
		contentPane.add(lblContent);
		
		textField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField, 0, SpringLayout.NORTH, lblDate);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 75, SpringLayout.EAST, lblDate);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_2, 0, SpringLayout.NORTH, lblFrom);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, textField);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_3, 0, SpringLayout.NORTH, lblTo);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_3, 0, SpringLayout.EAST, textField);
		textField_3.setColumns(10);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_4, 0, SpringLayout.NORTH, lblSubject);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_4, 0, SpringLayout.EAST, textField);
		textField_4.setColumns(10);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_5, 0, SpringLayout.NORTH, lblContent);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_5, 0, SpringLayout.WEST, textField);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField_5, 98, SpringLayout.NORTH, lblContent);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_5, 293, SpringLayout.WEST, textField);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JComboBox cbMonth = new JComboBox();
		sl_contentPane.putConstraint(SpringLayout.NORTH, cbMonth, -1, SpringLayout.NORTH, textField);
		sl_contentPane.putConstraint(SpringLayout.WEST, cbMonth, 41, SpringLayout.EAST, textField);
		sl_contentPane.putConstraint(SpringLayout.EAST, cbMonth, 170, SpringLayout.EAST, textField);
		cbMonth.setModel(new DefaultComboBoxModel<>(DatosDesplegables.Month));
		contentPane.add(cbMonth);
		
		JComboBox cbDay = new JComboBox();
		sl_contentPane.putConstraint(SpringLayout.NORTH, cbDay, 0, SpringLayout.NORTH, lblDate);
		sl_contentPane.putConstraint(SpringLayout.WEST, cbDay, 94, SpringLayout.EAST, cbMonth);
		sl_contentPane.putConstraint(SpringLayout.EAST, cbDay, -105, SpringLayout.EAST, contentPane);
		contentPane.add(cbDay);
		
		JButton btnOK = new JButton("OK");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnOK, 29, SpringLayout.EAST, textField_5);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnOK, -10, SpringLayout.SOUTH, contentPane);
		contentPane.add(btnOK);
		
		JButton btnCancel = new JButton("Cancelar");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnCancel, 0, SpringLayout.SOUTH, btnOK);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnCancel, -10, SpringLayout.EAST, contentPane);
		contentPane.add(btnCancel);
		
		JComboBox cbHora = new JComboBox();
		sl_contentPane.putConstraint(SpringLayout.NORTH, cbHora, -4, SpringLayout.NORTH, lblTime);
		sl_contentPane.putConstraint(SpringLayout.WEST, cbHora, 0, SpringLayout.WEST, textField);
		sl_contentPane.putConstraint(SpringLayout.EAST, cbHora, 130, SpringLayout.EAST, lblTime);
		contentPane.add(cbHora);
		
		JLabel lblHSep = new JLabel(":");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblHSep, 0, SpringLayout.NORTH, lblTime);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblHSep, 6, SpringLayout.EAST, cbHora);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblHSep, -20, SpringLayout.EAST, textField);
		contentPane.add(lblHSep);
		
		JComboBox cbMinutos = new JComboBox();
		sl_contentPane.putConstraint(SpringLayout.NORTH, cbMinutos, -4, SpringLayout.NORTH, lblTime);
		sl_contentPane.putConstraint(SpringLayout.WEST, cbMinutos, 23, SpringLayout.EAST, lblHSep);
		sl_contentPane.putConstraint(SpringLayout.EAST, cbMinutos, 72, SpringLayout.EAST, lblHSep);
		contentPane.add(cbMinutos);

	}
}
