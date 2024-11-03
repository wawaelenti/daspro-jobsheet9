import java.util.Scanner;

public class SearchNilai25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input jumlah elemen
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlahElemen = scanner.nextInt();

        // Membuat array berdasarkan jumlah elemen yang dimasukkan
        int[] arrNilai = new int[jumlahElemen];

        // Menerima input untuk setiap elemen array
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = scanner.nextInt();
        }

        // Menerima input nilai yang ingin dicari
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = scanner.nextInt();

        int hasil = -1; // Default untuk menunjukkan tidak ditemukan

        // Mencari nilai dalam array
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i; // Menyimpan indeks di mana key ditemukan
                break; // Keluar dari loop
            }
        }

        // Menampilkan hasil pencarian
        System.out.println();
        if (hasil != -1) {
            // Menambahkan 1 pada hasil untuk menunjukkan urutan mahasiswa
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
        System.out.println();

    }
}
