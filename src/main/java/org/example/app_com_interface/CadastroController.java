package org.example.app_com_interface;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CadastroController {
    @FXML
    private TextField campoUsuario;
    @FXML
    private TextField campoMatricula;
    @FXML
    private PasswordField criarSenha;
    @FXML
    private PasswordField campoConfirmarSenha;
    @FXML
    private Button btnVoltar;
    @FXML
    private Button btnCriarConta;

    // Metodo chamado ao clicar no botão, volto para a tela de loguin
    @FXML
    protected void onVoltarClick() throws IOException {
        //ao clicar no botão, volto para a tela de login
      HelloApplication.trocadorDeTelas("hello-view.fxml");
    }
    @FXML
    public void onClicarClick() {

        String usuario = campoUsuario.getText();
        String senha = criarSenha.getText();
        String confirmarSenha = campoConfirmarSenha.getText();

        if (usuario.isBlank() || senha.isBlank() || confirmarSenha.isBlank()){
            //Exiba uma janela de aviso para o usuário
            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Campos Obrigatórios");
            alerta.setHeaderText(null);
            alerta.setContentText("Preenchimento dos campos é obrigatório!");
            alerta.showAndWait();

            return;
        }

        //Verificar se a "senha" e "confirmar senha" estão corretas
        if (!(senha.equals(confirmarSenha))){
            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Senhas não conferem");
            alerta.setHeaderText(null);
            alerta.setContentText("As senhas não conferem. Digite a senha novamente");
            alerta.showAndWait();

            return;
    }
        CadastroDAO dao = new CadastroDAO();
}
