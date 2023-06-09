/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2_proyecto8_fredysalvador;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Fredy Salvador
 */
public class adminBanda {
     private ArrayList<Bandas> listaBanda = new ArrayList();
    private File archivo = null;
    
    public adminBanda(String path) {
        archivo = new File(path);
    }

    public ArrayList<Bandas> getListaPersonas() {
        return listaBanda;
    }

    public void setListaPersonas(ArrayList<Bandas> listaBandas) {
        this.listaBanda = listaBandas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setBanda(Bandas a){
        listaBanda.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            listaBanda = new ArrayList();
            Bandas temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Bandas) objeto.readObject()) != null) {
                        listaBanda.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Bandas t : listaBanda) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
