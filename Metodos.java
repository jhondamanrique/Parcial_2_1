import java.util.Stack;

public class Metodos {
    public void InvertirCadena(String cadena) {
        Stack<Character> pila = new Stack<>();

        //Contar la cantidad de caracteres en la cadena
        int contador = cadena.length();
        System.out.println("La cantidad de caracteres en la cadena es: " + contador);

        //Agregar cada caracter de la cadena a la pila
        for (int i = 0; i < cadena.length(); i++) {
            pila.push(cadena.charAt(i));
        }

        //Sacar caracteres para invertir la cadena
        String invertida="";
        while (!pila.isEmpty()){
            invertida += pila.pop();
        }
        System.out.println("La cadena invertida es: " + invertida);
    }
}
