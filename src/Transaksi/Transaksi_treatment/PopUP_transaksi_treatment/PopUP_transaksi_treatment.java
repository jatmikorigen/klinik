package Transaksi.Transaksi_treatment.PopUP_transaksi_treatment;
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

public class PopUP_transaksi_treatment extends javax.swing.JFrame {
     private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    private DefaultTableModel tabmodeBahan;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PopUP_transaksi_treatment.class.getName());

  
    public PopUP_transaksi_treatment() {
        initComponents();
        
            txtNamaPasien.setEditable(false);
            txtNamaDokter.setEditable(false);
            txtNamaTreatment.setEditable(false);

            loadKodeBahan();
    }

  
    private void loadKodeBahan() {
        cbKodeBahan.removeAllItems();
        try {
            String sql = "SELECT kode_bahan, nama_bahan FROM bahan_alat WHERE kode_bahan <> ''";
            PreparedStatement stat = conn.prepareStatement(sql);
            ResultSet rs = stat.executeQuery();
            while (rs.next()) {
                cbKodeBahan.addItem(rs.getString("kode_bahan") + " - " + rs.getString("nama_bahan"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal memuat data bahan: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdTransaksi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIdPasien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIdDokter = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNamaDokter = new javax.swing.JTextField();
        txtTanggal = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtNamaPasien = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtIdTreatment = new javax.swing.JTextField();
        txtNamaTreatment = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("ID TRANSAKSI");

        jLabel2.setText("ID PASIEN");

        jLabel3.setText("ID DOKTER");

        jLabel4.setText("ID TREATMENT");

        txtTanggal.setModel(new javax.swing.SpinnerDateModel());

        jLabel5.setText("Tanggal");

        jButton1.setText("Cari");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setText("Cari");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setText("Cari");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jLabel7.setText("Nama Pasien");

        jLabel8.setText("Nama DOKTER");

        jLabel9.setText("Nama Treatment");

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(this::btnTambahActionPerformed);

        btnBatal.setText("Batal");
        btnBatal.addActionListener(this::btnBatalActionPerformed);

        javax.swing.JPanel panelUtama = new javax.swing.JPanel();
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(panelUtama);
        panelUtama.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel7)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNamaDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTambah))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(btnBatal))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNamaTreatment)
                                    .addComponent(txtIdTreatment, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdTreatment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaTreatment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnBatal))
                .addGap(18, 18, 18))
        );

        // ---- Panel input Bahan/Alat yang dipakai ----
        javax.swing.JPanel panelBahan = new javax.swing.JPanel(new java.awt.BorderLayout(8, 8));
        panelBahan.setBorder(javax.swing.BorderFactory.createTitledBorder("Bahan/Alat yang Dipakai"));

        javax.swing.JPanel panelInputBahan = new javax.swing.JPanel();
        cbKodeBahan = new javax.swing.JComboBox<>();
        txtJumlahBahan = new javax.swing.JTextField(5);
        btnTambahBahan = new javax.swing.JButton("Tambah Bahan");
        btnHapusBahan = new javax.swing.JButton("Hapus Baris");
        btnTambahBahan.addActionListener(this::btnTambahBahanActionPerformed);
        btnHapusBahan.addActionListener(this::btnHapusBahanActionPerformed);
        panelInputBahan.add(new javax.swing.JLabel("Bahan:"));
        panelInputBahan.add(cbKodeBahan);
        panelInputBahan.add(new javax.swing.JLabel("Jumlah:"));
        panelInputBahan.add(txtJumlahBahan);
        panelInputBahan.add(btnTambahBahan);
        panelInputBahan.add(btnHapusBahan);
        panelBahan.add(panelInputBahan, java.awt.BorderLayout.NORTH);

        tabmodeBahan = new DefaultTableModel(null, new Object[]{"Kode Bahan", "Nama Bahan", "Jumlah"});
        tabelBahanTerpakai = new javax.swing.JTable(tabmodeBahan);
        javax.swing.JScrollPane scrollBahan = new javax.swing.JScrollPane(tabelBahanTerpakai);
        scrollBahan.setPreferredSize(new java.awt.Dimension(400, 120));
        panelBahan.add(scrollBahan, java.awt.BorderLayout.CENTER);

        getContentPane().setLayout(new java.awt.BorderLayout());
        getContentPane().add(panelUtama, java.awt.BorderLayout.NORTH);
        getContentPane().add(panelBahan, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void btnTambahBahanActionPerformed(java.awt.event.ActionEvent evt) {
        String selected = (String) cbKodeBahan.getSelectedItem();
        if (selected == null || selected.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Pilih bahan terlebih dahulu");
            return;
        }
        String jumlahText = txtJumlahBahan.getText().trim();
        int jumlah;
        try {
            jumlah = Integer.parseInt(jumlahText);
            if (jumlah <= 0) {
                JOptionPane.showMessageDialog(this, "Jumlah harus lebih dari 0");
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Jumlah harus berupa angka");
            return;
        }

        String[] parts = selected.split(" - ", 2);
        String kodeBahan = parts[0];
        String namaBahan = parts.length > 1 ? parts[1] : "";

        tabmodeBahan.addRow(new Object[]{kodeBahan, namaBahan, jumlah});
        txtJumlahBahan.setText("");
    }

 
    private void btnHapusBahanActionPerformed(java.awt.event.ActionEvent evt) {
        int baris = tabelBahanTerpakai.getSelectedRow();
        if (baris >= 0) {
            tabmodeBahan.removeRow(baris);
        }
    }

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
 if (txtIdTransaksi.getText().isEmpty()
        || txtIdPasien.getText().isEmpty()
        || txtIdDokter.getText().isEmpty()
        || txtIdTreatment.getText().isEmpty()) {

    JOptionPane.showMessageDialog(null, "Semua data harus diisi!");
    return;
}
        try {

        String hargaSql = "SELECT harga FROM treatment_layanan WHERE id_treatment = ?";
        PreparedStatement hargaStat = conn.prepareStatement(hargaSql);
        hargaStat.setString(1, txtIdTreatment.getText());
        ResultSet hargaRs = hargaStat.executeQuery();

        int totalBayar = 0;
        if (hargaRs.next()) {
            totalBayar = hargaRs.getInt("harga");
        } else {
            JOptionPane.showMessageDialog(null, "ID Treatment tidak ditemukan");
            return;
        }

        String sql = "INSERT INTO transaksi_treatment "
                + "(id_transaksi,id_pasien,id_dokter,id_treatment,tanggal,total_bayar)"
                + " VALUES (?,?,?,?,?,?)";

        PreparedStatement stat = conn.prepareStatement(sql);

        stat.setString(1, txtIdTransaksi.getText());
        stat.setString(2, txtIdPasien.getText());
        stat.setString(3, txtIdDokter.getText());
        stat.setString(4, txtIdTreatment.getText());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        stat.setString(5, sdf.format(txtTanggal.getValue()));

        stat.setInt(6, totalBayar);   

        stat.executeUpdate();

        for (int i = 0; i < tabmodeBahan.getRowCount(); i++) {
            String kodeBahan = tabmodeBahan.getValueAt(i, 0).toString();
            int jumlahPakai = Integer.parseInt(tabmodeBahan.getValueAt(i, 2).toString());

            String sqlPakai = "INSERT INTO pemakaian_bahan (id_transaksi, kode_bahan, jumlah) VALUES (?,?,?)";
            PreparedStatement statPakai = conn.prepareStatement(sqlPakai);
            statPakai.setString(1, txtIdTransaksi.getText());
            statPakai.setString(2, kodeBahan);
            statPakai.setInt(3, jumlahPakai);
            statPakai.executeUpdate();

            String sqlStock = "SELECT stock FROM bahan_alat WHERE kode_bahan = ?";
            PreparedStatement statStock = conn.prepareStatement(sqlStock);
            statStock.setString(1, kodeBahan);
            ResultSet rsStock = statStock.executeQuery();
            if (rsStock.next()) {
                int stockSaatIni;
                try {
                    stockSaatIni = Integer.parseInt(rsStock.getString("stock").trim());
                } catch (Exception exStock) {
                    stockSaatIni = 0;
                }
                int stockBaru = stockSaatIni - jumlahPakai;
                if (stockBaru < 0) {
                    stockBaru = 0;
                }
                String sqlUpdateStock = "UPDATE bahan_alat SET stock = ? WHERE kode_bahan = ?";
                PreparedStatement statUpdateStock = conn.prepareStatement(sqlUpdateStock);
                statUpdateStock.setString(1, String.valueOf(stockBaru));
                statUpdateStock.setString(2, kodeBahan);
                statUpdateStock.executeUpdate();
            }
        }

        JOptionPane.showMessageDialog(null, "Data berhasil disimpan");

        dispose();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
    dispose();
       
    }//GEN-LAST:event_btnBatalActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 try {
        String sql = "SELECT nama_dokter FROM dokter WHERE kode_dokter = ?";

        PreparedStatement stat = conn.prepareStatement(sql);
        stat.setString(1, txtIdDokter.getText());

        ResultSet rs = stat.executeQuery();

        if (rs.next()) {
            txtNamaDokter.setText(rs.getString("nama_dokter"));
        } else {
            JOptionPane.showMessageDialog(this, "ID Dokter tidak ditemukan");
            txtNamaDokter.setText("");
            txtIdDokter.requestFocus();
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
   }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     try {
        String sql = "SELECT nama_treatment FROM treatment_layanan WHERE id_treatment = ?";

        PreparedStatement stat = conn.prepareStatement(sql);
        stat.setString(1, txtIdTreatment.getText());

        ResultSet rs = stat.executeQuery();

        if (rs.next()) {
            txtNamaTreatment.setText(rs.getString("nama_treatment"));
        } else {
            JOptionPane.showMessageDialog(this, "ID Treatment tidak ditemukan");
            txtNamaTreatment.setText("");
            txtIdTreatment.requestFocus();
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_jButton3ActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new PopUP_transaksi_treatment().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTambahBahan;
    private javax.swing.JButton btnHapusBahan;
    private javax.swing.JComboBox<String> cbKodeBahan;
    private javax.swing.JTextField txtJumlahBahan;
    private javax.swing.JTable tabelBahanTerpakai;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtIdDokter;
    private javax.swing.JTextField txtIdPasien;
    private javax.swing.JTextField txtIdTransaksi;
    private javax.swing.JTextField txtIdTreatment;
    private javax.swing.JTextField txtNamaDokter;
    private javax.swing.JTextField txtNamaPasien;
    private javax.swing.JTextField txtNamaTreatment;
    private javax.swing.JSpinner txtTanggal;
    // End of variables declaration//GEN-END:variables
}
