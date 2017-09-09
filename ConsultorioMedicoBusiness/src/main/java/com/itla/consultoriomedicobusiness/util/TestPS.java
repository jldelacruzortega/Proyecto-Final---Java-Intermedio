/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.consultoriomedicobusiness.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoseLuis
 */
public class TestPS {
    
    private static String URL = "jdbc:mysql://localhost/consultoriodb";
    private static String USER = "root";
    private static String PASS = "#ApeSexx1766@";
    private static String INSERT_QUERY= "INSERT INTO Paciente(nombre, apellido, correo)"
            + " values(?,?,?)";
    
    public static void main(String[] args) throws SQLException{
     System.out.println("Paciente registrado correctamente");
    }
    
}
