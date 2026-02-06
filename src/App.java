public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Burbuja brujPalabras = new Burbuja(100, 10);

        System.out.println(brujPalabras.toStringWords());

        System.out.println("*** Ordenado ***");
        brujPalabras.ordenarPalabras();
        System.out.println(brujPalabras.toStringWords());

    }
}
