import java.util.ArrayList;
public class Existe {
    public static void main(String[] args) {

        ArrayList<Integer> existe = new ArrayList<>();
        existe.add(1);
        existe.add(2);
        existe.add(3);
        existe.add(4);
        existe.add(5);
        existe.add(6);

        System.out.println();

        if (existe.contains(4)){
            System.out.println("Existe");
        }else{
            System.out.println("NO existe");
        }

    }
}
