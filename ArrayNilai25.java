import java.util.Scanner;

public class ArrayNilai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         //membuat deklarasi variabel 
         int[] nilaiAkhir = new int[10];
         //membuat struktur perulangan
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) { 
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-"+i+" lulus!");  
            } else {
                System.out.println("Mahasiswa ke-"+i+" tidak lulus!");
            }
        }
    }
}
