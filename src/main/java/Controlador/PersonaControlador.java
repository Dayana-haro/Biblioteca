/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.PersonaModelo;
import java.sql.CallableStatement;
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
public class PersonaControlador {
    private PersonaModelo persona;
    Conexion conectar = new Conexion();
    PreparedStatement ejecutar;
    ResultSet resultado;
    private PesonaReporte person;

    public PersonaControlador() {
    }

    public PersonaControlador(PersonaModelo persona, PreparedStatement ejecutar, ResultSet resultado, PesonaReporte person) {
        this.persona = persona;
        this.ejecutar = ejecutar;
        this.resultado = resultado;
        this.person = person;
    }

    

    public PersonaModelo getPersona() {
        return persona;
    }

    public void setPersona(PersonaModelo persona) {
        this.persona = persona;
    }

    public PesonaReporte getPerson() {
        return person;
    }

    public void setPerson(PesonaReporte person) {
        this.person = person;
    }
    
    

    public void crearPersona(PersonaModelo p) {
        try {
        try (Connection con = Conexion.getConnection();
             CallableStatement cs = con.prepareCall("{CALL InsertarPersona(?, ?)}")) {
            cs.setString(1,p.getCedula() );
            cs.setString(2, p.getNombres());
            cs.execute();
        }
        JOptionPane.showMessageDialog(null, "Persona ingresada correctamente");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al insertar persona: ");
    }
   }
  }
