/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sql;

import data.dtPenjualan;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import tm.tmPembelian;
import tm.tmPenjualan;

/**
 *
 * @author sad
 */
public class dbPembelian {
 SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy H:m:s");
  tmPembelian tmPembelian=new tmPembelian();

  tmPenjualan tmp = new tmPenjualan();

  public boolean insert(dtPenjualan da)
  {
    boolean cek = true;
    String query = "";
    query = "insert into pembelian values ('" + da.getNoNota()+ "','" + da.getNmKonsumen() + "'," + "" + da.getTotal() + "," + da.getDiskon() + "," + "" + da.getGrandTotal() + ",'" + da.getKet() + "'," + "#" + this.sdf.format(da.getTglTransaksi()) + "#," + "#" + this.sdf.format(da.getTglBayar()) + "#);";
    try
    {
      koneksiAcces.stat.executeUpdate(query);
    }
    catch (Exception z) {
      JOptionPane.showMessageDialog(null, "Transaksi Pembelian Gagal ??? \n" + z.getMessage());
      cek = false;
    }
    return cek;
  }

  public boolean delete(String id) {
    boolean cek = true;
    try {
      String query = "delete from pembelian where noNota='" + id + "'";
      koneksiAcces.stat.executeUpdate(query);
    }
    catch (Exception z) {
      JOptionPane.showMessageDialog(null, z.getMessage());
      cek = false;
    }
    return cek;
  }

  public void reload()
  {
    try
    {
      ResultSet set = koneksiAcces.stat.executeQuery("select * from pembelian order by tglTransaksi asc");
      while (set.next()) {
        dtPenjualan da = new dtPenjualan();
        da.setNoNota(set.getString("noNota"));
        da.setNmKonsumen(set.getString("namaDistributor"));
        da.setTotal(set.getFloat("total"));
        da.setDiskon(set.getInt("disc"));
        da.setGrandTotal(set.getInt("grandTotal"));
        da.setKet(set.getInt("keterangan"));
        Date tgl = set.getDate("tglTransaksi");
        if (tgl != null)
          da.setTglTransaksi(tgl);
        else {
          da.setTglTransaksi(null);
        }

        tgl = set.getDate("tglBayar");
        if (tgl != null)
          da.setTglBayar(tgl);
        else {
          da.setTglBayar(null);
        }
        this.tmPembelian.insert(da);
      }
      set.close();
    }
    catch (Exception z) {
      System.out.print(z.getMessage());
    }
  }

  public boolean statusPembelian(String id,int n) {
    boolean cek = true;
    try {
      String query = "update pembelian set keterangan=" + n + " " + "where noNota='" + id + "';";
      koneksiAcces.stat.executeUpdate(query);
    }
    catch (Exception z) {
      JOptionPane.showMessageDialog(null, z.getMessage());
      cek = false;
    }
    return cek;
  }



}
