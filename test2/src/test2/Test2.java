    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.time.*;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

/**
 *
 * @author PANACHAITECHAPHAISAL
 */
public class Test2 {

    static String db_name = "myuser";
    static String User = "root";
    static String hostname = "localhost:3306";
    static String db_driver = "com.mysql.jdbc.Driver";

    public static Connection connectDB() {
        try {
            Class.forName(db_driver);
            String url = "jdbc:mysql://" + hostname + "/" + db_name + "?useLegacyDatetimeCode=false&serverTimezone=UTC";
            Connection connection = DriverManager.getConnection(url, User, "");
            return connection;
        } catch (Exception e) {
        }
        return null;
    }

}
