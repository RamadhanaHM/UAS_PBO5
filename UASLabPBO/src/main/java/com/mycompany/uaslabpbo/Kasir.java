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

public class Kasir {
    private List<Barang> daftarBarang = new ArrayList<>();

    public void tambahkanBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    public List<Barang> getDaftarBarang() {
        return daftarBarang;
    }

    public void tampilkanDaftarBarang() {
        System.out.println("==== Daftar Barang ====");
        for (int i = 0; i < daftarBarang.size(); i++) {
            Barang barang = daftarBarang.get(i);
            System.out.println((i + 1) + ". " + barang.getNama() + " - Rp" + barang.getHarga());
        }
        System.out.println("=======================");
    }
}
