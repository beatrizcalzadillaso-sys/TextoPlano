package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuOpciones extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuOpciones frame = new MenuOpciones();
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
	public MenuOpciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JButton btnLoad = new JButton("Cargar mensajes");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnLoad, 26, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnLoad, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnLoad, 58, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnLoad, 144, SpringLayout.WEST, contentPane);
		contentPane.add(btnLoad);
		
		JButton btnAdd = new JButton("Agregar mensajes");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnAdd, 70, SpringLayout.SOUTH, btnLoad);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnAdd, 15, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnAdd, 102, SpringLayout.SOUTH, btnLoad);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnAdd, -1, SpringLayout.EAST, btnLoad);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnAdd);
		
		JButton btnSave = new JButton("Guardar mensajes");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnSave, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnSave, 129, SpringLayout.EAST, btnLoad);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnSave, 42, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnSave, -10, SpringLayout.EAST, contentPane);
		contentPane.add(btnSave);
		
		JButton btnPrint = new JButton("New button");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnPrint, 49, SpringLayout.SOUTH, btnSave);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnPrint, 0, SpringLayout.WEST, btnSave);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnPrint, -32, SpringLayout.SOUTH, btnAdd);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnPrint, -15, SpringLayout.EAST, contentPane);
		contentPane.add(btnPrint);
		
		JButton btnExit = new JButton("Salir");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnExit, -10, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnExit, -38, SpringLayout.EAST, contentPane);
		contentPane.add(btnExit);

	}
}
