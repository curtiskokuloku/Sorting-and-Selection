/**
 * @author Curtis Kokulooku
 * @description Implementation of Bubble Sort
 */

public class BubbleSort {
    /**
     * @method bubbleSort() takes in an array of integers and sorts it
     * @param a: the array to be sorted
     * @description The algorithm has running time of O(n^2) for both best and worst cases
     */
    public static void bubbleSort(int[] a) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j] < a[j-1]) {
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
    }   // bubbleSort

    /**
     * @method display() prints the elements in the array to the screen
     * @param a: ah array of integers
     */
    public static void display(int[] a) {
        for (int element : a) {
            System.out.print(element);
        }
        System.out.println();
    }   // display

    public static void main(String[] args) {
        int[] a = {4, 5, 2, 7, 6, 1, 3};

        System.out.println("Array before sort ...");
        display(a);
        System.out.println("Array after Bubble sort ...");
        bubbleSort(a);
        display(a);
    }
}
