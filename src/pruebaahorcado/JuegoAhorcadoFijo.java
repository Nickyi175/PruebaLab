package pruebaahorcado;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class JuegoAhorcadoFijo extends JuegoAhorcadoBase{
    
    public JuegoAhorcadoFijo(String palabrasecreta){
        this.palabraSecreta=palabrasecreta.toUpperCase();
        inicializarPalabraSecreta();
        intentos=6;
    }
    
    public void actualizarPalabraActual(char letra){
        char[] palabrareemplazar = palabraActual.toCharArray();
        if(verificarLetra(letra)==true){
            for(int i=0; i<palabraSecreta.toCharArray().length;i++){
                if(palabraSecreta.toCharArray()[i]==letra){
                    palabrareemplazar[i]=letra;
                }
            }
            palabraActual = new String(palabrareemplazar);
        } else{
            intentos-=1;
        }
    }
    
    public boolean verificarLetra(char letra){
        for(char letraverificar: palabraSecreta.toCharArray()){
            if(letraverificar==letra){
                return true;
            }
        }
        return false;
    }
    
    public void inicializarPalabraSecreta(){
        palabraActual="";
        for(int i=0; i<palabraSecreta.length();i++){
            palabraActual+="_";
        }
    }
    
    public boolean hasGanado(){
        if(palabraActual.equals(palabraSecreta)){
            return true;
        }
        return false;
    }
    
    public void jugar(){
        while(intentos>0){
            String palabradeshebrada="";
            for(int i=0;i<palabraActual.length();i++){
                palabradeshebrada+=palabraActual.charAt(i)+" ";
            }
            String prueba;
            do{
                prueba = JOptionPane.showInputDialog(null, "Ingrese la letra que desea probar\nPista: "+palabradeshebrada+"\nIntentos restantes: "+intentos, "Ahorcado Fijo", JOptionPane.INFORMATION_MESSAGE);
            }while(prueba==null);
            prueba = prueba.toUpperCase();
            if(!prueba.equals("")){
            char letra = prueba.charAt(0);
            actualizarPalabraActual(letra);
            if(hasGanado()==true && intentos>0){
                JOptionPane.showMessageDialog(null,"Has ganado :)");
                intentos=0;
            } else if (intentos==0){
                JOptionPane.showMessageDialog(null,"Perdiste :(");
            }
            }
                     
            
        }
    }
}