public class BubbleSortDescending {
    // Fungsi untuk melakukan Bubble Sort pada array secara descending
    static void bubbleSortDescending(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            // // Elemen i terakhir sudah diurutkan, tidak perlu membandingkannya lagi
            for (int j = 0; j < n-i-1; j++) {
                // Lakukan pertukaran jika elemen yang dibandingkan lebih kecil
                if (arr[j] < arr[j+1]) {
                    // tukar arr[j+1] dan arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Fungsi untuk menampilkan array
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Contoh penggunaan
    public static void main(String args[]) {
        int arr[] = {55, 66, 77, 99, 200, 88, 100};

        System.out.println("\nArray sebelum diurutkan:");
        printArray(arr);

        bubbleSortDescending(arr);

        System.out.println("\nArray setelah diurutkan secara descending:");
        printArray(arr);
    }
}
