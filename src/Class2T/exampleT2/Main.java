package Class2T.exampleT2;

public class Main {
    public static void main(String[] args) {
        int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
        System.out.println(radixSort(arr));
    }

    public static int[] radixSort(int[] array){
        String arr[] = new String[array.length];
        int j = 0;
        int greaterLength = 0;
        for (int i = 0; i < array.length; i++) {
            arr[i] = String.valueOf(array[i]);
            if (array[i] > j){
                j = array[i];
                greaterLength = arr[i].length();
            }
        }
        arr = Utils.addZeros(arr,greaterLength);
        Utils.printArray(arr);
        return array;
    }
}
