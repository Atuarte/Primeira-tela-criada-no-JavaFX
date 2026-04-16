package org.example.app_com_interface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastroDAO {

    public void cadastrarUsuario(String nome, String senha) {
        String sql = "INSERT INTO usuarios (nome, senha) VALUES (?, ?)";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            //stmt.setString(2, email);
            stmt.setString(2, senha);
            stmt.executeUpdate();
            IO.println("Usuário criado!");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar", e);
        }
    }
}
