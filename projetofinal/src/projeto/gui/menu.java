package projeto.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
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
	public menu() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 508, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenu = new JLabel("Menu Inicial");
		lblMenu.setBounds(198, 11, 103, 14);
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblMenu);
		
		JLabel lblInformar = new JLabel("Informe Qual Sistema Deseja Utilizar");
		lblInformar.setBounds(144, 38, 209, 14);
		lblInformar.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblInformar);
		
		JLabel lblCad_aluno = new JLabel("Cadastro de Aluno");
		lblCad_aluno.setBounds(10, 78, 115, 14);
		contentPane.add(lblCad_aluno);
		
		JLabel lblCad_cargo = new JLabel("Cadastro de Cargo");
		lblCad_cargo.setBounds(353, 78, 109, 14);
		contentPane.add(lblCad_cargo);
		
		JLabel lblCad_colaborador = new JLabel("Cadastro de Colaborador");
		lblCad_colaborador.setBounds(10, 137, 146, 14);
		contentPane.add(lblCad_colaborador);
		
		JLabel lblCad_curso = new JLabel("Cadastro de Curso");
		lblCad_curso.setBounds(10, 198, 109, 20);
		contentPane.add(lblCad_curso);
		
		JLabel lblCad_professor = new JLabel("Cadastro de Professor");
		lblCad_professor.setBounds(188, 78, 131, 14);
		contentPane.add(lblCad_professor);
		
		JLabel lblTurma = new JLabel("Cadastro de Turma");
		lblTurma.setBounds(188, 137, 115, 14);
		contentPane.add(lblTurma);
		
		JLabel lblTurmaaux = new JLabel("Cadastrar Aluno em Turma");
		lblTurmaaux.setBounds(327, 137, 165, 14);
		contentPane.add(lblTurmaaux);
		
		JLabel lblUsuario = new JLabel("Cadastro de Usuário");
		lblUsuario.setBounds(188, 201, 131, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblConsulta = new JLabel("Sistema de Consultas");
		lblConsulta.setBounds(337, 201, 125, 14);
		contentPane.add(lblConsulta);
		
		JButton btnAluno = new JButton("Acessar");
		btnAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		});
		btnAluno.setBounds(10, 103, 89, 23);
		contentPane.add(btnAluno);
		
		JButton btnProfessor = new JButton("Acessar");
		btnProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		});
		btnProfessor.setBounds(198, 98, 89, 23);
		contentPane.add(btnProfessor);
		
		JButton btnCargo = new JButton("Acessar");
		btnCargo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		});
		btnCargo.setBounds(353, 103, 89, 23);
		contentPane.add(btnCargo);
		
		JButton btnTurma = new JButton("Acessar");
		btnTurma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		});
		btnTurma.setBounds(198, 164, 89, 23);
		contentPane.add(btnTurma);
		
		JButton btnColaborador = new JButton("Acessar");
		btnColaborador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		});
		btnColaborador.setBounds(10, 164, 89, 23);
		contentPane.add(btnColaborador);
		
		JButton btnAlunoaux = new JButton("Acessar");
		btnAlunoaux.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		});
		btnAlunoaux.setBounds(353, 164, 89, 23);
		contentPane.add(btnAlunoaux);
		
		JButton btnCurso = new JButton("Acessar");
		btnCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		});
		btnCurso.setBounds(10, 232, 89, 23);
		contentPane.add(btnCurso);
		
		JButton btnUsuario = new JButton("Acessar");
		btnUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		});
		btnUsuario.setBounds(198, 232, 89, 23);
		contentPane.add(btnUsuario);
		
		JButton btnConsulta = new JButton("Acessar");
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						dispose();
						try {
							menu_consulta frame = new menu_consulta();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnConsulta.setBounds(353, 232, 89, 23);
		contentPane.add(btnConsulta);
		
		JLabel lblOff = new JLabel("Sair");
		lblOff.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOff.setBounds(231, 283, 46, 14);
		contentPane.add(lblOff);
		
		JButton btnSair = new JButton("EXIT");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Informe Usuário e senha para ter acesso novamente ao sistema!\n");
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						dispose();
						
						try {
							iniciar_programa frame = new iniciar_programa();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
						dispose();
			}
		});
		btnSair.setBounds(198, 308, 89, 23);
		contentPane.add(btnSair);
	}
}
