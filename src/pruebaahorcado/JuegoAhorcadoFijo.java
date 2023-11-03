package pruebaahorcado;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class JuegoAhorcadoFijo extends JuegoAhorcadoBase{
    
    public JuegoAhorcadoFijo(String palabrasecreta){
        this.palabrasecreta=palabrasecreta.toUpperCase();
        inicializarPalabraSecreta();
        intentos=6;
    }
    
    public void actualizarPalabraActual(char letra){
        char[] palabrareemplazar = palabraactual.toCharArray();
        if(verificarLetra(letra)==true){
            for(int i=0; i<palabrasecreta.toCharArray().length;i++){
                if(palabrasecreta.toCharArray()[i]==letra){
                    palabrareemplazar[i]=letra;
                }
            }
            palabraactual = new String(palabrareemplazar);
        } else{
            intentos-=1;
        }
    }
    
    public boolean verificarLetra(char letra){
        for(char letraverificar: palabrasecreta.toCharArray()){
            if(letraverificar==letra){
                return true;
            }
        }
        return false;
    }
    
    public void inicializarPalabraSecreta(){
        palabraactual="";
        for(int i=0; i<palabrasecreta.length();i++){
            palabraactual+="_";
        }
    }
    
    public boolean hasGanado(){
        if(palabraactual.equals(palabrasecreta)){
            return true;
        }
        return false;
    }
    
    public void jugar(){
        while(intentos>0){
            String palabradeshebrada="";
            for(int i=0;i<palabraactual.length();i++){
                palabradeshebrada+=palabraactual.charAt(i)+" ";
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