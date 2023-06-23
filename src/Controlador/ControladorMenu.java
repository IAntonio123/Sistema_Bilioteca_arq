/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Usuario;
import Vista.FormInicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Antonio
 */
public class ControladorMenu implements ActionListener{
    Usuario usuario;
    FormInicio vista;
    public ControladorMenu(FormInicio fi,Usuario user){
        vista=fi;
        fi.setExtendedState(JFrame.MAXIMIZED_BOTH);
        fi.setDefaultCloseOperation(fi.EXIT_ON_CLOSE);
        fi.setTitle("Biblioteca");
        fi.setVisible(false);
        fi.setLocationRelativeTo(null);
        usuario=user;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
