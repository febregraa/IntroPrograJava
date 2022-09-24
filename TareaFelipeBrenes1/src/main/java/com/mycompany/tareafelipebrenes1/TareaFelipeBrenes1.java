/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tareafelipebrenes1;

/**
 *
 * @author Felipe
 */
import javax.swing.JOptionPane;
public class TareaFelipeBrenes1 {

    public static void main(String[] args) {
        String entradaMes = JOptionPane.showInputDialog("Ingrese numero correspondiente al mes que desee: ");
        int mes = Integer.parseInt(entradaMes);
        switch(mes){
            case 1: 
                System.out.println("Enero");
                System.out.println("Primer cuatrimestre");
                break;
            case 2:
                System.out.println("Febrero");
                System.out.println("Primer cuatrimestre");
                break;
            case 3: 
                System.out.println("Marzo");
                System.out.println("Primer cuatrimestre");
                break;
            case 4: 
                System.out.println("Abril");
                System.out.println("Primer cuatrimestre");
                break;
            case 5: 
                System.out.println("Mayo");
                System.out.println("Segundo cuatrimestre");
                break;
            case 6: 
                System.out.println("Junio");
                System.out.println("Segundo cuatrimestre");
                break;
            case 7: 
                System.out.println("Julio");
                System.out.println("Segundo cuatrimestre");
                break;
            case 8: 
                System.out.println("Agosto");
                System.out.println("Segundo cuatrimestre");
                break;
            case 9:
                System.out.println("Setiembre");
                System.out.println("Tercer cuatrimestre");
            case 10: 
                System.out.println("Octubre");
                System.out.println("Tercer cuatrimestre");
                break;
            case 11: 
                System.out.println("Noviembre");
                System.out.println("Tercer cuatrimestre");
                break;
            case 12: 
                System.out.println("Diciembre");
                System.out.println("Tercer cuatrimestre");
                break;
               
              
        
        }       
        
    }
}
