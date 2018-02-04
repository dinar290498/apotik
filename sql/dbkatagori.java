/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sql;

import data.dtKatagori;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import tm.tmKatagori;

/**
 *
 * @author Administrator
 */
public class dbkatagori {

    public boolean insert(dtKatagori da){
        boolean cek=true;
        try{
            String query="insert into katagori values "+
                         "('"+da.getNamaKatagori()+"')";
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
            String query="delete from katagori where namaKatagori='"+id+"'";
            koneksiAcces.stat.executeUpdate(query);
        }
        catch(Exception z){
            JOptionPane.showMessageDialog(null, z.getMessage());
            cek=false;
        }
        return cek;
    }

    tmKatagori tms=new tmKatagori();
    public void reload(){
        try{
            ResultSet set=koneksiAcces.stat.executeQuery("select * from katagori");
            while(set.next()){
                dtKatagori da=new dtKatagori();
                da.setNamaKatagori(set.getString("namaKatagori"));

               tms.insert(da);
            }
            set.close();
        }
         catch(Exception z){
            System.out.print(z.getMessage());
         }
    }

}
