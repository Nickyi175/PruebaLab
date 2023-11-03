/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaahorcado;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class AdminPalabrasSecretas {
    static ArrayList<String> palabrasSecretas;
    

    public AdminPalabrasSecretas(){
        palabrasSecretas=new ArrayList<>();
        palabrasSecretas.add("OLIMPIA");
        palabrasSecretas.add("MESSI");
        palabrasSecretas.add("RONALDO");
        palabrasSecretas.add("BENGSTON");
        palabrasSecretas.add("MOTAGUA");
    }

    public void agregarPalabra(String palabraSecreta) {
        palabrasSecretas.add(palabraSecreta);
    }
    
    public static ArrayList getpalabrasSecretas(){
        return palabrasSecretas;
    }
}
