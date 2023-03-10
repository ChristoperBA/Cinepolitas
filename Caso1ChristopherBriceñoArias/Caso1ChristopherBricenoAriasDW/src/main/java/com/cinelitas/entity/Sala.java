
package com.cinelitas.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="salas")
public class Sala implements Serializable {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int ID_Sala;
    private int Numero_Sala;
    private int Capacidad_Maxima;
    private String Nombre_Sala;
    
    
    @ManyToOne
    @JoinColumn(name="ID_Sala")
    private  Sala sala;

    public int getID_Sala() {
        return ID_Sala;
    }

    public void setID_Sala(int ID_Sala) {
        this.ID_Sala = ID_Sala;
    }

    public int getNumero_Sala() {
        return Numero_Sala;
    }

    public void setNumero_Sala(int Numero_Sala) {
        this.Numero_Sala = Numero_Sala;
    }

    public int getCapacidad_Maxima() {
        return Capacidad_Maxima;
    }

    public void setCapacidad_Maxima(int Capacidad_Maxima) {
        this.Capacidad_Maxima = Capacidad_Maxima;
    }

    public String getNombre_Sala() {
        return Nombre_Sala;
    }

    public void setNombre_Sala(String Nombre_Sala) {
        this.Nombre_Sala = Nombre_Sala;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
    
}
