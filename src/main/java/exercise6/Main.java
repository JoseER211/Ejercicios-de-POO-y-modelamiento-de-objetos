package main.java.exercise6;

import java.util.Scanner;
import java.util.Vector;

/**
 * @author Jose David Echavarria Ruiz
 */
public class Main {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();


            Integer number = 0;
            do {
                System.out.println("Ingrese el número.");
                number = Scan();
                vector.add(number);
            } while (vector.size() == 1 || number != vector.elementAt(vector.size()-2)); //Establece la condición para que la condición continue y solo pare cuando el número se repita.

            System.out.println(vector);
    }

    /**
     * Escanea un dato Entero por teclado.
     * @return el dato escaneado.
     */
    public static Integer Scan(){
        Scanner input = new Scanner(System.in);
        Integer option = input.nextInt();
        return option;
    }
}
