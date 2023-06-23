/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procesos;

import Modelo.Mascota;
import Vista.FormLibro;

/**
 *
 * @author Antonio
 */
public class ProcesosFormMascota {
    public static void Presentacion(FormLibro fmasc){
        fmasc.setTitle("Mascota");
        fmasc.txtcodigo.setEnabled(false);
        fmasc.setVisible(true);
    }
    public static void EstadoRegistro(FormLibro fmasc){
        fmasc.btnActualizar.setEnabled(false);
        fmasc.btnRegistrar.setEnabled(true);
        fmasc.btnConsultar.setEnabled(true);
    }
    
    public static void EstadoConsulta(FormLibro fmasc){
        fmasc.btnActualizar.setEnabled(true);
        fmasc.btnRegistrar.setEnabled(false);
        fmasc.btnConsultar.setEnabled(true);
    }
    
    public static void LimpiarEntradas(FormLibro fmasc){
        fmasc.txtcodigo.setText("");
        fmasc.txtNombre.setText("");
        fmasc.txtPeso.setText("");
        fmasc.txtDni.setText("");
        fmasc.cbxSexo.setSelectedIndex(0);
        fmasc.cbxTipoAnimal.setSelectedIndex(0);
        
        fmasc.lblNombresCliente.setText("");
        fmasc.spnEdad.setValue(0);
    }
    
    public static Mascota LeerDatos(FormLibro fmasc){
        Mascota pet=new Mascota();
        pet.setCodigoMascota(fmasc.txtcodigo.getText());
        pet.setDniPropietario(fmasc.txtDni.getText());
        pet.setEdad(Integer.parseInt(fmasc.spnEdad.getValue().toString()));
        pet.setNombre(fmasc.txtNombre.getText());
        pet.setPeso(Double.parseDouble(fmasc.txtPeso.getText()));
        pet.setSexo(fmasc.cbxSexo.getSelectedItem().toString());
        return pet;
        
        
    }
}
