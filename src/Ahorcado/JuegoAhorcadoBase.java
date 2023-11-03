package Ahorcado;

import javax.swing.JPanel;

//LISTO
abstract class JuegoAhorcadoBase extends JPanel implements JuegoAhorcado {
    protected String palabraSecreta,palabraActual;
    protected int intentos;

    public abstract void actualizarPalabraActual(char letra);
    public abstract boolean verificarLetra(char letra);
    public abstract boolean hasGanado();
    
    //REVISAR ESTA FUNCION
    //public abstract void reiniciarJuego();

}