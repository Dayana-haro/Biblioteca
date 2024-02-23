/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author user
 */
public class LibroModelo {
    String titulo;
    String idlibro;
    String isbn;
    String autor; 
    String editorial;
    String edicion;
    String lugar;
    String ciudad;
    String pais;
    String fechadeedicion;
    String paginas;

    public LibroModelo() {
    }

    public LibroModelo(String titulo, String idlibro, String isbn, String autor, String editorial, String edicion, String lugar, String ciudad, String pais, String fechadeedicion, String paginas) {
        this.titulo = titulo;
        this.idlibro = idlibro;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
        this.edicion = edicion;
        this.lugar = lugar;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fechadeedicion = fechadeedicion;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(String idlibro) {
        this.idlibro = idlibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFechadeedicion() {
        return fechadeedicion;
    }

    public void setFechadeedicion(String fechadeedicion) {
        this.fechadeedicion = fechadeedicion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
}
