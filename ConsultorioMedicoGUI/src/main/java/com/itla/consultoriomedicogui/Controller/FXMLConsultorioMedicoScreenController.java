/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.consultoriomedicogui.Controller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author JoseLuis
 */
public class FXMLConsultorioMedicoScreenController implements Initializable {
    
    @FXML private BorderPane mainLayout;
    /**
     * Initializes the controller class.
     */
      
      
      
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    
    
    
    @FXML
    public void CargarPaciente(ActionEvent evt) throws IOException{
    Parent rootPaciente = FXMLLoader.load(getClass().getResource("/fxml/FXMLRegistroPaciente.fxml"));
                   
    mainLayout.setCenter(rootPaciente);
               
    }
    
    @FXML
    public void CargarMedico(ActionEvent evt) throws IOException{
    Parent rootMedico = FXMLLoader.load(getClass().getResource("/fxml/FXMLRegistroMedicoController.fxml"));
                   
     mainLayout.setCenter(rootMedico);
               
    }
    
    @FXML
    public void CargarCita(ActionEvent evt) throws IOException{
    Parent rootCita = FXMLLoader.load(getClass().getResource("/fxml/FXMLRegistroCita.fxml"));
                   
     mainLayout.setCenter(rootCita);
               
    }

    @FXML
    public void CargarProcedimiento(ActionEvent evt) throws IOException{
    Parent rootProcedimiento = FXMLLoader.load(getClass().getResource("/fxml/FXMLRegistroProcedimiento.fxml"));
                   
     mainLayout.setCenter(rootProcedimiento);
               
    }
}
