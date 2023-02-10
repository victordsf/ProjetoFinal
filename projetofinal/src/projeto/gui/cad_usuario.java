package projeto.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import projeto.db.cadastrar;
import projeto.db.login;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class cad_usuario extends JFrame {

	private JPanel contentPane;
	private JTextField tfUsuario;
	private JPasswordField tfSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cad_usuario frame = new cad_usuario();
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
	public cad_usuario() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 191, 291);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Cadastro");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLogin.setBounds(55, 11, 99, 14);
		contentPane.add(lblLogin);
		
		JLabel lblUsuario = new JLabel("Usuário");
		lblUsuario.setBounds(24, 68, 57, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(24, 121, 57, 14);
		contentPane.add(lblSenha);
		
		tfSenha = new JPasswordField();
		tfSenha.setBounds(24, 149, 118, 20);
		contentPane.add(tfSenha);
		
		tfUsuario = new JTextField();
		tfUsuario.setBounds(24, 90, 118, 20);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrar cadastrar = new cadastrar();
				
				String usuario, senha;
				
				usuario = tfUsuario.getText();
				senha = tfSenha.getText();
				
				cadastrar.CadastroUsuario(usuario, senha);
				
				tfUsuario.setText("");
				tfSenha.setText("");
				
			}
		});
		btnCadastrar.setBounds(34, 200, 99, 23);
		contentPane.add(btnCadastrar);
		
		
	}
}
