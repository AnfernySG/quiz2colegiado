/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz2colegiado;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Quiz2colegiado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       Cancion[] top10 = new Cancion[10];

        // Solicitar al usuario que ingrese los datos de 10 canciones
            for (int i = 0; i < 10; i++) {
            // Mostrar cuadros de diálogo para obtener los datos de la canción
             Cancion nuevaCancion = new Cancion(0, "", "", 0, 0);

            // Utilizar JOptionPane para obtener los datos de la canción
            nuevaCancion.setId(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la canción #" + (i + 1))));
            nuevaCancion.setTitulo(JOptionPane.showInputDialog("Ingrese el título de la canción #" + (i + 1)));
            nuevaCancion.setAutor(JOptionPane.showInputDialog("Ingrese el autor de la canción #" + (i + 1)));
            nuevaCancion.setDuracion(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la duración de la canción #" + (i + 1))));
            nuevaCancion.setAnioCreacion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de creación de la canción #" + (i + 1))));

            // Almacenar la nueva canción en el arreglo
            top10[i] = nuevaCancion;
            //JOptionPane.showMessageDialog(nuevaCacion);
        }
            
        
        // Imprimir la información de todas las canciones ingresadas
        System.out.println("Información de todas las canciones:");
        for (Cancion cancion : top10) {
            System.out.println(cancion);
        }

        // Imprimir canciones anteriores al año actual
        System.out.println("\nCanciones anteriores al año actual:");
        for (Cancion cancion : top10) {
            if (cancion.AnteriorAlAnioActual()) {
                System.out.println(cancion);
            }
        }

        // Imprimir canciones del año actual
        System.out.println("\nCanciones del año actual:");
        for (Cancion cancion : top10) {
            if (cancion.DelAnioActual()) {
                System.out.println(cancion);
            }
        }

        // Imprimir canciones posteriores al año actual
        System.out.println("\nCanciones posteriores al año actual:");
        for (Cancion cancion : top10) {
            if (cancion.PosteriorAlAinoActual()) {
                System.out.println(cancion);
            }
        }

        // Encontrar y imprimir la canción de mayor duración
        Cancion cancionMasLarga = top10[0];
        for (Cancion cancion : top10) {
            if (cancion.getDuracion() > cancionMasLarga.getDuracion()) {
                cancionMasLarga = cancion;
            }
        }
        System.out.println("\nCanción de mayor duración:");
        System.out.println(cancionMasLarga);

        // Imprimir el autor de la canción en la primera posición
        System.out.println("\nAutor de la canción en la primera posición:");
        System.out.println(top10[0].getAutor());
    }
    
}
