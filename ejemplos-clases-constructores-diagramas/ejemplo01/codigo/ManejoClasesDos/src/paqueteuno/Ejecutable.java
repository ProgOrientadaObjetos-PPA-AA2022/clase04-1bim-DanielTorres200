/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

import paquetedos.Computadora;

public class Ejecutable {
    public static void main(String[] args) {
        // Se crea un objeto
        Computadora computadoraPersonall = new Computadora(16);
        Computadora computadoraPersonal2 = new Computadora("Intel");
        Computadora computadoraPersonal3 = new Computadora("AMD", 8);
        
        // Se asigna valores particulares al objeto
        // a través de los métodos establecer
        
        String procesador = "Intel";
        double memoria = 8.2; // se asume que está expresada en GB
        computadoraPersonal.establecerTipoProcesador(procesador);
        computadoraPersonal.establecerMemoria(memoria);
        
        // Se presenta valores en pantalla, rescatando los valores
        // que se necesita a través de los métodos obtener del
        // objeto 
        
        System.out.printf("Computadora\n"
                + "Procesador: %s\n"
                + "Memoria: %.2f GB\n", 
                computadoraPersonal.obtenerTipoProcesador(),
                computadoraPersonal.obtenerMemoria());
        
         System.out.printf("Computadora\n"
                + "Procesador: %s\n"
                + "Memoria: %.2f GB\n", 
                computadoraPersona2.obtenerTipoProcesador(),
                computadoraPersona2.obtenerMemoria());
        
          System.out.printf("Computadora\n"
                + "Procesador: %s\n"
                + "Memoria: %.2f GB\n", 
                computadoraPersona3.obtenerTipoProcesador(),
                computadoraPersona3.obtenerMemoria());
    }
}
