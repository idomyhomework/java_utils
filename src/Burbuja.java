import java.util.Random;

public class Burbuja {

    public static void sort(int[] datos) {
        for (int i = 1; i < datos.length - 1; i++) {
            for (int j = 0; j < datos.length - i; j++) {
                if (datos[j] > datos[j + 1]) {
                    int aux = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = aux;
                }
            }
        }
    }

    public static void improvedSort(int[] datos) {
        int i = 0;
        boolean esOrdenado = false;

        while (i < datos.length && !esOrdenado) {
            i++;
            esOrdenado = true;
            for (int j = 0; j < datos.length - i; j++) {
                if (datos[j] > datos[j + 1]) {
                    int aux = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = aux;
                    esOrdenado = false;
                }
            }
        }

    }

    public static void sortBidireccional(int arr[]) {
        int izq = 0;
        int der = arr.length - 1;
        boolean hayCambios = true;

        int temp = 0;
        while (izq < der && hayCambios) {
            hayCambios = false;
            for (int i = izq; i < der - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    hayCambios = true;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            if (!hayCambios) {
                break;
            }
            for (int i = der; i > izq; i--) {
                if (arr[i] < arr[i - 1]) {
                    hayCambios = true;
                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
            izq++;
            der--;
        }
    }
}
