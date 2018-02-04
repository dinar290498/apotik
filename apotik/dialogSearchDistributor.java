/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * dialogSearchDistributor.java
 *
 * Created on Mar 18, 2011, 1:35:37 AM
 */

package apotik;

import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import tm.tmDistributor;

/**
 *
 * @author SAD
 */
public class dialogSearchDistributor extends javax.swing.JDialog {

    /** Creates new form dialogSearchDistributor */
    public dialogSearchDistributor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Dimension dim = getToolkit().getScreenSize();
        Rectangle abounds = getBounds();
        setLocation((dim.width - abounds.width) / 2,(dim.height - abounds.height) / 2);
        jTable1.setModel(tmd);

        sorter = new TableRowSorter<TableModel>(tmd);
        jTable1.setRowSorter(sorter);
        reload();
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
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cari Distributor");
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Cari Distributor");

        javax.swing.GroupLayout panelRuncing1Layout = new javax.swing.GroupLayout(panelRuncing1);
        panelRuncing1.setLayout(panelRuncing1Layout);
        panelRuncing1Layout.setHorizontalGroup(
            panelRuncing1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRuncing1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRuncing1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addGroup(panelRuncing1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelRuncing1Layout.setVerticalGroup(
            panelRuncing1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRuncing1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRuncing1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRuncing1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount()==2){
            n=jTable1.getSelectedRow();
            setVisible(false);
        }
    }//GEN-LAST:event_jTable1MouseClicked


    tmDistributor tmd=new tmDistributor();
    private TableRowSorter<TableModel> sorter;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private tampilan.background background1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private tampilan.panelRuncing panelRuncing1;
    // End of variables declaration//GEN-END:variables
    int n=-1;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    private void reload(){

       jTextField1.getDocument().addDocumentListener(
                new DocumentListener() {
                    public void changedUpdate(DocumentEvent e) {
                        newFilter();
                    }
                    public void insertUpdate(DocumentEvent e) {
                        newFilter();
                    }
                    public void removeUpdate(DocumentEvent e) {
                        newFilter();
                    }
                });

    }

    private void newFilter() {

        RowFilter<TableModel, Object> rf = null;
        //If current expression doesn't parse, don't update.
        try {
            rf = RowFilter.regexFilter(jTextField1.getText());
        } catch (java.util.regex.PatternSyntaxException e) {
            return;
        }
        sorter.setRowFilter(rf);
    }
}
