/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

/**
 *
 * @author Asus
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Asus
 */
public class koneksi {
public koneksi() throws SQLException {
    bukakoneksi();
}
public Connection bukakoneksi()throws SQLException{
    Connection con=null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/koperasi","root","");
        System.out.println("connected");
        return con;
    }
    catch(SQLException se){
        System.out.println("No Connection open");
        return null;
    }
    catch(Exception ex){
        System.out.println("Cound not open connection");
        return null;
    }
}
    public static void main(String[] args) throws SQLException {
     koneksi a = new koneksi();
        System.out.println(a);
    }   
}




    

