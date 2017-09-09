/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.consultoriomedicogui.Controller;

import com.itla.consultoriomedicobusiness.entity.Medico;
import com.itla.consultoriomedicobusiness.enums.ServiceEnum;
import com.itla.consultoriomedicobusiness.services.MedicoService;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;



/**
 * FXML Controller class
 *
 * @author JoseLuis
 */
public class FXMLRegistroMedicoControllerController implements Initializable {
    
     
    @FXML private TextField txtNombre;
    @FXML private TextField txtApellido;
    @FXML private TextField txtEspecialidad;
    @FXML private TextField txtUniversidad;
    @FXML private TextField txtExequatur;
    @FXML private TextField txtDireccion;
    @FXML private TextField txtTelefono;
    @FXML private TextField txtCorreo;
    
    private ApplicationContext context;
    

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        context = new ClassPathXmlApplicationContext("/Spring/applicationContext.xml");
      
    } 
    
     @FXML
    public void guardarMedico(ActionEvent event) {
        
     
        
        MedicoService medicoService=(MedicoService) 
                context.getBean(ServiceEnum.MEDICO_SERVICE.getValue());
             
   
        
        System.out.println("Entraste aqui");
        Medico medico =new Medico();
        medico.setNombre(txtNombre.getText());
        medico.setApellido(txtApellido.getText());
        medico.setEspecialidad(txtEspecialidad.getText());
        medico.setUniversidad(txtUniversidad.getText());
        medico.setExequatur(txtExequatur.getText());
        medico.setDireccion(txtDireccion.getText());
        medico.setTelefono(txtTelefono.getText());        
        medico.setCorreo(txtCorreo.getText());
        
        medicoService.guardarMedico(medico);
          
        
        System.out.println("Done!!");
        
        JOptionPane.showMessageDialog(null, "Guardado con exito");
        
        txtNombre.setText("");
        txtApellido.setText("");
        txtEspecialidad.setText("");
        txtEspecialidad.setText("");
        txtUniversidad.setText("");
        txtExequatur.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        
    }
    
}



