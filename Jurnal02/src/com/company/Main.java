package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int CAP = 3;
        GenArrayList<ATK> atkList = new GenArrayList<>(CAP);
        GenArrayList<Bag> bagList = new GenArrayList<>(CAP);

//        for (int i = 0; i < CAP - 1; i++) {
//            System.out.print("Masukan Kode Barang: "); String kodeBarang = sc.nextLine();
//            System.out.print("Masukan Jenis Barang: "); String jenisBarang = sc.nextLine();
//            System.out.print("Masukan Nama Barang: "); String namaBarang = sc.nextLine();
//            System.out.print("Masukan Stock Barang: "); Integer stockBarang = sc.nextInt();
//            sc.nextLine(); // Capture enter
//            System.out.println();
//
//            atkList.add(new ATK(kodeBarang, jenisBarang, namaBarang, stockBarang));
//        }

        atkList.add(new ATK("A001", "Pensil", "Faber Castel", 30));
        atkList.add(new ATK("A002", "Spidol", "Spidol Whiteman", 30));
        atkList.add(new ATK("B001", "Buku Gambar", "Buku Gambar Faber", 30));
        atkList.edit(
                new ATK("A002", "Spidol", "Spidol Whiteman", 30),
                new ATK("A002", "Spidol", "Spidol Whiteman", 20)
        );
        atkList.sortedPrint();

        bagList.add(new Bag("C002", "Kotak Pensil", "Kotak Pensil Doraemon", 10));
        bagList.add(new Bag("C003", "Totebag", "Tote Bag Kain", 30));
        bagList.add(new Bag("C001", "Kotak Pensil", "Kotak Pensil Suneo", 100));
        bagList.edit(
                new Bag("C001", "Kotak Pensil", "Kotak Pensil Suneo", 100),
                new Bag("C001", "Kotak Pensil", "Kotak Pensil Suneo", 5)
        );
        bagList.sortedPrint();
    }
}
