/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package apotik;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import sql.dbDistributor;
import sql.dbJenisObat;
import sql.dbObat;
import sql.dbPelanggan;
import sql.dbPembelian;
import sql.dbPenjualan;
import sql.dbProduk;
import sql.dbSatuan;
import sql.dbUser;
import sql.dbkatagori;
import sql.koneksiAcces;

/**
 *
 * @author SAD
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    dbPelanggan dbPelanggan=new dbPelanggan();
    dbJenisObat dbJenisObat=new dbJenisObat();
    dbDistributor dbDistributor=new dbDistributor();
    dbkatagori dbkatagori=new dbkatagori();
    dbProduk dbProduk=new dbProduk();
    dbSatuan dbSatuan=new dbSatuan();
    dbObat dbObat=new dbObat();
    dbPenjualan dbPenjualan=new dbPenjualan();
    dbPembelian dbPembelian=new dbPembelian();
    dbUser dbUser = new dbUser();
    public static int akses;

    private void reload(){
        dbPelanggan.reload();
        dbJenisObat.reload();
        dbDistributor.reload();
        dbkatagori.reload();
        dbProduk.reload();
        dbSatuan.reload();
        dbObat.reload();
        dbPenjualan.reload();
        dbPembelian.reload();
        dbUser.reload();
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        Main mm=new Main();
        koneksiAcces.koneksi();
        mm.reload();

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new logIn().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
