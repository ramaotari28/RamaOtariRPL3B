public class BubbleSortAscending {
        // Fungsi untuk melakukan Bubble Sort ascending pada array
        static void bubbleSortAscending(int arr[]) {
            int n = arr.length;

            for (int i = 0; i < n-1; i++) {
                // Elemen i terakhir sudah diurutkan,tidak perlu membandingkannya lagi
                for (int j = 0; j < n-i-1; j++) {
                    // Lakukan pertukaran jika elemen yang dibandingkan lebih besar

                    if (arr[j] > arr[j+1]) {
                        // tukar arr[j+1] dan arr[i]
                        //fungsi untuk melakukan penukaran data
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
            int arr[] = {200, 100, 88, 66, 77, 55, 99};

            System.out.println("\nArray sebelum diurutkan:");
            printArray(arr);

            bubbleSortAscending(arr);

            System.out.println("\nArray setelah diurutkan secara  ascending:");
            printArray(arr);
        }
    }









