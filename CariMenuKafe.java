import java.util.Scanner;

public class CariMenuKafe {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi goreng", "Mie goreng", "Roti bakar", "Kentang goreng", "Teh tarik", "Cappuccino", "Chocholate ice"};

        // input dari pengguna untuk nama makanan yg dicari
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String cariMakanan = sc.nextLine();

        //linear Search untuk mencari makanan 
        boolean ditemukan = false;
        for (String item : menu) {
            if (item.equalsIgnoreCase(cariMakanan)) {
                ditemukan = true;
                break;
            }
        }
        //menampilkan hassil pencarian 
        if(ditemukan) {
            System.out.println("Makanan '"+ cariMakanan+ "' tersedia di menu. Silahkan pesan");   
        } else {
            System.out.println("Maaf Makanan '"+ cariMakanan+ "'tidak tersedia di menu.");
        }
    }
}
