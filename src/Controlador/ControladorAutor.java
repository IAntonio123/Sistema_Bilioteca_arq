/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Autor;
import Procesos.ProcesosFormAutor;
import Vista.FormAutor;

/**
 *
 * @author Antonio
 */
public class ControladorAutor {
    FormAutor vista;
    Autor cli;
    public ControladorAutor(FormAutor faut){
        vista=faut;
        ProcesosFormAutor.Presentacion(faut);
    }
}
