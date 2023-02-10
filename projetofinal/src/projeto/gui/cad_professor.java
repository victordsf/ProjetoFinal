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
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;

public class cad_professor extends JFrame {

	private JPanel contentPane;
	private JTextField tfEspecializacao;
	private JTextField tfArea;
	private JTextField tfExpertise;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cad_professor frame = new cad_professor();
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
	public cad_professor() {
		MaskFormatter mascaraCpf = null;
		
		try{
            mascaraCpf = new MaskFormatter("###.###.###-##");
           
           
            mascaraCpf.setPlaceholderCharacter('_');
            
    
     }
		catch(ParseException excp) {
            System.err.println("Erro na formatação: " + excp.getMessage());
            System.exit(-1);
     }
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 396, 286);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastros = new JLabel("Cadastro de Professores");
		lblCadastros.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCadastros.setBounds(118, 11, 179, 14);
		contentPane.add(lblCadastros);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(30, 50, 46, 14);
		contentPane.add(lblCpf);
		
		JLabel lblArea = new JLabel("Área de Atuação");
		lblArea.setBounds(10, 123, 103, 14);
		contentPane.add(lblArea);
		
		JLabel lblEspecializacao = new JLabel("Especialização");
		lblEspecializacao.setBounds(10, 87, 92, 14);
		contentPane.add(lblEspecializacao);
		
		JLabel lblExpertise = new JLabel("Expertise");
		lblExpertise.setBounds(10, 157, 66, 14);
		contentPane.add(lblExpertise);
		
		JFormattedTextField tfCpf = new JFormattedTextField(mascaraCpf);
		tfCpf.setBounds(112, 47, 115, 20);
		contentPane.add(tfCpf);
		
		tfEspecializacao = new JTextField();
		tfEspecializacao.setBounds(112, 84, 258, 20);
		contentPane.add(tfEspecializacao);
		tfEspecializacao.setColumns(10);
		
		tfArea = new JTextField();
		tfArea.setBounds(112, 120, 258, 20);
		contentPane.add(tfArea);
		tfArea.setColumns(10);
		
		tfExpertise = new JTextField();
		tfExpertise.setBounds(112, 154, 258, 20);
		contentPane.add(tfExpertise);
		tfExpertise.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrar cadastro = new cadastrar();
				
				String cpf,area,especializacao,expertise;
				
				cpf = tfCpf.getText();
				area= tfArea.getText();
				especializacao = tfEspecializacao.getText();
				expertise = tfExpertise.getText();
				
				cadastro.CadastroProfessores(cpf, area, especializacao, expertise);
				
				tfCpf.setText("");
				tfArea.setText("");
				tfEspecializacao.setText("");
				tfExpertise.setText("");
			
			}
		});
		btnCadastrar.setBounds(24, 213, 103, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atualizar atualizar = new atualizar();
				
				String cpf,area,especializacao,expertise;
				
				cpf = tfCpf.getText();
				area= tfArea.getText();
				especializacao = tfEspecializacao.getText();
				expertise = tfExpertise.getText();
				
				atualizar.atualizarProfessor(cpf, area, especializacao, expertise);
				
				tfCpf.setText("");
				tfArea.setText("");
				tfEspecializacao.setText("");
				tfExpertise.setText("");
			}
		});
		btnAtualizar.setBounds(158, 213, 89, 23);
		contentPane.add(btnAtualizar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Excluir excluir = new Excluir();
				
				String cpf;
				
				cpf = tfCpf.getText();
				
				excluir.excluirProfessor(cpf);
				
				tfCpf.setText("");
				tfArea.setText("");
				tfEspecializacao.setText("");
				tfExpertise.setText("");
			}
		});
		btnExcluir.setBounds(281, 213, 89, 23);
		contentPane.add(btnExcluir);
	}

}
