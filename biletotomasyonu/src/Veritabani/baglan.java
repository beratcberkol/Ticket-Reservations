package Veritabani;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.omg.CosNaming._BindingIteratorImplBase;

/**
 *
 * @author Berat Berkol
 */
public class baglan {
    
    private Connection _con;
    private String _dbname="obus";
    private String _dbusername="root";
    private String _dbpassword="berkol01";
    private String _host="jdbc:mysql://localhost:3306/";
    private String _drivername="com.mysql.jdbc.Driver";
    
    
    public baglan()
    {
        try {
         Class.forName(_drivername).newInstance();
        setCon((Connection)DriverManager.getConnection(_host+ _dbname,_dbusername,_dbpassword));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Hata var:"+e.getMessage());
        }
      
    }

    public Connection getCon() {
        return _con;
    }

    public void setCon(Connection _con) {
        this._con = _con;
    }
    
}