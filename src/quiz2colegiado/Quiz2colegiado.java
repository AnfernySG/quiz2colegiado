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
             Cancion cancionNueva = new Cancion(0, "", "", 0, 0);

            // Utilizar JOptionPane para obtener los datos de la canción
            cancionNueva.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite el ID de la canción #" + (i + 1))));
            cancionNueva.setTitulo(JOptionPane.showInputDialog("Digite el título de la canción #" + (i + 1)));
            cancionNueva.setAutor(JOptionPane.showInputDialog("Digite el autor de la canción #" + (i + 1)));
            cancionNueva.setDuracion(Double.parseDouble(JOptionPane.showInputDialog("Digite la duración de la canción #" + (i + 1))));
            cancionNueva.setAnioCreacion(Integer.parseInt(JOptionPane.showInputDialog("Digite el año de creación de la canción #" + (i + 1))));

            // Almacenar la nueva canción en el arreglo
            top10[i] = cancionNueva;
            
        }
            
        
        // Imprime la información de las canciones 
        System.out.println("Información de las canciones:");
        for (Cancion cancion : top10) {
            System.out.println(cancion);
        }

        // Imprime canciones anteriores al año actual
        System.out.println("\nCanciones anteriores al año actual:");
        for (Cancion cancion : top10) {
            if (cancion.AnteriorAlAnioActual()) {
                System.out.println(cancion);
            }
        }

        // Imprime canciones del año actual
        System.out.println("\nCanciones del año actual:");
        for (Cancion cancion : top10) {
            if (cancion.DelAnioActual()) {
                System.out.println(cancion);
            }
        }

        // Imprime canciones posteriores al año actual
        System.out.println("\nCanciones posteriores al año actual:");
        for (Cancion cancion : top10) {
            if (cancion.PosteriorAlAinoActual()) {
                System.out.println(cancion);
            }
        }

        // Encuentra e imprime la canción de mayor duración
        Cancion cancionMasLarga = top10[0];
        for (Cancion cancion : top10) {
            if (cancion.getDuracion() > cancionMasLarga.getDuracion()) {
                cancionMasLarga = cancion;
            }
        }
        System.out.println("\nCanción de mayor duración:");
        System.out.println(cancionMasLarga);

        // Imprime el autor de la canción en la primera posición
        System.out.println("\nAutor de la canción en la primera posición:");
        System.out.println(top10[0].getAutor());
    }
    
}
