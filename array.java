import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        // Create an array with the values
        int[] myArray = {1, 2, 3, 4, 5, 6, 7};

        // Shuffle the array
        shuffleArray(myArray);

        // Print the shuffled array
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }

    public static void shuffleArray(int[] array) {
        Random random = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            // Swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}