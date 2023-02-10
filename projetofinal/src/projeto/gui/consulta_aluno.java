package projeto.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTable;

public class consulta_aluno extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the frame.
	 */
public consulta_aluno() {
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
setBounds(100, 100, 533, 332);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);
contentPane.setLayout(null);

JLabel lblNewLabel = new JLabel("Sistema de Consulta de Alunos");
lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
lblNewLabel.setBounds(316, 4, 227, 19);
contentPane.add(lblNewLabel);

final DefaultTableModel modelo = new DefaultTableModel();
     
        table = new JTable(modelo);
        table.setBounds(1, 1, 500, 0);
        contentPane.add(table);
       
        modelo.addColumn("CPF");
        modelo.addColumn("RG");
        modelo.addColumn("Nome");
        modelo.addColumn("Data Nascimento");
        modelo.addColumn("Sexo");
        modelo.addColumn("Endereço");
        modelo.addColumn("Escolaridade");
        modelo.addColumn("Nome Mãe");
        modelo.addColumn("Nome Pai");
        modelo.addColumn("Telefone");
        modelo.addColumn("E-mail");
        modelo.addColumn("Registro");
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/projetovictor?user=root&password=");                 
            // procedimentos para obter os dados de uma tabela
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM aluno";
            ResultSet rs = stmt.executeQuery(query);
             
            while(rs.next()){
              String cpf =rs.getString("cpf");
              String rg = rs.getString("rg");
              String nome = rs.getString("nome");
              String data_nascimento = rs.getString("data_nascimento");
              String sexo = rs.getString("sexo");
              String endereco = rs.getString("endereco");
              String escolaridade = rs.getString("escolaridade");
              String nome_mae = rs.getString("nome_mae");
              String nome_pai = rs.getString("nome_pai");
              String telefone = rs.getString("telefone");
              String email = rs.getString("email");
              String registro = rs.getString("registro");
 
           
             modelo.addRow(new Object[] {cpf, rg,nome, data_nascimento,sexo,endereco ,escolaridade, nome_mae, nome_pai, telefone, email, registro});
            }
                 
            // fim procedimento para obter os dados
            }
            catch(SQLException ex){
                 System.out.println("SQLException: " + ex.getMessage());
                 System.out.println("SQLState: " + ex.getSQLState());
                 System.out.println("VendorError: " + ex.getErrorCode());
            }
            catch(Exception e){
              System.out.println("Problemas ao tentar conectar com o banco de dados");    
          }

       
        table.setPreferredScrollableViewportSize(new Dimension(500, 180));
         
        Container c = getContentPane();
                 
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 34, 812, 365);
        c.add(scrollPane);
             
        setSize(848, 438);
        setVisible(true); }
}