public class Selection {
    public static void sort(int[] arr) {
        int minimo = 0;
        int aux = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            minimo = i;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[j] < arr[minimo]) {
                    minimo = j;
                }
            }

            aux = arr[i];
            arr[i] = arr[minimo];
            arr[minimo] = aux;
        }
    }
}
