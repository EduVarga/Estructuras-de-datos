import java.util.ArrayList;
public class Altura {
    public static void main(String[] args) {

        ArrayList<Double> alturas = leerAlturas(numeroAlumnos());

        mostrarResultados(alturas);

    }
    public static int numeroAlumnos(){
        return Utilidades.leerEntero("Número de alumnos: ");
    }
    public static ArrayList<Double> leerAlturas(int numeroAlumnos){
        ArrayList<Double> alturas = new ArrayList<>();
        for (int i = 0; i < numeroAlumnos; i++){
                alturas.add(Utilidades.leerDoble("Introduce la altura"));
        }
        return alturas;
    }
    public static double calcularMedia(ArrayList<Double> alturas){
        double media = 0;
        for (double altura : alturas){
            media += altura;
        }
        return media / alturas.size();
    }
    public static int calcularAlumnosAlturaSuperior(ArrayList<Double> alturas, Double media){
        int alumnosAlturaSuperior = 0;
        for (Double altura : alturas){
            if (altura > media){
                alumnosAlturaSuperior ++;
            }
        }
        return alumnosAlturaSuperior;
    }
    public static int calcularAlumnosAlturaInferior(ArrayList<Double> alturas, Double media){
        int alumnosAlturaInferior = 0;
        for (Double altura : alturas){
            if (altura < media){
                alumnosAlturaInferior ++;
            }
        }
        return alumnosAlturaInferior;
    }
    public static void mostrarResultados(ArrayList<Double> alturas){
        Double media = calcularMedia(alturas);
        System.out.println(alturas);
        System.out.println("Altura media de los alumnos: " + media);
        System.out.println("Alumnos con altura superior a la media: " + calcularAlumnosAlturaSuperior(alturas, media));
        System.out.println("Alumnos con altura inferior a la media: " + calcularAlumnosAlturaInferior(alturas, media));
    }
}
