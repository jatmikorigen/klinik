package Transaksi.Transaksi_penjualan_produk.PopUP_penjualan_produk;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSpinner;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import java.util.HashMap;
import koneksi.koneksi;
public class PopUP_penjualan_produk extends javax.swing.JFrame {
     private Connection conn = new koneksi().connect();
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PopUP_penjualan_produk.class.getName());
private double hargaProdukTerpilih = 0;
    public PopUP_penjualan_produk() {
        initComponents();
        hitungTotal();
        txtNamaPasien.setEditable(false);
        txtNamaProduk.setEditable(false);
        txttotalharga.setEditable(false);
        txtJumlah.getDocument().addDocumentListener(
    new javax.swing.event.DocumentListener() {
        @Override
        public void insertUpdate(javax.swing.event.DocumentEvent e) {
            hitungTotal();
        }

        @Override
        public void removeUpdate(javax.swing.event.DocumentEvent e) {
            hitungTotal();
        }

        @Override
        public void changedUpdate(javax.swing.event.DocumentEvent e) {
            hitungTotal();
        }
    }
);
    }
private void hitungTotal() {
    try {
        int jumlah = Integer.parseInt(txtJumlah.getText().trim());
        double total = jumlah * hargaProdukTerpilih;
        txttotalharga.setText(String.valueOf(total));
    } catch (Exception e) {
        txttotalharga.setText("");
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdPenjualan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIdPasien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNamaPasien = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIdProduk = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNamaProduk = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttgl = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txttotalharga = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID PENJUALAN");

        jLabel2.setText("ID PASIEN");

        jLabel3.setText("NAMA PASIEN");

        jLabel4.setText("ID PRODUK");

        jLabel5.setText("Nama Produk");

        jLabel6.setText("Tanggal");

        txttgl.setModel(new javax.swing.SpinnerDateModel());

        jLabel7.setText("Jumlah");

        jButton1.setText("Tambah");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setText("Batal");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setText("Cari");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jButton4.setText("Cari");
        jButton4.addActionListener(this::jButton4ActionPerformed);

        jLabel8.setText("Total harga");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButton1)
                        .addGap(26, 26, 26)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdProduk)
                            .addComponent(txtNamaProduk)
                            .addComponent(txtNamaPasien)
                            .addComponent(txtIdPasien)
                            .addComponent(txtIdPenjualan)
                            .addComponent(txttgl, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(txtJumlah)
                            .addComponent(txttotalharga))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton4))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNamaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txttgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txttotalharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    dispose();  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  try {
            String sql = "SELECT nama FROM pasien WHERE id_pasien = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtIdPasien.getText());
 
            ResultSet rs = stat.executeQuery();
 
            if (rs.next()) {
    txtNamaPasien.setText(rs.getString("nama"));
            } else {
                JOptionPane.showMessageDialog(this, "ID Pasien tidak ditemukan");
                txtNamaPasien.setText("");
                txtIdPasien.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 try {
            String sql = "SELECT nama_produk, harga FROM produk WHERE id_produk = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtIdProduk.getText());
 
            ResultSet rs = stat.executeQuery();
 
            if (rs.next()) {
                txtNamaProduk.setText(rs.getString("nama_produk"));
                hargaProdukTerpilih = rs.getDouble("harga");
                hitungTotal();
            } else {
                JOptionPane.showMessageDialog(this, "ID Produk tidak ditemukan");
                txtNamaProduk.setText("");
                hargaProdukTerpilih = 0;
                txttotalharga.setText("");
                txtIdProduk.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
          
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 if (txtIdPenjualan.getText().isEmpty()
                || txtIdPasien.getText().isEmpty()
                || txtIdProduk.getText().isEmpty()
                || txtJumlah.getText().isEmpty()) {
 
            JOptionPane.showMessageDialog(null, "Semua data harus diisi!");
            return;
        }
 
        try {
            String sql = "INSERT INTO penjualan_produk "
                    + "(id_penjualan, id_pasien, id_produk, tanggal, jumlah, total_harga)"
                    + " VALUES (?,?,?,?,?,?)";
 
            PreparedStatement stat = conn.prepareStatement(sql);
 
            stat.setString(1, txtIdPenjualan.getText());
            stat.setString(2, txtIdPasien.getText());
            stat.setString(3, txtIdProduk.getText());
 
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            stat.setString(4, sdf.format(txttgl.getValue()));
 
            int jumlah = Integer.parseInt(txtJumlah.getText().trim());
            stat.setInt(5, jumlah);
            stat.setDouble(6,
             Double.parseDouble(txttotalharga.getText()));
 
            stat.executeUpdate();
 
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
 
            dispose();
 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Jumlah harus berupa angka");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new PopUP_penjualan_produk().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtIdPasien;
    private javax.swing.JTextField txtIdPenjualan;
    private javax.swing.JTextField txtIdProduk;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtNamaPasien;
    private javax.swing.JTextField txtNamaProduk;
    private javax.swing.JSpinner txttgl;
    private javax.swing.JTextField txttotalharga;
    // End of variables declaration//GEN-END:variables
}
