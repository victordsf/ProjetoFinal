package projeto.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;

public class cadastrar {
   
    public void CadastroAluno(String cpf, String rg, String nome, String data_nascimento, String sexo, String endereco, String escolaridade, String nome_mae, String nome_pai, String telefone, String email) {

        //Passo 1 - Qual comando SQL?
        String sql = "INSERT INTO aluno " + "(cpf, rg, nome, data_nascimento, sexo, endereco, escolaridade, nome_mae,nome_pai, telefone, email)" + "VALUES (?, ?, ?, ?, ?, ?, ?,?,?,?,?)";
       
        //Passo 2 - Preparar a conexão
        conexao novaConexao = new conexao(); 
        Connection conectar = novaConexao.getConexao();
        PreparedStatement preparar = null;
        ResultSet resultados = null;
       
        //Passo 3 - Tentar executar o SQL
        try {
            preparar = conectar.prepareStatement(sql);
            preparar.setString(1, cpf);
            preparar.setString(2, rg);
            preparar.setString(3, nome);
            preparar.setString(4, data_nascimento);
            preparar.setString(5, sexo);
            preparar.setString(6, endereco);
            preparar.setString(7, escolaridade);
            preparar.setString(8, nome_mae);
            preparar.setString(9, nome_pai);
            preparar.setString(10, telefone);
            preparar.setString(11, email);
            preparar.execute();
            JOptionPane.showMessageDialog(null,
                "Aluno cadastrado");
        }catch(Exception erro) {
            JOptionPane.showMessageDialog(null,"Falha ao cadastrar!\n"+erro.getMessage());
            System.err.println(erro.getMessage());
        }
    }
    public void CadastroColaboradores(String cpf, String rg, String nome, String data_nascimento, String sexo, String endereco, String escolaridade, int cargo, String telefone, String email) {

        //Passo 1 - Qual comando SQL?
        String sql = "INSERT INTO colaborador " + "(cpf, rg, nome, data_nascimento , sexo, endereco, escolaridade, cargo, telefone, email)" + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
       
        //Passo 2 - Preparar a conexão
        conexao novaConexao = new conexao(); 
        Connection conectar = novaConexao.getConexao();
        PreparedStatement preparar = null;
        ResultSet resultados = null;
       
        //Passo 3 - Tentar executar o SQL
        try {
            preparar = conectar.prepareStatement(sql);
            preparar.setString(1, cpf);
            preparar.setString(2, rg);
            preparar.setString(3, nome);
            preparar.setString(4, data_nascimento);
            preparar.setString(5, sexo);
            preparar.setString(6, endereco);
            preparar.setString(7, escolaridade);
            preparar.setInt(8, cargo);
            preparar.setString(9, telefone);
            preparar.setString(10, email);
            preparar.execute();
            JOptionPane.showMessageDialog(null,
                "Colaborador cadastrado");
        }catch(Exception erro) {
            JOptionPane.showMessageDialog(null,"Falha ao cadastrar!\n"+erro.getMessage());
            System.err.println(erro.getMessage());
}
    }
    public void CadastroProfessores(String cpf, String area, String especializacao, String expertise) {

        //Passo 1 - Qual comando SQL?
        String sql = "INSERT INTO professor " + "(cpf, area, especializacao, expertise)" + "VALUES (?, ?, ?, ?)";
       
        //Passo 2 - Preparar a conexão
        conexao novaConexao = new conexao(); 
        Connection conectar = novaConexao.getConexao();
        PreparedStatement preparar = null;
        ResultSet resultados = null;
       
        //Passo 3 - Tentar executar o SQL
        try {
            preparar = conectar.prepareStatement(sql);
            preparar.setString(1, cpf);
            preparar.setString(2, area);
            preparar.setString(3, especializacao);
            preparar.setString(4, expertise);
            preparar.execute();
            JOptionPane.showMessageDialog(null,
                "Professor cadastrado");
        }catch(Exception erro) {
            JOptionPane.showMessageDialog(null,"Falha ao cadastrar!\n"+erro.getMessage());
            System.err.println(erro.getMessage());
        }
    } 
    
    public void CadastroCargo(String titulo, String descricao, Double salario) {

        //Passo 1 - Qual comando SQL?
        String sql = "INSERT INTO cargo " + "(titulo, descricao, salario)" + "VALUES (?, ?, ?)";
       
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
            preparar.execute();
            JOptionPane.showMessageDialog(null,
                "Cargo cadastrado");
        }catch(Exception erro) {
            JOptionPane.showMessageDialog(null,"Falha ao cadastrar!\n"+erro.getMessage());
            System.err.println(erro.getMessage());
        }
    } 
    public void CadastroCurso(String titulo, String descricao, String area_tecnologica, String carga_horaria, String conteudo, String nivel) {

        //Passo 1 - Qual comando SQL?
        String sql = "INSERT INTO curso " + "(titulo, descricao, area_tecnologica, carga_horaria, conteudo, nivel)" + "VALUES (?, ?, ?, ?, ?, ?)";
       
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
            preparar.execute();
            JOptionPane.showMessageDialog(null,
                "Curso cadastrado");
        }catch(Exception erro) {
            JOptionPane.showMessageDialog(null,"Falha ao cadastrar!\n"+erro.getMessage());
            System.err.println(erro.getMessage());
        }
    } 
    public void CadastroTurma(String curso, String turno, String data_inicio, String data_termino, String cpf_professor) {

        //Passo 1 - Qual comando SQL?
        String sql = "INSERT INTO turma " + "(curso, turno, data_inicio, data_termino, cpf_professor)" + "VALUES (?, ?, ?, ?, ?)";
       
        //Passo 2 - Preparar a conexão
        conexao novaConexao = new conexao(); 
        Connection conectar = novaConexao.getConexao();
        PreparedStatement preparar = null;
        ResultSet resultados = null;
       
        //Passo 3 - Tentar executar o SQL
        try {
            preparar = conectar.prepareStatement(sql);
            preparar.setString(1, curso);
            preparar.setString(2, turno);
            preparar.setString(3, data_inicio);
            preparar.setString(4, data_termino);
            preparar.setString(5, cpf_professor);
            preparar.execute();
            JOptionPane.showMessageDialog(null,
                "Turma cadastrada");
        }catch(Exception erro) {
            JOptionPane.showMessageDialog(null,"Falha ao cadastrar!\n"+erro.getMessage());
            System.err.println(erro.getMessage());
        }
    } 
    public void CadastroTurmaAux(int cod_turma, int cod_aluno) {

        //Passo 1 - Qual comando SQL?
        String sql = "INSERT INTO turma_aux " + "(cod, registro_aluno)" + "VALUES (?, ?)";
       
        //Passo 2 - Preparar a conexão
        conexao novaConexao = new conexao(); 
        Connection conectar = novaConexao.getConexao();
        PreparedStatement preparar = null;
        ResultSet resultados = null;
       
        //Passo 3 - Tentar executar o SQL
        try {
            preparar = conectar.prepareStatement(sql);
            preparar.setInt(1, cod_turma);
            preparar.setInt(2, cod_aluno);
            preparar.execute();
            JOptionPane.showMessageDialog(null,
                "Aluno Cadastrado na Turma");
        }catch(Exception erro) {
            JOptionPane.showMessageDialog(null,"Falha ao cadastrar!\n"+erro.getMessage());
            System.err.println(erro.getMessage());
        }
    } 
    public void CadastroUsuario(String usuario, String senha) {
    	//Passo 1 - Qual comando SQL?
        String sql = "INSERT INTO usuario " + "(Usuario, Senha)" + "VALUES (?,?)";
       
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
            preparar.execute();
            
            JOptionPane.showMessageDialog(null,"Usuario cadastrado");
        }catch(Exception erro) {
        	System.out.println("Falha ao realizar cadastro");
            System.err.println(erro.getMessage());
    }
}
}