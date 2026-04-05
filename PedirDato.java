
import java.util.Scanner;

public class PedirDato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        System.out.println("Ingrese una cadena de texto:");
        String cadena = sc.nextLine();
        System.out.println("La cadena ingresada es: " + cadena);
        m.InvertirCadena(cadena);
        
    }
    

}
