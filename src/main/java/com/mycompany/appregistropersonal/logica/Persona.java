package com.mycompany.appregistropersonal.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Persona implements Serializable {
    
    //Atributos de la clase
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int num_persona;
    private String nombre;
    private String apellido;
    private String DNI;
    private String CUIL;
    private String categoria;
    private String sueldo;
    private String observacon;
    
    //Contructor vacio
     public Persona() {
    }
     
    //Contructor con parametros 

    public Persona(int num_persona, String nombre, String apellido, String DNI, String CUIL, String categoria, String sueldo, String observacon) {
        this.num_persona = num_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.CUIL = CUIL;
        this.categoria = categoria;
        this.sueldo = sueldo;
        this.observacon = observacon;
    }
    
     
    //Metodos de la clase (get and set)
    public int getNum_persona() {
        return num_persona;
    }

    public void setNum_persona(int num_persona) {
        this.num_persona = num_persona;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCUIL() {
        return CUIL;
    }

    public void setCUIL(String CUIL) {
        this.CUIL = CUIL;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getObservacon() {
        return observacon;
    }

    public void setObservacon(String observacon) {
        this.observacon = observacon;
    }

}
