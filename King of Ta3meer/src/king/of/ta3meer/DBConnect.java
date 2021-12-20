/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package king.of.ta3meer;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author kamal
 */
public class DBConnect {
    
    public Connection connect(){
        
        Connection conn = null;
        String sql = new String();
        try{
            try {
                Class.forName("org.sqlite.JDBC");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            }
            String url ="jdbc:sqlite:D:/Projects/KingOfTa3meer/KoT.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Connection To SqLite has been established .");
 
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());    
        }
        return conn;
    }//end of connect
    public int close(Connection conn){
       try {  
                if (conn != null) {  
                    conn.close();
                    System.out.println("Connection To SqLite has been Closed .");
                }  
            } catch (SQLException ex) {  
                System.out.println(ex.getMessage());
                return 1;
            }  
        return 0;
    }
    

    public static void main(String[] args){
        //calling in main
        
    }
    
   
}
