package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Panel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ShelterManager extends JFrame {

	private JPanel contentPane;
	private JTextField txtbienvenido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShelterManager frame = new ShelterManager();
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
	public ShelterManager() {
		setFont(new Font("Arial Black", Font.BOLD, 16));
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(128, 128, 0));
		setTitle("Shelter Manager");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 484);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(189, 183, 107));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		Panel registerPanel = new Panel();
		registerPanel.setFont(new Font("Andale Mono", Font.BOLD, 12));
		contentPane.add(registerPanel, "name_5523220415070");
		
		txtbienvenido = new JTextField();
		txtbienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		txtbienvenido.setForeground(Color.BLACK);
		txtbienvenido.setBackground(new Color(255, 255, 255));
		txtbienvenido.setBorder(null);
		txtbienvenido.setText("¡Bienvenido!");
		registerPanel.add(txtbienvenido);
		txtbienvenido.setColumns(10);
		
		Panel managerPanel = new Panel();
		contentPane.add(managerPanel, "name_5528133583943");
	}
}
