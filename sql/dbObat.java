/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sql;

import data.dtObat;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import tm.tmTableObat;

/**
 *
 * @author Administrator
 */
public class dbObat {

    SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
    public boolean insert(dtObat da){
        boolean cek=true;
        String query="";

            if(da.getKadaluarsa()==null) {
                query="insert into obat"
                        + " (kodeObat,namaObat,stok,hBeli,hUmum,hPelanggan,hResep,satuan,jenisObat,katagori,produk,distributor)"
                        + " values "+
                         "('"+da.getKodeObat()+"','"+da.getNamaObat()+"',"+
                         ""+da.getStok()+","+da.gethBeli()+","+
                         ""+da.gethUmum()+","+da.gethPelanggan()+","+
                         ""+da.gethResep()+",'"+da.getSatuan()+"',"+
                         "'"+da.getJenisObat()+"','"+da.getKatagori()+"',"+
                         "'"+da.getProduk()+"','"+da.getDistributor()+"');";
            }
            else{
                query="insert into obat  values "+
                         "('"+da.getKodeObat()+"','"+da.getNamaObat()+"',"+
                         ""+da.getStok()+","+da.gethBeli()+","+
                         ""+da.gethUmum()+","+da.gethPelanggan()+","+
                         ""+da.gethResep()+",'"+da.getSatuan()+"',"+
                         "'"+da.getJenisObat()+"','"+da.getKatagori()+"',"+
                         "'"+da.getProduk()+"','"+da.getDistributor()+"',"+
                         "#"+sdf.format(da.getKadaluarsa())+"#)";
            }
        try{
            koneksiAcces.stat.executeUpdate(query);
        }
        catch(Exception z){
            JOptionPane.showMessageDialog(null,"Pengisian Data Gagal ??? \n"+ z.getMessage());
            cek=false;
        }
        return cek;
    }

    public boolean edit(dtObat da,String id){
        boolean cek=true;
        String query="";
        if(da.getKadaluarsa()==null) {
            query="update obat set "+
                         "kodeObat='"+da.getKodeObat()+"',"+
                         "namaObat='"+da.getNamaObat()+"',"+
                         "stok="+da.getStok()+","+
                         "hBeli="+da.gethBeli()+","+
                         "hUmum="+da.gethUmum()+","+
                         "hPelanggan="+da.gethPelanggan()+","+
                         "hResep="+da.gethResep()+","+
                         "satuan='"+da.getSatuan()+"',"+
                         "jenisObat='"+da.getJenisObat()+"',"+
                         "katagori='"+da.getKatagori()+"',"+
                         "produk='"+da.getProduk()+"',"+
                         "distributor='"+da.getDistributor()+"' "+
                         "where kodeObat='"+id+"';";
        }
         else
            query="update obat set "+
                         "kodeObat='"+da.getKodeObat()+"',"+
                         "namaObat='"+da.getNamaObat()+"',"+
                         "stok="+da.getStok()+","+
                         "hBeli="+da.gethBeli()+","+
                         "hUmum="+da.gethUmum()+","+
                         "hPelanggan="+da.gethPelanggan()+","+
                         "hResep="+da.gethResep()+","+
                         "satuan='"+da.getSatuan()+"',"+
                         "jenisObat='"+da.getJenisObat()+"',"+
                         "katagori='"+da.getKatagori()+"',"+
                         "produk='"+da.getProduk()+"',"+
                         "distributor='"+da.getDistributor()+"', "+
                         "kadaluarsa=#"+sdf.format(da.getKadaluarsa())+"# "+
                         "where kodeObat='"+id+"';";

        try{
            koneksiAcces.stat.executeUpdate(query);
        }
        catch(Exception x){
            JOptionPane.showMessageDialog(null,"ERROR"+ x.getMessage());
            cek=false;
        }
        return cek;
    }

    public boolean delete(String id){
        boolean cek=true;
        try{
            String query="delete from obat where kodeObat='"+id+"'";
            koneksiAcces.stat.executeUpdate(query);
        }
        catch(Exception z){
            JOptionPane.showMessageDialog(null, z.getMessage());
            cek=false;
        }
        return cek;
    }

    tmTableObat tmp=new tmTableObat();
    public void reload(){
        Date tgl;
        try{
            ResultSet set=koneksiAcces.stat.executeQuery("select * from obat");
            while(set.next()){
                dtObat da=new dtObat();
                da.setKodeObat(set.getString("kodeObat"));
                da.setNamaObat(set.getString("namaObat"));
                da.setStok(set.getInt("stok"));
                da.sethBeli(set.getFloat("hBeli"));
                da.sethUmum(set.getFloat("hUmum"));
                da.sethPelanggan(set.getFloat("hPelanggan"));
                da.sethResep(set.getFloat("hResep"));
                da.setSatuan(set.getString("satuan"));
                da.setJenisObat(set.getString("jenisObat"));
                da.setKatagori(set.getString("katagori"));
                da.setProduk(set.getString("produk"));
                da.setDistributor(set.getString("distributor"));
                tgl=set.getDate("kadaluarsa");
                if(tgl!=null)
                    da.setKadaluarsa(tgl);
                else 
                    da.setKadaluarsa(null);

               tmp.insert(da);
            }
            set.close();
        }
         catch(Exception z){
            System.out.print(z.getMessage());
         }
    }

  public boolean editObat2(String id, int n) {
    boolean cek = true;
    String query = "";
    query = "update obat set stok=stok-" + n + " " + "where kodeObat='" + id + "';";
    try
    {
      koneksiAcces.stat.executeUpdate(query);
    }
    catch (Exception x) {
      JOptionPane.showMessageDialog(null, "ERROR" + x.getMessage());
      cek = false;
    }
    return cek;
  }

  public boolean editObat3(String id, int n) {
    boolean cek = true;
    String query = "";
    query = "update obat set stok=stok+" + n + " " + "where kodeObat='" + id + "';";
    try
    {
      koneksiAcces.stat.executeUpdate(query);
    }
    catch (Exception x) {
      JOptionPane.showMessageDialog(null, "ERROR" + x.getMessage());
      cek = false;
    }
    return cek;
  }

}
