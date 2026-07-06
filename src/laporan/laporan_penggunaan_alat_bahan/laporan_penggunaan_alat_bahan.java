package laporan.laporan_penggunaan_alat_bahan;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import koneksi.koneksi;
public class laporan_penggunaan_alat_bahan extends javax.swing.JPanel {
private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    public laporan_penggunaan_alat_bahan() {
        initComponents();
        datatable();
    }
protected void datatable() {

    Object[] Baris = {
        "Tanggal", "Nama Pasien", "Nama Dokter", "Nama Treatment",
        "Nama Bahan", "Jumlah Terpakai", "Status Stok"
    };

    tabmode = new DefaultTableModel(null, Baris);
    txttbl.setModel(tabmode);

    String cari = txtcari.getText();

    try {

        String sql =
            "SELECT tt.tanggal, " +
            "p.nama AS nama_pasien, " +
            "d.nama_dokter, " +
            "t.nama_treatment, " +
            "b.nama_bahan, " +
            "pb.jumlah, " +
            "b.stock, " +
            "b.stock_min " +
            "FROM pemakaian_bahan pb " +
            "INNER JOIN transaksi_treatment tt ON pb.id_transaksi = tt.id_transaksi " +
            "INNER JOIN pasien p ON tt.id_pasien = p.id_pasien " +
            "INNER JOIN dokter d ON tt.id_dokter = d.kode_dokter " +
            "INNER JOIN treatment_layanan t ON tt.id_treatment = t.id_treatment " +
            "INNER JOIN bahan_alat b ON pb.kode_bahan = b.kode_bahan " +
            "WHERE tt.id_transaksi LIKE ? " +
            "OR p.nama LIKE ? " +
            "OR d.nama_dokter LIKE ? " +
            "OR t.nama_treatment LIKE ? " +
            "OR b.nama_bahan LIKE ? " +
            "ORDER BY tt.tanggal ASC";

        PreparedStatement stat = conn.prepareStatement(sql);

        String keyword = "%" + cari + "%";
        stat.setString(1, keyword);
        stat.setString(2, keyword);
        stat.setString(3, keyword);
        stat.setString(4, keyword);
        stat.setString(5, keyword);

        ResultSet rs = stat.executeQuery();

        while (rs.next()) {

            String statusStok;
            try {
                int stock = Integer.parseInt(rs.getString("stock").trim());
                int stockMin = Integer.parseInt(rs.getString("stock_min").trim());
                statusStok = (stock <= stockMin) ? "Menipis" : "Cukup";
            } catch (Exception ex) {
                statusStok = "-";
            }

            tabmode.addRow(new Object[]{
                rs.getString("tanggal"),
                rs.getString("nama_pasien"),
                rs.getString("nama_dokter"),
                rs.getString("nama_treatment"),
                rs.getString("nama_bahan"),
                rs.getString("jumlah"),
                statusStok
            });
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Data gagal ditampilkan : " + e.getMessage());
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtcari = new javax.swing.JTextField();
        bcari = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txttbl = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Laporan Penggunaan Alat & Bahan");

        bcari.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bcari.setText("Cari");
        bcari.addActionListener(this::bcariActionPerformed);

        jButton1.setText("Cetak");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(360, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bcari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcari)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txttbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Tanggal", "Nama Pasien", "Nama Dokter", "Nama Treatment", "Nama Bahan", "Jumlah Terpakai", "Status Stok"
            }
        ));
        txttbl.setGridColor(new java.awt.Color(0, 0, 0));
        txttbl.setShowGrid(true);
        jScrollPane2.setViewportView(txttbl);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariActionPerformed
datatable();        
    }//GEN-LAST:event_bcariActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try {
        java.io.InputStream is = getClass().getResourceAsStream("/laporan/laporan_penggunaan_alat_bahan/lpab.jasper");
        if (is == null) {
            JOptionPane.showMessageDialog(null, "File .jasper tidak ditemukan!");
            return;
        }
        java.util.HashMap<String, Object> param = new java.util.HashMap<>();
        net.sf.jasperreports.engine.JasperPrint jp =
            net.sf.jasperreports.engine.JasperFillManager.fillReport(is, param, conn);
        net.sf.jasperreports.view.JasperViewer.viewReport(jp, false);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Gagal cetak: " + e.getMessage());
    }         
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcari;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTable txttbl;
    // End of variables declaration//GEN-END:variables
}
