import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);

        HashMap<String, Integer> resultado = new HashMap<>();

        ArrayList<String> numeros = new ArrayList<>();

        System.out.println();
        String palabras;

        do{
            System.out.println("Introduce el número: ");
            palabras = inputValue.nextLine();
            numeros.add(palabras);
        }while (!palabras.isEmpty());

        numeros.remove(numeros.size() - 1);

        int seRepite;

        do{
            if (resultado.containsKey(numeros.get(0))){
                seRepite = resultado.get(numeros.get(0));
                resultado.put(numeros.get(0), seRepite + 1);
            }else{
                resultado.put(numeros.get(0), 1);
            }
            numeros.remove(String.valueOf(numeros.get(0)));
        }while (!numeros.isEmpty());

        for (String clave : resultado.keySet()){
            System.out.println(clave + " - " + resultado.get(clave));
        }

    }
}
