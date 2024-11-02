public class SelectionSort {
    public static void sortNumbers(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        // Print the sorted array
        System.out.println("Arreglo ordenado en orden ascendente:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
