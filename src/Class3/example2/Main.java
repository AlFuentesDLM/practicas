package Class3.example2;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // quickSortMain();
        // heapSortMain();
        // bubbleSortMain();
        //FactoryTest();
        //testTime();
        timeAndSort();
    }

    public static void timeAndSort() {
        Integer array[] = createBigArray(100000);
        Time timer = new Time(System.currentTimeMillis());
        timer.start();
        System.out.println("Starting properties sort");
        Sorter sorter = (Sorter) MiFactory.getInstance();
        sorter.sort(array);
        timer.stop();
    }

    public static Integer[] createBigArray(int length) {
        Integer intArray[] = new Integer[length];
        int min = 1;
        int max = 100000;
        System.out.println("Random value in int from " + min + " to " + max + ":");
        for (int i = 0; i < length; i++) {
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            intArray[i] = random_int;
        }
        return intArray;
    }

    public static void testTime() {
        Time t = new Time(System.currentTimeMillis());
        t.start();
        try {
            TimeUnit.SECONDS.sleep(4);

        } catch (Exception ex) {
            System.out.println(ex);
        }
        t.stop();

    }

    public static void FactoryTest() {
        String stringArray[] = {
                "hola",
                "chao",
                "aksda",
                "asdkaal"
        };
        Integer arrayInt[] = {1, 23, 444, 4441, 4455, 100};
        Sorter sorter = (Sorter) MiFactory.getInstance();
        sorter.sort(stringArray);
        sorter.sort(arrayInt);
        printResult(stringArray, arrayInt);
    }

    public static void bubbleSortMain() {
        String stringArray[] = {
                "hola",
                "chao",
                "aksda",
                "asdkaal"
        };
        Integer arrayInt[] = {1, 23, 444, 4441, 4455, 100};
        BubbleSortSorterImpl<Integer> intSort = new BubbleSortSorterImpl<>();
        BubbleSortSorterImpl<String> stringSort = new BubbleSortSorterImpl<>();
        intSort.sort(arrayInt);
        stringSort.sort(stringArray);
        printResult(stringArray, arrayInt);
    }

    public static void heapSortMain() {
        String stringArray[] = {
                "hola",
                "chao",
                "aksda",
                "asdkaal"
        };
        Integer arrayInt[] = {1, 23, 444, 4441, 4455, 100};
        HeapSortSorterImpl<String> stringSort = new HeapSortSorterImpl<>();
        HeapSortSorterImpl<Integer> intSort = new HeapSortSorterImpl<>();
        stringSort.sort(stringArray);
        intSort.sort(arrayInt);
        printResult(stringArray, arrayInt);
    }

    public static void quickSortMain() {
        String stringArray[] = {
                "hola",
                "chao",
                "aksda",
                "asdkaal"
        };
        Integer arrayInt[] = {1, 23, 444, 4441, 4455, 100};
        QuickSortSorterImpl<Integer> sortInt = new QuickSortSorterImpl<>();
        QuickSortSorterImpl<String> sort = new QuickSortSorterImpl<>();
        sort.sort(stringArray);
        sortInt.sort(arrayInt);
        printResult(stringArray, arrayInt);
    }

    public static void printResult(String stringArray[], Integer arrayInt[]) {
        for (String text : stringArray
        ) {
            System.out.println(text);
        }

        for (Integer inte : arrayInt
        ) {
            System.out.println(inte);
        }
        System.out.println("----------------------------------------");
    }
}
