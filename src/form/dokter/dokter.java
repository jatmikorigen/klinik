
package form;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import koneksi.koneksi;
public class dokter extends javax.swing.JPanel {    
    public dokter() {
    initComponents();
    tampilData(); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jkodedokter = new javax.swing.JTextField();
        jnamadokter = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSimpan = new javax.swing.JButton();
        jEdit = new javax.swing.JButton();
        jHapus = new javax.swing.JButton();
        Jclear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Pilih = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jnohp = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(702, 643));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Form Dokter");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel2.setText("Kode Dokter");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel3.setText("Nama Dokter");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel4.setText("Jenis Kelamin");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel5.setText("Spesialis");

        jkodedokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jkodedokterActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pria", "Wanita" }));

        jSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icons8-save-10.png"))); // NOI18N
        jSimpan.setText("Simpan");
        jSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSimpanActionPerformed(evt);
            }
        });

        jEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icons8-change-10.png"))); // NOI18N
        jEdit.setText("Edit");
        jEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditActionPerformed(evt);
            }
        });

        jHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icons8-delete-10.png"))); // NOI18N
        jHapus.setText("Hapus");
        jHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHapusActionPerformed(evt);
            }
        });

        Jclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icons8-clear-symbol-10.png"))); // NOI18N
        Jclear.setText("Clear");
        Jclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JclearActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel7.setText("No HP");

        Pilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dokter Spesialis Dermatologi, Venereologi, dan Estetika (Sp.D.V.E)", "Dokter Estetika / Aesthetic Doctor", "Dokter Bedah Plastik (Sp.BP-RE)", "Dokter Gizi Klinik (Sp.GK)", "Dokter Spesialis Rambut (Trichology)", "Dokter Umum" }));
        Pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PilihActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton5.setText("Cari");

        jnohp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnohpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(108, 108, 108))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                        .addGap(301, 301, 301))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Pilih, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jnamadokter)
                                    .addComponent(jnohp)
                                    .addComponent(jkodedokter)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jSimpan)
                                .addGap(18, 18, 18)
                                .addComponent(jEdit)
                                .addGap(18, 18, 18)
                                .addComponent(jHapus)
                                .addGap(22, 22, 22)
                                .addComponent(Jclear)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jkodedokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jnamadokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jnohp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Pilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSimpan)
                    .addComponent(jEdit)
                    .addComponent(jHapus)
                    .addComponent(Jclear))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSimpanActionPerformed
try {
        String sql = "INSERT INTO dokter(kode_dokter,nama_dokter,no_hp,spesialis,jenis_kelamin) VALUES (?,?,?,?,?)";
        Connection conn = new koneksi().connect();
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, jkodedokter.getText());
        pst.setString(2, jnamadokter.getText());
        pst.setString(3, jnohp.getText());
        pst.setString(4, Pilih.getSelectedItem().toString());
        pst.setString(5, jComboBox1.getSelectedItem().toString());
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
        tampilData();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Gagal simpan : " + e);
    }
    }//GEN-LAST:event_jSimpanActionPerformed

    private void jEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditActionPerformed
         try {
        String sql = "UPDATE dokter SET "
                + "nama_dokter=?, "
                + "no_hp=?, "
                + "spesialis=?, "
                + "jenis_kelamin=? "
                + "WHERE kode_dokter=?";

        Connection conn = new koneksi().connect();
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, jnamadokter.getText());
        pst.setString(2, jnohp.getText());
        pst.setString(3, Pilih.getSelectedItem().toString());
        pst.setString(4, jComboBox1.getSelectedItem().toString());
        pst.setString(5, jkodedokter.getText());
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Data berhasil diubah");
              tampilData();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Gagal ubah : " + e);
    }
    }//GEN-LAST:event_jEditActionPerformed

    private void PilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PilihActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PilihActionPerformed

    private void jkodedokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jkodedokterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jkodedokterActionPerformed

    private void jnohpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnohpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnohpActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
int baris = jTable1.getSelectedRow();

jkodedokter.setText(
    jTable1.getValueAt(baris, 0).toString());

jnamadokter.setText(
    jTable1.getValueAt(baris, 1).toString());

jnohp.setText(
    jTable1.getValueAt(baris, 2).toString());

Pilih.setSelectedItem(
    jTable1.getValueAt(baris, 3).toString());

jComboBox1.setSelectedItem(
    jTable1.getValueAt(baris, 4).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHapusActionPerformed
        try {

        String sql = "DELETE FROM dokter WHERE kode_dokter=?";

        Connection conn = new koneksi().connect();
        PreparedStatement pst = conn.prepareStatement(sql);

        pst.setString(1, jkodedokter.getText());

        pst.executeUpdate();

        JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        
        tampilData();

    } catch (Exception e) {

        JOptionPane.showMessageDialog(null, "Gagal hapus : " + e);

    }
    }//GEN-LAST:event_jHapusActionPerformed

    private void JclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JclearActionPerformed
        jkodedokter.setText("");
    jnamadokter.setText("");
    jnohp.setText("");

    Pilih.setSelectedIndex(0);
    jComboBox1.setSelectedIndex(0);

    jkodedokter.requestFocus();

    }//GEN-LAST:event_JclearActionPerformed

private void tampilData() {

    javax.swing.table.DefaultTableModel model =
            new javax.swing.table.DefaultTableModel();

    model.addColumn("Kode Dokter");
    model.addColumn("Nama Dokter");
    model.addColumn("No HP");
    model.addColumn("Spesialis");
    model.addColumn("Jenis Kelamin");

    try {

        String sql = "SELECT * FROM dokter";

        Connection conn = new koneksi().connect();
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {

            model.addRow(new Object[]{
                rs.getString("kode_dokter"),
                rs.getString("nama_dokter"),
                rs.getString("no_hp"),
                rs.getString("spesialis"),
                rs.getString("jenis_kelamin")
            });

        }

        jTable1.setModel(model);

    } catch (Exception e) {

        JOptionPane.showMessageDialog(null,
                "Gagal tampil data : " + e);

    }

}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jclear;
    private javax.swing.JComboBox<String> Pilih;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JButton jEdit;
    private javax.swing.JButton jHapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSimpan;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jkodedokter;
    private javax.swing.JTextField jnamadokter;
    private javax.swing.JTextField jnohp;
    // End of variables declaration//GEN-END:variables
}
