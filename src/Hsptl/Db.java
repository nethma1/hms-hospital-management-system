/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hsptl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


/**
 *
 * @author HP
 */
public class Db {
    public static Statement getStatement(){
     try{
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hsptl","root","");
        Statement sta=con.createStatement();
        return sta;
        }catch(Exception e){
            e.printStackTrace();
            return null;
    }                                  
        
        
        }
    
}
