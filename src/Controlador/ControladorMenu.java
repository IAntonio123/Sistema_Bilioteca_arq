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
    
    }
}
