package Class3.example1;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SortUtils {

    public static <T> void sort(Precedable<T> arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            Precedable temp = null;
            for (int j = 1; j < n ; j++) {
                if (arr[j-1].precedeA((T) arr[j])){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        print(arr);
    }

    public static <T> void print(Precedable<T> elements[]){
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i].toString());
        }
    }
}


