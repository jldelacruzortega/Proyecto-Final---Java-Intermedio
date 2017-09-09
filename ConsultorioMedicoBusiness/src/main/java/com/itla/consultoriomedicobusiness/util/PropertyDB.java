/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.consultoriomedicobusiness.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoseLuis
 */
public class PropertyDB {  
    
    private PropertyDB() {}
    
    public static Properties getInstance(){
        
        Properties prop= new Properties();
        ClassLoader loader= Thread.currentThread().getContextClassLoader();
        InputStream input=loader.getResourceAsStream("jdbc-datasource.properties");
        
        try {
            prop.load(input);        
                      
        } catch (IOException ex) {
            Logger.getLogger(PropertyDB.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                input.close();
            }catch (IOException ex){
                 Logger.getLogger(PropertyDB.class.getName()).log(Level.SEVERE, null, ex);
                
            }
                
           
        }
        
        return prop;
        
        
        
        
        
    }
    
    
    
}
