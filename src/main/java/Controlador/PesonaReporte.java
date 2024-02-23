/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author user
 */
public class PesonaReporte {
    String Cédula;
    String Nombre;

    public PesonaReporte() {
    }

    public PesonaReporte(String Cédula, String Nombre) {
        this.Cédula = Cédula;
        this.Nombre = Nombre;
    }

    public String getCédula() {
        return Cédula;
    }

    public void setCédula(String Cédula) {
        this.Cédula = Cédula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    class person {

        public person() {
        }
    }
    
}
