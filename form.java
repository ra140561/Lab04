package alunos;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class form extends JFrame {

	public JPanel contentPane = new JPanel(new GridLayout(0,1));
	public JTextField textfirstName;
	public JTextField textlastName;
	public JTextField textwasBorn;
	public JTextField textemail;
	public JTextField textCPF;
	public JTextField textphone;
	public JTextField textaddress1;
	public JTextField textaddress2;
	public JTextField textCEP;
	public JTextField textcity;
	public JTextField textstate;
	public JTextField textcountry;
	private boolean checkFirst = false;
	private boolean checkLast = false;
	private boolean checkDate = false;
	private boolean checkEmail = false;
	private boolean checkCPF = false;
	private boolean checkPhone = true;
	private boolean checkCEP = true;
	private boolean FINAL = false;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form frame = new form();
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
	public form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 200, 400, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		textfirstName = new JTextField();
		textfirstName.getDocument().addDocumentListener(new DocumentListener() {
			  public void changedUpdate(DocumentEvent e) {
				  checkFirstNameField(textfirstName.getText());
			  }
			  public void removeUpdate(DocumentEvent e) {
				  checkFirstNameField(textfirstName.getText());
			  }
			  public void insertUpdate(DocumentEvent e) {
				  checkFirstNameField(textfirstName.getText());
			  }
		});
		textfirstName.setBounds(109, 58, 150, 19);
		contentPane.add(textfirstName);
		textfirstName.setColumns(10);
		
		
		
		textlastName = new JTextField();
		textlastName.getDocument().addDocumentListener(new DocumentListener() {
			  public void changedUpdate(DocumentEvent e) {
				  checkLastNameField(textlastName.getText());
			  }
			  public void removeUpdate(DocumentEvent e) {
				  checkLastNameField(textlastName.getText());
			  }
			  public void insertUpdate(DocumentEvent e) {
				  checkLastNameField(textlastName.getText());
			  }
		});
		textlastName.setBounds(109, 89, 150, 19);
		contentPane.add(textlastName);
		textlastName.setColumns(10);
		
		textwasBorn = new JTextField();
		textwasBorn.getDocument().addDocumentListener(new DocumentListener() {
			  public void changedUpdate(DocumentEvent e) {
				  checkDataField(textwasBorn.getText());
			  }
			  public void removeUpdate(DocumentEvent e) {
				  checkDataField(textwasBorn.getText());
			  }
			  public void insertUpdate(DocumentEvent e) {
				  checkDataField(textwasBorn.getText());
			  }
		});
		textwasBorn.setBounds(177, 120, 150, 19);
		contentPane.add(textwasBorn);
		textwasBorn.setText("DD/MM/AAAA");
		textwasBorn.setColumns(25);
		
		textemail = new JTextField();
		textemail.getDocument().addDocumentListener(new DocumentListener() {
			  public void changedUpdate(DocumentEvent e) {
				  checkEmailField(textemail.getText());
			  }
			  public void removeUpdate(DocumentEvent e) {
				  checkEmailField(textemail.getText());
			  }
			  public void insertUpdate(DocumentEvent e) {
				  checkEmailField(textemail.getText());
			  }
		});
		textemail.setBounds(92, 151, 150, 19);
		contentPane.add(textemail);
		textemail.setColumns(10);
		
		textCPF = new JTextField();
		textCPF.getDocument().addDocumentListener(new DocumentListener() {
			  public void changedUpdate(DocumentEvent e) {
				  checkCPFField(textCPF.getText());
			  }
			  public void removeUpdate(DocumentEvent e) {
				  checkCPFField(textCPF.getText());
			  }
			  public void insertUpdate(DocumentEvent e) {
				  checkCPFField(textCPF.getText());
			  }
		});
		textCPF.setBounds(82, 182, 150, 19);
		textCPF.setText("123.456.789-01");
		contentPane.add(textCPF);
		textCPF.setColumns(20);
		
		textphone = new JTextField();
		textphone.getDocument().addDocumentListener(new DocumentListener() {
			  public void changedUpdate(DocumentEvent e) {
				  checkPhoneField(textphone.getText());
			  }
			  public void removeUpdate(DocumentEvent e) {
				  checkPhoneField(textphone.getText());
			  }
			  public void insertUpdate(DocumentEvent e) {
				  checkPhoneField(textphone.getText());
			  }
		});
		textphone.setBounds(89, 213, 150, 19);
		contentPane.add(textphone);
		textphone.setText("+55XX(9)1234-5678");
		textphone.setColumns(10);
		
		textaddress1 = new JTextField();
		textaddress1.setBounds(90, 244, 150, 19);
		contentPane.add(textaddress1);
		textaddress1.setColumns(10);
		
		textaddress2 = new JTextField();
		textaddress2.setBounds(90, 275, 150, 19);
		contentPane.add(textaddress2);
		textaddress2.setColumns(10);
		
		textCEP = new JTextField();
		textCEP.getDocument().addDocumentListener(new DocumentListener() {
			  public void changedUpdate(DocumentEvent e) {
				  checkCEPField(textCEP.getText());
			  }
			  public void removeUpdate(DocumentEvent e) {
				  checkCEPField(textCEP.getText());
			  }
			  public void insertUpdate(DocumentEvent e) {
				  checkCEPField(textCEP.getText());
			  }
		});
		textCEP.setBounds(70, 306, 150, 19);
		textCEP.setText("01234-567");
		contentPane.add(textCEP);
		textCEP.setColumns(10);
		
		textcity = new JTextField();
		textcity.setBounds(50, 337, 150, 19);
		contentPane.add(textcity);
		textcity.setColumns(10);
		
		textstate = new JTextField();
		textstate.setBounds(63, 368, 150, 19);
		contentPane.add(textstate);
		textstate.setColumns(10);
		
		textcountry = new JTextField();
		textcountry.setBounds(80, 399, 150, 19);
		contentPane.add(textcountry);
		textcountry.setColumns(10);
		
		
		final JComboBox comboTitle = new JComboBox();
		comboTitle.setModel(new DefaultComboBoxModel(new String[] {"", "Mr.", "Mrs.", "Miss.", "Ms.", "Dr.", "Other"}));
		comboTitle.setToolTipText("");
		comboTitle.setBounds(58, 17, 81, 24);
		contentPane.add(comboTitle);
		
		JLabel lblFirstName = new JLabel("First Name: *");
		lblFirstName.setBounds(12, 60, 150, 15);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name: *");
		lblLastName.setBounds(12, 91, 150, 15);
		contentPane.add(lblLastName);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setBounds(12, 22, 90, 15);
		contentPane.add(lblTitle);
		
		JLabel lblwasBorn = new JLabel("Data Nascimento: * (*)");
		lblwasBorn.setBounds(12, 120, 210, 15);
		lblwasBorn.setToolTipText("DD/MM/AAAA");
		contentPane.add(lblwasBorn);
		
		JLabel lblemail = new JLabel("Email: *");
		lblemail.setBounds(12, 151, 180, 15);
		contentPane.add(lblemail);
		
		JLabel lblCPF = new JLabel("CPF: * (*)");
		lblCPF.setToolTipText("123.456.789-01");
		lblCPF.setBounds(12, 182, 180, 15);
		contentPane.add(lblCPF);
		
		JLabel lblphone = new JLabel("Phone: (*)");
		lblphone.setToolTipText("+55XX(9)1234-5678, onde XX = DDD, digito 9 eh opcional");
		lblphone.setBounds(12, 213, 180, 15);
		contentPane.add(lblphone);
		
		JLabel lbladdress1 = new JLabel("Address1:");
		lbladdress1.setBounds(12, 244, 180, 15);
		contentPane.add(lbladdress1);
		
		JLabel lbladdress2 = new JLabel("Address2:");
		lbladdress2.setBounds(12, 275, 180, 15);
		contentPane.add(lbladdress2);
		
		JLabel lblCEP = new JLabel("CEP: (*)");
		lblCEP.setToolTipText("01234-567");
		lblCEP.setBounds(12, 306, 180, 15);
		contentPane.add(lblCEP);
		
		JLabel lblcity = new JLabel("City:");
		lblcity.setBounds(12, 337, 180, 15);
		contentPane.add(lblcity);
		
		JLabel lblstate = new JLabel("State:");
		lblstate.setBounds(12, 368, 180, 15);
		contentPane.add(lblstate);
		
		JLabel lblcountry = new JLabel("Country:");
		lblcountry.setBounds(12, 399, 180, 15);
		contentPane.add(lblcountry);
		
		JLabel lblwarn1 = new JLabel("E_1:");
		lblwarn1.setBounds(12, 430, 420, 15);
		contentPane.add(lblwarn1);
		
		JLabel lblwarn2 = new JLabel("E_2:");
		lblwarn2.setBounds(12, 461, 420, 15);
		contentPane.add(lblwarn2);
		
		//ERROR LABELS
		
		//GeneralError1
		final JLabel errorMsg = new JLabel("Campos com \"*\" sao obrigatorios.");
		errorMsg.setBounds(45, 430, 420, 15);
		contentPane.add(errorMsg);
		errorMsg.setForeground(Color.red);
		
		//GeneralError2
		final JLabel errorMsg2 = new JLabel("Campos com \"(*)\" possuem formato esperado");
		errorMsg2.setBounds(45, 461, 420, 15);
		contentPane.add(errorMsg2);
		errorMsg2.setForeground(Color.magenta);

		//FirstNameError
		final JLabel errorMsg3 = new JLabel("");
		errorMsg3.setBounds(269, 60, 20, 15);
		contentPane.add(errorMsg3);
		errorMsg3.setForeground(Color.red);
		
		//LastNameError
		final JLabel errorMsg4 = new JLabel("");
		errorMsg4.setBounds(269, 91, 20, 15);
		contentPane.add(errorMsg4);
		errorMsg4.setForeground(Color.red);
		
		//BirthDateError
		final JLabel errorMsg5 = new JLabel("");
		errorMsg5.setBounds(337, 122, 20, 15);
		contentPane.add(errorMsg5);
		errorMsg5.setForeground(Color.red);
		
		//EmailError
		final JLabel errorMsg6 = new JLabel("");		
		errorMsg6.setBounds(252, 153, 20, 15);
		contentPane.add(errorMsg6);
		errorMsg6.setForeground(Color.red);
				
		//CPFError
		final JLabel errorMsg7 = new JLabel("");
		errorMsg7.setBounds(242, 184, 20, 15);
		contentPane.add(errorMsg7);
		errorMsg7.setForeground(Color.red);
				
		//PhoneError
		final JLabel errorMsg8 = new JLabel("");
		errorMsg8.setBounds(249, 215, 20, 15);
		contentPane.add(errorMsg8);
		errorMsg8.setForeground(Color.magenta);
				
		//CEPError
		final JLabel errorMsg9 = new JLabel("");
		errorMsg9.setBounds(225, 308, 20, 15);
		contentPane.add(errorMsg9);
		errorMsg9.setForeground(Color.red);

		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				//contentPane.setVisible(false);
				if(checkFinal()){
					
					if(textphone.getText().equalsIgnoreCase("+55XX(9)1234-5678"))
						textphone.setText("");
					
					if(textCEP.getText().equalsIgnoreCase("01234-567"))
						textCEP.setText("");
					
					errorMsg.setText("OK");
					errorMsg.setForeground(Color.green);
					
					errorMsg2.setText("OK");
					errorMsg2.setForeground(Color.green);
					
					print printForm = new print();
					printForm.titleLabel.setText((String) comboTitle.getSelectedItem());
					printForm.firstNameLabel.setText(textfirstName.getText());
					printForm.lastNameLabel.setText(textlastName.getText());
					printForm.wasBornLabel.setText(textwasBorn.getText());
					printForm.emailLabel.setText(textemail.getText());
					printForm.CPFLabel.setText(textCPF.getText());
					printForm.phoneLabel.setText(textphone.getText());
					printForm.address1Label.setText(textaddress1.getText());
					printForm.address2Label.setText(textaddress2.getText());
					printForm.CEPLabel.setText(textCEP.getText());
					printForm.cityLabel.setText(textcity.getText());
					printForm.stateLabel.setText(textstate.getText());
					printForm.countryLabel.setText(textcountry.getText());
					printForm.contentPane.setVisible(true);				
					printForm.show();
				}
				else{
					
					if((checkDate) && (checkCPF) && (checkPhone) && (checkCEP)){
						errorMsg2.setText("OK");
						errorMsg2.setForeground(Color.green);
						contentPane.updateUI();
						contentPane.repaint();
					}
					else{
						errorMsg2.setText("Campos com \"(*)\" possuem formato esperado");
						errorMsg2.setForeground(Color.magenta);
						contentPane.updateUI();
						contentPane.repaint();
					}
					
					if((checkFirst) && (checkLast) && (checkDate) && (checkEmail) && (checkCPF)){
						errorMsg.setText("OK");
						errorMsg.setForeground(Color.green);
						contentPane.updateUI();
						contentPane.repaint();
					}
					else{
						errorMsg.setText("Campos com \"*\" sao obrigatorios.");
						errorMsg.setForeground(Color.red);
						contentPane.updateUI();
						contentPane.repaint();
					}
					
					//FirstNameErrorStatus
					if(checkFirst){
						errorMsg3.setText("OK");
						errorMsg3.setForeground(Color.green);
						contentPane.updateUI();
						contentPane.repaint();
					}
					else if(!checkFirst){
						errorMsg3.setText("*");
						errorMsg3.setForeground(Color.red);
						contentPane.updateUI();
						contentPane.repaint();
					}
					
					//LastNameErrorStatus
					if(checkLast){
						errorMsg4.setText("OK");
						errorMsg4.setForeground(Color.green);
						contentPane.updateUI();
						contentPane.repaint();
					}
					else if(!checkLast){
						errorMsg4.setText("*");
						errorMsg4.setForeground(Color.red);
						contentPane.updateUI();
						contentPane.repaint();
					}
					
					//BirthDateErrorStatus
					if(checkDate){
						errorMsg5.setText("OK");
						errorMsg5.setForeground(Color.green);
						contentPane.updateUI();
						contentPane.repaint();
					}
					else if(!checkDate){
						errorMsg5.setText("*");
						errorMsg5.setForeground(Color.red);
						contentPane.updateUI();
						contentPane.repaint();
					}
					
					//EmailErrorStatus
					if(checkEmail){
						errorMsg6.setText("OK");
						errorMsg6.setForeground(Color.green);
						contentPane.updateUI();
						contentPane.repaint();
					}
					else if(!checkEmail){
						errorMsg6.setText("*");
						errorMsg6.setForeground(Color.red);
						contentPane.updateUI();
						contentPane.repaint();
					}
					
					//CPFErrorStatus
					if(checkCPF){
						errorMsg7.setText("OK");
						errorMsg7.setForeground(Color.green);
						contentPane.updateUI();
						contentPane.repaint();
					}
					else if(!checkCPF){
						errorMsg7.setText("*");
						errorMsg7.setForeground(Color.red);
						contentPane.updateUI();
						contentPane.repaint();
					}
					
					//PhoneErrorStatus
					if(checkPhone){
						errorMsg8.setText("OK");
						errorMsg8.setForeground(Color.green);
						contentPane.updateUI();
						contentPane.repaint();
					}
					else if(!checkPhone){
						errorMsg8.setText("(*)");
						errorMsg8.setForeground(Color.magenta);
						contentPane.updateUI();
						contentPane.repaint();
					}
					//CEPErrorStatus
					if(checkCEP){
						errorMsg9.setText("OK");
						errorMsg9.setForeground(Color.green);
						contentPane.updateUI();
						contentPane.repaint();
					}
					else if(!checkCEP){
						errorMsg9.setText("(*)");
						errorMsg9.setForeground(Color.magenta);
						contentPane.updateUI();
						contentPane.repaint();
					}
				}
			}
		});
		btnPrint.setBounds(163, 485, 74, 25);
		contentPane.add(btnPrint);
		
	}

	public void checkFirstNameField(String fNameInput) {
		boolean match = fNameInput.matches("[a-zA-Z]+");
		if(match) checkFirst = true;
		else if(!match) checkFirst = false;
	}
		
	public void checkLastNameField(String lNameInput) {
		boolean match = lNameInput.matches("[a-zA-Z]+");
		if(match) checkLast = true;
		else if(!match) checkLast= false;
	}
	
	public void checkDataField(String inputDate){
        boolean match = inputDate.matches("\\d{2}/{1}\\d{2}/{1}\\d{4}");
        if(match) checkDate = true;
        else if(!match) checkDate = false;
	}
	public void checkEmailField(String inputEmail){
        boolean match = inputEmail.matches("[a-zA-Z0-9_]+([.]+[a-zA-Z0-9_]+)*[@]{1}[a-zA-Z0-9]+[.]{1}[a-zA-Z]+");
        if(match) checkEmail = true;
        else if(!match) checkEmail = false;
	}
		  
	public void checkCPFField(String inCPF){  
		String cpf;
		
		boolean match;
		match = inCPF.matches("[0-9]{3}[.]{1}[0-9]{3}[.]{1}[0-9]{3}[-]{1}[0-9]{2}");
		if(!match) {
			checkCPF = false;
			return;
		}
		else if(match){
			String cpfGenerated = "";     
			cpf = inCPF;           
			cpf = removeChars(cpf);
			if ( checkInvalidSize(cpf) ){
				checkCPF = false;
				return;
			}
			if ( checkRepeatedDigits(cpf) ){
				checkCPF = false;
				return;
			}

			cpfGenerated = cpf.substring(0, 9);
			cpfGenerated = cpfGenerated.concat(checkCPF(cpfGenerated));
			cpfGenerated = cpfGenerated.concat(checkCPF(cpfGenerated));
			
			if ( !cpfGenerated.equals(cpf)){
				checkCPF = false;
				return;
			}
		}
			checkCPF = true;
			return;
		    
		 
	    
	}
   
	public String removeChars(String cpfToBuild){
		String aux;
		aux = cpfToBuild.replace("-","");
		aux = aux.replace(".","");
		return aux;
	} 
	private boolean checkInvalidSize(String cpf){  
		if ( cpf.length() != 11 )
			return true;   
		return false; /*if false, Size is VALID!*/
	} 
	private boolean checkRepeatedDigits(String cpf){   
		char firstDig = cpf.charAt(0);
		char [] charCpf = cpf.toCharArray();  
		for( char c: charCpf  )
			if ( c != firstDig )
				return false;        
        return true;
	} 
  
	private String checkCPF(String cpf){   
		int generatedDigit = 0;
		int mult = cpf.length()+1;
		char [] charCpf = cpf.toCharArray();
		for (int i = 0; i < cpf.length(); i++ )
			generatedDigit += (charCpf[i]-48)* mult--;
		if (generatedDigit % 11 < 2)
			generatedDigit = 0;
		else
			generatedDigit = 11 - generatedDigit % 11;
		return  String.valueOf(generatedDigit); 
	}


	public void checkPhoneField(String inputPhone){
		if (inputPhone.equalsIgnoreCase("+55XX(9)1234-5678") || inputPhone.isEmpty()) checkPhone = true;
		else {
			boolean match = inputPhone.matches("[+]{1}(([0-9]{9}[-]{1}[0-9]{4})|([0-9]{8}[-]{1}[0-9]{4})){1}");
			if(match) checkPhone = true;
			else if(!match) checkPhone = false;
		}
	}
	
	public void checkCEPField(String inCEP){
		if (inCEP.equalsIgnoreCase("01234-567") || inCEP.isEmpty()) checkCEP = true;
		else {
			boolean match = inCEP.matches("[0-9]{5}[-]{1}[0-9]{3}");
			if(match) checkCEP = true;
			else if (!match) checkCEP = false;
		}
	}
	
	
	public boolean checkFinal(){
        
        if((checkFirst) && (checkLast) && (checkDate) && (checkEmail) && (checkCPF) && (checkPhone) && (checkCEP))
        	FINAL = true;
        else FINAL = false;
        
        return FINAL;
	}
	
}
