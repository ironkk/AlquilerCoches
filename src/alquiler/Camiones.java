/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquiler;

/**
 *
 * @author dam
 */
public class Camiones extends Vehiculos {

    public Camiones(String matricula) {
        super(matricula);
    }

    
    @Override
    public double precioAlquiler(int dias) {
        return super.precioAlquiler(dias) + 40;
    }
    
    
}
