/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.consultoriomedicogui.Controller;


import com.itla.consultoriomedicobusiness.entity.Procedimiento;
import com.itla.consultoriomedicobusiness.enums.ServiceEnum;
import com.itla.consultoriomedicobusiness.services.ProcedimientoService;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * FXML Controller class
 *
 * @author JoseLuis
 */
public class FXMLRegistroProcedimientoController implements Initializable {
    
    @FXML private TextField txtDescripcion;
    
      private ApplicationContext context;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        context = new ClassPathXmlApplicationContext("/Spring/applicationContext.xml");
      
    }    
    
    public void guardarProcedimiento(ActionEvent event){
        
        
        ProcedimientoService procedimientoService = (ProcedimientoService)
                context.getBean(ServiceEnum.PROCEDIMIENTO_SERVICE.getValue());
        
         System.out.println("Entraste aqui");
        Procedimiento procedimiento = new Procedimiento();
        procedimiento.setDescripcion(txtDescripcion.getText());
       
        procedimientoService.guardarProcedimiento(procedimiento);
        
          System.out.println("Done!!");
        
        JOptionPane.showMessageDialog(null, "Guardado con exito");
        
        txtDescripcion.setText("");
    }
}
