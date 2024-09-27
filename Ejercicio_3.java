import java.util.HashSet;
import java.util.Set;


public class Ejercicio_3 {

        public static void main(String[] args) {
            Set<String> frase = new HashSet<>();
            frase.add("");
            frase.add("");
            frase.add("");
            frase.add("");
            frase.add("");
            frase.add("");
            frase.add("");
            frase.add("");


            // Recorrer el conjunto
            for (String palabras : frase) {
                System.out.println(palabras);
            }
        }
    }

