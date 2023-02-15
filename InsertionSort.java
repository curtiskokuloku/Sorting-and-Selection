/**
 * @author Curtis Kokulooku
 * @description Implementation of Insertion Sort
 *              The algorithm has a best-case running time of O(n) and
 *               a worst-case running time of O(n^2)
 */

public class InsertionSort {

    /**
     * @method insertionSort() takes in an array and sorts it in place
     * @param array: the sequence of integers to be sorted
     */
    public static void insertionSort(int[] array) {
        int key, i, j;
        for (i = 1; i < array.length; i++) {
            key = array[i];
            for (j = i-1; j >= 0 && key < array[j]; j--) {
                array[j+1] = array[j];
            }
            array[j+1] = key;
        }
    }

    /**
     * @method display() prints the elements in the array to the screen
     * @param a: ah array of integers
     */
    public static void display(int[] a) {
        for (int element : a) {
            System.out.print(element);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] a = {4, 5, 2, 7, 6, 1, 3};
        int[] b = {1, 2, 3, 4, 5, 6, 7};
        int[] c = {7, 6, 5, 4, 3, 2, 1};

        System.out.println("Insertion sort ...");
        System.out.println("\nFirst array:");
        display(a);
        insertionSort(a);
        display(a);
        System.out.println("\nSecond array:");
        display(b);
        insertionSort(b);
        display(b);
        System.out.println("\nThird array:");
        display(c);
        insertionSort(c);
        display(c);
    }

}
