/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sql;

import data.dtSatuan;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import tm.tmSatuan;

/**
 *
 * @author Administrator
 */
public class dbSatuan {

    public boolean insert(dtSatuan da){
        boolean cek=true;
        try{
            String query="insert into satuanObat values "+
                         "('"+da.getNamaSatuan()+"')";
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
            String query="delete from satuanObat where namaSatuan='"+id+"'";
            koneksiAcces.stat.executeUpdate(query);
        }
        catch(Exception z){
            JOptionPane.showMessageDialog(null, z.getMessage());
            cek=false;
        }
        return cek;
    }

    tmSatuan tms=new tmSatuan();
    public void reload(){
        try{
            ResultSet set=koneksiAcces.stat.executeQuery("select * from satuanObat");
            while(set.next()){
                dtSatuan da=new dtSatuan();
                da.setNamaSatuan(set.getString("namaSatuan"));

               tms.insert(da);
            }
            set.close();
        }
         catch(Exception z){
            System.out.print(z.getMessage());
         }
    }

}
