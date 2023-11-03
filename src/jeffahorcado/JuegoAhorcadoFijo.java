package jeffahorcado;

import java.awt.Graphics;
import javax.swing.JOptionPane;

//APARENTEMENTE LISTO PERO REVISAR
class JuegoAhorcadoFijo extends JuegoAhorcadoBase {

    public JuegoAhorcadoFijo(String palabraSecreta) {
        this.palabraSecreta = palabraSecreta.toLowerCase();
        inicializarPalabraSecreta();
//      this.palabraActual = "_".repeat(palabraSecreta.length());
        this.intentos = 6;
    }

    public void inicializarPalabraSecreta() {
        palabraActual = "";
        for (int i = 0; i < palabraSecreta.length(); i++) {
            palabraActual += "_";
        }
        //no tenia nada antes
    }

    public void jugar() {
        while (intentos > 0) {
            String palabradeshebrada = "";
            for (int i = 0; i < palabraActual.length(); i++) {
                palabradeshebrada += palabraActual.charAt(i) + " ";
            }
            String prueba;
            do {
                prueba = JOptionPane.showInputDialog(null, "Ingrese la letra que desea probar\nPista: " + palabradeshebrada + "\nIntentos restantes: " + intentos, "Ahorcado Fijo", JOptionPane.INFORMATION_MESSAGE);
            } while (prueba == null);
            prueba = prueba.toUpperCase();
            if (!prueba.equals("")) {
                char letra = prueba.charAt(0);
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
