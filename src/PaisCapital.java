import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class PaisCapital {
    public static void main(String[] args) {
        //OK
        Scanner inputValue = new Scanner(System.in);

        Map<String, String> mapa1 = new HashMap<>();

        mapa1.put("España", "Madrid");
        mapa1.put("Francia", "París");
        mapa1.put("Italia", "Roma");
        mapa1.put("Rumanía", "Bucarest");
        mapa1.put("Hungría", "Budapest");
        mapa1.put("Bélgica", "Bruselas");

        System.out.println();
        System.out.println("Introduce un país Europeo: ");
        String pais = inputValue.nextLine();

        System.out.println();

        if (mapa1.containsKey(pais)){
            System.out.println("La capital de " + pais + " es " + mapa1.get(pais));
        }else{
            System.out.println("Ese país no se encuentra en la lista");
        }

    }
}
