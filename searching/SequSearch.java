import java.util.Scanner;

public class SequSearch {

    // Metode untuk melakukan sequential search pada array
    public static int sequentialSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Mengembalikan indeks di mana target ditemukan
            }
        }
        return -1; // Mengembalikan -1 jika target tidak ditemukan dalam array
    }

    // Metode utama untuk menguji sequential search
    public static void main(String[] args) {
        // Array yang telah diurutkan
        int[] array = {12, 15, 21, 23, 25, 40, 45, 55, 87, 90};

        // Membaca input pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Angka yang ingin dicari: ");
        int target = scanner.nextInt();

        // Melakukan sequential search
        int index = sequentialSearch(array, target);

        // Menampilkan hasil pencarian
        if (index == -1) {
            System.out.println("Target tidak ditemukan");
        } else {
            System.out.println("Target ditemukan pada indeks " + index);
        }
    }
}
