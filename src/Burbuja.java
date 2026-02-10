import java.util.Random;

public class Burbuja {
    private int[] datos;
    private String[] datosTexto;

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

    public Burbuja(int len, int lenPalabra) {
        datosTexto = new String[len];
        for (int i = 0; i < datosTexto.length; i++) {
            datosTexto[i] = generarPalabra(97, 122, lenPalabra);
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

    public String toStringWords() {
        final int ANCHO = 50;
        String salida = "";
        for (int i = 0; i < datosTexto.length; i++) {
            if (i != datosTexto.length - 1)
                salida += datosTexto[i] + ", ";
            else
                salida += datosTexto[i];
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

    public String generarPalabra(int min, int max, int len) {
        Random rand = new Random();
        String resultado = "";
        for (int i = 0; i < len; i++) {
            int numRand = rand.nextInt(min, max);
            char ch = (char) numRand;
            resultado += String.valueOf(ch);
        }
        return resultado;
    }

    public void ordenarPalabras() {
        int i = 0;

        while (i < datosTexto.length) {
            i++;
            for (int j = 0; j < datosTexto.length - i; j++) {
                if (datosTexto[j].charAt(0) > datosTexto[j + 1].charAt(0)) {
                    String aux = datosTexto[j];
                    datosTexto[j] = datosTexto[j + 1];
                    datosTexto[j + 1] = aux;
                }
            }
        }

        for (int a = 0; a < datosTexto.length - 1; a++) {
            if (datosTexto[a].charAt(0) == datosTexto[a + 1].charAt(0)) {
                int o = 1;
                boolean esOrdenadoMejor = false;
                while (!esOrdenadoMejor) {
                    if (datosTexto[a].charAt(o) > datosTexto[a + 1].charAt(o)) {
                        String aux = datosTexto[a];
                        datosTexto[a] = datosTexto[a + 1];
                        datosTexto[a + 1] = aux;
                        esOrdenadoMejor = true;
                    } else {
                        o++;
                    }
                }
            }
        }
    }

    public static void bidireccional(int arr[]) {
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
