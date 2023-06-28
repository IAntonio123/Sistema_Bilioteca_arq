/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procesos;

import Modelo.Cliente;
import Vista.FormCliente;

/**
 *
 * @author Antonio
 */
public class ProcesosFormCliente {
    public static void Presentacion(FormCliente fcli){
        fcli.setTitle("Cliente");
        fcli.setVisible(true);
    }
    public static void EstadoRegistro(FormCliente fcli){
        fcli.btnActualizar.setEnabled(false);
        fcli.btnRegistrar.setEnabled(true);
        fcli.btnConsultar.setEnabled(true);
    }
    
    public static void EstadoConsulta(FormCliente fcli){
        fcli.btnActualizar.setEnabled(true);
        fcli.btnRegistrar.setEnabled(false);
        fcli.btnConsultar.setEnabled(true);
    }
    
    public static void LimpiarEntradas(FormCliente fcli){
        fcli.txtDni.setText("");
        fcli.txtNombres.setText("");
        fcli.txtTelefono.setText("");
        fcli.txtDireccion.setText("");
        fcli.txtCorreo.setText("");
    }
    
    public static Cliente LeerDatos(FormCliente fcli){
        Cliente cli=new Cliente();
        cli.setDnicli(fcli.txtDni.getText());
        cli.setNombrecli(fcli.txtNombres.getText());
        cli.setTelefonocli(Integer.parseInt(fcli.txtTelefono.toString()));
        cli.setDireccioncli(fcli.txtDireccion.getText());
        cli.setCorreocli(fcli.txtCorreo.getText());
        return cli;
    }
}
