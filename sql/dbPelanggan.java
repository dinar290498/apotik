/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sql;

import data.dtPelanggan;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import tm.tmPelanggan;

/**
 *
 * @author Administrator
 */
public class dbPelanggan {

    public boolean insert(dtPelanggan da){
        boolean cek=true;
        try{
            String query="insert into pelanggan values "+
                         "('"+da.getKodePelanggan()+"','"+da.getNamaPelanggan()+"',"+
                         "'"+da.getAlamat()+"','"+da.getTelp1()+"',"+
                         "'"+da.getTelp2()+"','"+da.getIdIdentitas()+"',"+
                         "'"+da.getNoIdentitas()+"',"+da.getSaldoPiutang()+")";
            koneksiAcces.stat.executeUpdate(query);
        }
        catch(Exception z){
            JOptionPane.showMessageDialog(null,"Pengisian Data Gagal ??? \n"+ z.getMessage());
            cek=false;
        }
        return cek;
    }

    public boolean edit(dtPelanggan da,String id){
        boolean cek=true;
        try{
            String query="update pelanggan set "+
                         "kodePelanggan='"+da.getKodePelanggan()+"',"+
                         "namaPelanggan='"+da.getNamaPelanggan()+"', "+
                         "alamat='"+da.getAlamat()+"',"+
                         "telp1='"+da.getTelp1()+"', "+
                         "telp2='"+da.getTelp2()+"',"+
                         "idIdentitas='"+da.getIdIdentitas()+"',"+
                         "noIdentitas='"+da.getNoIdentitas()+"',"+
                         "saldoPiutang="+da.getSaldoPiutang()+" "+
                         "where kodePelanggan='"+id+"';";
            koneksiAcces.stat.executeUpdate(query);
        }
        catch(Exception x){
            JOptionPane.showMessageDialog(null, x.getMessage());
            cek=false;
        }
        return cek;
    }

    public boolean delete(String id){
        boolean cek=true;
        try{
            String query="delete from pelanggan where kodePelanggan='"+id+"'";
            koneksiAcces.stat.executeUpdate(query);
        }
        catch(Exception z){
            JOptionPane.showMessageDialog(null, z.getMessage());
            cek=false;
        }
        return cek;
    }

    tmPelanggan tmp=new tmPelanggan();
    public void reload(){
        try{
            ResultSet set=koneksiAcces.stat.executeQuery("select * from pelanggan");
            while(set.next()){
                dtPelanggan da=new dtPelanggan();
                da.setKodePelanggan(set.getString("kodePelanggan"));
                da.setNamaPelanggan(set.getString("namaPelanggan"));
                da.setAlamat(set.getString("alamat"));
                da.setTelp1(set.getString("telp1"));
                da.setTelp2(set.getString("telp2"));
                da.setIdIdentitas(set.getString("idIdentitas"));
                da.setNoIdentitas(set.getString("noIdentitas"));
                da.setSaldoPiutang(set.getInt("saldoPiutang"));

               tmp.insert(da);
            }
            set.close();
        }
         catch(Exception z){
            System.out.print(z.getMessage());
         }
    }

}
