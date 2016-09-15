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
public  abstract class Vehiculo{
  
  public  int modelo;
  public  String marca;
  public  String color;
  public  String motor;
 
 public List <Rueda> ruedas=new ArrayList();// Clase padre 

  public  Motor tipomotor=new Motor();
  public  Conductor persona;
    
    public void acelerar(){
     
      
    }
    public void frenar(){

    }
}
 