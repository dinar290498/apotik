/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sql;

import data.dtDistributor;
import data.dtKatagori;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import tm.tmDistributor;
import tm.tmKatagori;

/**
 *
 * @author Administrator
 */
public class dbDistributor {

    public boolean insert(dtDistributor da){
        boolean cek=true;
        try{
            String query="insert into distributor values "+
                         "('"+da.getNamaDistributor()+"')";
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
            String query="delete from distributor where namaDistributor='"+id+"'";
            koneksiAcces.stat.executeUpdate(query);
        }
        catch(Exception z){
            JOptionPane.showMessageDialog(null, z.getMessage());
            cek=false;
        }
        return cek;
    }

    tmDistributor tms=new tmDistributor();
    public void reload(){
        try{
            ResultSet set=koneksiAcces.stat.executeQuery("select * from distributor");
            while(set.next()){
                dtDistributor da=new dtDistributor();
                da.setNamaDistributor(set.getString("namaDistributor"));

               tms.insert(da);
            }
            set.close();
        }
         catch(Exception z){
            System.out.print(z.getMessage());
         }
    }

}
