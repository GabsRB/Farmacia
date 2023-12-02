/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author gabbr
 */
public class ListaComprasController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
     //botao Menu
      @FXML
    private void abrirMenuPrincipalProduct(ActionEvent event) throws IOException {
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
   
    //botao 
      @FXML
    private void abrirFornecedor(ActionEvent event) throws IOException {
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TelaFornecedores.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Tela de Gerenciamento de Fornecedores");

        stage.show();
        
        currentStage.close();
    }
    //Fim do metodo btn Tela Produtos
    //Click Imagem Produtos
    @FXML
    private void AbrirFornecedorImag(MouseEvent event) throws IOException {
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TelaFornecedores.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Tela de Gerenciamento de Fornecedores");

        currentStage.close();

        stage.show();

        //Indica que o evento foi tratado 
        event.consume();
    }
    //Fim do metodo Imagem Tela Produtos
    
    //Btn abrir Clientes
    @FXML
    private void AbrirTelaProduc(ActionEvent event) throws IOException {
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TelaProdutos.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Tela de Gerenciamento de Produtos");

        stage.show();
        currentStage.close();
    }
     //Fim do metodo btn Tela Clientes
    //Click Imagem Clientes
    //Coidgo igual btn
    @FXML
    private void AbrirProductImag(MouseEvent event) throws IOException {
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

}
