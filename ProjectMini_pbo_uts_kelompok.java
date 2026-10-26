/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percabanganjava_raffy_pbo_sesi4;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class MiniProject_Raffy_PBO_sesi4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // --- BAGIAN 1: DATABASE KASIR (Materi Pertemuan 5 - Array 1 Dimensi) ---
        // Kita menyimpan banyak data dalam satu variabel menggunakan Array.
        String[] dataIdKasir = {"K01", "K02", "K03", "K04"};
        String[] dataNamaKasir = {"Raffy Nasyehkhudin", "Novian Pratmojo", "Singgah Sindudharma","Roihan nurdika yusuf"};
        String[] dataPinKasir = {"0106", "1234", "5678", "2323"};

        String kasirAktif = "";
        boolean loginSukses = false; // Tipe data boolean untuk status login[cite: 117]

        System.out.println("=== Selamat Datang ===");

        // --- BAGIAN 2: SISTEM LOGIN (Materi Pertemuan 5 - While Loop) ---
        // Perulangan dilakukan selama kondisi loginSukses masih false.
        while (loginSukses == false) {
            System.out.print("Masukkan ID Kasir: ");
            String inputId = input.nextLine();

            System.out.print("Masukkan PIN: ");
            String inputPin = input.nextLine();

            // For Loop untuk mengecek setiap data di dalam Array[cite: 34, 49].
            for (int i = 0; i < dataIdKasir.length; i++) {
                // If Statement (Pert. 4) digabung dengan Operator Logika && AND (Pert. 3).
                // Kedua kondisi (ID dan PIN) harus benar.
                if (inputId.equals(dataIdKasir[i]) && inputPin.equals(dataPinKasir[i])) {
                    loginSukses = true;
                    kasirAktif = dataNamaKasir[i]; // Menyimpan nama kasir yang cocok
                    break; // Menghentikan loop jika data sudah ketemu
                }
            }

            // Percabangan If-Else (Materi Pertemuan 4)[cite: 70].
            if (loginSukses == true) {
                System.out.println("\nLogin Berhasil! Selamat bertugas, " + kasirAktif + ".");
            } else {
                System.out.println("ID atau PIN Salah! Silakan coba lagi.\n");
            }
        } // Akhir dari While Loop

        // --- BAGIAN 3: DATA PELANGGAN ---
        System.out.println("\n=== DATA PELANGGAN ===");
        System.out.print("Masukkan Nama Pelanggan: ");
        String namaPelanggan = input.nextLine();

        // Karena nextLine() dan nextInt() bentrok, kita butuh input dummy untuk mereset Scanner
        System.out.println("\nTekan ENTER untuk lanjut ke menu pesanan...");
        input.nextLine();

        String rincianPesanan = "";
        int hargaMakanan = 0; // Hapus jika pakai totalHarga langsung, tapi kita pakai totalHarga saja biar simpel
        int totalHarga = 0;
        String tambahLagi = "t";

        System.out.println(" -------MENU MAKANAN---------");
        System.out.println("| 1. Nasi Goreng ayam        |");
        System.out.println("| 2. Nasi Goreng Ati Ampela  |");
        System.out.println("| 3. Nasi Goreng Special     |");
        System.out.println("| 4. Mie Goreng Ayam         |");
        System.out.println("| 5. Mie Goreng Ati Ampela   |");
        System.out.println("| 6. Mie Goreng Special      |");
        System.out.println("| 7. Mie Rebus Ayam          |");
        System.out.println("| 8. Mie Rebus Ati Ampela    |");
        System.out.println("| 9. Mie Rebus Special       |");
        System.out.println("| 10. Capcay Goreng          |");
        System.out.println("| 11. Capcay Goreng Special  |");
        System.out.println("| 12. Capcay Rebus           |");
        System.out.println("| 13. Capcay Rebus Special   |");
        System.out.println(" ---------------------------- ");
        System.out.println("\n -------MENU MAKANAN---------");
        System.out.println("| 1. Teh Manis               |");
        System.out.println("| 2. Es Teh Manis            |");
        System.out.println("| 3. Teh Tawar               |");
        System.out.println("| 4. Es Teh Tawar            |");
        System.out.println("| 5. Jeruk Anget             |");
        System.out.println("| 6. Es Jeruk                |");
        System.out.println(" ----------------------------");

        System.out.println("\n\n          =====>> Pemesanan Makanan <<=====       ");

        do {

            System.out.println("-------------------------------------------------------");
            System.out.print(" Silakan Ketik Nomor urut Makanan Yang Akan Anda Pesan!\n ");
            System.out.print("\n| Ketik Nomor urut menu yang ingin dipesan: ");
            int makanan = input.nextInt();
            String namaMakanan = "";
            hargaMakanan = 0;
            switch (makanan) {
                case 1:
                    namaMakanan = "Nasi Goreng ayam";
                    hargaMakanan = 14000;
                    break;
                case 2:
                    namaMakanan = "Nasi Goreng Ati Ampela";
                    hargaMakanan = 18000;
                    break;
                case 3:
                    namaMakanan = "Nasi Goreng Special";
                    hargaMakanan = 20000;
                    break;
                case 4:
                    namaMakanan = "Mie Goreng Ayam";
                    hargaMakanan = 14000;
                    break;
                case 5:
                    namaMakanan = "Mie Goreng Ati Ampela";
                    hargaMakanan = 18000;
                    break;
                case 6:
                    namaMakanan = "Mie Goreng Special";
                    hargaMakanan = 20000;
                    break;
                case 7:
                    namaMakanan = "Mie Rebus Ayam";
                    hargaMakanan = 14000;
                    break;
                case 8:
                    namaMakanan = "Mie Rebus Ati Ampela";
                    hargaMakanan = 18000;
                    break;
                case 9:
                    namaMakanan = "Mie Rebus Special";
                    hargaMakanan = 20000;
                    break;
                case 10:
                    namaMakanan = "Capcay Goreng";
                    hargaMakanan = 15000;
                    break;
                case 11:
                    namaMakanan = "Capcay Goreng Special";
                    hargaMakanan = 22000;
                    break;
                case 12:
                    namaMakanan = "Capcay Rebus";
                    hargaMakanan = 15000;
                    break;
                case 13:
                    namaMakanan = "Capcay Rebus Special";
                    hargaMakanan = 22000;
                    break;
                default:
                    System.out.println(" Maaf Tidak ada menu di nomor urut yang anda input");
            }
            // Validasi: Kalau menu ada harganya, catat ke struk!
            if (hargaMakanan > 0) {
                // Ini kuncinya: += berarti "tambahin ke bawahnya", bukan ditimpa (Materi Pertemuan 3)
                rincianPesanan += "- " + namaMakanan + " (Rp " + hargaMakanan + ")\n";
                totalHarga += hargaMakanan;
                System.out.println(">> " + namaMakanan + " berhasil masuk keranjang!<<");
                System.out.println("\n------------------------------------------------------");
            }

            // Tanya mau nambah lagi atau nggak
            System.out.print("\nMau tambah pesanan lagi?\n");
            System.out.print("\nKetik 'y' Jika ingin tambah pesanan, dan 't' jika pesanan sudah cukup");
            System.out.print("\nSilakan Ketik (y/t) : ");
            tambahLagi = input.next();

        } while (tambahLagi.equalsIgnoreCase("y"));
        // Jika kasir ketik 'y', loop balik lagi ke atas (Do-While).
        System.out.println("\n\n\n          =====>> Pemesanan Minuman <<=====       ");
        do {
            System.out.println("------------------------------------------------------");
            System.out.print("Silakan Ketik Nomor urut Minuman Yang Akan Anda Pesan!\n ");
            System.out.print("\n| Ketik Nomor urut menu yang ingin dipesan: ");
            int minuman = input.nextInt();
            String namaMinuman = "";
            int hargaMinuman = 0;

// 4. Bikin Switch KEDUA khusus minuman
            switch (minuman) {
                case 1:
                    namaMinuman = "Teh Manis";
                    hargaMinuman = 4000;
                    break;
                case 2:
                    namaMinuman = "Es Teh Manis";
                    hargaMinuman = 5000;
                    break;
                case 3:
                    namaMinuman = "Teh Tawar";
                    hargaMinuman = 3000;
                    break;
                case 4:
                    namaMinuman = "Es Teh Tawar";
                    hargaMinuman = 4000;
                    break;
                case 5:
                    namaMinuman = "Jeruk Anget";
                    hargaMinuman = 5000;
                    break;
                case 6:
                    namaMinuman = "Es Jeruk";
                    hargaMinuman = 7000;
                    break;
                default:
                    System.out.println("Maaf menu minuman tidak valid");
            }
            // Validasi: Kalau menu ada harganya, catat ke struk!
            if (hargaMinuman > 0) {
                // Ini kuncinya: += berarti "tambahin ke bawahnya", bukan ditimpa (Materi Pertemuan 3)
                rincianPesanan += "- " + namaMinuman + " (Rp " + hargaMinuman + ")\n";
                totalHarga += hargaMinuman;
                System.out.println(">> " + namaMinuman + " berhasil masuk keranjang!");
                System.out.println("\n------------------------------------------------------");
            }

            // Tanya mau nambah lagi atau nggak
            System.out.print("\nMau tambah pesanan lagi?\n");
            System.out.print("\nKetik 'y' Jika ingin tambah pesanan, dan 't' jika pesanan sudah cukup");
            System.out.print("\nSilakan Ketik (y/t) : ");
            tambahLagi = input.next();

        } while (tambahLagi.equalsIgnoreCase("y"));
        // Jika kasir ketik 'y', loop balik lagi ke atas (Do-While).
        System.out.println(" \n\n");
        // =========================================================
        // --- FITUR BARU 1: DISKON OTOMATIS (Materi Pertemuan 4) ---
        // =========================================================
        int diskon = 0;

        // Cek pakai if-else if untuk diskon bertingkat
        if (totalHarga > 60000) {
            diskon = 10000; // Potongan 10rb
            System.out.println("\n=========================================================================");
            System.out.println("          --[PROMO] Wah! Anda mendapat diskon Rp 10.000 --              ");
            System.out.println("=========================================================================");
        } else if (totalHarga > 30000) {
            diskon = 5000;  // Potongan 5rb
            System.out.println("=========================================================================");
            System.out.println("          --[PROMO] Lumayan! Anda mendapat diskon Rp 5.000 --           ");
            System.out.println("=========================================================================");
        }

        // Hitung total akhir setelah dipotong diskon
        int totalAkhir = totalHarga - diskon;

        // =========================================================
        // --- FITUR BARU 2: BAYAR & KEMBALIAN (Materi Pertemuan 5) ---
        // =========================================================
        int uangBayar = 0;

        System.out.println("\n\n-----------------------------------------");
        System.out.println("Total yang harus dibayar: Rp " + totalAkhir);

        // Pakai Do-While: Pasti nanya minimal 1 kali, kalau uang kurang bakal diulang terus
        do {
            System.out.print("Masukkan Uang Tunai Pelanggan: Rp ");
            uangBayar = input.nextInt();
            System.out.println("-----------------------------------------\n\n");
            

            if (uangBayar < totalAkhir) {

                System.out.println("-------------------------------------------------------");
                System.out.println(" >> Maaf, uang tidak cukup! Total tagihan: Rp " + totalAkhir + " <<\n");
            }
        } while (uangBayar < totalAkhir);

        // Hitung kembalian
        int kembalian = uangBayar - totalAkhir;

        // --- BAGIAN 5: CETAK STRUK (UPDATE MULTI-ORDER) ---
        System.out.println("========================================");
        System.out.println("            Nasi Goreng Gabel 2         ");
        System.out.println("             STRUK PEMBAYARAN           ");
        System.out.println("========================================");
        System.out.println("Kasir     : " + kasirAktif);
        System.out.println("Pelanggan : " + namaPelanggan);
        System.out.println("----------------------------------------");
        System.out.println("Daftar Pesanan:");
        System.out.print(rincianPesanan); // Nyetak semua list makanan yang dikumpul pakai +=
        System.out.println("----------------------------------------");
        System.out.println("Subtotal   : Rp " + totalHarga);
        System.out.println("Diskon     : Rp " + diskon);
        System.out.println("TOTAL BAYAR: Rp " + totalAkhir);
        System.out.println("----------------------------------------");
        System.out.println("Tunai      : Rp " + uangBayar);
        System.out.println("Kembalian  : Rp " + kembalian);
        System.out.println("========================================");
        System.out.println("    Terima Kasih Atas Kunjungan Anda    ");
        System.out.println("        Jl. Margasari, Margasari        ");
        System.out.println("      Kec. Karawang Timur, Karawang      ");
        
    }
}
