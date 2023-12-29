public class SelectionSortAscending {
    // Fungsi untuk melakukan Selection Sort pada array secara ascending
    static void selectionSortAscending(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            // Temukan nilai minimum dalam sisa array yang belum diurutkan
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Tukar elemen minimum dengan elemen pertama yang belum diurutkan
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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
        int arr[] = {99, 88, 66, 77, 55, 200, 100};

        System.out.println("\nArray sebelum diurutkan:");
        printArray(arr);

        selectionSortAscending(arr);

        System.out.println("\nArray setelah diurutkan menjadi selection sort ascending:");
        printArray(arr);
    }
}

