package projeto.gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class consulta_curso extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the frame.
	 */
	public consulta_curso() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 533, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Sistema de Consulta de Curso");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(231, 4, 275, 19);
		contentPane.add(lblNewLabel);

		final DefaultTableModel modelo = new DefaultTableModel();
		     
		        table = new JTable(modelo);
		        table.setBounds(1, 1, 500, 0);
		        contentPane.add(table);
		       
		        modelo.addColumn("Cod_Curso");
		        modelo.addColumn("Título");
		        modelo.addColumn("Descrição");
		        modelo.addColumn("Área Tecnológica");
		        modelo.addColumn("Carga Horária");
		        modelo.addColumn("Conteúdo");
		        modelo.addColumn("Nível");
		  
		        
		      
		        
		        try{
		            Class.forName("com.mysql.jdbc.Driver").newInstance();
		            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/projetovictor?user=root&password=");
		            
		            // procedimentos para obter 		                 
		            // procedimentos para obter os dados de uma tabela
		            Statement stmt = conn.createStatement();
		            String query = "SELECT * FROM curso";
		            ResultSet rs = stmt.executeQuery(query);
		             
		            while(rs.next()){
		              String cod =rs.getString("cod");
		              String titulo = rs.getString("titulo");
		              String descricao = rs.getString("descricao");
		              String area = rs.getString("area_tecnologica");
		              String carga =rs.getString("carga_horaria");
		              String conteudo = rs.getString("conteudo");
		              String nivel = rs.getString("nivel");
		            

		   
		 
		           
		             modelo.addRow(new Object[] {cod, titulo, descricao, area, carga, conteudo, nivel});
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
		        scrollPane.setBounds(29, 34, 635, 342);
		        c.add(scrollPane);
		             
		        setSize(708, 438);
		        setVisible(true); }
		}
