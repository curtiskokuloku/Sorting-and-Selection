/**
 * @author Curtis Kokulooku
 * @description Implementation of Merge Sort
 *              Requires extra space the size of the original array
 *              Time complexity is O(nlg(n)) because it uses divide-and-
 *              conquer algorithm to merge sort an array segment
 */

public class MergeSort {
    /**
     * @method print() : array printing utility for testing and debugging
     * @param a: an array of integers
     */
    public static void print(int[] a) {
        for (int element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /**
     * @method merge() : merges two sorted array segments into one sorted array segment
     * @param a: array where merge items are found
     * @param start: start index of first segment to merge
     * @param mid: end index of first segment to merge  (runs from start ... mid)
     * @param end: end index of second segment to merge (runs from mid + 1 ... end)
     * @param temp: temporary array used to do merging
     */
    public static void merge(int[] a, int start, int mid, int end, int[] temp) {
        int ptr1 = start;
        int ptr2 = mid + 1;
        int resPtr = start;

        while (ptr1 <= mid && ptr2 <= end) {
            if (a[ptr1] <= a[ptr2]) {
                temp[resPtr++] = a[ptr1++];
            } else {
                temp[resPtr++] = a[ptr2++];
            }
        }

        if (ptr1 <= mid) {  // copy rest of 1st half to temp
            for (int i = ptr1; i <= mid; i++) {
                temp[resPtr++] = a[i];
            }
        } else {    // copy rest of 2nd half to temp
            for (int i = ptr2; i <= end; i++) {
                temp[resPtr++] = a[i];
            }
        }
        System.arraycopy(temp, start, a, start, end - start + 1);
    }

    public static void mergeSort(int[] a, int start, int end, int[] temp) {
        if (start < end) {
            int mid = (start + end) / 2;
            System.out.println("MergeSort: start = " + start + "; mid = " + mid + "; end = " + end);
            mergeSort(a, start, mid, temp);
            mergeSort(a, mid + 1, end, temp);
            merge(a, start, mid, end, temp);
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 30, 31, 14, 15, 16, 4, 2, 2, 3, 4, 5, 6, 4, 3, 2};

        int[] temp = new int[a.length];
        System.out.println("Original array:");
        print(a);
        System.out.println();
        mergeSort(a, 0, a.length - 1, temp);
        System.out.println("Sorted array:");
        print(a);
    }  // main
}
