/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import com.mycompany.quiz.DataBaseConfig;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Usuario;

/**
 *
 * @author JORGE
 */
public class UsuarioRepository {

    public Usuario findById(int id) throws SQLException {
        String query = "SELECT * FROM usuario WHERE id = " + id;
        try (Connection connection = DataBaseConfig.getConnection(); Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(query)) {
            if (resultSet.next()) {
                return new Usuario(
                        resultSet.getInt("id"),
                        resultSet.getString("nombre"),
                        resultSet.getString("contraseña")
                );
            } else {
                return null;
            }
        }
    }

    public void save(Usuario usuario) throws SQLException {
        String query = "INSERT INTO cliente (nombre, contraseña, ) VALUES ('"
                + usuario.getNombre() + "', '" + usuario.getContraseña()
                + "')";
        try (Connection connection = DataBaseConfig.getConnection(); Statement statement = connection.createStatement()) {
            statement.executeUpdate(query);
        }
    }
}
