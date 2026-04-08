package org.example.app_com_interface;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField txtUsuario;

    @FXML
    PasswordField txtSenha;

    @FXML
    Button btnLoguin;

    @FXML
    Label labelLoguin;

    @FXML
    protected void onButtonLoguinClick() {
        LoginDAO usuario = new LoginDAO();

        String usuarioDigitado = txtUsuario.getText();
        String senhaDigitada = txtSenha.getText();

        boolean autenticado = usuario.autenticar(usuarioDigitado, senhaDigitada);

        if (autenticado == true) {
            labelLoguin.setText("Usuário e senha corretos!");
        } else {
            labelLoguin.setText("Usuário ou senha incorretos!");
        }
    }
}