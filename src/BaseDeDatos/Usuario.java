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

/**
 *
 * @author afrp0
 */
public class Usuario {
    private static final String URL = "jdbc:mysql://localhost:3306/dbpos";
    private static final String USER = "root";
    private static final String PASSWORD = "0000";
    
     public boolean UsuarioExistente (int codigoUsuario) {
        String query = "SELECT * FROM usuarios WHERE idusuario = ?";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, codigoUsuario);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt(1) > 0; 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; 
    }
    public boolean AgregarUsuario (int codigoUsuario, String nombreusuario, String apellidousuario, int idusuario, String contrasenia ) {
        String query = "INSERT INTO usuarios (codigoUsuario,nombreusuario,apellidousuario,idusuario,contrasenia) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, codigoUsuario);
            preparedStatement.setString(2, nombreusuario);
            preparedStatement.setString(3, apellidousuario);
            preparedStatement.setDouble(4, idusuario);
            preparedStatement.setString(5, contrasenia);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0; // Retorna true si se insertó al menos un registro
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
   public boolean EliminarUsuario(int codigoUsuario) {
        String query = "DELETE FROM usuarios WHERE codigoUsuario = ?";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, codigoUsuario);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0; // Retorna true si se eliminó al menos un registro
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
   
   public String[] obtenerUsuarioPorId(int codigoUsuario) {
    String query = "SELECT * FROM usuarios WHERE codigoUsuario = ?";
    try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
         PreparedStatement preparedStatement = connection.prepareStatement(query)) {
        preparedStatement.setInt(1, codigoUsuario);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            // Retorna un arreglo con los datos del usuario
            return new String[]{
                String.valueOf(resultSet.getInt("codigoUsuario")),
                resultSet.getString("nombreusuario"),
                resultSet.getString("apellidousuario"),
                String.valueOf(resultSet.getInt("idusuario")),
                resultSet.getString("contrasenia")
            };
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null; // Devuelve null si no se encuentra el usuario
}
   
   public boolean modificarUsuario(int codigoUsuario, String nombreusuario, String apellidousuario, int idusuario, String contrasena) {
    String query = "UPDATE usuarios SET nombreusuario = ?, apellidousuario = ?, idusuario = ?, contrasenia = ? WHERE codigoUsuario = ?;";
    
    try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
         PreparedStatement preparedStatement = connection.prepareStatement(query)) {
        // Establecer los parámetros en el orden correcto
        preparedStatement.setString(1, nombreusuario); // Nombre del usuario
        preparedStatement.setString(2, apellidousuario); // Apellido del usuario
        preparedStatement.setInt(3, idusuario);
        preparedStatement.setString(4, contrasena);
        preparedStatement.setInt(5, codigoUsuario); // Código del usuario
        

        int rowsAffected = preparedStatement.executeUpdate();
        return rowsAffected > 0; 
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
   
   
   
   public String[] obtenerUsuario(int codigoUsuario) {
    String query = "SELECT * FROM usuarios WHERE idusuario = ?";
    try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
         PreparedStatement preparedStatement = connection.prepareStatement(query)) {
        preparedStatement.setInt(1, codigoUsuario);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            // Retorna un arreglo con los datos del usuario
            return new String[]{
                String.valueOf(resultSet.getInt("codigoUsuario")),
                resultSet.getString("nombreusuario"),
                resultSet.getString("apellidousuario"),
                String.valueOf(resultSet.getInt("idusuario")),
                resultSet.getString("contrasenia")
            };
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null; // Devuelve null si no se encuentra el usuario
}
}




