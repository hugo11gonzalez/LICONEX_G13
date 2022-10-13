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
public class Auto extends Vehiculo{
    private int cantidadpuertas;

    public Auto(int cantidadpuertas, String patente, String marca, int cilindrada) {
        super(patente, marca, cilindrada);
        this.cantidadpuertas = cantidadpuertas;
    }

    public int getCantidadpuertas() {
        return cantidadpuertas;
    }

    public void setCantidadpuertas(int cantidadpuertas) {
        this.cantidadpuertas = cantidadpuertas;
    }
    
}
