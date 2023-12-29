public class SelectionSortDescending {
    // Fungsi untuk melakukan Selection Sort pada array secara descending
    static void selectionSortDescending(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            // Temukan nilai maksimum dalam sisa array yang belum diurutkan
            int maxIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Tukar elemen maksimum dengan elemen pertama yang belum diurutkan
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
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
        int arr[] = {100, 88, 99, 55, 77, 66, 200};

        System.out.println("\nArray sebelum diurutkan:");
        printArray(arr);

        selectionSortDescending(arr);

        System.out.println("\nArray setelah diurutkan menjadi selection sort descending:");
        printArray(arr);
    }
}
