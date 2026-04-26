package koneksi;
import java.sql.*;
public class koneksi {
    private Connection koneksi;
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Berhasil Konek");
        }
        catch(ClassNotFoundException ex) {
            System.out.println("Gagal Koneksi" +ex);
        }
        String url = "jdbc:mysql://localhost/nw_aestetic";
        try{
            koneksi=DriverManager.getConnection(url,"root","");
            System.out.println("Berhasil Koneksi database");
        }
        catch(SQLException ex){
            System.out.println("Gagal koneksi database"+ex);
        }
        return koneksi;
    }
}