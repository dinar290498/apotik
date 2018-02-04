/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package data;

import java.util.Date;

/**
 *
 * @author SAD
 */
public class dtObat {
    private String kodeObat;
    private String namaObat;
    private int stok;

    private double  hBeli;
    private double  hUmum;
    private double hPelanggan;
    private double hResep;
    private String satuan;
    private String jenisObat;
    private String katagori;
    private String produk;
    private String distributor;
    private Date kadaluarsa;

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public double gethBeli() {
        return hBeli;
    }

    public void sethBeli(double hBeli) {
        this.hBeli = hBeli;
    }

    public double gethPelanggan() {
        return hPelanggan;
    }

    public void sethPelanggan(double hPelanggan) {
        this.hPelanggan = hPelanggan;
    }

    public double gethResep() {
        return hResep;
    }

    public void sethResep(double hResep) {
        this.hResep = hResep;
    }

    public double gethUmum() {
        return hUmum;
    }

    public void sethUmum(double hUmum) {
        this.hUmum = hUmum;
    }

    public String getJenisObat() {
        return jenisObat;
    }

    public void setJenisObat(String jenisObat) {
        this.jenisObat = jenisObat;
    }

    public Date getKadaluarsa() {
        return kadaluarsa;
    }

    public void setKadaluarsa(Date kadaluarsa) {
        this.kadaluarsa = kadaluarsa;
    }

    public String getKatagori() {
        return katagori;
    }

    public void setKatagori(String katagori) {
        this.katagori = katagori;
    }

    public String getKodeObat() {
        return kodeObat;
    }

    public void setKodeObat(String kodeObat) {
        this.kodeObat = kodeObat;
    }

    public String getNamaObat() {
        return namaObat;
    }

    public void setNamaObat(String namaObat) {
        this.namaObat = namaObat;
    }

    public String getProduk() {
        return produk;
    }

    public void setProduk(String produk) {
        this.produk = produk;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }


}
