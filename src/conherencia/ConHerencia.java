/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conherencia;

/**
 *
 * @author Estudiante
 */
public class ConHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automovil auto = new Automovil();
        auto.caballosDeFuerza = 10;
        auto.cantidadDePuertas = 4;
        auto.arrancar();
    }
    
}
