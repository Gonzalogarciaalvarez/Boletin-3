/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg3_1;

import java.util.Scanner;

/**
 *
 * @author mfrancomartinez
 */
public class Boletin3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    Coche ejercicio1 = new Coche();
    System.out.println("Velocidade actual:"+ejercicio1.getVelocidade());
    ejercicio1.acelerar(40);
    System.out.println("Velocidade actual:"+ejercicio1.getVelocidade());
    ejercicio1.frenar(50);
    System.out.println("Velocidade actual:"+ejercicio1.getVelocidade()); 
    //jgfzs
    }
    
}
