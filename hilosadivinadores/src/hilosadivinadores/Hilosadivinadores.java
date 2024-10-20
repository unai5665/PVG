/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilosadivinadores;
import java.util.Random;

/**
 *
 * @author unaip
 */
public class Hilosadivinadores extends Thread {
    private NumeroOculto numeroOculto;
    private String nombreHilo;
    
    public Hilosadivinadores(NumeroOculto numeroOculto, String nombreHilo){
        this.numeroOculto = numeroOculto;
        this.nombreHilo = nombreHilo;
    }

   @Override
    public void run() {
        Random rand = new Random();
        
        
        while (!numeroOculto.isJuegoTerminado()){
            int propuesta = rand.nextInt(101);
            int resultado = numeroOculto.propuestaNumero(propuesta);
            
            if(resultado == -1){
                System.out.println(nombreHilo + " se detiene, otro hilo ya adivinó el número.");
                break;
            } else if (resultado == 1){
                System.out.println(nombreHilo + "adivinó el número: " + propuesta);
                break;
            }else{
                System.out.println(nombreHilo + "propuso: " + propuesta + "(incorrecto)");
            }
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
    }
       
    }
    
}
