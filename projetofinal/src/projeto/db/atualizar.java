package projeto.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class atualizar {
   
    public void atualizarAluno ( int registro,String rg, String nome, String data_nascimento, String sexo, String endereco, String escolaridade, String nome_mae, String nome_pai, String telefone, String email) {

        //Passo 1 - Qual comando SQL?
        String sql = "UPDATE aluno SET rg = " + "?" +
                                    ", nome = " + "?" +
                                    ", data_nascimento = " + "?" +
                                    ", sexo = " + "?" +
                                    ", endereco = " + "?" +
                                    ", escolaridade = " + "?" +
                                    ", nome_mae = " + "?" +
                                    ", nome_pai = " + "?" +
                                    ", telefone = " + "?" +
                                    ", email = " + "?" +
                                    "Where registro = " + "?";
                                    
                                    
       
        //Passo 2 - Preparar a conexão
        conexao novaConexao = new conexao();
        Connection conectar = novaConexao.getConexao();
        PreparedStatement preparar = null;
        ResultSet resultados = null;
       
        //Passo 3 - Tentar executar o SQL
        try {
            preparar = conectar.prepareStatement(sql);
            preparar.setString(1, rg);
            preparar.setString(2, nome);
            preparar.setString(3, data_nascimento);
            preparar.setString(4, sexo);
            preparar.setString(5, endereco);
            preparar.setString(6, escolaridade);
            preparar.setString(7, nome_mae);
            preparar.setString(8, nome_pai);
            preparar.setString(9, telefone);
            preparar.setString(10, email);
            preparar.setInt(11, registro);
            preparar.execute();
            JOptionPane.showMessageDialog(null,
            "Aluno Atualizado.");
        }catch(Exception erro) {
            JOptionPane.showMessageDialog(null,"Falha ao atualizar!");
            System.err.println(erro.getMessage());
        }
    }
    public void atualizarColaboradores ( String cpf,String rg, String nome, String data_nascimento, String sexo, String endereco, String escolaridade, int cargo, String telefone, String email) {

        //Passo 1 - Qual comando SQL?
        String sql = "UPDATE colaborador SET rg = " + "?" +
                                    ", nome = " + "?" +
                                    ", data_nascimento = " + "?" +
                                    ", sexo = " + "?" +
                                    ", endereco = " + "?" +
                                    ", escolaridade = " + "?" +
                                    ", cargo = " + "?" +
                                    ", telefone = " + "?" +
                                    ", email = " + "?" +
                                    "Where cpf = " + "?";
                                    
                                    
       
        //Passo 2 - Preparar a conexão
        conexao novaConexao = new conexao();
        Connection conectar = novaConexao.getConexao();
        PreparedStatement preparar = null;
        ResultSet resultados = null;
       
        //Passo 3 - Tentar executar o SQL
        try {
            preparar = conectar.prepareStatement(sql);
            preparar.setString(1, rg);
            preparar.setString(2, nome);
            preparar.setString(3, data_nascimento);
            preparar.setString(4, sexo);
            preparar.setString(5, endereco);
            preparar.setString(6, escolaridade);
            preparar.setInt(7, cargo);
            preparar.setString(8, telefone);
            preparar.setString(9, email);
            preparar.setString(10, cpf);
            preparar.execute();
            JOptionPane.showMessageDialog(null,
            "Colaborador Atualizado.");
        }catch(Exception erro) {
            JOptionPane.showMessageDialog(null,"Falha ao atualizar!");
            System.err.println(erro.getMessage());
        }
    }
    public void atualizarCargo (String titulo, String descricao, Double salario, int cod_cargo) {
    	
    	
    	//Passo 1 - Qual comando SQL?
        String sql = "UPDATE cargo SET titulo = " + "?" +
                                    ", descricao = " + "?" +
                                    ", salario = " + "?" +
                                    "Where cod_cargo = " + "?";
                                    
                                    
       
        //Passo 2 - Preparar a conexão
        conexao novaConexao = new conexao();
        Connection conectar = novaConexao.getConexao();
        PreparedStatement preparar = null;
        ResultSet resultados = null;
       
        //Passo 3 - Tentar executar o SQL
        try {
            preparar = conectar.prepareStatement(sql);
            preparar.setString(1, titulo);
            preparar.setString(2, descricao);
            preparar.setDouble(3, salario);
            preparar.setInt(4, cod_cargo);
            preparar.execute();
            JOptionPane.showMessageDialog(null,
            "Cargo Atualizado.");
        }catch(Exception erro) {
            JOptionPane.showMessageDialog(null,"Falha ao atualizar!");
            System.err.println(erro.getMessage());
    	
    }
}
    public void atualizarProfessor(String cpf, String area, String especializacao, String expertise) {
    	
    	
    	//Passo 1 - Qual comando SQL?
        String sql = "UPDATE professor SET area = " + "?" +
                                    ", especializacao = " + "?" +
                                    ", expertise = " + "?" +
                                    "Where cpf = " + "?";
                                    
                                    
       
        //Passo 2 - Preparar a conexão
        conexao novaConexao = new conexao();
        Connection conectar = novaConexao.getConexao();
        PreparedStatement preparar = null;
        ResultSet resultados = null;
       
        //Passo 3 - Tentar executar o SQL
        try {
            preparar = conectar.prepareStatement(sql);
            preparar.setString(1, area);
            preparar.setString(2, especializacao);
            preparar.setString(3, expertise);
            preparar.setString(4, cpf);
            preparar.execute();
            JOptionPane.showMessageDialog(null,
            "Professor Atualizado.");
        }catch(Exception erro) {
            JOptionPane.showMessageDialog(null,"Falha ao atualizar!");
            System.err.println(erro.getMessage());
}
    }
    public void atualizarCurso(int cod,String titulo, String descricao, String area_tecnologica, String carga_horaria, String conteudo, String nivel) {
    	
    	
    	//Passo 1 - Qual comando SQL?
    	String sql = "UPDATE curso SET titulo = " + "?" +
						                ", descricao = " + "?" +
						                ", area_tecnologica = " + "?" +
						                ", carga_horaria = " + "?" +
						                ", conteudo = " + "?" +
						                ", nivel = " + "?" +
						                "Where cod = " + "?";
                                    
       
        //Passo 2 - Preparar a conexão
        conexao novaConexao = new conexao();
        Connection conectar = novaConexao.getConexao();
        PreparedStatement preparar = null;
        ResultSet resultados = null;
       
        //Passo 3 - Tentar executar o SQL
        try {
            preparar = conectar.prepareStatement(sql);
            preparar.setString(1, titulo);
            preparar.setString(2, descricao);
            preparar.setString(3, area_tecnologica);
            preparar.setString(4, carga_horaria);
            preparar.setString(5, conteudo);
            preparar.setString(6, nivel);
            preparar.setInt(7, cod);
            preparar.execute();
            JOptionPane.showMessageDialog(null,
            "Curso Atualizado.");
        }catch(Exception erro) {
            JOptionPane.showMessageDialog(null,"Falha ao atualizar!");
            System.err.println(erro.getMessage());
}
    }
}