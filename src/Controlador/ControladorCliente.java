/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Procesos.ProcesosFormCliente;
import Vista.FormCliente;

/**
 *
 * @author Antonio
 */
public class ControladorCliente {
    FormCliente vista;
    Cliente cli;
    public ControladorCliente(FormCliente fcli){
        vista=fcli;
        ProcesosFormCliente.Presentacion(fcli);
    }
}
