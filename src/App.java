public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Burbuja bruj = new Burbuja(1000000, 1, 20);

        bruj.ordenarMejorado();

        System.out.println(bruj.toString());
    }
}
