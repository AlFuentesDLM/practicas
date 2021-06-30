package Class2T.exampleT2;

public class Utils {

    public static String[] addZeros(String[] array,int amountZero){
        for (int i = 0; i < array.length; i++) {
            while (array[i].length() < amountZero){
                array[i] = "0"+array[i];
            }
        }
        return array;
    }

    public static void printArray(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

