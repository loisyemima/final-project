/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.ResultSetTableModel;
import koneksi.koneksi;

/**
 *
 * @author Asus
 */
public class simpanan extends javax.swing.JFrame {

    /**
     * Creates new form simpanan
     */
    
    public simpanan() {
        initComponents();
        
        TampilTabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        anggota = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        wajib = new javax.swing.JTextField();
        sukarela = new javax.swing.JTextField();
        tanggal = new javax.swing.JTextField();
        simpanan = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simpan/icons8-bank-building-64.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 60));

        jLabel9.setFont(new java.awt.Font("Century751 No2 BT", 3, 29)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("KSU");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 110, 40));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("formulir Pendaftaran Simpanan");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 290, -1));

        jLabel10.setFont(new java.awt.Font("Century751 No2 BT", 3, 29)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("AMO");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 110, 40));

        jPanel2.setBackground(new java.awt.Color(153, 153, 0));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jPanel2AncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simpan/pembukuan.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel13.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("logout");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 40, 50, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 70, 65));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tanggal masuk");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 165, -1, -1));

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nama");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 165, -1, -1));

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Alamat");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 195, -1, -1));

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Simpanan wajib");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 105, -1, -1));

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Simpanan sukarela");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 135, -1, -1));

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("No simpanan");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 105, -1, -1));

        jLabel11.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("No anggota");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 135, -1, -1));
        jPanel1.add(anggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 135, 150, -1));

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        jPanel1.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 165, 150, -1));
        jPanel1.add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 195, 150, -1));
        jPanel1.add(wajib, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 105, 150, -1));
        jPanel1.add(sukarela, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 135, 150, -1));
        jPanel1.add(tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 165, 150, -1));
        jPanel1.add(simpanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 105, 150, -1));

        jButton1.setText("hapus");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 70, -1));

        jButton2.setText("edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 70, -1));

        jButton3.setText("simpan");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 80, -1));

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "no.simp", "no.angg", "nama", "alamat", "simp wajib", "simp sukarela", "tanggal"
            }
        ));
        jScrollPane1.setViewportView(tabel);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 610, 90));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simpan/layar.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel2AncestorMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel2AncestorMoved

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        login k = new login();
        k.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel2MouseClicked

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         try{
        koneksi Objkoneksi = new koneksi();
        Connection con = Objkoneksi.bukakoneksi();
        Statement st = con.createStatement();
        String sql = "INSERT INTO simpanan(no_simpanan, no_anggota, nama, alamat, simpanan_wajib, simpanan_sukarela, tanggal_masuk) VALUES "
                +"('"+simpanan.getText()+"','"+anggota.getText()+"','"+nama.getText() +"','"+alamat.getText()+"','"+wajib.getText()+"'," +
                    "'"+sukarela.getText()+"','"+tanggal.getText()+"')";
            int row = st.executeUpdate(sql);
            
            if (row ==1){
                JOptionPane.showMessageDialog(null,"Data sudah ditambahkan ke" +
                        " database","infomasi",JOptionPane.INFORMATION_MESSAGE);
                 
               con.close();
                }
    }
    catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Data tidak ditambahkan ke" +
                        " database","infomasi",JOptionPane.INFORMATION_MESSAGE);
    }
  TampilTabel();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
        koneksi Objkoneksi = new koneksi();
        Connection con = Objkoneksi.bukakoneksi();
        Statement st = con.createStatement();
        String sql = "delete from simpanan where no_simpanan = '"+simpanan.getText()+"' ";
        int row = st.executeUpdate(sql);
        if (row ==1){
                JOptionPane.showMessageDialog(null,"Data sudah dihapus dari " +
                        " database","infomasi",JOptionPane.INFORMATION_MESSAGE);
               
                con.close();

                }
    }
    catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Data tidak dihapus","infomasi",JOptionPane.
                INFORMATION_MESSAGE);
    }
    TampilTabel();  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
        koneksi Objkoneksi = new koneksi();
        Connection con = Objkoneksi.bukakoneksi();
        Statement st = con.createStatement();

        String sql = "update simpanan set no_anggota ='"+anggota.getText()+"',nama ='"+nama.getText()+"',alamat = '"+alamat.getText()+"',"
                + "simpanan_wajib = '"+wajib.getText()+"',simpanan_sukarela = '"+sukarela.getText()+"',"
                + "tanggal_masuk ='"+tanggal.getText()+"' where no_simpanan = '"+simpanan.getText()+"'" ;

         int row = st.executeUpdate(sql);
         if (row ==1){
                JOptionPane.showMessageDialog(null,"Data sudah di update "
                        ,"infomasi",JOptionPane.INFORMATION_MESSAGE);
                 con.close();
                }
    }
    catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Data tidak diUbah","infomasi",JOptionPane.
                INFORMATION_MESSAGE);
    }
 TampilTabel();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(simpanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(simpanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(simpanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(simpanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new simpanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JTextField anggota;
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField simpanan;
    private javax.swing.JTextField sukarela;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField tanggal;
    private javax.swing.JTextField wajib;
    // End of variables declaration//GEN-END:variables

    

    private void TampilTabel() {
        try {
            koneksi Objkoneksi = new koneksi();
            Connection con = Objkoneksi.bukakoneksi();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM simpanan";
            ResultSet set = st.executeQuery(sql);
            //menampilkan data ke Tabel
            ResultSetTableModel model = new ResultSetTableModel(set);
            tabel.setModel(model);

            
        }
        catch(SQLException e) { 
            System.out.println("gagal query");
        }
    }
}
