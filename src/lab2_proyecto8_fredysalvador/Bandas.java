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
public class Bandas extends Usuario{
    
private String Nombre;
private String Genero_Musical;
private ArrayList<Cancion> Cancion=new ArrayList();
private int numero_integrantes;

    public Bandas(String Nombre, String Genero_Musical, int numero_integrantes, String username, String password, int edad) {
        super(username, password, edad);
        this.Nombre = Nombre;
        this.Genero_Musical = Genero_Musical;
        this.numero_integrantes = numero_integrantes;
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

    

    public int getNumero_integrantes() {
        return numero_integrantes;
    }

    public void setNumero_integrantes(int numero_integrantes) {
        this.numero_integrantes = numero_integrantes;
    }

}
