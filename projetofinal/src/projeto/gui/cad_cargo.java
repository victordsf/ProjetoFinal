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
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class cad_cargo extends JFrame {

	private JPanel contentPane;
	private JTextField tfSalario;
	private JTextField tfDescricao;
	private JTextField tfTitulo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cad_cargo frame = new cad_cargo();
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
	public cad_cargo() {
		MaskFormatter mascaraReg= null;
		
		try{
            mascaraReg = new MaskFormatter("###");
            
    
     }
		catch(ParseException excp) {
            System.err.println("Erro na formatação: " + excp.getMessage());
            System.exit(-1);
     }
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 416, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastro = new JLabel("Cadastro de Cargos");
		lblCadastro.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCadastro.setBounds(154, 11, 147, 14);
		contentPane.add(lblCadastro);
		
		JLabel lblTitulo = new JLabel("Título");
		lblTitulo.setBounds(10, 53, 46, 14);
		contentPane.add(lblTitulo);
		
		JLabel lblDescricao = new JLabel("Descrição");
		lblDescricao.setBounds(10, 97, 62, 14);
		contentPane.add(lblDescricao);
		
		JLabel lblSalario = new JLabel("Salario");
		lblSalario.setBounds(10, 138, 46, 14);
		contentPane.add(lblSalario);
		
		tfSalario = new JTextField();
		tfSalario.setBounds(77, 135, 108, 20);
		contentPane.add(tfSalario);
		tfSalario.setColumns(10);
		
		tfDescricao = new JTextField();
		tfDescricao.setBounds(77, 94, 309, 20);
		contentPane.add(tfDescricao);
		tfDescricao.setColumns(10);
		
		tfTitulo = new JTextField();
		tfTitulo.setBounds(77, 50, 161, 20);
		contentPane.add(tfTitulo);
		tfTitulo.setColumns(10);
		
		JFormattedTextField tfCod = new JFormattedTextField(mascaraReg);
		tfCod.setBounds(300, 50, 86, 20);
		contentPane.add(tfCod);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrar Cadastro = new cadastrar();
				
				String titulo, descricao;
				double salario;
				
				titulo = tfTitulo.getText();
				descricao = tfDescricao.getText();
				salario = Double.parseDouble(tfSalario.getText());
				
				Cadastro.CadastroCargo(titulo, descricao, salario);
				
				tfTitulo.setText("");
				tfDescricao.setText("");
				tfSalario.setText("");
				tfCod.setText("");
			}
		});
		btnCadastrar.setBounds(20, 197, 100, 23);
		contentPane.add(btnCadastrar);
		
		JLabel lblCod = new JLabel("COD");
		lblCod.setBounds(255, 53, 46, 14);
		contentPane.add(lblCod);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atualizar Atualizar = new atualizar();
				
				int cod_cargo;
				String titulo, descricao;
				double salario;
				
				cod_cargo = Integer.parseInt(tfCod.getText());
				titulo = tfTitulo.getText();
				descricao = tfDescricao.getText();
				salario = Double.parseDouble(tfSalario.getText());
				
				Atualizar.atualizarCargo(titulo, descricao, salario, cod_cargo );
		
				tfTitulo.setText("");
				tfDescricao.setText("");
				tfSalario.setText("");
				tfCod.setText("");
			}
		});
		btnAtualizar.setBounds(154, 197, 89, 23);
		contentPane.add(btnAtualizar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Excluir excluir = new Excluir();
				
				int cod_cargo;
				
				cod_cargo = Integer.parseInt(tfCod.getText());
				
				excluir.excluirCargo(cod_cargo);
				
				tfTitulo.setText("");
				tfDescricao.setText("");
				tfSalario.setText("");
				tfCod.setText("");
			}
		});
		btnExcluir.setBounds(284, 197, 89, 23);
		contentPane.add(btnExcluir);
		
		
	}
}
