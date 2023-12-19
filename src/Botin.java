import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Botin {
    public static String repartir(int participantes, ArrayList<Integer> billetes){
        HashMap<Integer, String> repartir = new HashMap<>();
        String resultado;
        for (int i = 0; i < billetes.size(); i++){
            do{
                for (int j = 0; j < participantes; j++){
                    if (repartir.containsKey(j)){
                        if (billetes.isEmpty()){
                            break;
                        }
                        resultado = repartir.get(j);
                        resultado += billetes.get(i) + " ";
                        repartir.replace(j, resultado);
                    }else{
                        repartir.put(j, (billetes.get(i) + " "));
                    }
                    billetes.remove(billetes.get(i));
                }
            }while (!billetes.isEmpty());
        }
        return repartir.toString();
    }
    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);

        ArrayList<Integer> billetes = new ArrayList<>();

        String numeros;

        System.out.println();
        System.out.println("Introduce los números (formato 'número,número,...'): ");
        numeros = inputValue.nextLine();

        String[] separados = numeros.split(",");

        for (String numSep : separados){
            int valor = Integer.parseInt(numSep);
            billetes.add(valor);
        }

        int participantes = billetes.get(0);

        billetes.remove(0);

        System.out.println(repartir(participantes,billetes));

    }
}
