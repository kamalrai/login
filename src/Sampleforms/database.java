package Sampleforms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class database {
    Connection conn;
    Statement st;
    int val;

    public database() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop_dbms", "root", "@9869540717a");
            if (this.conn != null) {
                System.out.println("Your Database is Connected Now");
            }

            this.st = this.conn.createStatement();
        } catch (Exception var2) {
            var2.printStackTrace();
        }

    }

    public int insert(String query) {
        try {
            this.val = this.st.executeUpdate(query);
        } catch (SQLException var3) {
            var3.printStackTrace();
        }

        return this.val;
    }

    public static void main(String[] arge) {
        new database();
    }
}
