public class StepHash {
    private static final int TABLE_SIZE = 10;
    private String[] table;

    public StepHash() {
        table = new String[TABLE_SIZE];
    }

    // Langkah 1: Fungsi hash dengan beberapa operasi bitwise dan matematika
    private int hashFunction(String value) {
        int hash = 0;

        for (int i = 0; i < value.length(); i++) {
            hash = (hash << 5) ^ value.charAt(i);
        }

        return Math.abs(hash % TABLE_SIZE);
    }

    // Langkah 2: Penyisipan data ke dalam tabel hash
    public void insert(String data) {
        int index = hashFunction(data);
        table[index] = data;
        System.out.println("Data: " + data + " disisipkan pada indeks: " + index);
    }

    // Langkah 3: Pencarian data dalam tabel hash
    public void search(String data) {
        int index = hashFunction(data);

        if (table[index] != null && table[index].equals(data)) {
            System.out.println("Data: " + data + " ditemukan pada indeks: " + index);
        } else {
            System.out.println("Data: " + data + " tidak ditemukan dalam tabel");
        }
    }

    public static void main(String[] args) {
        StepHash hashTable = new StepHash();

        // Langkah 4: Menambahkan beberapa data ke dalam tabel hash
        hashTable.insert("Apple");
        hashTable.insert("Banana");
        hashTable.insert("Cherry");
        hashTable.insert("Grapes");

        System.out.println("\n");

        // Langkah 5: Mencari data dalam tabel hash
        hashTable.search("Banana");
        hashTable.search("Orange");
    }
}
