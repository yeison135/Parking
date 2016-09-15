/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Personas.Conductor;
import concesionario.Carro;
import concesionario.Moto;
import concesionario.Motor;
import concesionario.Puerta;
import concesionario.Rueda;
import concesionario.Vehiculo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author yalvarez
 */
public class Menu {

    public static void main(String[] args) {

        Puerta carpuerta1 = new Puerta();//puerta 1
        carpuerta1.color = "verde";
        carpuerta1.material = "acero";
        carpuerta1.pocision = "derecha";

        Puerta carpuerta2 = new Puerta();//puerta 2
        carpuerta2.color = "Amarillopollito";
        carpuerta2.material = "acero";
        carpuerta2.pocision = "izquierda";

        Puerta carpuerta3 = new Puerta();//puerta 3
        carpuerta3.color = "verde";
        carpuerta3.material = "acero";
        carpuerta3.pocision = "traceraizquierda";

        Puerta carpuerta4 = new Puerta();//puerta 4
        carpuerta4.color = "verde";
        carpuerta4.material = "acero";
        carpuerta4.pocision = "traceraderecha";

        Rueda carrueda = new Rueda();//rueda carro
        carrueda.diametro = 400;
        carrueda.fabricante = "semesn";
        carrueda.material = "metal";

        Conductor concarro = new Conductor();
        concarro.lc = 1256985;
        concarro.nombre = "camilo";       //conductor del carro 
        concarro.telefono = 578956;

        //____________________________________
        Motor carmotor = new Motor();// cree motor carro
        carmotor.cilindraje = 1300;
        carmotor.modelo = 2016;
        carmotor.serie = 14558;

        //____________________________________
        Carro sandero = new Carro();
        sandero.modelo = 2016;
        sandero.color = "azul";
        sandero.marca = "sandero";
        sandero.tipomotor = carmotor;
        carmotor.cilindraje = 1200;
        sandero.puertas.add(carpuerta1);// obgetos de el carro 1
        sandero.puertas.add(carpuerta2);
        sandero.puertas.add(carpuerta3);
        sandero.puertas.add(carpuerta4);
        sandero.persona = concarro;
        sandero.ruedas.add(carrueda);
        sandero.ruedas.add(carrueda);
        sandero.ruedas.add(carrueda);
        sandero.ruedas.add(carrueda);

        //___________________________________
        Carro renault = new Carro();
        renault.modelo = 2004;
        renault.color = "violeta";
        renault.marca = "reanut";
        renault.tipomotor = carmotor;
        carmotor.cilindraje = 1600;
        renault.puertas.add(carpuerta1);// obgetos de el carro 2
        renault.puertas.add(carpuerta2);
        renault.puertas.add(carpuerta3);
        renault.puertas.add(carpuerta4);
        renault.persona = concarro;
        renault.ruedas.add(carrueda);
        renault.ruedas.add(carrueda);
        renault.ruedas.add(carrueda);
        renault.ruedas.add(carrueda);

        //____________________________________
        Carro ford = new Carro();
        ford.modelo = 2000;
        ford.color = "verde";
        ford.marca = "ford";
        ford.tipomotor = carmotor;
        carmotor.cilindraje = 1900;
        ford.puertas.add(carpuerta1);// obgetos de el carro 3
        ford.puertas.add(carpuerta2);
        ford.puertas.add(carpuerta3);
        ford.puertas.add(carpuerta4);
        ford.persona = concarro;
        ford.ruedas.add(carrueda);
        ford.ruedas.add(carrueda);
        ford.ruedas.add(carrueda);
        ford.ruedas.add(carrueda);

        //____________________________________
        Carro chevrolet = new Carro();
        chevrolet.modelo = 2010;
        chevrolet.color = "rojo";
        chevrolet.marca = "chevrolet";
        chevrolet.tipomotor = carmotor;
        carmotor.cilindraje = 4000;
        chevrolet.puertas.add(carpuerta1);// obgetos de el carro 4
        chevrolet.puertas.add(carpuerta2);
        chevrolet.puertas.add(carpuerta3);
        chevrolet.puertas.add(carpuerta4);
        chevrolet.persona = concarro;
        chevrolet.ruedas.add(carrueda);
        chevrolet.ruedas.add(carrueda);
        chevrolet.ruedas.add(carrueda);
        chevrolet.ruedas.add(carrueda);

        //____________________________________
        Carro kia = new Carro();
        kia.modelo = 2011;
        kia.color = "rojo";
        kia.marca = "kia";
        kia.tipomotor = carmotor;
        carmotor.cilindraje = 4000;
        kia.puertas.add(carpuerta1);// obgetos de el carro 5
        kia.puertas.add(carpuerta2);
        kia.puertas.add(carpuerta3);
        kia.puertas.add(carpuerta4);
        kia.persona = concarro;
        kia.ruedas.add(carrueda);
        kia.ruedas.add(carrueda);
        kia.ruedas.add(carrueda);
        kia.ruedas.add(carrueda);

        //____________________________________
        Moto akt = new Moto();
        akt.color = "Morado";
        akt.marca = "moto de marca akt"; //obgetos de la moto  1
        akt.tipomotor = carmotor;
        akt.ruedas.add(carrueda);
        akt.ruedas.add(carrueda);
        akt.persona = concarro;
        akt.colorcasco = "rojo";

        Moto honda = new Moto();
        honda.color = "Morado";
        honda.marca = "moto de marca honda"; //obgetos de la moto  2
        honda.tipomotor = carmotor;
        honda.ruedas.add(carrueda);
        honda.ruedas.add(carrueda);
        honda.persona = concarro;
        honda.colorcasco = "violeta";

        Moto nero = new Moto();
        nero.color = "Morado";
        nero.marca = "moto nero"; //obgetos de la moto  3
        nero.tipomotor = carmotor;
        nero.ruedas.add(carrueda);
        nero.ruedas.add(carrueda);
        nero.persona = concarro;
        nero.colorcasco = "amarillo";

        Moto ktm = new Moto();
        ktm.color = "Morado";
        ktm.marca = "moto de marca ktm"; //obgetos de la moto  4
        ktm.tipomotor = carmotor;
        ktm.ruedas.add(carrueda);
        ktm.ruedas.add(carrueda);
        ktm.persona = concarro;
        ktm.colorcasco = "negro";

        Moto vemar = new Moto();
        vemar.color = "Morado";
        vemar.marca = "moto de marca vemar"; //obgetos de la moto  5
        vemar.tipomotor = carmotor;
        vemar.ruedas.add(carrueda);
        vemar.ruedas.add(carrueda);
        vemar.persona = concarro;
        vemar.colorcasco = "lila";
        //________________________________________

        List<Puerta> numpuertas = new ArrayList(); //lista de puertas
        numpuertas.add(carpuerta1);
        numpuertas.add(carpuerta2);
        numpuertas.add(carpuerta3);
        numpuertas.add(carpuerta4);

        //inicio de lista
        List<Carro> carros = new ArrayList();
        carros.add(sandero);
        carros.add(renault); // lista carro 
        carros.add(ford);
        carros.add(chevrolet);
        carros.add(kia);

        Carro[] arcarro = new Carro[5];
        arcarro[1] = sandero;
        arcarro[4] = renault; // arreglo moto
        arcarro[2] = ford;
        arcarro[3] = chevrolet;
        arcarro[0] = kia;

        //_______________________________________
        List<Moto> motos = new ArrayList();
        motos.add(ktm);
        motos.add(nero); // lista carro 
        motos.add(vemar);
        motos.add(akt);
        motos.add(honda);

        Moto[] armotos = new Moto[5];
        armotos[0] = ktm;
        armotos[1] = nero;
        armotos[2] = vemar;
        armotos[3] = honda;
        armotos[4] = akt;
//        int y;
//        for (int i = 0; i < arcarro.length; i++) { // datos carro 
//            y = i + 1;
//            System.out.print("Auto # ");
//            System.out.println((int) (i + 1)); // convertir a de string a enteros ()
//            System.out.println("cilindraje " + arcarro[i].tipomotor.cilindraje);
//            arcarro[i].imprimir();
//
//        }

        List<Vehiculo> vehiculos = new ArrayList();
        vehiculos.add(ktm);
        vehiculos.add(nero); // lista carro 
        vehiculos.add(vemar);
        vehiculos.add(akt);
        vehiculos.add(honda);
        vehiculos.add(sandero);
        vehiculos.add(renault); // lista carro 
        vehiculos.add(ford);
        vehiculos.add(chevrolet);
        vehiculos.add(kia);
//            vehiculos.add(carros.get(i));
//            vehiculos.add(motos.get(i));

        // motos 
        for (int i = 0; i < vehiculos.size(); i++) {
            try {
                Carro carr = (Carro) vehiculos.get(i); // ------CAST
                System.out.println("Carro : " + carr);

            } catch (ClassCastException e) {//P
                Moto mot = (Moto) vehiculos.get(i);
                System.out.println("el color del casco es : "+mot.colorcasco);
            }
        }
        System.out.println("el numero de vehiculos en la lista es de : " + vehiculos.size());

         String entradaTeclado = "";
         String hola = "";
         Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
         entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
         System.out.println("hola");
         hola = entradaEscaner.nextLine ();
         System.out.println("hola");
//         if (vehiculos.get(i).equals(carros.get(i).puertas)){
//         System.out.println("ENRTYUIO------------------------------------------------------" );
//         System.out.println(" el vehiculo es tipo carro de marca " + carros.get(i).puertas);
//         
//         }
    }
}

/**
 * List<Vehiculo> vehiculos = new ArrayList(); vehiculos.add(ktm);
 * vehiculos.add(nero); // lista carro vehiculos.add(vemar); vehiculos.add(akt);
 * vehiculos.add(honda); vehiculos.add(sandero); vehiculos.add(renault); //
 * lista carro vehiculos.add(ford); vehiculos.add(chevrolet);
 * vehiculos.add(kia); // vehiculos.add(carros.get(i)); //
 * vehiculos.add(motos.get(i));
 *
 * // motos for (int i = 0; i < carros.size(); i++) { System.out.print(" el
 * vehiculo es tipo " + vehiculos.get(i).marca + " "); System.out.println(" de
 * color " + vehiculos.get(i).colorcasco + " ");
 *
 * System.out.println(" el vehiculo es tipo carro de marca " +
 * carros.get(i).marca); System.out.println("y el numero de puertas es: " +
 * carros.get(i).puertas.size());
 *
 * }
 */
