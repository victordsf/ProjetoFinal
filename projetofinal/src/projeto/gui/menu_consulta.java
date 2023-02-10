package projeto.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menu_consulta extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu_consulta frame = new menu_consulta();
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
	public menu_consulta() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 577, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenu = new JLabel("Menu de Consultas");
		lblMenu.setBounds(216, 11, 150, 15);
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblMenu);
		
		JLabel lblInformar = new JLabel("Informe Qual Sistema Deseja Consultar");
		lblInformar.setBounds(163, 37, 264, 14);
		lblInformar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblInformar);
		
		JLabel lblAluno = new JLabel("Consultar Alunos");
		lblAluno.setBounds(33, 80, 106, 14);
		contentPane.add(lblAluno);
		
		JButton btnAluno = new JButton("Consultar");
		btnAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							consulta_aluno frame = new consulta_aluno();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnAluno.setBounds(33, 105, 89, 23);
		contentPane.add(btnAluno);
		
		JLabel lblCargo = new JLabel("Consultar Cargos");
		lblCargo.setBounds(33, 159, 106, 14);
		contentPane.add(lblCargo);
		
		JLabel lblColaborador = new JLabel("Consultar Colaboradores");
		lblColaborador.setBounds(33, 235, 150, 14);
		contentPane.add(lblColaborador);
		
		JButton btnCargos = new JButton("Consultar");
		btnCargos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							consulta_cargo frame = new consulta_cargo();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnCargos.setBounds(33, 185, 89, 23);
		contentPane.add(btnCargos);
		
		JButton btnColaborador = new JButton("Consultar");
		btnColaborador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							consulta_colaborador frame = new consulta_colaborador();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnColaborador.setBounds(33, 266, 89, 23);
		contentPane.add(btnColaborador);
		
		JLabel lblCurso = new JLabel("Consultar Cursos");
		lblCurso.setBounds(215, 80, 106, 14);
		contentPane.add(lblCurso);
		
		JButton btnCurso = new JButton("Consultar");
		btnCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							consulta_curso frame = new consulta_curso();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnCurso.setBounds(215, 105, 89, 23);
		contentPane.add(btnCurso);
		
		JLabel lblProfessor = new JLabel("Consultar Professores");
		lblProfessor.setBounds(216, 235, 139, 14);
		contentPane.add(lblProfessor);
		
		JButton btnProfessor = new JButton("Consultar");
		btnProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							consulta_professor frame = new consulta_professor();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnProfessor.setBounds(216, 266, 89, 23);
		contentPane.add(btnProfessor);
		
		JLabel lblTurma = new JLabel("Consultar Turmas");
		lblTurma.setBounds(215, 159, 118, 14);
		contentPane.add(lblTurma);
		
		JButton btnTurma = new JButton("Consultar");
		btnTurma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							consulta_turma frame = new consulta_turma();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnTurma.setBounds(215, 185, 89, 23);
		contentPane.add(btnTurma);
		
		JLabel lblUsuario = new JLabel("Consultar Usuários");
		lblUsuario.setBounds(387, 80, 114, 14);
		contentPane.add(lblUsuario);
		
		JButton btnUsuario = new JButton("Consultar");
		btnUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							consulta_usuario frame = new consulta_usuario();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnUsuario.setBounds(387, 105, 89, 23);
		contentPane.add(btnUsuario);
		
		JLabel lblTurmaaux = new JLabel("Consultar Alunos em Turmas");
		lblTurmaaux.setBounds(387, 159, 166, 14);
		contentPane.add(lblTurmaaux);
		
		JButton btnAlunoaux = new JButton("Consultar");
		btnAlunoaux.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							consulta_aluno_turma frame = new consulta_aluno_turma();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnAlunoaux.setBounds(387, 185, 89, 23);
		contentPane.add(btnAlunoaux);
		
		JLabel lblMenuu = new JLabel("Voltar Para o Menu");
		lblMenuu.setBounds(387, 235, 132, 14);
		contentPane.add(lblMenuu);
		
		JButton btnMenuu = new JButton("Voltar");
		btnMenuu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
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
		});
		btnMenuu.setBounds(387, 266, 89, 23);
		contentPane.add(btnMenuu);
	}

}
