/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.abadjose.suquilandasamantha.Controladores;

import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Cantante;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Compositor;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Disco;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class ControladorPersona implements IControlador {
    private List<Persona> personas;

    public ControladorPersona() {
        personas = new ArrayList<>();
    }

    @Override
    public void create(Object Persona) {
        
        if (Persona instanceof Cantante) {
            personas.add((Cantante) Persona);
        }
        if (Persona instanceof Compositor){
            personas.add((Compositor) Persona);
        }
    }

    @Override
    public Persona read(Object Disco) {
        return null;
    }

    @Override
    public void update(Object Persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Object Persona) {
        
    }

    @Override
    public void list() {
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
    }
    
    
}
    
    
    