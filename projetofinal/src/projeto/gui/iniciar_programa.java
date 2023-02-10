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

public class iniciar_programa extends JFrame {

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
					iniciar_programa frame = new iniciar_programa();
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
	public iniciar_programa() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 182, 307);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login ");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLogin.setBounds(63, 11, 79, 14);
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
		
		
		JButton btnLogin = new JButton("Fazer Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login login = new login();
				
				String usuario, senha;
				
				usuario = tfUsuario.getText();
				senha = tfSenha.getText();
				
				login.fazerLogin(usuario, senha);
				
				tfUsuario.setText("");
				tfSenha.setText("");
				
				dispose();
			}
		});
		btnLogin.setBounds(37, 208, 99, 23);
		contentPane.add(btnLogin);
		
	}
}
