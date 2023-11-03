/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ahorcado;

/**
 *
 * @author aleja
 */
public class DibujoAhorcado {
    private int intentosRestantes;

    public DibujoAhorcado(int intentosRestantes) {
        this.intentosRestantes = intentosRestantes;
    }

    public void actualizarIntentos(int intentosRestantes) {
        this.intentosRestantes = intentosRestantes;
    }

    public String dibujarMuñeco() {
        String muñeco = "";
        if (intentosRestantes < 6) muñeco += "|";
        if (intentosRestantes < 4) muñeco += "\n|";
        if (intentosRestantes < 6) muñeco += "\n O  ";
        if (intentosRestantes < 5) muñeco += "\n /";
        if (intentosRestantes < 4) muñeco += "|";
        if (intentosRestantes < 3) muñeco += "\\";
        if (intentosRestantes < 2) muñeco += "\n /";
        if (intentosRestantes < 1) muñeco += " \\";
       
        

        return muñeco;
    }
}