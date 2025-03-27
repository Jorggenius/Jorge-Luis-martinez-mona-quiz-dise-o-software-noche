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
import java.util.ArrayList;
import modelo.Moto;

/**
 *
 * @author JORGE
 */
public class MotoRepository {

    public Moto findById(int id) throws SQLException {
        String query = "SELECT * FROM moto WHERE id = " + id;
        try (Connection connection = DataBaseConfig.getConnection(); Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(query)) {
            if (resultSet.next()) {
                return new Moto(
                        resultSet.getInt("id"),
                        resultSet.getString("marca"),
                        resultSet.getInt("cilindraje"),
                        resultSet.getInt("precio"),
                        resultSet.getString("color")
                );
            } else {
                return null;
            }
        }
    }

    public ArrayList<Moto> findAll() throws SQLException {
        String query = "SELECT * FROM moto";
        ArrayList<Moto> clientes = new ArrayList<>();

        try (Connection connection = DataBaseConfig.getConnection(); Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                clientes.add(new Moto(
                        resultSet.getInt("id"),
                        resultSet.getString("marca"),
                        resultSet.getInt("cilindraje"),
                        resultSet.getInt("precio"),
                        resultSet.getString("color")
                ));
            }
        }
        return clientes;
    }

    public void save(Moto moto) throws SQLException {
        String query = "INSERT INTO moto (marca, cilindraje, precio, color) VALUES ('"
                + moto.getMarca() + "', '" + moto.getCilindraje()
                + "', '" + moto.getPrecio() + "', '" + moto.getColor() + "')";
        try (Connection connection = DataBaseConfig.getConnection(); Statement statement = connection.createStatement()) {
            statement.executeUpdate(query);
        }
    }

    public void delete(int id) throws SQLException {
        String query = "DELETE FROM moto WHERE id = " + id;
        try (Connection connection = DataBaseConfig.getConnection(); Statement statement = connection.createStatement()) {
            statement.executeUpdate(query);
        }
    }

    public void update(Moto moto) throws SQLException {
        String query = "UPDATE moto SET marca = '" + moto.getMarca()
                + "', cilindraje = " + moto.getCilindraje()
                + ", precio = " + moto.getPrecio()
                + ", color = '" + moto.getColor()
                + "' WHERE id = " + moto.getId();

        try (Connection connection = DataBaseConfig.getConnection(); Statement statement = connection.createStatement()) {
            statement.executeUpdate(query);
        }
    }
}
