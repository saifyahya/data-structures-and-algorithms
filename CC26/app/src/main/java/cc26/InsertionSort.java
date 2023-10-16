package CC26.app.src.main.java.cc26;

public class InsertionSort {
    public static void insert(int[] sorted, int value, int numberOfSortedElements) {
        int i = 0;
        while (i < numberOfSortedElements && value > sorted[i] ) {
            i++;
        }
        while (i < sorted.length) {
            int temp = sorted[i];
            sorted[i] = value;
            value = temp;
            i++;
        }
    }
    public static int[] insertionSort(int[] input) {
        int[] sorted = new int[input.length];
        sorted[0] = input[0];

        for (int i = 1; i < input.length; i++) {
            insert(sorted, input[i],i);
        }

        return sorted;
    }

    public static void print(int array[]){
        for(int num :array){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
