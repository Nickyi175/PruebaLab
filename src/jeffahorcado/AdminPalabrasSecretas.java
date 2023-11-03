package jeffahorcado;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//APARENTEMENTE LISTO, REVISAR
public class AdminPalabrasSecretas {
    static ArrayList<String> palabrasSecretas;
//    private List<String> palabrasSecretas;

    public AdminPalabrasSecretas() {
        palabrasSecretas = new ArrayList<>();
    }

    public void agregarPalabra(String palabra) {
        palabrasSecretas.add(palabra);
    }

//    public String seleccionarPalabraAzar() {
//        if (palabrasSecretas.isEmpty()) {
//            System.out.println("No hay palabras secretas disponibles.");
//            return "";
//        }
//        Random random = new Random();
//        int indice = random.nextInt(palabrasSecretas.size());
//        return palabrasSecretas.get(indice);
//    }
    public static ArrayList getpalabrasSecretas(){
        return palabrasSecretas;
    }
    /*
    public static ArrayList getpalabrasSecretas(){
        return palabrasSecretas;
    }
    
    ESTO PODRIA FUNCIOANR
    */

}