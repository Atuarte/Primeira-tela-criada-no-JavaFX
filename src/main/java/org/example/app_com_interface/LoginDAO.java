package org.example.app_com_interface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    public boolean autenticar(String emailDigitado, String senhaDigitada) {
        String sql = "SELECT senha FROM usuarios WHERE email = ?";

        try (
                Connection conn = DatabaseConfig.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setString(1, emailDigitado);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String senhaDoBanco = rs.getString("senha");
                    if(senhaDigitada.equals(senhaDoBanco))
                        return true; //senha correta
                    else {
                        return false;//senha incorreta
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao autenticar usuário", e);
        }

        return false; // usuário não encontrado
    }
}

