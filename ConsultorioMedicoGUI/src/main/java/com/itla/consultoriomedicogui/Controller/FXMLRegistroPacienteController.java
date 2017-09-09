/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.consultoriomedicogui.Controller;

import com.itla.consultoriomedicobusiness.entity.Paciente;
import com.itla.consultoriomedicobusiness.enums.ServiceEnum;
import com.itla.consultoriomedicobusiness.services.PacienteService;

import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javax.swing.JOptionPane;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

/**
 * FXML Controller class
 *
 * @author JoseLuis
 */

public class FXMLRegistroPacienteController implements Initializable {

    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtSexo;
    @FXML
    private TextField txtEdad;
    @FXML
    private TextField txtCedula;
    @FXML
    private TextField txtTelefono;
    @FXML
    private TextField txtDireccion;
    @FXML
    private TextField txtCorreo;
    @FXML
    private TextField txtDescripcion;

    private ApplicationContext context;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        context = new ClassPathXmlApplicationContext("/Spring/applicationContext.xml");

        
    }

    @FXML
    public void guardarPaciente(ActionEvent event) {
        

        PacienteService pacienteService = (PacienteService) 
                context.getBean(ServiceEnum.PACIENTE_SERVICE.getValue());

        Paciente paciente = new Paciente();
        paciente.setNombre(txtNombre.getText());
        paciente.setApellido(txtApellido.getText());
//      paciente.setSexo(txtSexo.getText());
        paciente.setEdad(Integer.parseInt(txtEdad.getText()));
        paciente.setCedula(txtCedula.getText());
        paciente.setTelefono(txtTelefono.getText());
        paciente.setDireccion(txtDireccion.getText());
        paciente.setCorreo(txtCorreo.getText());
        paciente.setDescripcion(txtDescripcion.getText());

        
        pacienteService.guardarPaciente(paciente);
        
        
        JOptionPane.showMessageDialog(null, "Guardado con exito");

    }

}
