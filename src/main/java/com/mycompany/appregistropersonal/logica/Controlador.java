package com.mycompany.appregistropersonal.logica;

import com.mycompany.appregistropersonal.persistencia.ControladorPersistencia;

public class Controlador {
    
    ControladorPersistencia controlPersis = new ControladorPersistencia();

    public void guardar(String nombrePersona, String apellidoPersona, String dniPersona, String cuitPersona, 
            String cbmCategoriaPersona, String sueldoPersona, String observaPersona) {
        
        //Creamos los datos de la persona
        Persona persona = new Persona();
        persona.setNombre(nombrePersona);
        persona.setApellido(apellidoPersona);
        persona.setDNI(dniPersona);
        persona.setCUIL(cuitPersona);
        persona.setSueldo(sueldoPersona);
        persona.setObservacon(observaPersona);
        persona.setCategoria(cuitPersona);
        
        controlPersis.guardar(persona);
        
    }
    
    
    
}
