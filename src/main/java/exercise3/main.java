package main.java.exercise3;

import java.util.Scanner;

/**
 * @author Jose David Echavarria Ruiz
 */
public class main {
    public static void main(String[] args) {

        System.out.println("Este programa permite crear una lista y ordenarla." + "\n");

        System.out.println("Digite el tamaño de la lista.");
        Integer sizeArray = Scan();

        System.out.println("Digite el rango de los números de la lista.");
        Integer rangeArray = Scan();
        System.out.println();

        Integer[] array = new Integer[sizeArray];

        for (Integer i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * rangeArray);  //Se fuerza a que el array sea entero y entre un rango.
            System.out.println(array[i]);
        }

        Integer order;
        do {

            System.out.println("¿Cuál método de ordenamiento desea usar?");
            System.out.println("1. Algoritmo burbuja" + "\n" + "2. Quick sort");

            order = Scan();
            System.out.println();

            switch (order) {
                case 1:
                    Integer[] orderArrayBubble = bubble(array);
                    for (Integer i = 0; i < orderArrayBubble.length; i++) {
                        System.out.println(orderArrayBubble[i]);
                    }
                    break;
                case 2:
                    Integer[] orderArrayQuicksort = quickSort(array, 0, array.length - 1);
                    for (Integer i = 0; i < orderArrayQuicksort.length; i++) {
                        System.out.println(orderArrayQuicksort[i]);
                    }
                    break;

                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (order > 2);

    }

    /**
     * Escanea un dato por teclado.
     * @return el dato escaneado.
     */

    public static Integer Scan() {
        Scanner data = new Scanner(System.in);
        Integer option = data.nextInt();
        return option;
    }

    /**
     * Crea un array con la funcionalidad de ordenamiento por burbuja.
     * @param array sobre el que se aplica el ordenamiento por burbuja.
     * @return el array ordenado.
     */

    public static Integer[] bubble(Integer[] array) {
        Integer assistant;

        for (Integer i = 1; i < array.length; i++) {
            for (Integer j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    assistant = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = assistant;
                }
            }
        }
        return array;
    }

    /**
     * Crea un array con la funcionalidad de ordenamiento por quick sort.
     * @param array sobre el que se aplica el ordenamiento por quick sort.
     * @param begin primer valor del arreglo.
     * @param end último valor del arreglo.
     * @return el array ordenado
     */

    public static Integer[] quickSort(Integer[] array, Integer begin, Integer end) {
        if (begin < end) {
            Integer partitionIndex = partition(array, begin, end);

            quickSort(array, begin, partitionIndex-1);
            quickSort(array, partitionIndex+1, end);
        }
        return array;
    }

    /**
     *  Ordena y selecciona desde dónde dividir el arreglo.
     * @param array sobre el que se aplica la división
     * @param begin primer valor del arreglo.
     * @param end último valor del arreglo.
     * @return el índice en donde se va dividir el arreglo.
     */
    private static int partition(Integer array[], Integer begin, Integer end) {
        Integer pivot = array[end];
        Integer i = (begin-1);

        for (Integer j = begin; j < end; j++) {
            if (array[j] <= pivot) {
                i++;

                Integer swapTemp = array[i];
                array[i] = array[j];
                array[j] = swapTemp;
            }
        }

        Integer swapTemp = array[i+1];
        array[i+1] = array[end];
        array[end] = swapTemp;

        return i+1;
    }
}



