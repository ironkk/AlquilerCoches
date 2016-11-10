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
public class Coches extends Vehiculos{
    
    private int plaza;

    public Coches(int plaza, String matricula) {
        super(matricula);
        this.plaza = plaza;
    }

    public int getPlaza() {
        return plaza;
    }

    public void setPlaza(int plaza) {
        this.plaza = plaza;
    }





    
    @Override
    public double precioAlquiler(int dias) {
        return (super.precioAlquiler(dias) * 1.5) + (plaza * 1.5);
    }

  
 
    
}
