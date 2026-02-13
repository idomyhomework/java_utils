import java.time.Duration;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) throws Exception {
        // crear un array de elementos int random
        int[] originalArray = GeneradorRandom.randomIntArray(0, 100, 100000);

        // algoritmo burbuja
        int[] sortBurbuja = originalArray.clone();
        LocalTime startBurbuja = LocalTime.now();
        Burbuja.sort(sortBurbuja);
        LocalTime finishBurbuja = LocalTime.now();
        System.out.print("Burbuja ejecutado en...");
        System.out.println((double) Duration.between(startBurbuja, finishBurbuja).toMillis() / 1000 + " segundos");

        // algoritmo insertion
        int[] sortInsertion = originalArray.clone();
        LocalTime startInsertion = LocalTime.now();
        Insertion.sort(sortInsertion);
        LocalTime finishInsertion = LocalTime.now();
        System.out.print("Insertion ejecutado en...");
        System.out.println((double) Duration.between(startInsertion, finishInsertion).toMillis() / 1000 + " segundos");

        // algoritmo quicksort
        int[] quickSort = originalArray.clone();
        LocalTime startQuick = LocalTime.now();
        Quicksort.sort(quickSort);
        LocalTime finishQuick = LocalTime.now();
        System.out.print("Quicksort ejecutado en...");
        System.out.println((double) Duration.between(startQuick, finishQuick).toMillis() / 1000 + " segundos");

        // algoritmo seleccion
        int[] selectionSort = originalArray.clone();
        LocalTime startSelection = LocalTime.now();
        Selection.sort(selectionSort);
        LocalTime finishSelection = LocalTime.now();
        System.out.print("Selection ejecutado en...");
        System.out.println((double) Duration.between(startSelection, finishSelection).toMillis() / 1000 + " segundos");
    }
}