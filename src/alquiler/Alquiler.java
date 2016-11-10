/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquiler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dam
 */
public class Alquiler {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Array
        List<Vehiculos> misVehiculos = new ArrayList<>(4);

        //Coches
        Coches ferrari = new Coches(3, "2244BBB");

        //añadir
        misVehiculos.add(ferrari);
        //Microbuses

        Microbuses miBus = new Microbuses(8, "2214BCB");

        //añadir
        misVehiculos.add(miBus);

        //FurgonetasCargas
        FurgonetasCarga miFurgoneta = new FurgonetasCarga(80, "1579BNC");

        //añadir
        misVehiculos.add(miFurgoneta);

        //Camiones
        Camiones miCamion = new Camiones("1251JVC");

        //añadir
        misVehiculos.add(miCamion);

        try {
            System.out.println("Matricula: ");
            String matricula = br.readLine();
            System.out.println("Dias Duracion Alquiler: ");
            int dias = Integer.parseInt(br.readLine());
            for (Vehiculos v : misVehiculos) {
                if(matricula.equalsIgnoreCase(v.getMatricula()))
                   
                System.out.println(v.precioAlquiler(dias));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        
        
     


    }

}
