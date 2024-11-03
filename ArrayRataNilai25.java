import java.util.Scanner;

public class ArrayRataNilai25 {

    public static void main(String[] args) {
        //deklarasi scanner
        Scanner sc = new Scanner(System.in);

        //memasukkan jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();

        //membuat variabel array
        int[] nilaiMhs = new int[5];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int jumlahLulus = 0;
        int jumlahTIdakLulus = 0;

        //membuat struktur perulangan untuk input nilai
        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" :");
            nilaiMhs[i] = sc.nextInt();
        }

        //menghitung total nilai dan jumlah mahasiswa yang lulus dan tidak lulus
        for (int i =  0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) { 
                totalLulus += nilaiMhs[i]; //total nilai lulus
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTIdakLulus++;
            }
        }
        //menghitung nilai rata2 nilai lulus dan tidak lulus
        double rataLulus = (jumlahLulus > 0) ? (totalLulus / jumlahLulus) : 0;
        double rataTidakLulus = (jumlahTIdakLulus > 0) ? (totalTidakLulus / jumlahTIdakLulus) : 0;
        //menampilkan hasil 
        System.out.println("Rata-rata nilai lulus = "+ rataLulus);
        System.out.println("Rata-rata nilai lulus ="+ rataTidakLulus);
    }
    
}
