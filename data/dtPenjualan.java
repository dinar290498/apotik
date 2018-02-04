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
public class dtPenjualan {
    private String noNota;
    private Date tglTransaksi;
    private String idKonsumen; // distributor
    private String nmKonsumen;
    private float total;
    private int diskon;
    private float grandTotal;
    private int ket; //1 lunas 2 ngutang 3 ngutang lunas
    private Date tglBayar;

    public String getNmKonsumen() {
        return nmKonsumen;
    }

    public void setNmKonsumen(String nmKonsumen) {
        this.nmKonsumen = nmKonsumen;
    }

    public Date getTglBayar() {
        return tglBayar;
    }

    public void setTglBayar(Date tglBayar) {
        this.tglBayar = tglBayar;
    }

    

    public int getDiskon() {
        return diskon;
    }

    public void setDiskon(int diskon) {
        this.diskon = diskon;
    }


    public float getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(float grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getIdKonsumen() {
        return idKonsumen;
    }

    public void setIdKonsumen(String idKonsumen) {
        this.idKonsumen = idKonsumen;
    }

    public int getKet() {
        return ket;
    }

    public void setKet(int ket) {
        this.ket = ket;
    }



    public String getNoNota() {
        return noNota;
    }

    public void setNoNota(String noNota) {
        this.noNota = noNota;
    }

    public Date getTglTransaksi() {
        return tglTransaksi;
    }

    public void setTglTransaksi(Date tglTransaksi) {
        this.tglTransaksi = tglTransaksi;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }



    

}
