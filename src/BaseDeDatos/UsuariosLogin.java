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
public class UsuariosLogin {
    private static final String URL = "jdbc:mysql://localhost:3306/dbpos";
    private static final String USER = "root";
    private static final String PASSWORD = "0000";

    public boolean validarUsuario (String idusuario, String contrasenia) {
        boolean esvalido = false;
        String query = "SELECT * FROM usuarios WHERE idusuario = ? AND contrasenia = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, idusuario);
            preparedStatement.setString(2, contrasenia);
            ResultSet resultSet = preparedStatement.executeQuery();
            esvalido = resultSet.next(); 
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return esvalido;
    }
}

