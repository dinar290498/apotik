/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sql;

import data.dtDistributor;
import data.dtKatagori;
import data.dtProduk;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import tm.tmKatagori;
import tm.tmPelanggan;
import tm.tmProduk;

/**
 *
 * @author Administrator
 */
public class dbProduk {

    public boolean insert(dtProduk da){
        boolean cek=true;
        try{
            String query="insert into produk values "+
                         "('"+da.getNamaProduk()+"')";
            koneksiAcces.stat.executeUpdate(query);
        }
        catch(Exception z){
            JOptionPane.showMessageDialog(null,"Pengisian Data Gagal ??? \n"+ z.getMessage());
            cek=false;
        }
        return cek;
    }


    public boolean delete(String id){
        boolean cek=true;
        try{
            String query="delete from produk where namaProduk='"+id+"'";
            koneksiAcces.stat.executeUpdate(query);
        }
        catch(Exception z){
            JOptionPane.showMessageDialog(null, z.getMessage());
            cek=false;
        }
        return cek;
    }

    tmProduk tms=new tmProduk();
    public void reload(){
        try{
            ResultSet set=koneksiAcces.stat.executeQuery("select * from produk");
            while(set.next()){
                dtProduk da=new dtProduk();
                da.setNamaProduk(set.getString("namaProduk"));

               tms.insert(da);
            }
            set.close();
        }
         catch(Exception z){
            System.out.print(z.getMessage());
         }
    }

}
