/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liconex_g13;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author hugoa
 */
public class Examen {
    private LocalDate fecha;
    Persona Per;

    public Examen(LocalDate fecha, Persona Per) {
        this.fecha = fecha;
        this.Per = Per;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Persona getPer() {
        return Per;
    }

    public void setPer(Persona Per) {
        this.Per = Per;
    }

    @Override
    public String toString() {
        return "Examen{" + "fecha=" + fecha + ", Per=" + Per + '}';
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Examen other = (Examen) obj;
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        if (!Objects.equals(this.Per, other.Per)) {
            return false;
        }
        return true;
    }
    
}
