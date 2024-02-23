/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.LibroModelo;
import Modelo.PersonaModelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class LibrosControlador {
    private   LibroModelo libro;
    private PersonaModelo persona;
    Conexion conectar = new Conexion();
    Connection conectado = (Connection) conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;
    private LibroReporte reporte;

    public LibrosControlador() {
    }

    public LibrosControlador(LibroModelo libro, PreparedStatement ejecutar, ResultSet resultado, LibroReporte reporte) {
        this.libro = libro;
        this.ejecutar = ejecutar;
        this.resultado = resultado;
        this.reporte = reporte;
    }
    
    
    public void crearLibros(LibroModelo libro) {
        try {
            String SQL = "call InsertarLibroRepresado('" + libro.getTitulo() + "','" + libro.getAutor() + "'," + libro.getIsbn()
                    + ",'" + libro.getPaginas()+ "','" + libro.getEdicion()+ "','" + libro.getEditorial()+ "','" + libro.getLugar()
                    + "','" + libro.getPais()+ "','" + libro.getFechadeedicion()+ "','" + libro.getAutor()+"')";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
            int res = ejecutar.executeUpdate();
            //executeUpdate cuando esxribo la base de datos
            //int res cuando escribo
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Libro creado");
            } else {
                JOptionPane.showMessageDialog(null, "Resvise la información ingresada");
            }
            ejecutar.close();
        } catch (SQLException e) {
            System.out.println("ERROR EN LA CONEXIÓN" + e);
        }
    }

    public ArrayList<Object[]> datosLibro() {
        ArrayList<Object[]> listaTotalRegistros = new ArrayList<>();
        try {
            String SQL = "call sp_listaLibros()";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
            resultado = ejecutar.executeQuery();
            //executeQuery cuando consulto la base de datos
            //ResultSet cuando recibo datos
            int cont = 1;
            while (resultado.next()) {

                Object[] fila = new Object[10];
                for (int i = 0; i < 10; i++) {
                    fila[i] = resultado.getObject(i + 1);

                }
                fila[0] = cont;
                cont++;
                listaTotalRegistros.add(fila);
            }
            ejecutar.close();
            return listaTotalRegistros;
        } catch (Exception e) {
            System.out.println("BDD" + e);
        }
        return null;
    }

    public ArrayList<Object[]> buscarPersona(String Titulo) {
        ArrayList<Object[]> listaTotalRegistros = new ArrayList<>();
        try {
            String sql = "call sp_BuscarLibro('" + Titulo + "');";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            ResultSet resultado = ejecutar.executeQuery();
            int cont = 1;
            while (resultado.next()) {
                Object[] fila = new Object[6];
                for (int i = 0; i < 6; i++) {
                    fila[i] = resultado.getObject(i + 1);
                }
                fila[0] = cont;
                listaTotalRegistros.add(fila);
                cont++;
            }
            ejecutar.close();
            return listaTotalRegistros;

        } catch (SQLException e) {
            System.out.println("COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }
        return null;

    }
}
