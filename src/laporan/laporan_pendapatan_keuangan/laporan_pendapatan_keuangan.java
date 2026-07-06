package laporan.laporan_pendapatan_keuangan;
import java.io.InputStream;
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
public class laporan_pendapatan_keuangan extends javax.swing.JPanel {
private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    public laporan_pendapatan_keuangan() {
     initComponents();
        datatable();
    }
protected void datatable() {
    Object[] Baris = {
        "Tanggal", "Pendapatan Produk", "Pendapatan Treatment", "Total Harian"
    };

    tabmode = new DefaultTableModel(null, Baris);
    txttbl.setModel(tabmode);

    String dari = txtDari.getText().trim();
    String sampai = txtSampai.getText().trim();
    boolean pakaiFilter = !dari.isEmpty() && !sampai.isEmpty();

    long totalProduk = 0;
    long totalTreatment = 0;
    try {
        String sql =
            "SELECT tanggal, " +
            "SUM(pendapatan_produk) AS pendapatan_produk, " +
            "SUM(pendapatan_treatment) AS pendapatan_treatment " +
            "FROM ( " +
            "  SELECT tanggal, total_harga AS pendapatan_produk, 0 AS pendapatan_treatment FROM penjualan_produk " +
            "  UNION ALL " +
            "  SELECT tanggal, 0 AS pendapatan_produk, total_bayar AS pendapatan_treatment FROM transaksi_treatment " +
            ") gabungan " +
            (pakaiFilter ? "WHERE tanggal BETWEEN ? AND ? " : "") +
            "GROUP BY tanggal " +
            "ORDER BY tanggal ASC";
        PreparedStatement stat = conn.prepareStatement(sql);
        if (pakaiFilter) {
            stat.setString(1, dari);
            stat.setString(2, sampai);
        }
        ResultSet rs = stat.executeQuery();
        while (rs.next()) {
            long pendapatanProduk = rs.getLong("pendapatan_produk");
            long pendapatanTreatment = rs.getLong("pendapatan_treatment");
            long totalHarian = pendapatanProduk + pendapatanTreatment;
            totalProduk += pendapatanProduk;
            totalTreatment += pendapatanTreatment;
            tabmode.addRow(new Object[]{
                rs.getString("tanggal"),
                "Rp " + pendapatanProduk,
                "Rp " + pendapatanTreatment,
                "Rp " + totalHarian
            });
        }

        lblTotalProduk.setText("Total Pendapatan Produk : Rp " + totalProduk);
        lblTotalTreatment.setText("Total Pendapatan Treatment : Rp " + totalTreatment);
        lblGrandTotal.setText("Grand Total Pendapatan : Rp " + (totalProduk + totalTreatment));

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Data gagal ditampilkan : " + e.getMessage());
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDari = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSampai = new javax.swing.JTextField();
        btntampilkan = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txttbl = new javax.swing.JTable();
        lblTotalProduk = new javax.swing.JLabel();
        lblTotalTreatment = new javax.swing.JLabel();
        lblGrandTotal = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Laporan Pendapatan Keuangan");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Dari (yyyy-mm-dd):");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Sampai (yyyy-mm-dd):");

        btntampilkan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btntampilkan.setText("Tampilkan");
        btntampilkan.addActionListener(this::btntampilkanActionPerformed);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Cetak");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDari, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSampai, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btntampilkan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btntampilkan)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtDari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtSampai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txttbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Tanggal", "Pendapatan Produk", "Pendapatan Treatment", "Total Harian"
            }
        ));
        txttbl.setGridColor(new java.awt.Color(0, 0, 0));
        txttbl.setShowGrid(true);
        jScrollPane2.setViewportView(txttbl);

        lblTotalProduk.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTotalProduk.setText("Total Pendapatan Produk : Rp 0");

        lblTotalTreatment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTotalTreatment.setText("Total Pendapatan Treatment : Rp 0");

        lblGrandTotal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblGrandTotal.setText(" Total Pendapatan : Rp 0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotalProduk)
                            .addComponent(lblTotalTreatment)
                            .addComponent(lblGrandTotal))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalProduk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalTreatment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGrandTotal)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btntampilkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntampilkanActionPerformed
datatable();
    }//GEN-LAST:event_btntampilkanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try {

    InputStream is = getClass().getResourceAsStream(
            "/laporan/laporan_pendapatan_keuangan/lpks.jasper");

    if (is == null) {
        JOptionPane.showMessageDialog(null,
                "File lppks.jasper tidak ditemukan!");
        return;
    }

    HashMap<String, Object> param = new HashMap<>();

    JasperPrint jp = JasperFillManager.fillReport(is, param, conn);

    JasperViewer.viewReport(jp, false);

} catch (Exception e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(null, e.getMessage());
}
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btntampilkan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblGrandTotal;
    private javax.swing.JLabel lblTotalProduk;
    private javax.swing.JLabel lblTotalTreatment;
    private javax.swing.JTextField txtDari;
    private javax.swing.JTextField txtSampai;
    private javax.swing.JTable txttbl;
    // End of variables declaration//GEN-END:variables
}
