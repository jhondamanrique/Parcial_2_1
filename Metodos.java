import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class Metodos{
    Scanner sc = new Scanner(System.in);
    Validaciones v = new Validaciones();
    public objMatriz[][] LlenarMatriz(objMatriz[][] m){
        System.out.println("Ingrese los numeros de la matriz:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                objMatriz obj = new objMatriz(0);
                System.out.println("Ingrese el numero: ");
                obj.setNumero(v.ValidarEntero(sc));
                m[i][j]= obj;
            }
        }
        return m;
    }

    public void MostrarMatriz(objMatriz[][]m){
        System.out.println("La matriz es: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j].getNumero() + " ");   
            }
            System.out.println();
        }
    }

    public Stack<Integer> SumaFilaPila(objMatriz[][]m){
        Stack<Integer> pila = new Stack<>();
        for (int i = 0; i < m.length; i++) {
            int suma=0;
            for (int j = 0; j < m.length; j++) {
                suma+=m[i][j].getNumero();
            }
            pila.push(suma);
        }
        return pila;
    } 

    public Queue<Integer> SumaColumnasCola(objMatriz[][]m){
        Queue<Integer> cola = new LinkedList<>();
        for (int i = 0; i < m.length; i++) {
            int suma=0;
            for (int j = 0; j < m.length; j++) {
                suma+=m[j][i].getNumero();
            }
            cola.add(suma);
        }
        return cola;
    }

    public int Factorial(int n){
        int fac = 1;
        for (int i = n; i >= 1; i--) {
            fac*=i;
        }
        return fac;
    }

    public Queue<Integer> OrdenarCola(Queue<Integer> cola){
        ArrayList<Integer> lista = new ArrayList<>(); 
            while (!cola.isEmpty()) {
                lista.add(cola.poll());
            }

            Collections.sort(lista, Collections.reverseOrder());

            for (int num : lista) {
                cola.add(num);
            }
        return cola;
    }

}