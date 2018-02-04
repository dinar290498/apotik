/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * dialogSatuan.java
 *
 * Created on Mar 14, 2011, 12:02:23 AM
 */

package apotik;

import data.dtDistributor;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JOptionPane;
import sql.dbDistributor;
import tm.tmDistributor;

/**
 *
 * @author SAD
 */
public class dialogDistributor extends javax.swing.JDialog {

    /** Creates new form dialogSatuan */
    public dialogDistributor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Dimension dim = getToolkit().getScreenSize();
        Rectangle abounds = getBounds();
        setLocation((dim.width - abounds.width) / 2,(dim.height - abounds.height) / 2);

        jTable1.setModel(tmDistributor);
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
        panelRuncing1 = new tampilan.panelRuncing();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelBiasa1 = new tampilan.panelBiasa();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        botton1 = new tampilan.botton();
        botton2 = new tampilan.botton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Distributor");
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        panelBiasa1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setText("Distributor");

        botton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tampilan/new.png"))); // NOI18N
        botton1.setText("Tambah");
        botton1.setFont(new java.awt.Font("Tahoma", 1, 11));
        botton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botton1ActionPerformed(evt);
            }
        });

        botton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tampilan/delete.png"))); // NOI18N
        botton2.setText("Hapus");
        botton2.setFont(new java.awt.Font("Tahoma", 1, 11));
        botton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBiasa1Layout = new javax.swing.GroupLayout(panelBiasa1);
        panelBiasa1.setLayout(panelBiasa1Layout);
        panelBiasa1Layout.setHorizontalGroup(
            panelBiasa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBiasa1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBiasa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelBiasa1Layout.createSequentialGroup()
                        .addComponent(botton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBiasa1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1)))
                .addContainerGap())
        );
        panelBiasa1Layout.setVerticalGroup(
            panelBiasa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBiasa1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBiasa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBiasa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botton2, 0, 0, Short.MAX_VALUE)
                    .addComponent(botton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelRuncing1Layout = new javax.swing.GroupLayout(panelRuncing1);
        panelRuncing1.setLayout(panelRuncing1Layout);
        panelRuncing1Layout.setHorizontalGroup(
            panelRuncing1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRuncing1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRuncing1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(panelBiasa1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelRuncing1Layout.setVerticalGroup(
            panelRuncing1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRuncing1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBiasa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRuncing1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRuncing1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(background1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botton1ActionPerformed
        if(!jTextField1.getText().trim().equals("")){
            dtDistributor dtd=new dtDistributor();
            dtd.setNamaDistributor(jTextField1.getText());

            if(dbDistributor.insert(dtd))
                tmDistributor.insert(dtd);
            
            jTextField1.setText("");
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Isi Daftar Distributor Obat !!!","ERROT",JOptionPane.ERROR_MESSAGE);
}//GEN-LAST:event_botton1ActionPerformed

    private void botton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botton2ActionPerformed
        int n=jTable1.getSelectedRow();
        if(n>=0){
            if(dbDistributor.delete(tmDistributor.fieldDistributor.get(n).getNamaDistributor()))
            tmDistributor.delete(n);
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Pilih data yang akan di hapus","ERROT",JOptionPane.ERROR_MESSAGE);
}//GEN-LAST:event_botton2ActionPerformed



    tmDistributor tmDistributor=new tmDistributor();
    dbDistributor dbDistributor=new dbDistributor();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private tampilan.background background1;
    private tampilan.botton botton1;
    private tampilan.botton botton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private tampilan.panelBiasa panelBiasa1;
    private tampilan.panelRuncing panelRuncing1;
    // End of variables declaration//GEN-END:variables

}
