/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Libro;
import Procesos.ProcesosFormLibro;
import Vista.FormLibro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Antonio
 */
public class ControladorLibro implements ActionListener{
    FormLibro vista;
    Libro cli;
    public ControladorLibro(FormLibro flib){
        vista=flib;
        ProcesosFormLibro.Presentacion(flib);
        vista.btnNuevoLibro.addActionListener(this);
        vista.btnPaso2.addActionListener(this);
        vista.btnVolverPaso1.addActionListener(this);
        vista.btnRegistrar.addActionListener(this);
        vista.btnVolverInicio2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==vista.btnNuevoLibro){
           vista.tbpLibro.setSelectedIndex(1);
       }
       if(e.getSource()==vista.btnPaso2){
           vista.tbpLibro.setSelectedIndex(2);
       }
       if(e.getSource()==vista.btnVolverPaso1){
           vista.tbpLibro.setSelectedIndex(3);
       }
       if(e.getSource()==vista.btnRegistrar){
           vista.tbpLibro.setSelectedIndex(3);
       }
       if(e.getSource()==vista.btnVolverInicio2){
           vista.tbpLibro.setSelectedIndex(0);
       }
    }
    
}
