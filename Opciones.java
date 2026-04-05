
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Opciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validaciones v = new Validaciones();
        System.out.println("ingrese el tamaño de la Matriz: ");
        int n = v.ValidarEntero(sc);
        objMatriz[][] matriz = new objMatriz[n][n];
        Metodos m = new Metodos();
        matriz = m.LlenarMatriz(matriz);
        m.MostrarMatriz(matriz);
        int opt=0; 
        boolean seguir=true;

        while (seguir){
            System.out.println("Bienvenido al menu, ingrese la opcion que desea realizar: ");
            System.out.println("1) Sumar filas y guardar en pila");
            System.out.println("2) Sumar Columnas y guardar en cola");
            System.out.println("3) Factorial de la dimension de la matriz");
            System.out.println("4) Ordenatr cola de mayor a menor");
            System.out.println("5) Salir");
            opt = v.ValidarEntero(sc);

            switch (opt){
                case 1:
                Stack<Integer> pila = m.SumaFilaPila(matriz);
                System.out.println("La pila con la suma de las filas es: " + pila);
                break;
                case 2:
                Queue<Integer> cola = m.SumaColumnasCola(matriz);
                System.out.println("La cola con la suma de las columnas es: " + cola);
                break;
                case 3:
                int factorial = m.Factorial(n);
                System.out.println("El factorial de la dimension de la matriz es: " + factorial);
                break;
                case 4:
                Queue<Integer> cola2 = m.SumaColumnasCola(matriz);
                Queue<Integer> colaOrdenada = m.OrdenarCola(cola2);
                System.out.println("La cola ordenada de mayor a menor es: " + colaOrdenada);
                break;
                case 5:
                seguir=false;
                System.out.println("Gracias por usar el programa");
            }
        }

        
    }
}
