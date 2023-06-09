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
public class Solistas extends Usuario{
private String Nombre;
private String Genero_Musical;
private ArrayList<Cancion> Cancion=new ArrayList();

    public Solistas(String Nombre, String Genero_Musical, String username, String password, int edad) {
        super(username, password, edad);
        this.Nombre = Nombre;
        this.Genero_Musical = Genero_Musical;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getGenero_Musical() {
        return Genero_Musical;
    }

    public void setGenero_Musical(String Genero_Musical) {
        this.Genero_Musical = Genero_Musical;
    }

    public ArrayList<Cancion> getCancion() {
        return Cancion;
    }

    public void setCancion(ArrayList<Cancion> cancion) {
        this.Cancion = cancion;
    }
    
    
    
}
