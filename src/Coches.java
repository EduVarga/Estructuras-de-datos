import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Coches {
    public static void main(String[] args) {
        //OK
        Scanner inputValue = new Scanner(System.in);

        ArrayList<String> coches = new ArrayList<>();

        String coche;

        do{
            coche = inputValue.nextLine();
            if (coche.isEmpty()){
                coches.add(coche);
            }
        }while (coche.isEmpty());

        Collections.sort(coches);

        System.out.println(coches);

    }
}
