/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import com.mycompany.Cliente;
import com.mycompany.Banco;
import com.mycompany.DAO;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.util.ArrayList;
import java.util.Collection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TextField;
import static javax.swing.UIManager.getInt;
/**
 *
 * @author gabbr
 */
public class ClienteDAO implements DAO<Cliente> {
   
    @Override
    public boolean insere(Cliente cliente) throws SQLException {
        try {
            Banco.conectar();

            String sql = "INSERT INTO Cliente (Nome, CPF, Datanasc, Genero, Telefone, Email, Endereco, Numero, Bairro, Cidade, UF, CEP) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement stm = Banco.obterConexao().prepareStatement(sql)) {
                stm.setString(1, cliente.getNome());
                stm.setString(2, cliente.getCpf());
                stm.setDate(3, new java.sql.Date(cliente.getDataNasc().getTime()));
                stm.setString(4, cliente.getGenero());
                stm.setString(5, cliente.getTelefone());
                stm.setString(6, cliente.getEmail());
                stm.setString(7, cliente.getEndereco());
                stm.setString(8, cliente.getNumero());
                stm.setString(9, cliente.getBairro());
                stm.setString(10, cliente.getCidade());
                stm.setString(11, cliente.getUf());
                stm.setString(12, cliente.getCep());

                stm.executeUpdate();
            }
            return true;

        } catch (SQLException e) {
        e.printStackTrace();
        // Adicione log ou exibição de mensagem para identificar a causa específica do erro
        throw e; // Re-lança a exceção para que o método que chamou também a trate, se necessário
    } finally {
        Banco.desconectar();
    }
    }
    @Override
    public boolean remove(Cliente model) throws SQLException {
        // Implemente a lógica para remover um cliente
        return false;
    }

    @Override
    public boolean altera(Cliente model) throws SQLException {
        // Implemente a lógica para alterar um cliente
        return false;
    }

    @Override
    public Cliente buscaID(Cliente model) throws SQLException {
        // Implemente a lógica para buscar um cliente pelo ID
        return null;
    }

    @Override
    public Collection<Cliente> lista(String criterio) throws SQLException {
        // Implemente a lógica para listar clientes com base em algum critério
        return null;
    }
}

