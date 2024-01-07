import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LaMejorTerminacion {
    public static void main(String[] args) {
        //OK
        Scanner inputValue = new Scanner(System.in);

        HashMap<String, Integer> resultado = new HashMap<>();

        ArrayList<String> boletos = new ArrayList<>();
        String boleto;

        System.out.println();
        System.out.println("El almacenamiento de los boletos terminará cuando introduzcas '0'");
        System.out.println();

        do{
            System.out.println("Introduce el boleto de lotería: ");
            boleto = inputValue.nextLine();
            boletos.add(boleto);
        }while (!boleto.equals("0"));

        boletos.remove(boletos.size() - 1);

        System.out.println();
        System.out.println("Boletos --> " + boletos);
        System.out.println();

        ArrayList<String> ultimoDigito = new ArrayList<>();

        for (String numeros : boletos){
            ultimoDigito.add((String.valueOf(numeros.charAt(numeros.length() - 1))));
        }

        int seRepite;

        do{
            if (resultado.containsKey(ultimoDigito.get(0))){
                seRepite = resultado.get(ultimoDigito.get(0));
                resultado.put(ultimoDigito.get(0), seRepite + 1);
            }else{
                resultado.put(ultimoDigito.get(0), 1);
            }
            ultimoDigito.remove(String.valueOf(ultimoDigito.get(0)));
        }while (!ultimoDigito.isEmpty());

        System.out.println(resultado);

    }
}
