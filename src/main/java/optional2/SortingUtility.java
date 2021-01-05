
package optional2;

public class SortingUtility {

    public static final int DESC_ORDER = 1;

    public static <T extends Comparable<T>> void sort(T[] a, int order) {

        if (order == DESC_ORDER) {
            bubbleSortInDescOrder(a);
        }
    }

    private static <T extends Comparable<T>> void bubbleSortInDescOrder(T[] a) {
        int left = 0;
        int right = a.length - 1;
        for (int i = right; i > 1; i--) {
            for (int j = left; j < i; j++) {
                if (((Comparable<T>) a[j]).compareTo(a[j + 1]) < 0) {
                    swap(a, j, j + 1);
                }
            }
        }
    }

    private static void swap(Object[] a, int left, int right) {
        Object temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }
}
