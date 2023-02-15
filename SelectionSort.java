/**
 * @author Curtis Kokulooku
 * @description Implementation of Selection Sort
 *              The algorithm has running time of O(n^2)
 *              for both best and worst cases
 */

public class SelectionSort {

    /**
     * @method selectionSort() takes in an array of integers and sorts it
     * @param a: the array to be sorted
     */
    public static void selectionSort(int[] a) {
        int minIndex, tmp, i, j;
        for (i = 0; i < a.length-1; i++) {
            minIndex = i;
            for (j = i+1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            tmp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = tmp;
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
        System.out.println("\nBefore Selection Sort ...");
        display(a);
        System.out.println("\nAfter Selection Sort ...");
        selectionSort(a);
        display(a);
    }
}
