import java.util.HashSet;
import java.util.Set;


public class Ejercicio_3 {

        public static void main(String[] args) {
            Set<String> frase = new HashSet<>();
            frase.add("Hola,");
            frase.add("mi");
            frase.add("nombre");
            frase.add("es");
            frase.add("David");
            frase.add("Fuentes");
            frase.add("Fernández,");
            frase.add("vivo");
            frase.add("en");
            frase.add("Andújar");
            frase.add("(Jaén),");
            frase.add("y");
            frase.add("tengo");
            frase.add("36");
            frase.add("años.");
            frase.add("Un");
            frase.add("saludo.");


            // Recorrer el conjunto
            for (String palabras : frase) {
                System.out.println(palabras);
            }
        }
    }

