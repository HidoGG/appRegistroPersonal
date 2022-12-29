package com.mycompany.appregistropersonal.logica;

import com.mycompany.appregistropersonal.persistencia.ControladorPersistencia;
import java.util.List;

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
        persona.setCategoria(cbmCategoriaPersona);
        
        controlPersis.guardar(persona);
        
    }

    public List<Persona> traerPersona() {
        
        return controlPersis.traerPersona(); 
        
    }

    public void borrarPersona(int Num_persona) {
    
        controlPersis.borrarPersona(Num_persona);
        
    }

    public Persona traerPersona(int Num_persona) {
       return controlPersis.traerPersona(Num_persona);
    }

    public void modificarPersona(Persona perso, String nombrePersona, String apellidoPersona, 
            String dniPersona, String cuitPersona, String cbmCategoriaPersona, String sueldoPersona, 
            String observaPersona) {
        
        perso.setNombre(nombrePersona);
        perso.setApellido(apellidoPersona);
        perso.setDNI(dniPersona);
        perso.setCUIL(cuitPersona);
        perso.setCategoria(cbmCategoriaPersona);
        perso.setSueldo(sueldoPersona);
        perso.setObservacon(observaPersona);
        
        //Modificar persona
        controlPersis.modificarPersona(perso);
        
    }
    
    
    
}
