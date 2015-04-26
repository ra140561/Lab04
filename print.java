package alunos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class print extends JFrame {

	public JPanel contentPane;
	JLabel titleLabel = new JLabel("Title");
	JLabel firstNameLabel = new JLabel("First Name");
	JLabel lastNameLabel = new JLabel("Last Name");
	JLabel wasBornLabel = new JLabel("Data Nascimento");
	JLabel emailLabel = new JLabel("Email");
	JLabel CPFLabel = new JLabel("CPF");
	JLabel phoneLabel = new JLabel("Phone");
	JLabel address1Label = new JLabel("Address1");
	JLabel address2Label = new JLabel("Address2");
	JLabel CEPLabel = new JLabel("CEP");
	JLabel cityLabel = new JLabel("City");
	JLabel stateLabel = new JLabel("State");
	JLabel countryLabel = new JLabel("Country");

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					print frame = new print();					
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
	public print() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		firstNameLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		firstNameLabel.setBounds(150, 82, 216, 15);
		contentPane.add(firstNameLabel);		
		
		lastNameLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		lastNameLabel.setBounds(150, 109, 216, 15);
		contentPane.add(lastNameLabel);
		
		wasBornLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		wasBornLabel.setBounds(150, 136, 216, 15);
		contentPane.add(wasBornLabel);
		
		emailLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		emailLabel.setBounds(150, 163, 216, 15);
		contentPane.add(emailLabel);
		
		CPFLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		CPFLabel.setBounds(150, 190, 216, 15);
		contentPane.add(CPFLabel);
		
		phoneLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		phoneLabel.setBounds(150, 217, 216, 15);
		contentPane.add(phoneLabel);
		
		address1Label.setFont(new Font("Dialog", Font.PLAIN, 12));
		address1Label.setBounds(150, 244, 216, 15);
		contentPane.add(address1Label);
		
		address2Label.setFont(new Font("Dialog", Font.PLAIN, 12));
		address2Label.setBounds(150, 271, 216, 15);
		contentPane.add(address2Label);
		
		CEPLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		CEPLabel.setBounds(150, 298, 216, 15);
		contentPane.add(CEPLabel);
		
		cityLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		cityLabel.setBounds(150, 325, 216, 15);
		contentPane.add(cityLabel);
		
		stateLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		stateLabel.setBounds(150, 352, 216, 15);
		contentPane.add(stateLabel);
		
		countryLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		countryLabel.setBounds(150, 379, 216, 15);
		contentPane.add(countryLabel);
		
		JLabel lblNewLabel = new JLabel("First Name:");
		lblNewLabel.setBounds(12, 82, 106, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name:");
		lblNewLabel_1.setBounds(12, 109, 98, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Title:");
		lblNewLabel_2.setBounds(12, 55, 70, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Data Nascimento:");
		lblNewLabel_3.setBounds(12, 136, 150, 15);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Email:");
		lblNewLabel_4.setBounds(12, 163, 106, 15);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("CPF:");
		lblNewLabel_5.setBounds(12, 190, 106, 15);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Phone:");
		lblNewLabel_6.setBounds(12, 217, 106, 15);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Address 1:");
		lblNewLabel_7.setBounds(12, 244, 106, 15);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Address 2:");
		lblNewLabel_8.setBounds(12, 271, 106, 15);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("CEP:");
		lblNewLabel_9.setBounds(12, 298, 106, 15);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("City:");
		lblNewLabel_10.setBounds(12, 325, 106, 15);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("State:");
		lblNewLabel_11.setBounds(12, 352, 106, 15);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Country:");
		lblNewLabel_12.setBounds(12, 379, 106, 15);
		contentPane.add(lblNewLabel_12);
		
		titleLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		titleLabel.setBounds(150, 55, 216, 15);
		contentPane.add(titleLabel);
		
		JLabel lblNewLabel_13 = new JLabel("Form Printed");
		lblNewLabel_13.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_13.setBounds(139, 12, 159, 31);
		contentPane.add(lblNewLabel_13);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(12, 429, 117, 25);
		contentPane.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}

}
