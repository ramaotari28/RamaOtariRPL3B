
import java.util.Scanner;

    public class DirectHash {
        private boolean[] table;

        // Konstruktor untuk membuat tabel hash dengan ukuran tertentu
        public DirectHash(int size) {
            table = new boolean[size];
        }

        // Metode untuk menyisipkan nilai ke dalam tabel hash
        public void insert(int value) {
            table[value] = true;
            System.out.println("Angka: " + value + " ditambahkan ke dalam tabel hash.");
        }

        // Metode untuk menghapus nilai dari tabel hash
        public void delete(int value) {
            table[value] = false;
            System.out.println("Angka: " + value + " dihapus dari tabel hash.");
        }

        // Metode untuk mencari nilai dalam tabel hash
        public void search(int value) {
            if (table[value]) {
                System.out.println("Angka: " + value + " ditemukan dalam tabel hash.");
            } else {
                System.out.println("Angka: " + value + " tidak ditemukan dalam tabel hash.");
            }
        }

        public static void main(String[] args) {
            // Membuat objek hash table dengan ukuran 200
            DirectHash hashTable = new DirectHash(200);
            Scanner scanner = new Scanner(System.in);

            // Menambahkan beberapa angka ke dalam tabel
            hashTable.insert(188);
            hashTable.insert(130);
            hashTable.insert(180);
            hashTable.insert(100);
            hashTable.insert(99);

            System.out.println("\n");

            // Mencari dan menghapus angka dalam tabel hash
            System.out.print("Masukkan angka yang ingin Anda cari: ");
            int searchValue = scanner.nextInt(); // Membaca input dari pengguna

            // Mencari angka dalam tabel hash
            hashTable.search(searchValue);

            System.out.print("Masukkan angka yang ingin Anda hapus: ");
            int deleteValue = scanner.nextInt(); // Membaca input dari pengguna

            // Menghapus angka dari tabel hash
            hashTable.delete(deleteValue);

            scanner.close(); // Menutup Scanner setelah penggunaan selesai
        }
    }






