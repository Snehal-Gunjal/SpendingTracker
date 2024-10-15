
package DB;

import java.sql.*;
import javax.swing.*;

public class DB_Connect 
{
    public static Connection co ;
    public static Statement st ;
    
    static
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            co = DriverManager.getConnection("jdbc:mysql://localhost:3306/spending_db","root","root");
            st =co.createStatement();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
}
