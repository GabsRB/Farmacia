/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

//import com.mycompany.modelTelaFornecedores;
//import br.com.fatec.model.Veiculo;
//import br.com.fatec.persistencia.Banco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author aluno
 */
public class FornecedorDAO {

    public static void cadastrarFornecedor(String nome, String cnpjCpf, String telefone,
                                           String email, String endereco, String numero,
                                           String bairro, String cidade, String uf, String cep) throws SQLException {
        try {
            // Conectar ao banco de dados
            Banco.conectar();

            // SQL para inserir um fornecedor na tabela Fornecedores
            String sql = "INSERT INTO Fornecedores (Nome, CNPJouCPF, Telefone, Email, Endereco, Numero, Bairro, Cidade, UF, CEP) " +
                         "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            // Criar um PreparedStatement
            PreparedStatement preparedStatement = Banco.obterConexao().prepareStatement(sql);

            // Preencher os valores
            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, cnpjCpf);
            preparedStatement.setString(3, telefone);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, endereco);
            preparedStatement.setString(6, numero);
            preparedStatement.setString(7, bairro);
            preparedStatement.setString(8, cidade);
            preparedStatement.setString(9, uf);
            preparedStatement.setString(10, cep);

            // Executar a inserção
            preparedStatement.executeUpdate();

            // Fechar o PreparedStatement
            preparedStatement.close();

        } finally {
            // Desconectar do banco de dados, independentemente do resultado
            Banco.desconectar();
        }
    }
    
}
