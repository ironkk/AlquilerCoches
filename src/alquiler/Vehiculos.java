/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquiler;

public class Vehiculos {
   
    private String matricula;

    public Vehiculos(String matricula) {
        this.matricula = matricula;
    }
    
    public double precioAlquiler(int dias){
        return 50 * dias;
        
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
