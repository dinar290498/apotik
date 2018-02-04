/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package data;

/**
 *
 * @author SAD
 */
public class dtPelanggan {
    private String kodePelanggan;
    private String namaPelanggan;
    private String alamat;
    private String telp1;
    private String telp2;
    private String idIdentitas;
    private String noIdentitas;
    private int saldoPiutang;

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getIdIdentitas() {
        return idIdentitas;
    }

    public void setIdIdentitas(String idIdentitas) {
        this.idIdentitas = idIdentitas;
    }

    public String getKodePelanggan() {
        return kodePelanggan;
    }

    public void setKodePelanggan(String kodePelanggan) {
        this.kodePelanggan = kodePelanggan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getNoIdentitas() {
        return noIdentitas;
    }

    public void setNoIdentitas(String noIdentitas) {
        this.noIdentitas = noIdentitas;
    }

    public int getSaldoPiutang() {
        return saldoPiutang;
    }

    public void setSaldoPiutang(int saldoPiutang) {
        this.saldoPiutang = saldoPiutang;
    }



    public String getTelp1() {
        return telp1;
    }

    public void setTelp1(String telp1) {
        this.telp1 = telp1;
    }

    public String getTelp2() {
        return telp2;
    }

    public void setTelp2(String telp2) {
        this.telp2 = telp2;
    }


}
