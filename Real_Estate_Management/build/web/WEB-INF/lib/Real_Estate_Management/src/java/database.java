

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class database {
    
    
    Connection cn=null;
    Statement st=null;
     
   String connectdb()
    {
    try
    {
       Class.forName("com.mysql.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_realestate", "root", "root");
       return "Database Connected";
    }catch(Exception ex)
            {
               return(ex.toString());
            }
    }
    
    
    String Insert(String sql,String msg)
    {
     try
     {
       st=cn.createStatement();
       st.executeUpdate(sql);
       return(msg);
     }catch(Exception ex)
     {
            return(ex.toString());
     }
    }
     String Delete(String sql,String msg)
    {
     try
     {
       st=cn.createStatement();
       st.executeUpdate(sql);
       return(msg);
     }catch(Exception ex)
     {
            return(ex.toString());
     }
    }
     String Update(String sql,String msg)
    {
     try
     {
       st=cn.createStatement();
       st.executeUpdate(sql);
       return(msg);
     }catch(Exception ex)
     {
            return(ex.toString());
     }
    }
    
}
