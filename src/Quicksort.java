public class Quicksort {
    public static void sort(int[] arr, int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }
        int pivote = arr[(fin + inicio) / 2];
        int aux = arr[inicio];

        arr[inicio] = pivote;
        arr[(fin + inicio) / 2] = aux;
        int izq = inicio + 1;
        int der = fin;

        while (izq <= der) {
            while (izq <= fin && arr[izq] < pivote) {
                izq++;
            }
            while (der > inicio && arr[der] >= pivote) {
                der--;
            }

            if (izq < der) {
                aux = arr[izq];
                arr[izq] = arr[der];
                arr[der] = aux;
            }
        }
        if (der > inicio) {
            aux = arr[inicio];
            arr[inicio] = arr[der];
            arr[der] = aux;
        }
        sort(arr, inicio, der - 1);
        sort(arr, der + 1, fin);
    }

    public static void sort(int[] arr) {
        int inicio = 0;
        int fin = arr.length - 1;
        if (inicio >= fin) {
            return;
        }
        int pivote = arr[(fin + inicio) / 2];
        int aux = arr[inicio];

        arr[inicio] = pivote;
        arr[(fin + inicio) / 2] = aux;
        int izq = inicio + 1;
        int der = fin;

        while (izq <= der) {
            while (izq <= fin && arr[izq] < pivote) {
                izq++;
            }
            while (der > inicio && arr[der] >= pivote) {
                der--;
            }

            if (izq < der) {
                aux = arr[izq];
                arr[izq] = arr[der];
                arr[der] = aux;
            }
        }
        if (der > inicio) {
            aux = arr[inicio];
            arr[inicio] = arr[der];
            arr[der] = aux;
        }
        sort(arr, inicio, der - 1);
        sort(arr, der + 1, fin);
    }

    public static void sortStrings(String[] arr, int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }
        String pivote = arr[(fin + inicio) / 2];
        String aux = arr[inicio];

        arr[inicio] = pivote;
        arr[(fin + inicio) / 2] = aux;
        int izq = inicio + 1;
        int der = fin;

        while (izq <= der) {
            while (izq <= fin && arr[izq].compareTo(pivote) < 0) {
                izq++;
            }
            while (der > inicio && arr[der].compareTo(pivote) >= 0) {
                der--;
            }

            if (izq < der) {
                aux = arr[izq];
                arr[izq] = arr[der];
                arr[der] = aux;
            }
        }
        if (der > inicio) {
            aux = arr[inicio];
            arr[inicio] = arr[der];
            arr[der] = aux;
        }
        sortStrings(arr, inicio, der - 1);
        sortStrings(arr, der + 1, fin);
    }
}
