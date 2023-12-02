/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany;

import com.mycompany.Cliente;
import com.mycompany.DAO;
import com.mycompany.ClienteDAO;
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
import java.sql.SQLException;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import java.time.LocalDate;
import java.util.Date;
import javafx.scene.control.ToggleGroup;


/**
 * FXML Controller class
 *
 * @author gabbr
 */
public class TelaClientesController implements Initializable {
    
    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField fieldIdClient;
    
    @FXML
    private TextField filedNomeCliet;
 
    
    @FXML
    private TextField filedCPFclIENT;
    
    @FXML
    private DatePicker filedDateNascClient;
    
    @FXML
    private RadioButton RdFem;
    
    @FXML
    private RadioButton Rdmasc;
    
    @FXML
    private RadioButton RdOutro;
    
    @FXML
    private TextField filedTelefoneClient;

    @FXML
    private TextField filedEmailClient;
    
    @FXML
    private TextField filedEnderecoclient;
    
    @FXML
    private TextField filedNumClient;
    
    @FXML
    private TextField filedBairroClient;
    
    @FXML
    private TextField filedCidadeClient;
    
    @FXML
    private TextField filedCEPclIENT;
    
    @FXML
    private TextField filedUFclIENT;
    
    @FXML
    private Button btnCadastrarClient;
    
    private ToggleGroup genderToggleGroup;

  
    @FXML
    void buttonPressed(MouseEvent event) {

    }

    @FXML
    void buttonReleased(MouseEvent event) {

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    fieldIdClient = new TextField();
    filedNomeCliet = new TextField();
    filedCPFclIENT = new TextField();
    filedDateNascClient = new DatePicker();
    genderToggleGroup = new ToggleGroup();
    //RdFem.setToggleGroup(genderToggleGroup);
   // Rdmasc.setToggleGroup(genderToggleGroup);
    //RdOutro.setToggleGroup(genderToggleGroup);
    filedTelefoneClient = new TextField();
    filedEmailClient = new TextField();
    filedEnderecoclient = new TextField();
    filedNumClient = new TextField();
    filedBairroClient = new TextField();
    filedCidadeClient = new TextField();
    filedCEPclIENT = new TextField();
    filedUFclIENT = new TextField();
   
        
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
    
    //Ligacao com campos do designer junto com cmapos do BD
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
private void cadastrarCliente(ActionEvent event) throws IOException {
    
     System.out.println("Método cadastrarCliente chamado.");

    // Verificar se os campos estão preenchidos corretamente
/*    if (fieldIdClient.getText().isEmpty() || filedCPFclIENT.getText().isEmpty()) {
        System.out.println("Campos obrigatórios não preenchidos.");
        // Adicione aqui uma mensagem de alerta ao usuário, se necessário
        return;
    }*/
    Cliente cliente = new Cliente();
    cliente.setNome(filedNomeCliet.getText());
    cliente.setCpf(filedCPFclIENT.getText());

    if (filedDateNascClient.getValue() != null) {
    LocalDate dataNasc = filedDateNascClient.getValue();
    cliente.setDataNasc(java.sql.Date.valueOf(dataNasc));
}

// Verifique se o cliente.getDataNasc() não é nulo antes de chamar getTime()
if (cliente.getDataNasc() != null) {
    // O método getTime() só será chamado se getDataNasc() não for nulo
    long timeInMillis = cliente.getDataNasc().getTime();
}

    cliente.setGenero(getSelectedGender()); // Exemplo para RadioButton
    cliente.setTelefone(filedTelefoneClient.getText()); // Exemplo para TextField de telefone
    cliente.setEmail(filedEmailClient.getText()); // Exemplo para TextField de email
    cliente.setEndereco(filedEnderecoclient.getText()); // Exemplo para TextField de endereço
    cliente.setNumero(filedNumClient.getText()); // Exemplo para TextField de número
    cliente.setBairro(filedBairroClient.getText()); // Exemplo para TextField de bairro
    cliente.setCidade(filedCidadeClient.getText()); // Exemplo para TextField de cidade
    cliente.setUf(filedUFclIENT.getText()); // Exemplo para TextField de UF
    cliente.setCep(filedCEPclIENT.getText()); // Exemplo para TextField de CEP
    
     ClienteDAO clienteDAO = new ClienteDAO();
     
     try {
        // Verificar se o método insere está funcionando corretamente
        if (clienteDAO.insere(cliente)) {
            System.out.println("Cliente cadastrado com sucesso.");
            limparCampos();
            // Adicione aqui o que deseja fazer após o cadastro
        } else {
            System.out.println("Falha ao cadastrar cliente.");
            // Adicione aqui o tratamento de erro, se necessário
        }
    } catch (SQLException e) {
        System.out.println("Erro durante o cadastro do cliente: " + e.getMessage());
        e.printStackTrace();
        // Adicione aqui o tratamento de erro, se necessário
    }

    try {
        if (clienteDAO.insere(cliente)) {
            // Cliente cadastrado com sucesso
            limparCampos();
            // Adicione aqui o que deseja fazer após o cadastro
        } else {
            // Falha ao cadastrar cliente
            // Adicione aqui o tratamento de erro, se necessário
        }
    } catch (SQLException e) {
        e.printStackTrace();
        // Adicione aqui o tratamento de erro, se necessário
    }
}
private String getSelectedGender() {
    RadioButton selectedRadioButton = (RadioButton) genderToggleGroup.getSelectedToggle();

    if (selectedRadioButton != null) {
        String gender = selectedRadioButton.getText();
        return gender;
    }

    // Retornar um valor padrão ou tratar o caso em que nenhum RadioButton foi selecionado
    return "Não informado";
}
private void limparCampos() {
    // Limpar os campos do formulário após o cadastro
    fieldIdClient.clear();
    filedNomeCliet.clear();
    filedCPFclIENT.clear();
    filedDateNascClient.setValue(null);

    // Limpar os demais campos...
    filedTelefoneClient.clear();
    filedEmailClient.clear();
   filedEnderecoclient.clear();
   filedNumClient.clear();
    filedBairroClient.clear();
    filedCidadeClient.clear();
    filedUFclIENT.clear();
    filedCEPclIENT.clear();

    // Limpar os RadioButtons do grupo de gênero
    genderToggleGroup.selectToggle(null);

    // Adicione outros campos conforme necessário
}


}

