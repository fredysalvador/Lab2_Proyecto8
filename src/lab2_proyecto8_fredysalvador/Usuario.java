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
public class Usuario {
     private String username;
    private String password;
    private int edad;

    public Usuario(String username, String password, int edad) {
        this.username = username;
        this.password = password;
        this.edad = edad;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getEdad() {
        return edad;
    }
}
