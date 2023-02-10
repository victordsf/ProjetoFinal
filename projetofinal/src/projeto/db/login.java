package projeto.db;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import projeto.gui.iniciar_programa;
import projeto.gui.menu;

public class login {
	   
    public void fazerLogin(
            String usuario,
            String senha) {
       
    	//Passo 1 - Comando SQL
        String sql = "SELECT * FROM usuario " + "WHERE Usuario=? AND Senha=?";
       
        //Passo 2 - Preparar a conexão
        conexao novaConexao = new conexao();
        Connection conectar = novaConexao.getConexao();
        PreparedStatement preparar = null;
        ResultSet resultados = null;
       
        //Passo 3 - Tentar executar o SQL
        try {
            preparar = conectar.prepareStatement(sql);
            preparar.setString(1, usuario);
            preparar.setString(2, senha);
            resultados = preparar.executeQuery();
        }catch(Exception erro) {
            JOptionPane.showMessageDialog(null,"Falha ao acessar");
            System.err.println(erro.getMessage());
        }
       
        //Passo 4 - Tentar mostrar os resultados
        try {
            if(resultados.next()) {
            	System.out.println("\nLogin efetuado");
            	JOptionPane.showMessageDialog(null,"Login efetuado");
            	
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
            	
            }else{
            	System.out.println("\nUsuário ou Senha incorreta");
            	JOptionPane.showMessageDialog(null,"Usuário ou Senha incorretos");
            	try {
					iniciar_programa frame = new iniciar_programa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
		
      	
            }
            
        }catch(Exception erro) {
        	System.out.println("\nFalha não há resultados");
            System.err.println(erro.getMessage());
        }
    }
    
}