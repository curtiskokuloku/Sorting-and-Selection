import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Curtis Kokulooku
 * @description Implementation of Heap Sort
 *              Time complexity is O(nlg(n)) because it uses divide-and-
 *              conquer algorithm to sort an array segment using heapify algorithm
 */

public class HeapSort {

    /**
     * @method heapSort() sorts array according to min-heap property
     * @param arr: array to sort
     * @param length: number of elements to sort
     */
    public static void heapSort(int[] arr, int length) {
        int temp, size = length -1, n = length / 2;
        for (int i = n; i >= 0; i--) {
            heapify(arr, i, size);
        }

        for (int j = size; j >= 0; j--) {
            temp = arr[0];
            arr[0] = arr[size];
            arr[size] = temp;
            size--;
            heapify(arr, 0, size);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int [] arr, int index, int l) {
        int temp = arr[index];
        arr[index] = arr[l];
        arr[l] = temp;
    }

    public static int leftChild(int index) {
        return 2 * index;
    }

    public static int rightChild(int index) {
        return 2 * index + 1;
    }

    public static void heapify(int[] arr, int i, int size) {
        int left = leftChild(i);
        int right = rightChild(i);
        int large;

        if (left <= size && arr[left] > arr[i]) {
            large = left;
        } else {
            large = i;
        }
        if (right <= size && arr[right] > arr[i]) {
            large = right;
        }

        if (large != i) {
            swap(arr, i, large);
            heapify(arr,large, size);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = s.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        heapSort(arr, size);
    }
}
