public class BinarySearchArray {
    // in most cases, the low and high values are not given
    // low would be 0 and high would be length - 1
    //have to find the mid, which is (low + (high - low) / 2)
    // key is what we are trying to find
    public static int searchI(int[] array, int key, int low, int high) {
        // iterative method
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (array[mid] < key) {
                low = mid + 1;
            } else if (array[mid] > key) {
                high = mid - 1;
            } else if (array[mid] == key) {
                return mid;
            }
        }
        return index;
    }

    public static int searchR(int[] array, int key, int low, int high) {
        // recursive method
        int middle = low + ((high - low) / 2);

        if (high < low) {
            return -1;
        }

        if (array[middle] == key) {
            return middle;
        } else if (array[middle] < key) {
            return searchR(array, key, middle + 1, high);
        } else {
            return searchR(array, key, low, middle - 1);
        }
    }
}
