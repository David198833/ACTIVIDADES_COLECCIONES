import java.util.List;
import java.util.ArrayList;

public class Ejercicio_1 {


    public static void main(String[] args) {

        //Declaro la lista y creo un objeto tipo ArrayList
        List<Integer> numeros = new ArrayList<>();
        //Recorro la lista para almacenar los elementos
        for (int i = 0; i < 10; i++) {
            //agrega los elementos y no se permiten duplicados
            numeros.add(i);
        }

        //declaro la variable que suma los elementos de la lista
        int suma = 0;
        //Recorro la lista para para porteriormente sume los números
        for (int i = 0; i < numeros.size(); i++) {
            //Muestra la lista de los numeros
            System.out.println(numeros.get(i));
            //suma los valores de los elementos
            suma += numeros.get(i);

        }
        //Muestra por pantalla la suma total de los valores de los elementos
        System.out.println("La suma total es: "+ suma);


    }
}

