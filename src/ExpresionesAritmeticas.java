import java.util.ArrayList;
import java.util.Stack;

public class ExpresionesAritmeticas {
    public static void main(String[] args) {

        Stack<String> operacion = new Stack<>();

        ArrayList<String> calculo = new ArrayList<>();
        calculo.add("5");
        calculo.add("1");
        calculo.add("2");
        calculo.add("+");
        calculo.add("4");
        calculo.add("*");
        calculo.add("+");
        calculo.add("3");
        calculo.add("-");

        int resultado = 0;
        int opu;
        int opd;

        for (String digito : calculo) {
            switch (digito) {
                default:
                    operacion.push(digito);
                    break;
                case "+":
                    opu = Integer.parseInt(operacion.pop());
                    opd = Integer.parseInt(operacion.pop());
                    resultado = opd + opu;
                    operacion.push(String.valueOf(resultado));
                    break;
                case "-":
                    opu = Integer.parseInt(operacion.pop());
                    opd = Integer.parseInt(operacion.pop());
                    resultado = opd - opu;
                    operacion.push(String.valueOf(resultado));
                    break;
                case "*":
                    opu = Integer.parseInt(operacion.pop());
                    opd = Integer.parseInt(operacion.pop());
                    resultado = opd * opu;
                    operacion.push(String.valueOf(resultado));
                    break;
                case "/":
                    opu = Integer.parseInt(operacion.pop());
                    opd = Integer.parseInt(operacion.pop());
                    resultado = opd / opu;
                    operacion.push(String.valueOf(resultado));
                    break;
            }
        }

        System.out.println(resultado);

    }
}
