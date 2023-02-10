package projeto.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import projeto.db.Excluir;
import projeto.db.atualizar;
import projeto.db.cadastrar;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;

public class cad_aluno extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup bgSexo = new ButtonGroup();
	private JTextField tfNome;
	private JTextField tfEndereco;
	private JTextField tfEscolaridade;
	private JTextField tfPai;
	private JTextField tfMae;
	private JTextField tfEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cad_aluno frame = new cad_aluno();
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
	public cad_aluno() {
		MaskFormatter mascaraTel = null;
		MaskFormatter mascaraData = null;
		MaskFormatter mascaraCpf = null;
		MaskFormatter mascaraRg = null;
		MaskFormatter mascaraReg= null;
		
		try{
            mascaraTel = new MaskFormatter("(##)#####-####");
            mascaraData = new MaskFormatter("##/##/####");
            mascaraCpf = new MaskFormatter("###.###.###-##");
            mascaraRg = new MaskFormatter("##.###.###");
            mascaraReg = new MaskFormatter("#####");
            
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
		setBounds(100, 100, 429, 556);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastro = new JLabel("Cadastro de Aluno");
		lblCadastro.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCadastro.setBounds(150, 11, 158, 14);
		contentPane.add(lblCadastro);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(23, 64, 46, 14);
		contentPane.add(lblCpf);
		
		JFormattedTextField tfCpf = new JFormattedTextField(mascaraCpf);
		tfCpf.setBounds(67, 61, 121, 20);
		contentPane.add(tfCpf);
		
		JLabel lblRg = new JLabel("RG");
		lblRg.setBounds(23, 104, 33, 14);
		contentPane.add(lblRg);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(23, 138, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblData = new JLabel("Data Nascimento");
		lblData.setBounds(198, 104, 97, 14);
		contentPane.add(lblData);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(23, 180, 46, 14);
		contentPane.add(lblSexo);
		
		JRadioButton rbMasculino = new JRadioButton("Masculino");
		bgSexo.add(rbMasculino);
		rbMasculino.setBounds(67, 176, 88, 23);
		contentPane.add(rbMasculino);
		
		JRadioButton rbFeminino = new JRadioButton("Feminino");
		bgSexo.add(rbFeminino);
		rbFeminino.setBounds(169, 176, 88, 23);
		contentPane.add(rbFeminino);
		
		JRadioButton rbPni = new JRadioButton("Prefiro Não Informar");
		bgSexo.add(rbPni);
		rbPni.setBounds(259, 176, 149, 23);
		contentPane.add(rbPni);
		
		JLabel lblEndereco = new JLabel("Endereço");
		lblEndereco.setBounds(10, 227, 59, 14);
		contentPane.add(lblEndereco);
		
		JLabel lblEscolaridade = new JLabel("Escolaridade");
		lblEscolaridade.setBounds(10, 265, 76, 14);
		contentPane.add(lblEscolaridade);
		
		JLabel lblNome_pai = new JLabel("Nome do Pai");
		lblNome_pai.setBounds(10, 303, 76, 14);
		contentPane.add(lblNome_pai);
		
		JLabel lblNome_mae = new JLabel("Nome da Mãe");
		lblNome_mae.setBounds(10, 340, 82, 14);
		contentPane.add(lblNome_mae);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(10, 414, 70, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblRegistro = new JLabel("Registro");
		lblRegistro.setBounds(198, 64, 59, 14);
		contentPane.add(lblRegistro);
		
		JFormattedTextField tfRg = new JFormattedTextField(mascaraRg);
		tfRg.setBounds(67, 101, 118, 20);
		contentPane.add(tfRg);
		
		JFormattedTextField tfData = new JFormattedTextField(mascaraData);
		tfData.setBounds(305, 101, 96, 20);
		contentPane.add(tfData);
		
		tfNome = new JTextField();
		tfNome.setBounds(67, 135, 334, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfEndereco = new JTextField();
		tfEndereco.setBounds(103, 224, 298, 20);
		contentPane.add(tfEndereco);
		tfEndereco.setColumns(10);
		
		tfEscolaridade = new JTextField();
		tfEscolaridade.setBounds(103, 262, 298, 20);
		contentPane.add(tfEscolaridade);
		tfEscolaridade.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(10, 379, 46, 14);
		contentPane.add(lblEmail);
		
		JFormattedTextField tfRegistro = new JFormattedTextField(mascaraReg);
		tfRegistro.setBounds(304, 61, 97, 20);
		contentPane.add(tfRegistro);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(103, 376, 298, 20);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
		
		tfPai = new JTextField();
		tfPai.setBounds(103, 300, 298, 20);
		contentPane.add(tfPai);
		tfPai.setColumns(10);
		
		tfMae = new JTextField();
		tfMae.setBounds(103, 337, 298, 20);
		contentPane.add(tfMae);
		tfMae.setColumns(10);
		
		JFormattedTextField tfTelefone = new JFormattedTextField(mascaraTel);
		tfTelefone.setBounds(103, 411, 108, 20);
		contentPane.add(tfTelefone);
		
		JButton btnCadastar = new JButton("Cadastrar");
		btnCadastar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrar cadastro = new cadastrar();
				
				String cpf, rg, data, nome, sexo="", endereco, escolaridade, nome_mae, nome_pai, telefone, email;
				
			
				cpf = tfCpf.getText();
				rg = tfRg.getText();
				nome = tfNome.getText();
				data = tfData.getText();
				endereco = tfEndereco.getText();
				escolaridade = tfEscolaridade.getText();
				nome_pai = tfPai.getText();
				nome_mae = tfMae.getText();
				telefone = tfTelefone.getText();
				email = tfEmail.getText();
				
				
				if (rbMasculino.isSelected()) {
					sexo = "Masculino";
				}
				if (rbFeminino.isSelected()) {
					sexo = "Feminino";
				}
				if (rbPni.isSelected()) {
					sexo = "Prefiro Não Informar";
				}
				
				cadastro.CadastroAluno(cpf, rg, nome, data, sexo, endereco, escolaridade, nome_mae, nome_pai, telefone, email);
				
				tfCpf.setText("");
				tfRg.setText("");
				tfNome.setText("");
				tfData.setText("");
				tfEndereco.setText("");
				tfEscolaridade.setText("");
				tfPai.setText("");
				tfMae.setText("");
				tfTelefone.setText("");
				tfEmail.setText("");
			}
		});
		btnCadastar.setBounds(80, 452, 108, 23);
		contentPane.add(btnCadastar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				atualizar Atualizar = new atualizar();
				
				String rg, data, nome, sexo="", endereco, escolaridade, nome_mae, nome_pai, telefone, email;
				
				int registro;
				
				registro = Integer.parseInt(tfRegistro.getText());
				rg = tfRg.getText();
				nome = tfNome.getText();
				data = tfData.getText();
				endereco = tfEndereco.getText();
				escolaridade = tfEscolaridade.getText();
				nome_pai = tfPai.getText();
				nome_mae = tfMae.getText();
				telefone = tfTelefone.getText();
				email = tfEmail.getText();
				
				
				if (rbMasculino.isSelected()) {
					sexo = "Masculino";
				}
				if (rbFeminino.isSelected()) {
					sexo = "Feminino";
				}
				if (rbPni.isSelected()) {
					sexo = "Prefiro Não Informar";
				}
				
				Atualizar.atualizarAluno(registro, rg, nome, data, sexo, endereco, escolaridade, nome_mae, nome_pai, telefone, email);
				
				tfRegistro.setText("");
				tfCpf.setText("");
				tfRg.setText("");
				tfNome.setText("");
				tfData.setText("");
				tfEndereco.setText("");
				tfEscolaridade.setText("");
				tfPai.setText("");
				tfMae.setText("");
				tfTelefone.setText("");
				tfEmail.setText("");
				tfRegistro.setText("");
			}
		});
		btnAtualizar.setBounds(294, 414, 89, 23);
		contentPane.add(btnAtualizar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Excluir excluir = new Excluir();
				
				int registro;
				
				registro = Integer.parseInt(tfRegistro.getText());
				
				excluir.excluirAluno(registro);
				
				tfRegistro.setText("");
			}
		});
		btnExcluir.setBounds(294, 463, 89, 23);
		contentPane.add(btnExcluir);
		

	

	}
}
