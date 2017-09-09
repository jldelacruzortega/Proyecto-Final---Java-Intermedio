/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.consultoriomedicogui.Controller;

import com.itla.consultoriomedicobusiness.entity.Cita;
import com.itla.consultoriomedicobusiness.enums.ServiceEnum;
import com.itla.consultoriomedicobusiness.services.CitaService;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * FXML Controller class
 *
 * @author JoseLuis
 */
public class FXMLRegistroCitaController implements Initializable {
    
    @FXML
    private TextField txtPaciente;
    @FXML
    private TextField txtMedico;
    @FXML
    private TextField txtProcedimiento;
    
    
    private ApplicationContext context;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
         context = new ClassPathXmlApplicationContext("/Spring/applicationContext.xml");

       
    }    
    
    public void guardarCita(ActionEvent event){
        
          CitaService citaService = (CitaService) 
                context.getBean(ServiceEnum.CITA_SERVICE.getValue());
          
       

        
        
        
    }
    
}
