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
public class Microbuses extends Coches{

    public Microbuses(int plaza, String matricula) {
        super(plaza, matricula);
    }

    
    @Override
    public double precioAlquiler(int plaza) {
        return 2 * plaza;
    }
    
    
  
    
}
