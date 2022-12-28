package com.mycompany.appregistropersonal.persistencia;

import com.mycompany.appregistropersonal.logica.Persona;
import com.mycompany.appregistropersonal.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorPersistencia {
    
    PersonaJpaController personaJpa = new PersonaJpaController();

    public void guardar(Persona persona) {
        
        //Crear en la BD Persona
        personaJpa.create(persona);
        
    }

    public List<Persona> traerPersona() {
        
        //Busca todos los registros y retorne.
        return personaJpa.findPersonaEntities();
        
    }

    public void borrarPersona(int Num_persona) {
        
        try {
            personaJpa.destroy(Num_persona);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Persona traerPersona(int Num_persona) {
        return personaJpa.findPersona(Num_persona);
    }

    public void modificarPersona(Persona perso) {
        
        try {
            personaJpa.edit(perso);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
}
