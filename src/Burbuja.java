import java.util.Random;

public class Burbuja {
    private int[] datos;

    public Burbuja(int n, int min, int max) {
        datos = new int[n];
        generarDatos(n, Math.min(min, max), Math.max(min, max));

    }

    private void generarDatos(int n, int min, int max) {
        Random rand = new Random();

        for (int i = 0; i < datos.length; i++) {
            datos[i] = rand.nextInt(min, max);
        }

    }

    public String toString() {
        final int ANCHO = 5;
        String salida = "";
        for (int i = 0; i < datos.length; i++) {
            if (i != datos.length - 1)
                salida += datos[i] + ", ";
            else
                salida += datos[i];
            if (i != 0 && i % ANCHO == 0)
                salida += "\n";
        }

        return salida;
    }

    public void ordenar() {
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

    public void ordenarMejorado() {
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
}
