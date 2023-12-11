import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos {
    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);

        Map<String, String> mapa1 = new HashMap<>();

        mapa1.put("Marta", "612345789");
        mapa1.put("Sergio", "634567890");
        mapa1.put("Paula", "656789012");
        mapa1.put("Alejandro", "678901234");
        mapa1.put("Clara", "601234567");
        mapa1.put("Andrés", "623456798");
        mapa1.put("Carolina", "645678901");
        mapa1.put("Roberto", "667890123");
        mapa1.put("Laura", "689012345");
        mapa1.put("David", "612345876");

        System.out.println();
        System.out.println("Listado de contactos: ");
        for (String clave : mapa1.keySet()){
            System.out.print(clave + "   ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Introduce un contacto: ");
        String contancto = inputValue.nextLine();

        if (mapa1.containsKey(contancto)){
            System.out.println("Número de teléfono de " + contancto + " : " + mapa1.get(contancto));
        }else{
            System.out.println("El contancto " + contancto + " no tiene un número de teléfono asociado");
        }

    }
}
