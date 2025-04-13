/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class Cliente {
    private static final String URL = "jdbc:mysql://localhost:3306/dbpos";
    private static final String USER = "root";
    private static final String PASSWORD = "0000";
    
     public boolean ClienteExistente (int idcliente) {
        String query = "SELECT * FROM cliente WHERE idcliente = ?";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, idcliente);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt(1) > 0; 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; 
    }
    public boolean AgregarCliente (int idcliente, String nombres, String apellidos, double celular, String email ) {
        String query = "INSERT INTO cliente (idcliente, nombres, apellidos, celular, email) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, idcliente);
            preparedStatement.setString(2, nombres);
            preparedStatement.setString(3, apellidos);
            preparedStatement.setDouble(4, celular);
            preparedStatement.setString(5, email);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0; // Retorna true si se insertó al menos un registro
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
   public String[] obtenerCliente(int codigoCliente) {
    String query = "SELECT * FROM cliente WHERE idcliente = ?";
    try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
         PreparedStatement preparedStatement = connection.prepareStatement(query)) {
        preparedStatement.setInt(1, codigoCliente);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            // Retorna un arreglo con los datos del usuario
            return new String[]{
                String.valueOf(resultSet.getInt("idcliente")),
                resultSet.getString("nombres"),
                resultSet.getString("apellidos"),
            };
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null; // Devuelve null si no se encuentra el usuario
}
}
