public class Insertion {
    public static void sort(int[] arr) {
        int clave = 0;
        int j = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            clave = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > clave) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = clave;
        }
    }
}
