/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.consultoriomedicobusiness.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoseLuis
 */
public class Test {
    
   
    private static String URL = "jdbc:mysql://localhost/consultoriodb";
    private static String USER = "root";
    private static String PASS = "#ApeSexx1766@";
    
   
    
    public static void main (String[] args) throws SQLException{
        Connection connection =  null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection =DriverManager.getConnection(URL, USER, PASS);
            Statement stm = connection.createStatement();
            String query = "SELECT * FROM Paciente";
            
            ResultSet res= stm.executeQuery(query);
            while(res.next()){
                System.out.println(res.getString(1)+""+ res.getString(2));
            }
            
           /*/String QUERY = "INSERT INTO profesor(nombre, apellido, correo)"
                            + "values('Juan','Martinez', 'jmartinez@gmail.com')";
            stm.executeUpdate(QUERY); */
            
            System.out.println("Done...");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                   
           }catch(SQLException ex){
               Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
           }finally{
                try {
                connection.close();
            }catch (SQLException ex){
          Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
     }

}


