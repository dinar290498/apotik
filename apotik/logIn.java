

package apotik;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.sql.ResultSet;
import java.sql.SQLException;
import sql.dbBackground;
import sql.koneksiAcces;

/**
 *
 * @author SAD
 */
public class logIn extends javax.swing.JFrame {

    /** Creates new form logIn */
    public logIn() {
        initComponents();
    setBackground();
    reload();
    Dimension dim = getToolkit().getScreenSize();
    Rectangle abounds = getBounds();
    setLocation((dim.width - abounds.width) / 2, (dim.height - abounds.height) / 2);
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
        panelBiasa1 = new tampilan.panelBiasa();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        botton1 = new tampilan.botton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LogIn Form");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelRuncing1.setBackground(new java.awt.Color(51, 51, 51));

        panelBiasa1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username :");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password :");

        javax.swing.GroupLayout panelBiasa1Layout = new javax.swing.GroupLayout(panelBiasa1);
        panelBiasa1.setLayout(panelBiasa1Layout);
        panelBiasa1Layout.setHorizontalGroup(
            panelBiasa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBiasa1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(panelBiasa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(panelBiasa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPasswordField1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );
        panelBiasa1Layout.setVerticalGroup(
            panelBiasa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBiasa1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelBiasa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBiasa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        botton1.setText("Login User");
        botton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRuncing1Layout = new javax.swing.GroupLayout(panelRuncing1);
        panelRuncing1.setLayout(panelRuncing1Layout);
        panelRuncing1Layout.setHorizontalGroup(
            panelRuncing1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRuncing1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRuncing1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBiasa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelRuncing1Layout.setVerticalGroup(
            panelRuncing1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRuncing1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBiasa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botton1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SIlahkan Masukkan Username dan Password");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tampilan/Hospital.png"))); // NOI18N

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(background1Layout.createSequentialGroup()
                        .addComponent(panelRuncing1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRuncing1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        getContentPane().add(background1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
          koneksiAcces.stat.close();
          koneksiAcces.kon.close();
        }
        catch (SQLException ex) {
        }
        System.exit(0);

    }//GEN-LAST:event_formWindowClosing

    private void botton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botton1ActionPerformed
 if (cek(this.jComboBox1.getSelectedItem().toString(), this.jPasswordField1.getText())) {
      this.jLabel3.setText("Password Bener !!!");
      if (Main.akses == 0) {
        setVisible(false);
        new formUtama().setVisible(true);
      }
      else {
        setVisible(false);
        new transaksi().setVisible(true);
      }
    }
    else {
      this.jLabel3.setText("Password yang dimasukan Salah !!!");
    }
    }//GEN-LAST:event_botton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    dbBackground dbBackground=new dbBackground();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private tampilan.background background1;
    private tampilan.botton botton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private tampilan.panelBiasa panelBiasa1;
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

 private void reload()
  {
    this.jComboBox1.removeAllItems();
    try {
      ResultSet set = koneksiAcces.stat.executeQuery("select * from user");
      while (set.next()) {
        this.jComboBox1.addItem(set.getString("username"));
      }
      set.close();
    }
    catch (Exception z) {
      System.out.print(z.getMessage());
    }
  }

  private boolean cek(String username, String password) {
    boolean cek = false;
    try {
      ResultSet set = koneksiAcces.stat.executeQuery("select * from user");

      while (set.next()) {
        if ((username.equals(set.getString("username"))) && (password.equals(set.getString("password")))) {
          cek = true;
          Main.akses = set.getInt("akses");
        }
      }
      set.close();
    }
    catch (Exception z) {
      System.out.print(z.getMessage());
    }
    return cek;
  }


}
