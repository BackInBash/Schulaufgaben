
import java.security.MessageDigest;
import java.sql.*;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author
 */
public class Login {

    /**
     * @param args the command line arguments
     */
    public static String sha256(String base) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(base.getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer();

            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void main(String[] args) {
        try {
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            // handle the error
        }

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://[Database IP]/[Database Name]", "Username", "Password");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Login");

            Scanner s = new Scanner(System.in);
            while (true) {
                System.out.println("Optionen: \n L Login \n N Neuen Benutzer anlegen \n E Programm Beenden \n U Benutzer Optionen");
                boolean isLogin = false;
                switch (s.next()) {
                    case "L":
                        System.out.println("Bitte Usernamen eingeben: ");
                        String user = s.next();
                        System.out.println("Bitte Passwort eingeben: ");
                        String password = sha256(s.next());
                        boolean isFalse = true;
                        while (rs.next()) {
                            if (rs.getString("Username").equals(user)) {
                                if (rs.getString("Passwort").equals(password)) {
                                    System.out.println("Login Erfolgreich!");
                                    isFalse = false;
                                    isLogin = true;
                                } else {
                                    System.out.println("Passwort falsch");
                                    isFalse = false;
                                }
                            }
                        }
                        if (isFalse) {
                            System.out.println("Username wurde nicht gefunden");
                        }
                        break;
						
                    case "N":
                        System.out.println("Bitte Usernamen eingeben: ");
                        String Nuser = s.next();
                        System.out.println("Bitte Passwort eingeben: ");
                        String Npassword = sha256(s.next());

                        PreparedStatement stm = conn.prepareStatement("INSERT INTO Login(Username, Passwort) VALUES (?, ?)");
                        stm.setString(1, Nuser);
                        stm.setString(2, Npassword);
                        stm.executeUpdate();
                        System.out.println("User " + Nuser + " wurde angelegt");

                    case "E":
                        System.exit(0);
						
                    case "U":
                        System.out.println("Bitte Usernamen eingeben: ");
                        String Uuser = s.next();
                        System.out.println("Bitte Passwort eingeben: ");
                        String Upassword = sha256(s.next());
                        boolean UisFalse = true;
                        while (rs.next()) {
                            if (rs.getString("Username").equals(Uuser)) {
                                if (rs.getString("Passwort").equals(Upassword)) {
                                    System.out.println("Login Erfolgreich!");
                                    UisFalse = false;
                                    isLogin = true;
                                    while (true) {
                                        System.out.println("User Optionen: \n D User Löschen");
                                        switch (s.next()) {
                                            case "D":
                                                PreparedStatement Dstm = conn.prepareStatement("DELETE FROM Login WHERE Username = ? AND Passwort = ?");
                                                Dstm.setString(1, Uuser);
                                                Dstm.setString(2, Upassword);
                                                Dstm.executeUpdate();
                                                System.out.println("User " + Uuser + " wurde Gelöscht");
                                                break;
                                        }
                                        break;
                                    }
                                } else {
                                    System.out.println("Passwort falsch");
                                    isFalse = false;
                                }
                            }
                            break;
                        }
                        if (UisFalse) {
                            System.out.println("Username wurde nicht gefunden");
                        }
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
