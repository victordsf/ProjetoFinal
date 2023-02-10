package projeto.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import projeto.db.atualizar;
import projeto.db.cadastrar;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;

public class cad_colaborador extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfEndereco;
	private JTextField tfCargo;
	private JTextField tfEmail;
	private JTextField tfEscolaridade;
	private final ButtonGroup rbSexo = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cad_colaborador frame = new cad_colaborador();
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
	public cad_colaborador() {
		MaskFormatter mascaraTel = null;
		MaskFormatter mascaraData = null;
		MaskFormatter mascaraCpf = null;
		MaskFormatter mascaraRg = null;
		
		try{
            mascaraTel = new MaskFormatter("(##)#####-####");
            mascaraData = new MaskFormatter("##/##/####");
            mascaraCpf = new MaskFormatter("###.###.###-##");
            mascaraRg = new MaskFormatter("##.###.###");
            
            mascaraTel.setPlaceholderCharacter('_');
            mascaraData.setPlaceholderCharacter('_');
            mascaraCpf.setPlaceholderCharacter('_');
            mascaraRg.setPlaceholderCharacter('_');
    
     }
		catch(ParseException excp) {
            System.err.println("Erro na formatação: " + excp.getMessage());
            System.exit(-1);
     }
		
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 406, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastro = new JLabel("Cadastro de Colaboradores");
		lblCadastro.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCadastro.setBounds(126, 11, 193, 14);
		contentPane.add(lblCadastro);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(10, 62, 46, 14);
		contentPane.add(lblCpf);
		
		JLabel lblRg = new JLabel("RG");
		lblRg.setBounds(232, 62, 46, 14);
		contentPane.add(lblRg);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 138, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblData = new JLabel("Data Nascimento");
		lblData.setBounds(184, 103, 110, 14);
		contentPane.add(lblData);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(10, 219, 46, 14);
		contentPane.add(lblSexo);
		
		JRadioButton rbMasculino = new JRadioButton("Masculino");
		rbSexo.add(rbMasculino);
		rbMasculino.setBounds(58, 215, 85, 23);
		contentPane.add(rbMasculino);
		
		JRadioButton rbFeminino = new JRadioButton("Feminino");
		rbSexo.add(rbFeminino);
		rbFeminino.setBounds(145, 215, 85, 23);
		contentPane.add(rbFeminino);
		
		JRadioButton rbPni = new JRadioButton("Prefiro Não Informar");
		rbSexo.add(rbPni);
		rbPni.setBounds(232, 215, 151, 23);
		contentPane.add(rbPni);
		
		JFormattedTextField tfRg = new JFormattedTextField(mascaraRg);
		tfRg.setBounds(288, 59, 92, 20);
		contentPane.add(tfRg);
		
		JFormattedTextField tfData = new JFormattedTextField(mascaraData);
		tfData.setBounds(288, 100, 92, 20);
		contentPane.add(tfData);
		
		JFormattedTextField tfCpf = new JFormattedTextField(mascaraCpf);
		tfCpf.setBounds(66, 59, 110, 20);
		contentPane.add(tfCpf);
		
		JLabel lblEndereco = new JLabel("Endereço");
		lblEndereco.setBounds(10, 175, 60, 14);
		contentPane.add(lblEndereco);
		
		tfNome = new JTextField();
		tfNome.setBounds(76, 135, 304, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfEndereco = new JTextField();
		tfEndereco.setBounds(76, 172, 304, 20);
		contentPane.add(tfEndereco);
		tfEndereco.setColumns(10);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setBounds(10, 103, 46, 14);
		contentPane.add(lblCargo);
		
		tfCargo = new JTextField();
		tfCargo.setBounds(66, 100, 108, 20);
		contentPane.add(tfCargo);
		tfCargo.setColumns(10);
		
		JLabel lblEscolaridade = new JLabel("Escolaridade");
		lblEscolaridade.setBounds(10, 301, 85, 14);
		contentPane.add(lblEscolaridade);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(93, 260, 290, 20);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(10, 341, 60, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(10, 263, 46, 14);
		contentPane.add(lblEmail);
		
		tfEscolaridade = new JTextField();
		tfEscolaridade.setBounds(93, 298, 290, 20);
		contentPane.add(tfEscolaridade);
		tfEscolaridade.setColumns(10);
		
		JFormattedTextField tfTelefone = new JFormattedTextField(mascaraTel);
		tfTelefone.setBounds(93, 338, 110, 20);
		contentPane.add(tfTelefone);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrar cadastro = new cadastrar();
				
				String cpf,rg,nome,data,sexo="",endereco,escolaridade,telefone,email;
				int cargo;
				
				cpf = tfCpf.getText();
				rg = tfRg.getText();
				nome = tfNome.getText();
				data = tfData.getText();
				endereco = tfEndereco.getText();
				escolaridade = tfEscolaridade.getText();
				telefone = tfTelefone.getText();
				email = tfEmail.getText();
				cargo = Integer.parseInt(tfCargo.getText());
				
				if (rbMasculino.isSelected()) {
					sexo = "Masculino";
				}
				if (rbFeminino.isSelected()) {
					sexo = "Feminino";
				}
				if (rbPni.isSelected()) {
					sexo = "Prefiro Não Informar";
				}
				
				cadastro.CadastroColaboradores(cpf, rg, nome, data, sexo, endereco, escolaridade, cargo, telefone, email);
				
				tfCpf.setText("");
				tfRg.setText("");
				tfNome.setText("");
				tfData.setText("");
				tfEndereco.setText("");
				tfEscolaridade.setText("");
				tfTelefone.setText("");
				tfEmail.setText("");
				tfCargo.setText("");
			}
		});
		btnCadastrar.setBounds(51, 387, 100, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				atualizar Atualizar = new atualizar();
				
				String cpf,rg,nome,data,sexo="",endereco,escolaridade,telefone,email;
				int cargo;
				
				cpf = tfCpf.getText();
				rg = tfRg.getText();
				nome = tfNome.getText();
				data = tfData.getText();
				endereco = tfEndereco.getText();
				escolaridade = tfEscolaridade.getText();
				telefone = tfTelefone.getText();
				email = tfEmail.getText();
				cargo = Integer.parseInt(tfCargo.getText());
				
				if (rbMasculino.isSelected()) {
					sexo = "Masculino";
				}
				if (rbFeminino.isSelected()) {
					sexo = "Feminino";
				}
				if (rbPni.isSelected()) {
					sexo = "Prefiro Não Informar";
				}

				Atualizar.atualizarColaboradores(cpf, rg, nome, data, sexo, endereco, escolaridade, cargo, telefone, email);
				
				tfCpf.setText("");
				tfRg.setText("");
				tfNome.setText("");
				tfData.setText("");
				tfEndereco.setText("");
				tfEscolaridade.setText("");
				tfTelefone.setText("");
				tfEmail.setText("");
				tfCargo.setText("");
			}
		});
		btnAtualizar.setBounds(232, 387, 89, 23);
		contentPane.add(btnAtualizar);
	}
}
