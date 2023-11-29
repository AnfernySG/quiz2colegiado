/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2colegiado;

/**
 *
 * @author USUARIO
 */
public class Cancion {
    private int id;
    private String titulo;
    private String autor;
    private double duracion;
    private int anioCreacion;

    public Cancion(int id, String titulo, String autor, double duracion, int anioCreacion) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.anioCreacion = anioCreacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }
    
    // Método para determinar si la canción es anterior al año actual
    public boolean AnteriorAlAnioActual() {
        return anioCreacion < java.time.Year.now().getValue();
    }

    // Método para determinar si la canción es del año actual
    public boolean DelAnioActual() {
        return anioCreacion == java.time.Year.now().getValue();
    }

    // Método para determinar si la canción es posterior al año actual
    public boolean PosteriorAlAinoActual() {
        return anioCreacion > java.time.Year.now().getValue();
    }

    // Método para obtener una representación de la canción como cadena de texto
    public String toString() {
        return "ID: " + id +
                ", Título: " + titulo +
                ", Autor: " + autor +
                ", Duración: " + duracion +
                ", Año de Creación: " + anioCreacion;
    }
    }


