/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

import javafx.scene.input.MouseEvent; //Importa a classe MouseEvent do pacote para lidar com eventos do mouse
import javafx.event.ActionEvent; //Importa a classe ActionEvent do pacote para lidar com eventos de ações
import javafx.fxml.FXML; //Importa a anotação FXML do pacote para usar anotações FXML no código
import javafx.fxml.FXMLLoader; //Importa a classe FXMLLoader do pacote para carregar arquivos FXML
import javafx.scene.Node; //Importa a classe Node do pacote para representar nós na hierarquia 
import javafx.scene.Parent; //Importa a classe Parent do pacote para representar um nó pai na hierarquia da cena
import javafx.scene.Scene; //Importa a classe Scene do pacote para representar uma cena Javafx
import javafx.stage.Stage; //Importa a classe Stage do pacote para representar uma janela Javafx
import java.io.IOException;//Importa a exceção IOException para lidar com operações de entrada/saída.
import javafx.scene.control.Button;  //Importa a classe Button do pacote para criar botões Javafx

/**
 * FXML Controller class
 *
 * @author gabbr
 */
public class MenuPrincipalController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    //Btn abrir Tela fornecedor
    //Indica que o método é associado a um elemento de interface definido no arquivo FXML
     @FXML
     //Declado o metodo que é chamado quando o botão é clicado
    private void AbrirTelaFornecedor(ActionEvent event) throws IOException {
        //Irá Obter a referência para a janela atual a partir do evento
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        //Cria um carregador de FXML e especifica o arquivo FXML a ser carregado 
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TelaFornecedores.fxml"));
        //Carrega o arquivo FXML e obtem o nó raiz da hierarquia da interface
        Parent root = loader.load();

        //Cria um nova aba para a janela
        Stage stage = new Stage();
        //Define os elementos da nova janela com o nó raiz
        stage.setScene(new Scene(root));
        //Define o título para a janela
        stage.setTitle("Tela de Gerenciamento de Fornecedores");

        //Chama a nova tela
        stage.show();
        //Fecha a janela atual
        currentStage.close();
    }
    //Fim do metodo botão Tela fornecedor
    
    //Click Imagem Fornecedor
    //Coidgo igual btn
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
    //Fim do metodo Imagem Tela fornecedor
    
    //Btn abrir Produtos
    @FXML
    private void AbrirTelaProdutos(ActionEvent event) throws IOException {
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
    //Coidgo igual btn
    @FXML
    private void AbrirProdutosImag(MouseEvent event) throws IOException {
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
    private void AbrirTelaClientes(ActionEvent event) throws IOException {
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
    private void AbrirClientesImag(MouseEvent event) throws IOException {
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
    private void AbrirTelaConsultProduc(ActionEvent event) throws IOException {
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
    private void AbrirConsuProdutImag(MouseEvent event) throws IOException {
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
    private void AbrirTelaCompras(ActionEvent event) throws IOException {
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
    private void AbrirListCompImag(MouseEvent event) throws IOException {
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
    private void AbrirTelaExame(ActionEvent event) throws IOException {
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
    private void AbrirTelaExamImag(MouseEvent event) throws IOException {
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
    private void AbrirConsultExame(ActionEvent event) throws IOException {
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
    private void AbrirConsultExamImag(MouseEvent event) throws IOException {
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
    //varivel 
    private Button btnFornecedoresMenu;

    @FXML
    private void buttonPressed() {
        //Define o estilo do botão quando pressionado
        btnFornecedoresMenu.setStyle("-fx-background-color: #CCCCCC");
    }

    @FXML
    private void buttonReleased() {
        //Volta ao estado original do botão
        btnFornecedoresMenu.setStyle("");
    }
    
}
