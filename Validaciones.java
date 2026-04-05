import java.util.Scanner;

public class Validaciones {
    public int ValidarEntero(Scanner sc){
        while (!sc.hasNextInt()){
            System.out.println("Ingrese un numero entero: ");
            sc.nextLine();
        }
        return sc.nextInt();   
     }
}
