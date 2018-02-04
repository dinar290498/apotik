 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sql;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import tm.tmDistributor;

/**
 *
 * @author Administrator
 */
public class dbBackground {



    public boolean edit(int id){
        boolean cek=true;
        try{
            String query="update background set "+
                         "ID="+id+";";
            koneksiAcces.stat.executeUpdate(query);
        }
        catch(Exception x){
            JOptionPane.showMessageDialog(null, x.getMessage());
            cek=false;
        }
        return cek;
    }

    tmDistributor tms=new tmDistributor();
    
    public int reload(){
        int n=0;
        try{
            ResultSet set=koneksiAcces.stat.executeQuery("select * from background");
            while(set.next()){
                n=set.getInt("ID");

            }
            set.close();
        }
         catch(Exception z){
            System.out.print(z.getMessage());
         }
        return n;
    }

}
