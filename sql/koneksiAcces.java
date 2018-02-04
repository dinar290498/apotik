/*
 * membuat koneksi ODBC secara RunTime
 */

package sql;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class koneksiAcces {
    public static Connection kon;
    public static Statement stat;
    static String lokasiDb;
    static String lokasKoneksi;

    public static void koneksi(){
        lokasiDb=System.getProperty("user.dir") + File.separator + "apotik.accdb";
        lokasKoneksi="jdbc:odbc:Driver={Microsoft Access Driver " + "(*.mdb, *.accdb)};DBQ="+lokasiDb;
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            kon = DriverManager.getConnection(lokasKoneksi, "bismilah", "bismilah");
            stat=kon.createStatement();
        }
        catch(Exception z){
            System.out.println(z);
        }
    }

}
