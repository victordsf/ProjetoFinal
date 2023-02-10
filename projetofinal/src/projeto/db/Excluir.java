package projeto.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class Excluir {
   
    public void excluirAluno(int registro) {

            //Passo 1 - Qual comando SQL?
            String sql = "DELETE FROM aluno WHERE registro = " + "?";
           
            //Passo 2 - Preparar a conexão
            conexao novaConexao = new conexao();
            Connection conectar = novaConexao.getConexao();
            PreparedStatement preparar = null;
            ResultSet resultados = null;
           
            //Passo 3 - Tentar executar o SQL
            try {
                preparar = conectar.prepareStatement(sql);
                preparar.setInt(1, registro);
                preparar.execute();
                JOptionPane.showMessageDialog(null,
                "Aluno excluído");
            }catch(Exception erro) {
                JOptionPane.showMessageDialog(null,"Falha ao excluir!");
                System.err.println(erro.getMessage());
            }
    }
    public void excluirCargo(int cod_cargo) {

        //Passo 1 - Qual comando SQL?
        String sql = "DELETE FROM cargo WHERE cod_cargo = " + "?";
       
        //Passo 2 - Preparar a conexão
        conexao novaConexao = new conexao();
        Connection conectar = novaConexao.getConexao();
        PreparedStatement preparar = null;
        ResultSet resultados = null;
       
        //Passo 3 - Tentar executar o SQL
        try {
            preparar = conectar.prepareStatement(sql);
            preparar.setInt(1, cod_cargo);
            preparar.execute();
            JOptionPane.showMessageDialog(null,
            "Cargo excluído");
        }catch(Exception erro) {
            JOptionPane.showMessageDialog(null,"Falha ao excluir!");
            System.err.println(erro.getMessage());
}
 }
    public void excluirProfessor(String cpf) {

        //Passo 1 - Qual comando SQL?
        String sql = "DELETE FROM professor WHERE cpf = " + "?";

        //Passo 2 - Preparar a conexão
        conexao novaConexao = new conexao();
        Connection conectar = novaConexao.getConexao();
        PreparedStatement preparar = null;
        ResultSet resultados = null;
       
        //Passo 3 - Tentar executar o SQL
        try {
            preparar = conectar.prepareStatement(sql);
            preparar.setString(1, cpf);
            preparar.execute();
            JOptionPane.showMessageDialog(null,
            "Professor excluído");
        }catch(Exception erro) {
            JOptionPane.showMessageDialog(null,"Falha ao excluir!");
            System.err.println(erro.getMessage());
    
}
    }
    public void excluirCurso(int cod) {

        //Passo 1 - Qual comando SQL?
        String sql = "DELETE FROM curso WHERE cod = " + "?";
       
        //Passo 2 - Preparar a conexão
        conexao novaConexao = new conexao();
        Connection conectar = novaConexao.getConexao();
        PreparedStatement preparar = null;
        ResultSet resultados = null;
       
        //Passo 3 - Tentar executar o SQL
        try {
            preparar = conectar.prepareStatement(sql);
            preparar.setInt(1, cod);
            preparar.execute();
            JOptionPane.showMessageDialog(null,
            "Curso excluído");
        }catch(Exception erro) {
            JOptionPane.showMessageDialog(null,"Falha ao excluir!");
            System.err.println(erro.getMessage());
}
    }
    public void excluirAlunoTurma(int registro) {

        //Passo 1 - Qual comando SQL?
        String sql = "DELETE FROM turma_aux WHERE registro_aluno = " + "?";
       
        //Passo 2 - Preparar a conexão
        conexao novaConexao = new conexao();
        Connection conectar = novaConexao.getConexao();
        PreparedStatement preparar = null;
        ResultSet resultados = null;
       
        //Passo 3 - Tentar executar o SQL
        try {
            preparar = conectar.prepareStatement(sql);
            preparar.setInt(1, registro);
            preparar.execute();
            JOptionPane.showMessageDialog(null,
            "Aluno excluído");
        }catch(Exception erro) {
            JOptionPane.showMessageDialog(null,"Falha ao excluir!");
            System.err.println(erro.getMessage());
}
    }
    public void excluirTurma(int cod) {

        //Passo 1 - Qual comando SQL?
        String sql = "DELETE FROM turma WHERE cod = " + "?";
       
        //Passo 2 - Preparar a conexão
        conexao novaConexao = new conexao();
        Connection conectar = novaConexao.getConexao();
        PreparedStatement preparar = null;
        ResultSet resultados = null;
       
        //Passo 3 - Tentar executar o SQL
        try {
            preparar = conectar.prepareStatement(sql);
            preparar.setInt(1, cod);
            preparar.execute();
            JOptionPane.showMessageDialog(null,
            "Turma excluído");
        }catch(Exception erro) {
            JOptionPane.showMessageDialog(null,"Falha ao excluir!");
            System.err.println(erro.getMessage());
}
    }
}