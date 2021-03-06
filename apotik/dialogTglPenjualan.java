/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * dialogTglPenjualan.java
 *
 * Created on May 21, 2011, 11:46:20 PM
 */

package apotik;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import sql.dbBackground;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import sql.koneksiAcces;

/**
 *
 * @author sad
 */
public class dialogTglPenjualan extends javax.swing.JDialog {

    /** Creates new form dialogTglPenjualan */
    public dialogTglPenjualan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    Dimension dim = getToolkit().getScreenSize();
    Rectangle abounds = getBounds();
    setLocation((dim.width - abounds.width) / 2, (dim.height - abounds.height) / 2);

    jDateChooser1.setDate(new Date());

    this.jDateChooser1.setDate(new Date());
    Calendar c1 = Calendar.getInstance();
    c1.add(7, 1);

    this.jDateChooser2.setDate(c1.getTime());
    setBackground();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background1 = new tampilan.background();
        jLabel1 = new javax.swing.JLabel();
        panelRuncing1 = new tampilan.panelRuncing();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LAPORAN PENJUALAN");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tanggal Awal Penjualan :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tanggal Akhir Penjualan :");

        jDateChooser1.setDateFormatString("d/MM/yyyy");

        jDateChooser2.setDateFormatString("d/MM/yyyy");

        jButton1.setText("Lihat Laporan");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRuncing1Layout = new javax.swing.GroupLayout(panelRuncing1);
        panelRuncing1.setLayout(panelRuncing1Layout);
        panelRuncing1Layout.setHorizontalGroup(
            panelRuncing1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRuncing1Layout.createSequentialGroup()
                .addGroup(panelRuncing1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRuncing1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRuncing1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelRuncing1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelRuncing1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        panelRuncing1Layout.setVerticalGroup(
            panelRuncing1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRuncing1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRuncing1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRuncing1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel4.setText("* Tanggal Akhir harus lebih dari Tanggal Awal ");

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRuncing1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRuncing1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        getContentPane().add(background1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    setVisible(false);
    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
    try {
      InputStream repot1 = getClass().getResourceAsStream("/report/penjualan.jrxml");

      JasperReport jr = JasperCompileManager.compileReport(repot1);

      Map param = new HashMap();
      param.put("date1", sdf.format(this.jDateChooser1.getDate()));
      param.put("date2", sdf.format(this.jDateChooser2.getDate()));
      JasperPrint jp = JasperFillManager.fillReport(jr, param, koneksiAcces.stat.getConnection());

      JasperViewer viewer = new JasperViewer(jp, false);
      viewer.setFitPageZoomRatio();
      viewer.setVisible(true);
    }
    catch (Exception z) {
      System.out.print(z.getMessage());
    }
    }//GEN-LAST:event_jButton1ActionPerformed


    dbBackground dbBackground=new dbBackground();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private tampilan.background background1;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private tampilan.panelRuncing panelRuncing1;
    // End of variables declaration//GEN-END:variables
    private void setBackground(){
        int n=dbBackground.reload();
        if(n==1) {
            background1.setGambar("background1.jpg");
        }
        else if(n==2) {
            background1.setGambar("background2.jpg");
        }
        else if(n==3) {
            background1.setGambar("background3.jpg");
        }
        else if(n==4) {
            background1.setGambar("background4.jpg");
        }
        else if(n==5) {
            background1.setGambar("background5.jpg");
        }

    }
}
