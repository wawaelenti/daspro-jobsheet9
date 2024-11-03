import java.util.Scanner;

public class PemesananKafe {
    
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        //meminta jumlah pesanan 
        System.out.print("Masukkan jumlah pesanan: ");
        n = sc.nextInt();
        sc.nextLine();

        //deklarsi array untuk menyimpan pesanan 
        String[] menu = new String[n];
        int [] harga = new int [n];

        //input pesanan dan harga
        for(int i =0;i<n;i++) {
            System.out.print("Menu " +(i+1)+" : ");
            menu[i] = sc2.nextLine();
            System.out.print("harga "+(i+1)+" : " );
            harga[i] = sc.nextInt();
            sc.nextLine();
        }

        //menghitung total biaya pemesanan 
        int total = 0;
        for(int i=0;i<harga.length;i++) {
            total += harga[i];
        }

        //menampilkan daftar pesanan dan total biaya
        System.out.println("\nDaftar Pesanan: ");
        for(int i=0; i<harga.length;i++) {
            System.out.println("menu "+(i+1)+" :" + menu[i]);
            System.out.println("harga " +(i+1)+" : " + harga[i]);
        } 
        System.out.println("Total biaya: Rp " + total);
    }   
}
