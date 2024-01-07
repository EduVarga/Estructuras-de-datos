import java.util.ArrayList;
import java.util.Stack;

public class Parentesis {
    public static void main(String[] args) {
        //OK
        Stack<String> stack = new Stack<>();

        String parentesis = "[{()}]";
        ArrayList<String> digitos = new ArrayList<>();

        for (int i = 0; i < parentesis.length(); i++){
            digitos.add(String.valueOf(parentesis.charAt(i)));
        }

        for (int i = 0; i < parentesis.length(); i++) {
            switch (digitos.get(i)) {
                case "[":
                case "{":
                case "(":
                    stack.push(digitos.get(i));
                    break;
                case "]":
                    if (stack.peek().equals("[")) {
                        stack.pop();
                    }
                    break;
                case "}":
                    if (stack.peek().equals("{")) {
                        stack.pop();
                    }
                    break;
                case ")":
                    if (stack.peek().equals("(")) {
                        stack.pop();
                    }
                    break;
            }
        }

        if (stack.isEmpty()){
            System.out.println("Bien parentizado");
        }else{
            System.out.println("Mal parentizado");
        }

    }
}
