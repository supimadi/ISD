package com.company;

public class Goods implements Comparable<Goods> {
    private String kodeBarang;
    private String jenisBarang;
    private String namaBarang;
    private Integer stockBarang;

    public Goods(String kodeBarang, String jenisBarang, String namaBarang, Integer stockBarang) {
        this.kodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        this.stockBarang = stockBarang;
    }

    public String getKodeBarang() { return this.kodeBarang; }
    public String getJenisBarang() { return this.jenisBarang; }
    public String getNamaBarang() { return this.namaBarang; }
    public Integer getStockBarang() { return this.stockBarang; }

    public void setKodeBarang(String kodeBarang) { this.kodeBarang = kodeBarang; }
    public void setNamaBarang(String namaBarang) { this.namaBarang = namaBarang; }
    public void setJenisBarang(String jenisBarang) { this.jenisBarang = jenisBarang; }
    public void setStockBarang(Integer stockBarang) { this.stockBarang = stockBarang; }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Goods) {
            Goods other = (Goods) o;
            return this.kodeBarang.equals(other.kodeBarang);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.kodeBarang.hashCode();
    }

    @Override
    public String toString() {
        return "Kode Barang: " + kodeBarang +
                ", Jenis Barang: " + jenisBarang +
                ", Nama Barang: " + namaBarang +
                ", Stock Barang: " + stockBarang;
    }

    @Override
    public int compareTo(Goods o) {
        return this.getKodeBarang().compareTo(o.getKodeBarang());
    }
}