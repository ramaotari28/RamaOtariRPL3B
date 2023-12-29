import java.util.ArrayList;
import java.util.Scanner;

// Representasi Mahasiswa dengan tiga atribut: nim, nama, dan jurusan
class Mahasiswa {
    private String nim;
    private String nama;
    private String jurusan;
    // Konstruktor untuk menginisialisasi objek Mahasiswa dengan nim, nama, dan jurusan
    public Mahasiswa(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }
    // Metode pengambil untuk mendapatkan NIM
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }
    // Metode pengambil untuk mendapatkan Jurusan
    public String getJurusan() {
        return jurusan;
    }
}
    //Kelas utama untuk mengelola dan berinteraksi dengan data Mahasiswa
     public class DataMahasiswa {
        // Membuat ArrayList untuk menyimpan objek Mahasiswa
        // ArrayList ini akan digunakan sebagai penyimpanan data Mahasiswa
    public static int sequentialSearch(ArrayList<Mahasiswa> dataMahasiswa, String nim) {
        for (int i = 0; i < dataMahasiswa.size(); i++) {
            if (dataMahasiswa.get(i).getNim().equals(nim)) {
                return i; // Mengembalikan indeks mahasiswa yang ditemukan
            }
        }
        return -1; // Mengembalikan -1 jika NIM tidak ditemukan
    }

    public static void main(String[] args) {
        ArrayList<Mahasiswa> dataMahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean selesai = false;

        while (!selesai) {
            System.out.println(" Menu Data Mahasiswa");
            // ... (unchanged menu options)

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline character setelah membaca angka

            switch (pilihan) {
                // ... (unchanged cases)
                case 3:
                    System.out.println("Masukkan nim yang dicari");
                    String cariNIMsequential = scanner.nextLine();

                    int sequentialSearchResult = sequentialSearch(dataMahasiswa, cariNIMsequential);
                    if (sequentialSearchResult != -1) {
                        System.out.println("Data ditemukan pada indeks ke : " + sequentialSearchResult);
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                    break;
                // ... (unchanged cases)
            }

            System.out.println(); // Memberikan baris kosong sebagai pemisah antar transaksi
        }

        scanner.close();
    }
}
