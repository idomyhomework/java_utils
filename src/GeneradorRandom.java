import java.util.Random;

public class GeneradorRandom {
    public static int[] randomIntArray(int minValue, int maxValue, int quantity) {
        int[] result = new int[quantity];
        Random rand = new Random();
        for (int i = 0; i < quantity; i++) {
            result[i] = rand.nextInt(minValue, maxValue);
        }

        return result;
    }
}
