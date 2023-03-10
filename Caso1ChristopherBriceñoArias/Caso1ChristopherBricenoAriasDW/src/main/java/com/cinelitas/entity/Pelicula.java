
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
@Table(name="peliculas")
public class Pelicula implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int ID_Pelicula;
    private int ID_Sala;
    private String Nombre_Pelicula;
    private int Costo_Entrada;
    private String Fecha_Entrada;
    
    @ManyToOne
    @JoinColumn(name="ID_Pelicula")
    private Pelicula pelicula;

    public int getID_Pelicula() {
        return ID_Pelicula;
    }

    public void setID_Pelicula(int ID_Pelicula) {
        this.ID_Pelicula = ID_Pelicula;
    }

    public int getID_Sala() {
        return ID_Sala;
    }

    public void setID_Sala(int ID_Sala) {
        this.ID_Sala = ID_Sala;
    }

    public String getNombre_Pelicula() {
        return Nombre_Pelicula;
    }

    public void setNombre_Pelicula(String Nombre_Pelicula) {
        this.Nombre_Pelicula = Nombre_Pelicula;
    }

    public int getCosto_Entrada() {
        return Costo_Entrada;
    }

    public void setCosto_Entrada(int Costo_Entrada) {
        this.Costo_Entrada = Costo_Entrada;
    }

    public String getFecha_Entrada() {
        return Fecha_Entrada;
    }

    public void setFecha_Entrada(String Fecha_Entrada) {
        this.Fecha_Entrada = Fecha_Entrada;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    
  

}
