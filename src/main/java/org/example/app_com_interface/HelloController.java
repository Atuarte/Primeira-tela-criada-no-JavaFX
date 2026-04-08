package org.example.app_com_interface;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.awt.image.ImagingOpException;

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
    protected void onButtonLoguinClick(){
        labelLoguin.setText("Login realizado com sucesso!");
    }
}
