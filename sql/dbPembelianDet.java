/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sql;

import data.dtPenjualanDet;
import javax.swing.JOptionPane;

/**
 *
 * @author sad
 */
public class dbPembelianDet {
  public boolean insert(dtPenjualanDet da)
  {
    boolean cek = true;
    String query = "";
    query = "insert into pembelianDet values ('" + da.getNoNota() + "','" + da.getKodeObat() + "'," + "" + da.getHarga() + "," + da.getBny() + "," + "" + da.getSubTotal() + ",'" + da.getDisc() + "'," + "" + da.getTotal() + ");";
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
}
