package koneksi;
public class Session {
    private static String username;
    private static String role;
    public static void setCurrentUser(String u, String r) {
        username = u;
        role = (r == null) ? "admin" : r;
    }
    public static String getUsername() {
        return username;
    }
    public static String getRole() {
        return role;
    }
    public static boolean isAdmin() {
        return "admin".equalsIgnoreCase(role);
    }
    public static boolean isDokter() {
        return "dokter".equalsIgnoreCase(role);
    }
    public static boolean isKasir() {
        return "kasir".equalsIgnoreCase(role);
    }
    public static void clear() {
        username = null;
        role = null;
    }
}
