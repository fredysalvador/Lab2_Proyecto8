/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2_proyecto8_fredysalvador;

import java.io.Serializable;

/**
 *
 * @author Fredy Salvador
 */
public class Cancion implements Serializable {

    private String Nombre;
    private double timpo_duracion;
    private String Artista;

    private static final long SerialVersionUID = 555L;

    public Cancion() {
    }

    public Cancion(String Nombre, double timpo_duracion, String Artista) {
        this.Nombre = Nombre;
        this.timpo_duracion = timpo_duracion;
        this.Artista = Artista;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getTimpo_duracion() {
        return timpo_duracion;
    }

    public void setTimpo_duracion(double timpo_duracion) {
        this.timpo_duracion = timpo_duracion;
    }

      public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }
    
}
