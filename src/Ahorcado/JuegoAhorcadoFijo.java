package Ahorcado;

import java.awt.Graphics;
import javax.swing.JOptionPane;

//APARENTEMENTE LISTO PERO REVISAR
class JuegoAhorcadoFijo extends JuegoAhorcadoBase {

    public JuegoAhorcadoFijo(String palabraSecreta) {
        this.palabraSecreta = palabraSecreta.toLowerCase();
        this.intentos = 6;
        inicializarPalabraSecreta();
//      this.palabraActual = "_".repeat(palabraSecreta.length());
        
    }

    public void inicializarPalabraSecreta() {
        palabraActual = "";
        for (int i = 0; i < palabraSecreta.length(); i++) {
            palabraActual += "_";
        }
        //no tenia nada antes
    }

    public void jugar() {
        System.out.println(palabraSecreta);
        while (intentos > 0) {
            String lineas = "";
            for (int i = 0; i < palabraActual.length(); i++) {
                lineas += palabraActual.charAt(i) + " ";
            }
            String caracter;
            do {
                caracter = JOptionPane.showInputDialog(null, "Ingrese un caracter\nCantidad de caracteres" + lineas + "\nIntentos restantes: " + intentos, "AHORCADO FIJO", JOptionPane.INFORMATION_MESSAGE);
            } while (caracter == null);
            caracter = caracter.toLowerCase();
            if (!caracter.equals("")) {
                char letra = caracter.charAt(0);
                actualizarPalabraActual(letra);
                if (hasGanado() == true && intentos > 0) {
                    JOptionPane.showMessageDialog(null, "¡FELICIDADES, HAS GANADO!");
                    intentos = 0;
                } else if (intentos == 0) {
                    JOptionPane.showMessageDialog(null, "Oh no... perdiste...");
                }
            }

        }
    }

    @Override
    public void actualizarPalabraActual(char letra) {
        char[] palabrareemplazar = palabraActual.toCharArray();
        if (verificarLetra(letra) == true) {
            for (int i = 0; i < palabraSecreta.toCharArray().length; i++) {
                if (palabraSecreta.toCharArray()[i] == letra) {
                    palabrareemplazar[i] = letra;
                }
            }
            palabraActual = new String(palabrareemplazar);
        } else {
            intentos -= 1;
        }

//        StringBuilder nuevaPalabra = new StringBuilder(palabraActual);
//        for (int i = 0; i < palabraSecreta.length(); i++) {
//            if (palabraSecreta.charAt(i) == letra) {
//                nuevaPalabra.setCharAt(i, letra);
//            }
//        }
//        palabraActual = nuevaPalabra.toString();
    }

    @Override
    public boolean verificarLetra(char letra) {
        for (char letraverificar : palabraSecreta.toCharArray()) {
            if (letraverificar == letra) {
                return true;
            }
        }
        return false;
//        boolean letraCorrecta = false;
//        for (int i = 0; i < palabraSecreta.length(); i++) {
//            if (palabraSecreta.charAt(i) == letra) {
//                letraCorrecta = true;
//            }
//        }
//        if (!letraCorrecta) {
//            intentos--;
//        }
//        return letraCorrecta;
    }

    @Override
    public boolean hasGanado() {
        if (palabraActual.equals(palabraSecreta)) {
            return true;
        }
        return false;
//        return palabraSecreta.equals(palabraActual);
    }

//    @Override
//    public void reiniciarJuego() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
