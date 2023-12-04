import java.util.ArrayList;
import java.util.Arrays;

public class ConvertirAArray {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("BMW");
        arrayList.add("Audi");
        arrayList.add("Porsche");
        arrayList.add("Ferrari");

        String[] array = new String[arrayList.size()];
        array = arrayList.toArray(array);

        System.out.println();
        System.out.println(Arrays.toString(array));

    }
}
