import java.util.Scanner;

public class InterpolationSearch {

    // Metode untuk pencarian menggunakan Interpolation Search
    public static int interpolationSearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        // Melakukan pencarian selama batas rendah masih kurang dari atau sama dengan batas tinggi
        // dan target berada di antara nilai pada batas rendah dan batas tinggi
        while (low <= high && target >= array[low] && target <= array[high]) {
            // Jika batas rendah dan batas tinggi sama, dan nilai pada indeks tersebut sesuai dengan target
            if (low == high) {
                if (array[low] == target) {
                    return low; // Mengembalikan indeks di mana target ditemukan
                }
                return -1; // Mengembalikan -1 jika target tidak ditemukan
            }

            // Menghitung indeks perkiraan dengan menggunakan interpolasi
            int mid = low + (high - low) * ((target - array[low]) / (array[high] - array[low]));

            // Jika nilai pada indeks perkiraan sesuai dengan target
            if (array[mid] == target) {
                return mid; // Mengembalikan indeks di mana target ditemukan
            }

            // Jika nilai pada indeks perkiraan kurang dari target, perbarui batas rendah
            if (array[mid] < target) {
                low = mid + 1;
            } else {
                // Jika nilai pada indeks perkiraan lebih dari target, perbarui batas tinggi
                high = mid - 1;
            }
        }

        return -1; // Mengembalikan -1 jika target tidak ditemukan dalam array
    }

    // Metode utama untuk menguji Interpolation Search
    public static void main(String[] args) {
        // Array yang telah diurutkan
        int[] array = {12, 15, 21, 23, 25, 40, 45, 55, 87, 90};

        // Membaca input pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Angka yang ingin dicari: ");
        int target = scanner.nextInt();

        // Melakukan pencarian menggunakan Interpolation Search
        int index = interpolationSearch(array, target);

        // Menampilkan hasil pencarian
        if (index == -1) {
            System.out.println("Target tidak ditemukan");
        } else {
            System.out.println("Target ditemukan pada indeks " + index);
        }
    }
}
