/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection1;

import java.sql.Connection;
import java.sql.DriverManager;




/**
 *
 * @author Dell
 */
public  class DbConnection1 
{
   static Connection con;
    
    /**
     *
     * @return
     */
    public static Connection getConnect()
    {
      try
      {
          Class.forName("com.mysql.jdbc.Driver");
          
           con= DriverManager.getConnection("jdbc:mysql:///address_book", "root", "root");
          
           
      }
       catch(Exception e)
       {
           
       }
        return con;
        
    }
    
    
}
