/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/recuperacion";
    private static final String USER = "root";
    private static final String PASSWORD = "Dayana26*";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    java.sql.Connection conexion;

    public java.sql.Connection conectar() {
        //LANZAR CÓDIGO DE PRUEBA 
        try {
            //Manera de Conexión a la Base de Datos
            Class.forName("com.mysql.jdbc.Driver");
            //Parámetros de conexión url/usuario/clave en mysql
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/recuperacion?autoReconnect=true&useSSL=false", "root", "Dayana26*");
            System.out.println("CONECTADO");
        } catch (ClassNotFoundException | SQLException e)//CAPTURAR ERRORES 
        {
            System.out.println("ERROR DE CONEXION A LA BASE DE DATOS");
        }
        return conexion;
    }

}
