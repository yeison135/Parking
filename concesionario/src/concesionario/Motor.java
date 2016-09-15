/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;


public class Motor {
    public   int modelo;
    public   int serie;
    public   int cilindraje;
      
    public void imprimir(){
        System.out.println("Modelo Motor" + modelo);
        System.out.println("serie Motor " + serie);
        System.out.println("Cilindrage Motor " + cilindraje);
    }
    
}
