import java.util.Scanner;

public class binasearch {


    // Fungsi binary search rekursif
    public static int binaSearch(int[] arr, int target, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // Angka ditemukan, mengembalikan indeks
            }

            if (arr[mid] < target) {
                // Cari di sebelah kanan
                return binaSearch(arr, target, mid + 1, high);
            } else {
                // Cari di sebelah kiri
                return binaSearch(arr, target, low, mid - 1);
            }
        }

        return -1; // Angka tidak ditemukan
    }

    public static void main(String[] args) {
        int[] data = {12, 15, 21, 23, 25, 40, 45, 55, 81, 90};

        // Membaca angka target dari keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka yang ingin dicari: ");
        int target = scanner.nextInt();

        int hasilPencarian = binaSearch(data, target, 0, data.length - 1);

        if (hasilPencarian != -1) {
            System.out.println("Angka " + target + " ditemukan pada indeks ke-" + hasilPencarian);
        } else {
            System.out.println("Angka " + target + " tidak ditemukan dalam array.");
        }

        // Menutup scanner setelah digunakan
        scanner.close();
    }
}