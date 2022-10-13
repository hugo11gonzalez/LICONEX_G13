/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liconex_g13;

/**
 *
 * @author hugoa
 */
public class Moto extends Vehiculo {
    private boolean espejos;

    public Moto(boolean espejos, String patente, String marca, int cilindrada) {
        super(patente, marca, cilindrada);
        this.espejos = espejos;
    }

    public boolean isEspejos() {
        return espejos;
    }

    public void setEspejos(boolean espejos) {
        this.espejos = espejos;
    }

    

  
    
    
}
