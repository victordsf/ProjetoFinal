package projeto.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import projeto.db.Excluir;
import projeto.db.cadastrar;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cad_aluno_turma extends JFrame {

	private JPanel contentPane;
	private JTextField tfCod;
	private JTextField tfRegistro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cad_aluno_turma frame = new cad_aluno_turma();
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
	public cad_aluno_turma() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 222, 283);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastros = new JLabel("Cadastrar Aluno em Turma");
		lblCadastros.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCadastros.setBounds(23, 11, 189, 14);
		contentPane.add(lblCadastros);
		
		JLabel lblCod = new JLabel("COD da Turma");
		lblCod.setBounds(50, 48, 86, 14);
		contentPane.add(lblCod);
		
		JLabel lblRegistro = new JLabel("Registro do Aluno");
		lblRegistro.setBounds(50, 104, 105, 14);
		contentPane.add(lblRegistro);
		
		tfCod = new JTextField();
		tfCod.setBounds(50, 73, 86, 20);
		contentPane.add(tfCod);
		tfCod.setColumns(10);
		
		tfRegistro = new JTextField();
		tfRegistro.setBounds(51, 134, 86, 20);
		contentPane.add(tfRegistro);
		tfRegistro.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cadastrar cadastrar = new cadastrar();
				
				int registro, cod_turma;
				
				registro = Integer.parseInt(tfRegistro.getText());
				cod_turma = Integer.parseInt(tfCod.getText());
				
				cadastrar.CadastroTurmaAux(cod_turma, registro);
				
				tfRegistro.setText("");
				tfCod.setText("");
			}
		});
		btnCadastrar.setBounds(50, 176, 99, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Excluir excluir = new Excluir();
				
				int registro;
				
				registro = Integer.parseInt(tfRegistro.getText());
				
				excluir.excluirAlunoTurma(registro);
				
				tfRegistro.setText("");
				tfCod.setText("");
				
				
			}
		});
		btnExcluir.setBounds(50, 210, 99, 23);
		contentPane.add(btnExcluir);
	}

}
