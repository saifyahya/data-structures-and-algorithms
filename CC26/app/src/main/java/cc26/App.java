/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package CC26.app.src.main.java.cc26;

public class App {

    public static void main(String[] args) {
        int sampleArray[] ={8,4,23,42,16,15};
        System.out.println("array before sorting");
        InsertionSort.print(sampleArray);
        System.out.println("array after sorting");
        InsertionSort.print( InsertionSort.insertionSort(sampleArray));
        /* on place insertion sort*/
        System.out.println("array after sorting in place");
        InsertionSort.insertionSortOnPlace(sampleArray);
        InsertionSort.print(sampleArray);
    }
}
