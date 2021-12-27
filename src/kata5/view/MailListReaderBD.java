package kata5.view;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import kata5.model.Mail;

public class MailListReaderBD {
    public static List<Mail> listaEmail = new ArrayList<Mail> ();
    
    public List<Mail> read(String dbName){
        String url = "jdbc:sqlite:" + dbName;
        Connection conn = null;
        String sql = "SELECT * FROM EMAIL";
        try{
            conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                String email = rs.getString("mail");
                if (email.contains("@")){
                    listaEmail.add(new Mail(email));
                }
            }
        } catch (SQLException e) { 
            System.out.println(e.getMessage());
        }
        return listaEmail;
    }
}
