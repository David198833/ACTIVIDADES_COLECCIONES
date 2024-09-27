import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Map<String, String> paises = new HashMap<>();
        paises.put("España", "Madrid");
        paises.put("Alemania", "Berlín");
        paises.put("Austria", "Viena");
        paises.put("Bélgica", "Bruselas");
        paises.put("Chipre", "Nicosia");
        paises.put("Croacia", "Zagreb");
        paises.put("Dinamarca", "Copenhague");
        paises.put("Eslovaquia", "Bratislava");
        paises.put("Eslovenia", "Liubliana");
        paises.put("Finlandia", "Helsinki");
        paises.put("Francia", "París");
        paises.put("Grecia", "Atenas");
        paises.put("Hungría", "Budapest");
        paises.put("Irlanda", "Dublín");
        paises.put("Letonia", "Riga");
        paises.put("Lituania", "Vilna");
        paises.put("Luxemburgo", "Luxemburgo");
        paises.put("Malta", "La Valeta");
        paises.put("Paises Bajos", "Amsterdam");
        paises.put("Polonia", "Varsovia");
        paises.put("Portugal", "Lisboa");
        paises.put("Reino Unido", "Londres");
        paises.put("República Checa", "Praga");
        paises.put("Rumanía", "Bucarest");
        paises.put("Suecia", "Estocolmo");

        Scanner lecturaDatos = new Scanner(System.in);
        System.out.println("Introduzca el País");
        String lecturaPais = lecturaDatos.nextLine();

        //la función containsKey comprueba que la clave almacenada en el HashMap existe en la lista
        if (paises.containsKey(lecturaPais)) {
            System.out.println("La capital de " + lecturaPais + " es " + paises.get(lecturaPais));
        } else {
            System.out.println("Este País no existe, aquí tiene la lista de Paises de la UE:");
            for (Map.Entry<String, String> entry : paises.entrySet()) {
                String pais = entry.getKey();
                String capital = entry.getValue();
                System.out.println("País: " + pais + ", Capital: " + capital);
            }
        }

    }
}






