import java.util.Scanner;

public class Hash {
    private int[] table;

    // Konstruktor untuk membuat tabel hash dengan ukuran tertentu
    Hash(int size) {
        table = new int[size];
    }

    // Metode untuk menyisipkan nilai ke dalam tabel hash
    void insert(int value) {
        int index = value;
        table[index] = value;

        System.out.println("Angka: " + value + " ditambahkan ke dalam indeks: " + index);
    }

    // Metode untuk mencari nilai dalam tabel hash
    void search(int value) {
        if (table[value] == value) {
            System.out.println("Angka: " + table[value] + " berada pada indeks: " + value);
        } else
            System.out.println("Angka: " + value + " tidak ada dalam tabel");
    }
}

    class HashTable {
    public static void main(String[] args) {
        // Membuat objek hash table dengan ukuran 200
        Hash table = new Hash(200);
        Scanner scanner = new Scanner(System.in);

        // Menambahkan beberapa angka ke dalam tabel
        table.insert(188);
        table.insert(130);
        table.insert(180);
        table.insert(100);
        table.insert(99);

        System.out.println("\n");

        System.out.print("Masukkan angka yang ingin Anda cari: ");
        int searchValue = scanner.nextInt(); // Membaca input dari pengguna

        // Mencari angka dalam tabel hash
        table.search(searchValue);

        scanner.close(); // Menutup Scanner setelah penggunaan selesai
    }
}
