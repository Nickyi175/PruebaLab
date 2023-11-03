/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jeffahorcado;

import java.awt.Graphics;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class JuegoAhorcadoAzar extends JuegoAhorcadoBase {
    private List<String> palabrasPosibles;
    private Random random = new Random();

    public JuegoAhorcadoAzar(List<String> palabrasPosibles) {
        this.palabrasPosibles = palabrasPosibles;
        this.palabraSecreta = seleccionarPalabraAleatoria();
        this.palabraActual = "_".repeat(palabraSecreta.length());
        this.intentos = 6; // Por ejemplo, 6 intentos disponibles
    }

    
    public void inicializarPalabraSecreta() {
        
    }

    
    public void jugar() {
        
    }

    private String seleccionarPalabraAleatoria() {
        int indice = random.nextInt(palabrasPosibles.size());
        return palabrasPosibles.get(indice);
    }

    @Override
    public void actualizarPalabraActual(char letra) {
        StringBuilder nuevaPalabra = new StringBuilder(palabraActual);
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                nuevaPalabra.setCharAt(i, letra);
            }
        }
        palabraActual = nuevaPalabra.toString();
    }

    @Override
    public boolean verificarLetra(char letra) {
        boolean letraCorrecta = false;
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                letraCorrecta = true;
            }
        }
        if (!letraCorrecta) {
            intentos--;
        }
        return letraCorrecta;
    }

    @Override
    public boolean hasGanado() {
        return palabraSecreta.equals(palabraActual);
    }

    @Override
    public void reiniciarJuego() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}