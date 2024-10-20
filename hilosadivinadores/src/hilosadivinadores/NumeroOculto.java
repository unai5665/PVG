/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilosadivinadores;
import java.util.Random;
/**
 *
 * @author unaip
 */
public class NumeroOculto {
     private int numeroOculto;
    private boolean juegoTerminado;

    public NumeroOculto() {
        Random rand = new Random();
        this.numeroOculto = rand.nextInt(101);  // Número entre 0 y 100
        this.juegoTerminado = false;
    }

    public synchronized int propuestaNumero(int num) {
        if (juegoTerminado) {
            return -1;  // El juego ya ha terminado
        }

        if (num == numeroOculto) {
            juegoTerminado = true;
            return 1;  // Adivinó el número
        }

        return 0;  // Número incorrecto
    }

    public synchronized boolean isJuegoTerminado() {
        return juegoTerminado;
    }
    
}
