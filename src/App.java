public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] arr = { 45, 34, 55, 66, 67, 90, 1, -34, 0, 123, 78, -1, -30, -1024, 569 };

        Quicksort.sort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}