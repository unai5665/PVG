/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilosadivinadores;

/**
 *
 * @author unaip
 */
public class Main {
     public static void main(String[] args) {
        NumeroOculto numeroOculto = new NumeroOculto();

        // Crear y lanzar 10 hilos
        for (int i = 1; i <= 10; i++) {
            Hilosadivinadores hilo = new Hilosadivinadores(numeroOculto, "Hilo-" + i);
            hilo.start();
        }
    }
    
}
