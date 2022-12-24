package com.mycompany.appregistropersonal.persistencia;

import com.mycompany.appregistropersonal.logica.Persona;

public class ControladorPersistencia {
    
    PersonaJpaController personaJpa = new PersonaJpaController();

    public void guardar(Persona persona) {
        
        //Crear en la BD Persona
        personaJpa.create(persona);
        
    }
    
    
    
}
