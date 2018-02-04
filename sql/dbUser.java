/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sql;

import data.dtUser;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import tm.tmUser;

/**
 *
 * @author sad
 */
public class dbUser {
 tmUser tms = new tmUser();

  public boolean insert(dtUser du)
  {
    boolean cek = true;
    try {
      String query = "insert into user values ('" + du.getUserName() + "','" + du.getPassword() + "'," + du.getAkses() + ");";

      koneksiAcces.stat.executeUpdate(query);
    }
    catch (Exception z) {
      JOptionPane.showMessageDialog(null, "Pengisian Data User Gagal ??? \n" + z.getMessage());
      cek = false;
    }
    return cek;
  }

  public boolean delete(String id) {
    boolean cek = true;
    try {
      String query = "delete from user where username='" + id + "'";
      koneksiAcces.stat.executeUpdate(query);
    }
    catch (Exception z) {
      JOptionPane.showMessageDialog(null, "Penghapusan Data User Gagal??? \n" + z.getMessage());
      cek = false;
    }
    return cek;
  }

  public boolean edit(dtUser da, String id) {
    boolean cek = true;
    String query = "";
    query = "update user set username='" + da.getUserName() + "'," + "password='" + da.getPassword() + "'," + "akses=" + da.getAkses() + " " + "where username='" + id + "';";
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

  public void reload()
  {
    try {
      ResultSet set = koneksiAcces.stat.executeQuery("select * from user");
      while (set.next()) {
        dtUser da = new dtUser();
        da.setUserName(set.getString("username"));
        da.setPassword(set.getString("password"));
        da.setAkses(set.getInt("akses"));

        this.tms.insert(da);
      }
      set.close();
    }
    catch (Exception z) {
      System.out.print(z.getMessage());
    }
  }
}
