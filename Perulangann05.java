import java.util.Scanner;

public class Perulangann05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] daftarMakanan = {"Nasi Goreng", "Mie Ayam", "Bakso", "Sate Ayam"};
        int[] hargaMakanan = {10000, 8000, 7000, 12000};

        System.out.println("Menu Makanan:");
        for (int i = 0; i < daftarMakanan.length; i++) {
            System.out.println((i + 1) + ". " + daftarMakanan[i] + " - Rp " + hargaMakanan[i]);
        }

        double totalHarga = 0.0;

        System.out.println("\nPesan makanan (masukkan nomor makanan atau 0 untuk selesai):");
        int nomorMakanan;
        do {
            nomorMakanan = sc.nextInt();
            if (nomorMakanan > 0 && nomorMakanan <= daftarMakanan.length) {
                totalHarga += hargaMakanan[nomorMakanan - 1];
            } else if (nomorMakanan != 0) {
                System.out.println("Nomor makanan tidak valid. Silakan masukkan nomor makanan yang benar.");
            }
        } while (nomorMakanan != 0);

        System.out.println("Total Harga: Rp " + totalHarga);

        System.out.println("Terima kasih! Selamat menikmati makanan Anda.");
    }
}
