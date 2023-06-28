/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Venta;
import Procesos.ProcesosFormVenta;
import Vista.FormVenta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Antonio
 */
public class ControladorVenta implements ActionListener{
    FormVenta vista;
    Venta vent;
    public ControladorVenta(FormVenta fvent){
        vista=fvent;
        ProcesosFormVenta.Presentacion(fvent);
        vista.btnAgregar.addActionListener(this);
        vista.btnPaso2.addActionListener(this);
        vista.btnRegistrarVenta.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.btnAgregar){
           vista.tbpVenta.setSelectedIndex(1);
       }
       if(e.getSource()==vista.btnPaso2){
           vista.tbpVenta.setSelectedIndex(2);
       }
       if(e.getSource()==vista.btnRegistrarVenta){
           vista.tbpVenta.setSelectedIndex(3);
       }
    }
}
