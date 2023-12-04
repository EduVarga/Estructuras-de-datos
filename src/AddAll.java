import java.util.ArrayList;
public class AddAll {
    public static void main(String[] args) {

        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);
        lista1.add(5);
        ArrayList<Integer> lista2 = new ArrayList<>();

        lista2.addAll(lista1);

        System.out.println();
        System.out.println(lista1);
        System.out.println();
        System.out.println(lista2);

    }
}
