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

public class Producto {
    private static final String URL = "jdbc:mysql://localhost:3306/dbpos";
    private static final String USER = "root";
    private static final String PASSWORD = "0000";
    
    public Producto(){
    }
    
    public boolean ProductoExistente (double idproducto) {
        String query = "SELECT * FROM producto WHERE idproducto = ?";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setDouble(1, idproducto);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt(1) > 0; 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; 
    }
    
      
    public boolean AgregarProducto (double idproducto, String nombreproducto, double preciounitario, int cantidadproducto, double iva, String unidadmedida, String nombreproveedor, String fechaingreso, String fechavencimiento, double precioVenta, double rentabilidad, double precioFinal ) {
        String query = "insert into producto(idproducto, nombre, precioUnitario, cantidadProducto, iva, unidadMedida, nombreProveedor, fechaIngreso, fechaVencimiento, precioVenta, porcentajeIva, rentabilidad, precioFinal) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setDouble(1, idproducto);
            preparedStatement.setString(2, nombreproducto);
            preparedStatement.setDouble(3, preciounitario);
            preparedStatement.setInt(4, cantidadproducto);
            preparedStatement.setDouble(5, (precioVenta * iva));
            preparedStatement.setString(6, unidadmedida);
            preparedStatement.setString(7, nombreproveedor);
            preparedStatement.setString(8, fechaingreso);
            preparedStatement.setString(9, fechavencimiento);
            preparedStatement.setDouble(10, precioVenta);
            preparedStatement.setDouble(11, iva);
            preparedStatement.setDouble(12, rentabilidad);
            preparedStatement.setDouble(13, precioFinal);
            
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0; // Retorna true si se insertó al menos un registro
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
}
    
     public String[] obtenerProductoPorId(int codigoUsuario) {
    String query = "SELECT * FROM producto WHERE idproducto = ?";
    try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
         PreparedStatement preparedStatement = connection.prepareStatement(query)) {
        preparedStatement.setInt(1, codigoUsuario);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            // Retorna un arreglo con los datos del usuario
            return new String[]{
                String.valueOf(resultSet.getInt("idproducto")),
                resultSet.getString("nombre"),
                String.valueOf(resultSet.getDouble("precioUnitario")),
                String.valueOf(resultSet.getInt("cantidadProducto")),
                String.valueOf(resultSet.getDouble("iva")),
                resultSet.getString("unidadMedida"),
                resultSet.getString("nombreProveedor"),
                resultSet.getString("fechaIngreso"),
                resultSet.getString("fechaVencimiento"),
                String.valueOf(resultSet.getDouble("precioFinal")),
                String.valueOf(resultSet.getDouble("porcentajeIva")),
                String.valueOf(resultSet.getDouble("rentabilidad")),
                String.valueOf(resultSet.getDouble("precioVenta")),
                
            };
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null; // Devuelve null si no se encuentra el producto
}
     
     public boolean ModificarProducto (double idproducto, String nombreproducto, double preciounitario, int cantidadproducto, double iva, String unidadmedida, String nombreproveedor, String fechaingreso, String fechavencimiento, double precioVenta, double rentabilidad, double precioFinal ) {
        String query = "UPDATE producto SET nombre = ?, precioUnitario = ?, cantidadProducto = ?, iva = ?, unidadMedida = ?, nombreProveedor = ?, fechaIngreso = ?, fechaVencimiento = ?, precioFinal = ?, porcentajeIva = ?, rentabilidad = ?, precioVenta = ? WHERE idproducto = ?";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, nombreproducto);
            preparedStatement.setDouble(2, preciounitario);
            preparedStatement.setInt(3, cantidadproducto);
            preparedStatement.setDouble(4, (precioVenta * iva));
            preparedStatement.setString(5, unidadmedida);
            preparedStatement.setString(6, nombreproveedor);
            preparedStatement.setString(7, fechaingreso);
            preparedStatement.setString(8, fechavencimiento);
            preparedStatement.setDouble(9, precioFinal);
            preparedStatement.setDouble(10, iva);
            preparedStatement.setDouble(11, rentabilidad);
            preparedStatement.setDouble(12, precioVenta);
            preparedStatement.setDouble(13, idproducto);
            
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0; // Retorna true si se insertó al menos un registro
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
}

public boolean EliminarProducto(int codigoProducto) {
        String query = "DELETE FROM producto WHERE idproducto = ?";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, codigoProducto);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0; // Retorna true si se eliminó al menos un registro
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /*Mostrar los productos en la tabla */

    public double idproducto;
    public String nombre;
    public double precioUnitario;
    public int cantidadProducto;
    public double iva;
    public String unidadMedida;
    public String nombreProveedor;
    public String fechaIngreso;
    public String fechaVencimiento;
    public double precioVenta;
    public double rentabilidad;
    public double precioFinal;
    public double porcentajeIva;

    
    // Constructor para crear un objeto Producto
    public Producto(double idproducto, String nombre, String unidadMedida, int cantidadProducto, double precioUnitario,  double rentabilidad, double precioVenta, double porcentajeIva, double iva, double precioFinal, String nombreProveedor, String fechaIngreso, String fechaVencimiento) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidadProducto = cantidadProducto;
        this.iva = iva;
        this.unidadMedida = unidadMedida;
        this.nombreProveedor = nombreProveedor;
        this.fechaIngreso = fechaIngreso;
        this.fechaVencimiento = fechaVencimiento;
        this.precioVenta = precioVenta;
        this.rentabilidad = rentabilidad;
        this.precioFinal = precioFinal;
        this.porcentajeIva = porcentajeIva;
    }

    
    // Método para obtener todos los productos
    public List<Producto> obtenerTodosLosProductos() {
        List<Producto> productos = new ArrayList<>();
        String query = "SELECT * FROM producto";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                // Crear un objeto Producto y agregarlo a la lista
                Producto producto = new Producto(
                    resultSet.getDouble("idproducto"),
                    resultSet.getString("nombre"),
                    resultSet.getString("unidadMedida"),
                    resultSet.getInt("cantidadProducto"),
                    resultSet.getDouble("precioUnitario"),
                    resultSet.getDouble("rentabilidad"),
                    resultSet.getDouble("precioVenta"),
                    resultSet.getDouble("porcentajeIva"),
                    resultSet.getDouble("iva"),
                    resultSet.getDouble("precioFinal"),
                    resultSet.getString("nombreProveedor"),
                    resultSet.getString("fechaIngreso"),
                    resultSet.getString("fechaVencimiento")
                );
                productos.add(producto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productos; // Retorna la lista de productos
    }

}
