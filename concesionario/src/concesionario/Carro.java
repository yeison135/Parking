/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import Personas.Conductor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yalvarez
 */
public class Carro extends Vehiculo {
    public List<Puerta> puertas = new ArrayList(); // clase hijo 
    public String toString() { //
//        System.out.println("Modelo " + modelo);
//        System.out.println("Marca " + marca);
//        System.out.println("Color " + color);
//        System.out.println("conductor " + persona.nombre);
//        System.out.println("Ruedas");
        for(int i=0;i<ruedas.size();i++){
        
//         ruedas.get(i).imprimir(); // imprimir lista ruedas 
//          System.out.println(" Rueda # "+(int)(i+1)); // convertir a de string a enteros ()  
        }
        return "Modelo " + modelo + " Marca " + marca+ " Color " + color;

    }

    public void acelerar() {

    }

    public void frenar() {

    }

}
