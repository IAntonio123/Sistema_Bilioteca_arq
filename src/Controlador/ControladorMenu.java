/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Formato.CentrarForma;
import Modelo.Usuario;
import Vista.FormInicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import Main.Main;
import Vista.FormAutor;
import Vista.FormCliente;
import Vista.FormLibro;
import Vista.FormMostrarLibros;
import Vista.FormMostrarPrestamos;
import Vista.FormMostrarVentas;
import Vista.FormPrestamo;
import Vista.FormVenta;
/**
 *
 * @author Antonio
 */
public class ControladorMenu implements ActionListener{
    Usuario usuario;
    FormInicio vista;
    public ControladorMenu(FormInicio fi,Usuario user){
        vista=fi;
        vista.jmFormCliente.addActionListener(this);
        vista.jmFormLibro.addActionListener(this);
        vista.jmFormAutor.addActionListener(this);
        vista.jmFormVenta.addActionListener(this);
        vista.jmFormPrestamo.addActionListener(this);
        vista.jmMostrarLibros.addActionListener(this);
        vista.jmMostrarPrestamos.addActionListener(this);
        vista.jmMostrarVentas.addActionListener(this);
        
        fi.setExtendedState(JFrame.MAXIMIZED_BOTH);
        fi.setDefaultCloseOperation(fi.EXIT_ON_CLOSE);
        fi.setTitle("Biblioteca");
        fi.setVisible(false);
        fi.setLocationRelativeTo(null);
        usuario=user;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.jmFormCliente){
            Main.fcli=new FormCliente();
            Main.controlfcli=new ControladorCliente(Main.fcli);
            vista.jdpContenedor.add(Main.fcli);
            CentrarForma.CPanel(vista.jdpContenedor, Main.fcli);
        } 
        if(e.getSource()==vista.jmFormLibro){
            Main.flib=new FormLibro();
            Main.controlflib=new ControladorLibro(Main.flib);
            vista.jdpContenedor.add(Main.flib);
            CentrarForma.CPanel(vista.jdpContenedor, Main.flib);
        } 
        if(e.getSource()==vista.jmFormAutor){
            Main.faut=new FormAutor();
            Main.controlfaut=new ControladorAutor(Main.faut);
            vista.jdpContenedor.add(Main.faut);
            CentrarForma.CPanel(vista.jdpContenedor, Main.faut);
        }
        
        if(e.getSource()==vista.jmFormVenta){
            Main.fvent=new FormVenta();
            Main.controlVent=new ControladorVenta(Main.fvent);
            vista.jdpContenedor.add(Main.fvent);
            CentrarForma.CPanel(vista.jdpContenedor, Main.fvent);
        } 
        if(e.getSource()==vista.jmFormPrestamo){
            Main.fprest=new FormPrestamo();
            Main.controlPrest=new ControladorPrestamo(Main.fprest);
            vista.jdpContenedor.add(Main.fprest);
            CentrarForma.CPanel(vista.jdpContenedor, Main.fprest);
        } 
        if(e.getSource()==vista.jmMostrarLibros){
            Main.fLisLib=new FormMostrarLibros();
            Main.controlfLisLib=new ControladorMostrarLibros(Main.fLisLib);
            vista.jdpContenedor.add(Main.fLisLib);
            CentrarForma.CPanel(vista.jdpContenedor, Main.fLisLib);
        } 
        if(e.getSource()==vista.jmMostrarPrestamos){
            Main.fLisPrest=new FormMostrarPrestamos();
            Main.controlLisPrest=new ControladorMostrarPrestamo(Main.fLisPrest);
            vista.jdpContenedor.add(Main.fLisPrest);
            CentrarForma.CPanel(vista.jdpContenedor, Main.fLisPrest);
        } 
        if(e.getSource()==vista.jmMostrarVentas){
            Main.fLisVent=new FormMostrarVentas();
            Main.controlfListVent=new ControladorMostrarVenta(Main.fLisVent);
            vista.jdpContenedor.add(Main.fLisVent);
            CentrarForma.CPanel(vista.jdpContenedor, Main.fLisVent);
        } 
    
    }
}
