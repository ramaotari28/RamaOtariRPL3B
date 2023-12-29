public class BubbleSort2 {
    public static void main(String[] args) {
        int[] arr = {33, 22, 44, 11, 55};

        // Menampilkan array sebelum diurutkan
        System.out.println("Array sebelum diurutkan:");
        printArray(arr);

        // Memanggil metode bubbleSort
        bubbleSort(arr);

        // Menampilkan array setelah diurutkan
        System.out.println("\nArray setelah diurutkan:");
        printArray(arr);
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {


                if (arr[j] > arr[j + 1]) {
                    // Tukar elemen arr[j] dan arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
