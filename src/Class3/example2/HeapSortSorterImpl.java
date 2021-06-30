package Class3.example2;

public class HeapSortSorterImpl <T extends Comparable<? super T>> implements Sorter<T> {

    @Override
    public void sort(T[] arr) {
        heapSort(arr);
    }
    private void heapSort(T[] array)
    {
        int size = array.length;

        // build heapSort (rearrange array)
        for (int i = size / 2 - 1; i >= 0; i--)
            heapify(array, size, i);

        // one by one extract an element from heapSort
        for (int i = size - 1; i >= 0; i--)
        {
            // move current root to end
            T temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // call max heapify on the reduced heapSort
            heapify(array, i, 0);
        }
    }

    // to heapify a subtree rooted with node i which is an index in array[]
    void heapify(T[] array, int size, int i)
    {
        int max   = i; // initialize max as root
        int left  = 2 * i + 1;
        int right = 2 * i + 2;

        // if left child is larger than root
        if (left < size && array[left].compareTo(array[max]) > 0)
            max = left;

        // if right child is larger than max
        if (right < size && array[right].compareTo(array[max]) > 0)
            max = right;

        // if max is not root
        if (max != i)
        {
            // swap
            T temp = array[i];
            array[i] = array[max];
            array[max] = temp;

            // recursively heapify the affected sub-tree
            heapify(array, size, max);
        }
    }
}
