/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class TelaFornecedoresController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    //botao Menu
      @FXML
    private void abrirMenuPrincipal(ActionEvent event) throws IOException {
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuPrincipal.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Menu Principal");

        stage.show();
        
        currentStage.close();
    }
    //fim botão menu
    
    //Imagem Menu
    @FXML
    private void AbrirMenuImag(MouseEvent event) throws IOException {
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuPrincipal.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Menu Principal");

        currentStage.close();

        stage.show();

        event.consume();
    }
    //fim Imagem menu
    
    //botao Fornecedores
    /*private void abrirFornecedores() {
    }//fim botão fornecedores
    //Imagem Fornecedores
    private void AbrirForneceImag(){
    }//fim Imagem fornece
    */
    
    //botao 
      @FXML
    private void abrirProdutos(ActionEvent event) throws IOException {
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TelaProdutos.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Tela de Gerenciamento de Produtos");

        stage.show();
        
        currentStage.close();
    }
    //Fim do metodo btn Tela Produtos
    //Click Imagem Produtos
    @FXML
    private void AbrirProducImag(MouseEvent event) throws IOException {
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TelaProdutos.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Tela de Gerenciamento de Produtos");

        currentStage.close();

        stage.show();

        //Indica que o evento foi tratado 
        event.consume();
    }
    //Fim do metodo Imagem Tela Produtos
    
    //Btn abrir Clientes
    @FXML
    private void AbrirTelaClient(ActionEvent event) throws IOException {
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TelaClientes.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Tela de Gerenciamento de Clientes");

        stage.show();
        currentStage.close();
    }
     //Fim do metodo btn Tela Clientes
    //Click Imagem Clientes
    //Coidgo igual btn
    @FXML
    private void AbrirClientImag(MouseEvent event) throws IOException {
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TelaClientes.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Tela de Gerenciamento de Clientes");

        currentStage.close();

        stage.show();

        //Indica que o evento foi tratado 
        event.consume();
    }
    //Fim do metodo Imagem Tela Clientes
    
    //Btn abrir Tela Consulta de Produtos
    @FXML
    private void AbrirForneceConsultProduc(ActionEvent event) throws IOException {
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ConsultarProdutos.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Tela de Consulta de Produtos");

        stage.show();
        currentStage.close();
    }
     //Fim do metodo btn Tela Consulta de Produtos
    //Click Imagem Consulta de Produtos
    //Coidgo igual btn
    @FXML
    private void AbrirFornConsuProdutImag(MouseEvent event) throws IOException {
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ConsultarProdutos.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Tela de Consulta de Produtos");

        currentStage.close();

        stage.show();

        //Indica que o evento foi tratado 
        event.consume();
    }
    //Fim do metodo Imagem Tela Consulta de Produtos
    
    //Btn abrir Tela Lista de Compras
    @FXML
    private void AbrirTelaComprasForn(ActionEvent event) throws IOException {
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ListaCompras.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Tela de Lista de Compras");

        stage.show();
        currentStage.close();
    }
     //Fim do metodo btn Tela Lista de Compras
    //Click Imagem Lista de Compras
    //Codigo igual btn
    @FXML
    private void AbrirListCompFornImag(MouseEvent event) throws IOException {
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ListaCompras.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Tela de Lista de Compras");

        currentStage.close();

        stage.show();

        //Indica que o evento foi tratado 
        event.consume();
    }
    //Fim do metodo Imagem Tela Lista de Compras
    
    //Btn abrir Tela Exames
    @FXML
    private void AbrirTelaExameForn(ActionEvent event) throws IOException {
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TelaExames.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Tela de Gerenciamento de Exames e Testes");

        stage.show();
        currentStage.close();
    }
     //Fim do metodo btn Tela Exames
    //Click Imagem Tela Exames
    //Codigo igual btn
    @FXML
    private void AbrirTelaExamFornImag(MouseEvent event) throws IOException {
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TelaExames.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Tela de Gerenciamento de Exames e Testes");

        currentStage.close();

        stage.show();

        //Indica que o evento foi tratado 
        event.consume();
    }
    //Fim do metodo Imagem Tela Tela Exames
    
    //Btn abrir Tela Consulta Exames
    @FXML
    private void AbrirConsultExameForn(ActionEvent event) throws IOException {
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ConsultaExames.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Tela de Consulta de Exames e Testes");

        stage.show();
        currentStage.close();
    }
     //Fim do metodo btn Tela Consulta Exames
    //Click Imagem Tela Consulta Exames
    //Codigo igual btn
    @FXML
    private void AbrirConsultExamFornImag(MouseEvent event) throws IOException {
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ConsultaExames.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Tela de Consulta de Exames e Testes");

        currentStage.close();

        stage.show();

        //Indica que o evento foi tratado 
        event.consume();
    }
    //Fim do metodo Imagem Tela Consulta Exames
    
    
    @FXML
    private Button BtnInicialForn;

    @FXML
    private void buttonPressed() {
        BtnInicialForn.setStyle("-fx-background-color: #CCCCCC");
    }

    @FXML
    private void buttonReleased() {
        BtnInicialForn.setStyle("");
    }
    
    @FXML
    private TextField FieldNomeEmpresa;

    @FXML
    private TextField FieldCPFCNPJ;

    @FXML
    private TextField FieldTelefone;

    @FXML
    private TextField FieldEmail;

    @FXML
    private TextField FieldEndereco;

    @FXML
    private TextField FieldNum;

    @FXML
    private TextField FieldBairro;

    @FXML
    private TextField FieldCidade;

    @FXML
    private TextField FieldUF;

    @FXML
    private TextField FieldCEP;
    
    @FXML
    private Button BtnCadastrar;

    
    @FXML
    private void cadastrar(ActionEvent event) throws IOException {
        // Obtenha os valores dos campos
        String nome = FieldNomeEmpresa.getText();
        String cnpjCpf = FieldCPFCNPJ.getText();
        String telefone = FieldTelefone.getText();
        String email = FieldEmail.getText();
        String endereco = FieldEndereco.getText();
        String numero = FieldNum.getText();
        String bairro = FieldBairro.getText();
        String cidade = FieldCidade.getText();
        String uf = FieldUF.getText();
        String cep = FieldCEP.getText();

        try {
            // Chame o método para cadastrar no banco de dados
            Banco.conectar();
            FornecedorDAO.cadastrarFornecedor(nome, cnpjCpf, telefone, email, endereco,
                                            numero, bairro, cidade, uf, cep);
            Banco.desconectar();

            // Exiba uma mensagem de sucesso
            System.out.println("Cadastro realizado com sucesso!");
        } catch (SQLException e) {
            // Exiba uma mensagem de erro em caso de falha
            e.printStackTrace();
            System.out.println("Erro ao cadastrar: " + e.getMessage());
        }
    }
}
