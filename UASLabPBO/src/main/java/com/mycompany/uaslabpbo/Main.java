/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uaslabpbo;

/**
 *
 * @author ASPIRE 5
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       System.out.println("Selamat datang di Toko Manroe");
        System.out.println("*****************************");
        Kasir kasir = new Kasir();

        Barang barang1 = new Barang("Buku Tulis", 5000, 10);
        Barang barang2 = new Barang("Pensil", 1000, 20);
        Barang barang3 = new Barang("Penghapus", 2000, 15);
        Barang barang4 = new Barang("Pulpen", 3000, 8);
        Barang barang5 = new Barang("Penggaris", 4000, 12);
        Barang barang6 = new Barang("Spidol", 2000, 10);
        Barang barang7 = new Barang("Stabilo", 5000, 5);
        Barang barang8 = new Barang("Lem", 6000, 6);
        Barang barang9 = new Barang("Kertas HVS", 10000, 10);
        Barang barang10 = new Barang("Buku Gambar", 4000, 15);

        kasir.tambahkanBarang(barang1);
        kasir.tambahkanBarang(barang2);
        kasir.tambahkanBarang(barang3);
        kasir.tambahkanBarang(barang4);
        kasir.tambahkanBarang(barang5);
        kasir.tambahkanBarang(barang6);
        kasir.tambahkanBarang(barang7);
        kasir.tambahkanBarang(barang8);
        kasir.tambahkanBarang(barang9);
        kasir.tambahkanBarang(barang10);

        kasir.tampilkanDaftarBarang();
        Transaksi transaksi = new Transaksi();
        int pilihan = -1;
        while (pilihan != 0) {
            System.out.print("Masukkan nomor barang yang ingin dibeli (Klik 0 jika suda selesai memilih): ");
            Scanner scanner = new Scanner(System.in);
            pilihan = scanner.nextInt();
            if (pilihan > 0 && pilihan <= kasir.getDaftarBarang().size()) {
                Barang barang = kasir.getDaftarBarang().get(pilihan - 1);
                System.out.print("Masukkan jumlah barang yang ingin dibeli: ");
                int jumlah = scanner.nextInt();
                transaksi.tambahkanBarang(barang, jumlah);
            } else if (pilihan != 0) {
                System.out.println("Nomor barang tidak valid!");
            }
        }

        transaksi.tampilkanInvoice();

        double totalHarga = transaksi.hitungTotalHarga();
        System.out.println("Total Harga: " + totalHarga);

        System.out.print("Masukkan jumlah pembayaran: ");
        Scanner scanner = new Scanner(System.in);
        double jumlahPembayaran = scanner.nextDouble();
        double kembalian = transaksi.hitungKembalian(jumlahPembayaran);
        System.out.println("Kembalian: " + kembalian);
        
        System.out.println("Terimakasih!!!");
        scanner.close();
    }
}
