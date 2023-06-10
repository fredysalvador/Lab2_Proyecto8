/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2_proyecto8_fredysalvador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fredy Salvador
 */
public class Eventos {
    private String fecha_Comienzo;
    private String Ciudad;
    private String Lugar;
    private int capacidad_personas;
private ArrayList<Cancion> Cancion=new ArrayList();

    public Eventos() {
    }

    public Eventos(String fecha_Comienzo, String Ciudad, String Lugar, int capacidad_personas) {
        this.fecha_Comienzo = fecha_Comienzo;
        this.Ciudad = Ciudad;
        this.Lugar = Lugar;
        this.capacidad_personas = capacidad_personas;
        this.Cancion = new ArrayList<>();
    }

    public String getFecha_Comienzo() {
        return fecha_Comienzo;
    }

    public void setFecha_Comienzo(String fecha_Comienzo) {
        this.fecha_Comienzo = fecha_Comienzo;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public int getCapacidad_personas() {
        return capacidad_personas;
    }

    public void setCapacidad_personas(int capacidad_personas) {
        this.capacidad_personas = capacidad_personas;
    }
    
     public ArrayList<Cancion> getCancion() {
        return Cancion;
    }

    public void setCancion(ArrayList<Cancion> cancion) {
        this.Cancion = cancion;
    }
    
    public void agregarCanciones(List<Cancion> cancion) {
        this.Cancion.addAll(cancion);
    }
}
