
package form;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import koneksi.koneksi;
import koneksi.koneksi;
public class pasien extends javax.swing.JFrame {
     private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    
    public pasien() {
        initComponents();
        kosong();
        aktif();
        datatable();
    }
 protected void aktif(){
        txtid.requestFocus();
      
    }
 protected void kosong(){
    txtid.setText("");
    txtnm.getText();
    txtalm.getText();
    txthp.getText();
    txttgl.getText();
    txtra.getText();
  
 }
protected void datatable (){
     Object[] Baris = {
        "ID Pasien",
        "Nama",
        "Alamat",
        "No Hp",
        "Tgl",
        "jenis Kelamin"
    };
tabmode = new DefaultTableModel(null, Baris);
    String cariitem = jcrps.getText();
     try {
    String sql = "SELECT * FROM barang WHERE ID_Pasien LIKE '%" + cariitem + "%' OR Nama LIKE '%" + cariitem + "%' ORDER BY ID_Pasien ASC";


        Statement stat = conn.createStatement();
        ResultSet hasil = stat.executeQuery(sql);

        while (hasil.next()) {
           tabmode.addRow(new Object[]{
                hasil.getString(1),
                hasil.getString(2),
                hasil.getString(3),
                hasil.getString(4),
                hasil.getString(5)
            });
        }

      jtable.setModel(tabmode);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,
            "Data gagal dipanggil: " + e);
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnm = new javax.swing.JTextField();
        txtalm = new javax.swing.JTextField();
        txthp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txttgl = new javax.swing.JTextField();
        txtra = new javax.swing.JTextField();
        jspn = new javax.swing.JButton();
        jubh = new javax.swing.JButton();
        jhps = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        jcari = new javax.swing.JTextField();
        jcrps = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 255, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel4.setText("Form Pasien");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 34, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel5.setText("ID Pasien");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 98, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel6.setText("Nama");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 144, -1, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel7.setText("Alamat");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 198, -1, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel8.setText("No HP");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 256, -1, -1));

        txtid.setText("jTextField1");
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 97, -1, -1));

        txtnm.setText("jTextField2");
        add(txtnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 143, -1, -1));

        txtalm.setText("jTextField3");
        add(txtalm, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 197, -1, -1));

        txthp.setText("jTextField4");
        add(txthp, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 255, -1, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel1.setText("Tanggal Lahir");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 300, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel2.setText("Riwayat Alergi");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 344, -1, -1));

        txttgl.setText("jTextField5");
        add(txttgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 299, -1, -1));

        txtra.setText("jTextField6");
        add(txtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 343, -1, -1));

        jspn.setText("simpan");
        jspn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jspnActionPerformed(evt);
            }
        });
        add(jspn, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 80, -1, -1));

        jubh.setText("ubah");
        jubh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jubhActionPerformed(evt);
            }
        });
        add(jubh, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, -1, -1));

        jhps.setText("hapus");
        jhps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jhpsActionPerformed(evt);
            }
        });
        add(jhps, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, -1, -1));

        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Pasien", "Nama", "Alamat", "No HP", "Tanggal Lahir", "Riwayat Alergi"
            }
        ));
        jScrollPane1.setViewportView(jtable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 590, 130));

        jcari.setText("jTextField1");
        add(jcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 310, -1));

        jcrps.setText("cari");
        jcrps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcrpsActionPerformed(evt);
            }
        });
        add(jcrps, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void jspnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jspnActionPerformed
 String sql ="insert into barang value (?,?,?,?,?)";
try{
    PreparedStatement stat = conn.prepareStatement(sql);
    stat.setString(1, txtid.getText());
    stat.setString(2, txtnm.getText());
    stat.setString(3, txtalm.getText());
    stat.setString(4, txthp.getText());
    stat.setString(5, txttgl.getText());
    stat.setString(6, txtra.getText());
    stat.executeUpdate();
    JOptionPane.showMessageDialog(null,"data berhasil di simpan");
    txtid.requestFocus();
}
catch (SQLException e){
    JOptionPane.showMessageDialog(null,"data gagal disimpan"+ e);
}
datatable();        // TODO add your handling code here:
    }//GEN-LAST:event_jspnActionPerformed

    private void jubhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jubhActionPerformed
try{
       String sql ="update barang set ID Pasien=?,Nama=?,Alamat=?,No HP=?,Tgl=?,Jenis Kelamin=? where ID Pasien='"+txtid.getText()+"'";
        PreparedStatement stat = conn.prepareStatement(sql);
        stat.setString(1, txtid.getText());
        stat.setString(2, txtnm.getText());
        stat.setString(3, txtalm.getText());
        stat.setString(4, txthp.getText());
        stat.setString(5, txttgl.getText());
        stat.setString(6, txtra.getText());
        
         stat.executeUpdate();
          JOptionPane.showMessageDialog(null,"data berhasil di ubah");
          kosong();
          txtid.requestFocus();
   }
   catch(SQLException e){
       JOptionPane.showMessageDialog(null," data gagal di ubah"+e);
       
   }
   datatable();        // TODO add your handling code here:
    }//GEN-LAST:event_jubhActionPerformed

    private void jcrpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcrpsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcrpsActionPerformed

    private void jhpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jhpsActionPerformed
       int ok=JOptionPane.showConfirmDialog(null,"hapus","konformasi dialog",JOptionPane.YES_NO_CANCEL_OPTION);   
if(ok==0){
    String sql ="delete from barang where kd_brg ="+txtid.getText()+"'";
    try{
      PreparedStatement stat = conn.prepareStatement(sql);
      stat.executeUpdate();
      kosong();
          txtid.requestFocus();
    }
    catch(SQLException e){
        JOptionPane.showMessageDialog(null, "data gagal dihapus"+e);
    }
    datatable();
}
    }//GEN-LAST:event_jhpsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jcari;
    private javax.swing.JButton jcrps;
    private javax.swing.JButton jhps;
    private javax.swing.JButton jspn;
    private javax.swing.JTable jtable;
    private javax.swing.JButton jubh;
    private javax.swing.JTextField txtalm;
    private javax.swing.JTextField txthp;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnm;
    private javax.swing.JTextField txtra;
    private javax.swing.JTextField txttgl;
    // End of variables declaration//GEN-END:variables

}
