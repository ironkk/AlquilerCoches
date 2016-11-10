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


//20 € * PMA
public class FurgonetasCarga extends Vehiculos {
    
    private double PMA;

    public FurgonetasCarga(double PMA, String matricula) {
        super(matricula);
        this.PMA = PMA;
    }

    public double getPMA() {
        return PMA;
    }

    public void setPMA(double PMA) {
        this.PMA = PMA;
    }

    @Override
    public double precioAlquiler(int dias) {
        return super.precioAlquiler(dias) + (20 * PMA);
    }

    

    
    
}
