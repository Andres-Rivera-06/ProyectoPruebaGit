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


public class Pos {
    private static final String URL = "jdbc:mysql://localhost:3306/dbpos";
    private static final String USER = "root";
    private static final String PASSWORD = "0000";
    
    public Pos(){
    }
    
    
    /*Mostrar los productos en la tabla */

    public double idproducto;
    public String nombre;
    public int cantidadProducto;
    public double iva;
    public String unidadMedida;
    public double precioVenta;
    public double precioFinal;
    public int cantidadProductoPedido;
    public double descuentoProductoPedido;

    
    // Constructor para crear un objeto Producto
    public Pos(double idproducto, String nombre, String unidadMedida, int cantidadProducto, double precioVenta, double iva, double precioFinal, int cantidadProductoPedido, double descuentoProductoPedido) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.cantidadProducto = cantidadProducto;
        this.iva = iva;
        this.unidadMedida = unidadMedida;
        this.precioVenta = precioVenta;
        this.precioFinal = precioFinal;
        this.cantidadProductoPedido = cantidadProductoPedido;
        this.descuentoProductoPedido = descuentoProductoPedido;
    }

    
    // Método para obtener todos los productos
    public List<Pos> obtenerProducto(double idProducto, int cantidadProductoPedido_1, double descuentoProductoPedido_1) {
        List<Pos> productos = new ArrayList<>();
        String query = "SELECT * FROM producto WHERE idproducto = ?";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setDouble(1, idProducto);
            ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    // Crear un objeto Producto y agregarlo a la lista
                    Pos producto = new Pos(
                        resultSet.getDouble("idproducto"),
                        resultSet.getString("nombre"),
                        resultSet.getString("unidadMedida"),
                        resultSet.getInt("cantidadProducto"),
                        resultSet.getDouble("precioVenta"),
                        resultSet.getDouble("iva"),
                        resultSet.getDouble("precioFinal" ),
                        cantidadProductoPedido_1,
                        descuentoProductoPedido_1
                    );
                    productos.clear();
                    productos.add(producto);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        return productos; // Retorna la lista de productos
    }
}
