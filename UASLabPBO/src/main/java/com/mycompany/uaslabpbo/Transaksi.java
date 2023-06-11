/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uaslabpbo;

/**
 *
 * @author ASPIRE 5
 */
import java.util.ArrayList;
import java.util.List;

public class Transaksi {
    private List<Barang> daftarBarang = new ArrayList<>();
    private List<Integer> jumlahBarang = new ArrayList<>();

    public void tambahkanBarang(Barang barang, int jumlah) {
        daftarBarang.add(barang);
        jumlahBarang.add(jumlah);
    }

    public void tampilkanInvoice() {
        System.out.println("==== Toko Manroe ====");
        for (int i = 0; i < daftarBarang.size(); i++) {
            Barang barang = daftarBarang.get(i);
            int jumlah = jumlahBarang.get(i);
            double subtotal = barang.getHarga() * jumlah;
            System.out.println(barang.getNama() + " (x" + jumlah + "): " + subtotal);
        }
        System.out.println("=================");
    }

    public double hitungTotalHarga() {
        double total = 0;
        for (int i = 0; i < daftarBarang.size(); i++) {
            Barang barang = daftarBarang.get(i);
            int jumlah = jumlahBarang.get(i);
            double subtotal = barang.getHarga() * jumlah;
            total += subtotal;
        }
        return total;
    }

    public double hitungKembalian(double jumlahPembayaran) {
        double totalHarga = hitungTotalHarga();
        return jumlahPembayaran - totalHarga;
    }
}
