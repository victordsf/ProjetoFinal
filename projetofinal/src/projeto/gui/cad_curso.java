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
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class cad_curso extends JFrame {

	private JPanel contentPane;
	private JTextField tfDescricao;
	private JTextField tfArea;
	private final ButtonGroup bgNivel = new ButtonGroup();
	private JTextField tfTitulo;
	private JTextField tfConteudo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cad_curso frame = new cad_curso();
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
	public cad_curso() {
		MaskFormatter mascaraReg= null;
		//MaskFormatter mascaraCargaH = null;
		
		try{
            mascaraReg = new MaskFormatter("####");
           //mascaraCargaH = new MaskFormatter("#########");
            
    
     }
		catch(ParseException excp) {
            System.err.println("Erro na formatação: " + excp.getMessage());
            System.exit(-1);
     }
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastros = new JLabel("Cadastro de Cursos");
		lblCadastros.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCadastros.setBounds(158, 11, 146, 14);
		contentPane.add(lblCadastros);
		
		JLabel lblCod = new JLabel("COD");
		lblCod.setBounds(10, 57, 46, 14);
		contentPane.add(lblCod);
		
		JLabel lblTitulo = new JLabel("Título do Curso");
		lblTitulo.setBounds(10, 92, 98, 14);
		contentPane.add(lblTitulo);
		
		JLabel lblDescricao = new JLabel("Descrição");
		lblDescricao.setBounds(10, 125, 61, 14);
		contentPane.add(lblDescricao);
		
		JLabel lblArea = new JLabel("Área Tecnologica");
		lblArea.setBounds(10, 160, 109, 14);
		contentPane.add(lblArea);
		
		JLabel lblCargah = new JLabel("Carga Horária");
		lblCargah.setBounds(174, 57, 82, 14);
		contentPane.add(lblCargah);
		
		JLabel lblNivel = new JLabel("Nível");
		lblNivel.setBounds(10, 196, 46, 14);
		contentPane.add(lblNivel);
		
		tfConteudo = new JTextField();
		tfConteudo.setBounds(118, 222, 306, 20);
		contentPane.add(tfConteudo);
		tfConteudo.setColumns(10);
		
		JLabel lblConteudo = new JLabel("Conteúdo");
		lblConteudo.setBounds(10, 225, 69, 14);
		contentPane.add(lblConteudo);
		
		tfTitulo = new JTextField();
		tfTitulo.setBounds(118, 89, 306, 20);
		contentPane.add(tfTitulo);
		tfTitulo.setColumns(10);
		
		tfDescricao = new JTextField();
		tfDescricao.setBounds(118, 122, 306, 20);
		contentPane.add(tfDescricao);
		tfDescricao.setColumns(10);
		
		tfArea = new JTextField();
		tfArea.setBounds(118, 157, 306, 20);
		contentPane.add(tfArea);
		tfArea.setColumns(10);
		
		JLabel lblHoras = new JLabel("Horas");
		lblHoras.setBounds(378, 57, 46, 14);
		contentPane.add(lblHoras);
		
		JRadioButton rbAperfeicoamento = new JRadioButton("Aperfeiçoamento");
		bgNivel.add(rbAperfeicoamento);
		rbAperfeicoamento.setBounds(86, 192, 133, 23);
		contentPane.add(rbAperfeicoamento);
		
		JRadioButton rbQualificacao = new JRadioButton("Qualificação");
		bgNivel.add(rbQualificacao);
		rbQualificacao.setBounds(221, 192, 98, 23);
		contentPane.add(rbQualificacao);
		
		JRadioButton rbTecnico = new JRadioButton("Técnico");
		bgNivel.add(rbTecnico);
		rbTecnico.setBounds(338, 192, 86, 23);
		contentPane.add(rbTecnico);
		
		JFormattedTextField tfCod = new JFormattedTextField(mascaraReg);
		tfCod.setBounds(64, 54, 86, 20);
		contentPane.add(tfCod);
		
		JFormattedTextField tfCarga = new JFormattedTextField();
		tfCarga.setBounds(266, 54, 86, 20);
		contentPane.add(tfCarga);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrar cadastrar = new cadastrar();
				
				String titulo, descricao, area, carga,conteudo, nivel="";
				
				
				
				titulo = tfTitulo.getText();
				descricao = tfDescricao.getText();
				area = tfArea.getText();
				carga = tfCarga.getText();
				conteudo = tfConteudo.getText();
		
				if (rbAperfeicoamento.isSelected()) {
					nivel = "Aperfeiçoamento";
				}
				if (rbQualificacao.isSelected()) {
					nivel = "Qualificação";
				}
				if (rbTecnico.isSelected()) {
					nivel = "Técnico";
				}
				
				cadastrar.CadastroCurso(titulo, descricao, area, carga, conteudo, nivel);
				
				tfTitulo.setText("");
				tfCod.setText("");
				tfDescricao.setText("");
				tfArea.setText("");
				tfCarga.setText("");
				tfConteudo.setText("");
				
			}
		});
		btnCadastrar.setBounds(34, 267, 103, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atualizar atualizar = new atualizar();
				
				String titulo, descricao, area, carga, conteudo, nivel="";
				int cod;
			
				
				cod = Integer.parseInt(tfCod.getText());
				titulo = tfTitulo.getText();
				descricao = tfDescricao.getText();
				area = tfArea.getText();
				carga = tfCarga.getText();
				conteudo = tfConteudo.getText();
		
				if (rbAperfeicoamento.isSelected()) {
					nivel = "Aperfeiçoamento";
				}
				if (rbQualificacao.isSelected()) {
					nivel = "Qualificação";
				}
				if (rbTecnico.isSelected()) {
					nivel = "Técnico";
				}
				
				atualizar.atualizarCurso(cod, titulo, descricao, area, carga, conteudo, nivel);
				
				tfTitulo.setText("");
				tfCod.setText("");
				tfDescricao.setText("");
				tfArea.setText("");
				tfCarga.setText("");
				tfConteudo.setText("");
			}
		});
		btnAtualizar.setBounds(184, 267, 89, 23);
		contentPane.add(btnAtualizar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Excluir excluir = new Excluir();
				
				int cod;
				
				cod = Integer.parseInt(tfCod.getText());
				
				excluir.excluirCurso(cod);
				
				tfCod.setText("");
				tfTitulo.setText("");
				tfCod.setText("");
				tfDescricao.setText("");
				tfArea.setText("");
				tfCarga.setText("");
				tfConteudo.setText("");
			}
		});
		btnExcluir.setBounds(317, 267, 89, 23);
		contentPane.add(btnExcluir);
		
			
	}

}
