/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Modelo.Prestamo;
import Procesos.ProcesoFormPrestamo;
import Procesos.ProcesosFormCliente;
import Vista.FormCliente;
import Vista.FormPrestamo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Antonio
 */
public class ControladorPrestamo implements ActionListener{
    FormPrestamo vista;
    Prestamo prest;
    public ControladorPrestamo(FormPrestamo fprest){
        vista=fprest;
        ProcesoFormPrestamo.Presentacion(fprest);
        vista.btnAgregar.addActionListener(this);
        vista.btnPaso2.addActionListener(this);
        vista.btnPaso3.addActionListener(this);
        vista.btnRehgistrarPrestamo.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==vista.btnAgregar){
           vista.tbpPrestamo.setSelectedIndex(1);
       }
       if(e.getSource()==vista.btnPaso2){
           vista.tbpPrestamo.setSelectedIndex(2);
       }
       if(e.getSource()==vista.btnPaso3){
           vista.tbpPrestamo.setSelectedIndex(3);
       }
       if(e.getSource()==vista.btnRehgistrarPrestamo){
           vista.tbpPrestamo.setSelectedIndex(4);
       }    }
}
