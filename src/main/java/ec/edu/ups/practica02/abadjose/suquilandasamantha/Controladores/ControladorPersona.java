/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.abadjose.suquilandasamantha.Controladores;

import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Cancion;
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

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    public void imprimir () {
        for (Persona persona: personas) {
            System.out.println(persona);
        }
    }
    public Persona buscarPorNombreDeDisco(String valor) {
        for (Persona persona:personas) {
            if(persona instanceof Cantante) {
                Cantante cantanteCast = (Cantante) persona;
                    for(Disco disco : cantanteCast.getDiscografia()){
                        if(disco.getNombre().equals(valor)) {
                            System.out.println(persona);
                            return persona;
                        }
                    }
            }
        }
    return null;  
 }
    public Persona buscarPorTituloDeCancion(String valor) {
        for (Persona persona:personas) {
            if(persona instanceof Compositor) {
                Compositor compositorCast = (Compositor) persona;
                    for(Cancion cancion : compositorCast.getCancionesTop100Billboard()){
                        if(cancion.getTitulo().equals(valor)) {
                            System.out.println(persona);
                            return persona;
                        }
                    }
            }
        }
    return null;  
 }
    public Persona buscarPorCodigoCantante(int codigo) {
        for (Persona persona:personas) {
            if(persona instanceof Cantante) {
                Cantante cantanteCast = (Cantante) persona;
                        if(cantanteCast.getCodigo()==codigo) {
                            return persona;
                        }
                    }
            }
    return null;  
 }
    public Persona buscarPorCodigoCompositor(int codigo) {
        for (Persona persona:personas) {
            if(persona instanceof Compositor) {
                Compositor compositorCast = (Compositor) persona;
                        if(compositorCast.getCodigo() == codigo) {
                            return persona;
                        }
                    }
            }
    return null;  
 }

    

    @Override
    public void create(Persona objec) {
        personas.add((Persona)objec);
        }

    @Override
    public Persona read(Persona objec) {
        if (objec.getNombre()instanceof String) {
            String nombre = (String) objec.getNombre();
            for (Persona persona : personas) {
                if(persona.getNombre().equals(nombre)) {
                    return persona;
                }
            }
        }
        return null;
    }

    @Override
    public void update(Persona objec) {
        String nombre = ((Persona)objec).getNombre();
        for(int i = 0; i<personas.size();i++) {
            Persona persona = personas.get(i);
            if (persona.getNombre().equals(nombre)) {
                personas.set(i, (Persona)objec);
                break;
            }
        }
        
    }

    @Override
    public void delete(Persona objec) {
        for (int i = 0;i<personas.size();i++ ) {
            Persona persona = personas.get(i);
            if (persona.equals((Persona)objec)) {
                personas.remove(i);
                break;
            }
        }
    }

    
    
    @Override
        public String toString() {
            return "ControladorPersona{" + "personas=" + personas + '}';
    }
}
