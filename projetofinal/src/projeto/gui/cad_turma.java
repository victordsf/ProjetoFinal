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
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;

public class cad_turma extends JFrame {

	private JPanel contentPane;
	private JTextField tfCod;
	private JTextField tfTurno;
	private JTextField tfCurso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cad_turma frame = new cad_turma();
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
	public cad_turma() {
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
		setBounds(100, 100, 282, 326);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastors = new JLabel("Cadastro de Turmas");
		lblCadastors.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCadastors.setBounds(66, 11, 160, 14);
		contentPane.add(lblCadastors);
		
		JLabel lblCod = new JLabel("COD Turma");
		lblCod.setBounds(10, 48, 80, 14);
		contentPane.add(lblCod);
		
		JLabel lblCurso = new JLabel("COD Curso");
		lblCurso.setBounds(10, 87, 70, 14);
		contentPane.add(lblCurso);
		
		JLabel lblTurno = new JLabel("Turno");
		lblTurno.setBounds(146, 48, 46, 14);
		contentPane.add(lblTurno);
		
		JLabel lblDatai = new JLabel("Data Início");
		lblDatai.setBounds(10, 125, 70, 14);
		contentPane.add(lblDatai);
		
		JLabel lblCpf = new JLabel("CPF do Professor");
		lblCpf.setBounds(10, 203, 106, 14);
		contentPane.add(lblCpf);
		
		JLabel lblDatat = new JLabel("Data Término");
		lblDatat.setBounds(10, 167, 92, 14);
		contentPane.add(lblDatat);
		
		tfCod = new JTextField();
		tfCod.setBounds(86, 45, 50, 20);
		contentPane.add(tfCod);
		tfCod.setColumns(10);
		
		tfTurno = new JTextField();
		tfTurno.setBounds(187, 45, 69, 20);
		contentPane.add(tfTurno);
		tfTurno.setColumns(10);
		
		JFormattedTextField tfDatai = new JFormattedTextField(mascaraData);
		tfDatai.setBounds(123, 122, 133, 20);
		contentPane.add(tfDatai);
		
		JFormattedTextField tfDatat = new JFormattedTextField(mascaraData);
		tfDatat.setBounds(123, 164, 133, 20);
		contentPane.add(tfDatat);
		
		tfCurso = new JTextField();
		tfCurso.setBounds(86, 84, 170, 20);
		contentPane.add(tfCurso);
		tfCurso.setColumns(10);
		
		JFormattedTextField tfCpf = new JFormattedTextField(mascaraCpf);
		tfCpf.setBounds(123, 200, 133, 20);
		contentPane.add(tfCpf);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrar cadastrar = new cadastrar();
				
				String curso, turno, datai, datat, cpf;
				
				curso = tfCurso.getText();
				turno = tfTurno.getText();
				datai = tfDatai.getText();
				datat = tfDatat.getText();
				cpf = tfCpf.getText();
				
				cadastrar.CadastroTurma(curso, turno, datai, datat, cpf);
				
				tfCurso.setText("");
				tfTurno.setText("");
				tfDatai.setText("");
				tfDatat.setText("");
				tfCpf.setText("");
				
			}
		});
		btnCadastrar.setBounds(29, 253, 107, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Excluir excluir = new Excluir ();
				
				int cod;
				
				cod = Integer.parseInt(tfCod.getText());
				
				excluir.excluirTurma(cod);
				
				tfCod.setText("");
				tfCurso.setText("");
				tfTurno.setText("");
				tfDatai.setText("");
				tfDatat.setText("");
				tfCpf.setText("");

				
			}
		});
		btnExcluir.setBounds(155, 253, 89, 23);
		contentPane.add(btnExcluir);
	}
}
