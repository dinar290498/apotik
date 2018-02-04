/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sql;

import data.dtJenisObat;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import tm.tmJenisObat;

/**
 *
 * @author Administrator
 */
public class dbJenisObat {

    public boolean insert(dtJenisObat da){
        boolean cek=true;
        try{
            String query="insert into jenisObat values "+
                         "('"+da.getNamaJenisObat()+"')";
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
            String query="delete from jenisObat where namaJenisObat='"+id+"'";
            koneksiAcces.stat.executeUpdate(query);
        }
        catch(Exception z){
            JOptionPane.showMessageDialog(null, z.getMessage());
            cek=false;
        }
        return cek;
    }

    tmJenisObat tms=new tmJenisObat();
    public void reload(){
        try{
            ResultSet set=koneksiAcces.stat.executeQuery("select * from jenisObat");
            while(set.next()){
                dtJenisObat da=new dtJenisObat();
                da.setNamaJenisObat(set.getString("namaJenisObat"));

               tms.insert(da);
            }
            set.close();
        }
         catch(Exception z){
            System.out.print(z.getMessage());
         }
    }

}
