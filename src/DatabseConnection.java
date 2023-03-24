import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabseConnection {

    public Connection dbConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java34", "root", "Spiegoshana");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM phoneBook");
            while (rs.next()){
                System.out.printf("name:  %s phoneNo: %s email: %s  \n",
                        rs.getString(1),rs.getString(2),rs.getString(3));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }



}
