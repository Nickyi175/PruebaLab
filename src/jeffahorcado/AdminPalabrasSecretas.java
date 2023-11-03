/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jeffahorcado;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author aleja
 */
public class AdminPalabrasSecretas {
    private List<String> palabrasSecretas;

    public AdminPalabrasSecretas() {
        palabrasSecretas = new ArrayList<>();
    }

    public void agregarPalabra(String palabra) {
        palabrasSecretas.add(palabra);
    }

    public String seleccionarPalabraAzar() {
        if (palabrasSecretas.isEmpty()) {
            System.out.println("No hay palabras secretas disponibles.");
            return "";
        }
        Random random = new Random();
        int indice = random.nextInt(palabrasSecretas.size());
        return palabrasSecretas.get(indice);
    }
}