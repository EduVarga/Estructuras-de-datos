import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TelefonosII {
    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);

        HashMap<String, ArrayList<String>> numeros = new HashMap<>();
        ArrayList<String> telefonos = new ArrayList<>();

        telefonos.add("612345789");
        telefonos.add("612345789");
        numeros.put("Marta", telefonos);
        telefonos = new ArrayList<>();

        telefonos.add("634567890");
        numeros.put("Sergio", telefonos);
        telefonos = new ArrayList<>();

        telefonos.add("656789012");
        telefonos.add("612345876");
        numeros.put("Paula", telefonos);
        telefonos = new ArrayList<>();

        telefonos.add("678901234");
        telefonos.add("689012345");
        numeros.put("Alejandro", telefonos);
        telefonos = new ArrayList<>();

        telefonos.add("601234567");
        numeros.put("Clara", telefonos);
        telefonos = new ArrayList<>();

        telefonos.add("623456798");
        telefonos.add("612345678");
        numeros.put("Andrés", telefonos);
        telefonos = new ArrayList<>();

        telefonos.add("645678901");
        numeros.put("Carolina", telefonos);
        telefonos = new ArrayList<>();

        telefonos.add("667890123");
        numeros.put("Roberto", telefonos);
        telefonos = new ArrayList<>();

        telefonos.add("689012345");
        telefonos.add("612345789");
        numeros.put("Laura", telefonos);
        telefonos = new ArrayList<>();

        telefonos.add("612345876");
        telefonos.add("601234567");
        numeros.put("David", telefonos);

        System.out.println();
        System.out.println("Lista de contactos: ");
        for (String clave : numeros.keySet()){
            System.out.print(clave + "   ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Introduce un contancto: ");
        String contacto = inputValue.nextLine();

        if (numeros.containsKey(contacto)){
            System.out.println("Número/s de " + contacto + " : " + numeros.get(contacto));
        }else{
            System.out.println("El contacto " + contacto + " no está asociado a ningún número");
        }

    }
}
