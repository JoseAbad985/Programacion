/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.practica02.abadjose.suquilandasamantha.Controladores;

import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Persona;

/**
 *
 * @author ESTUDIANTE
 */
public interface IControlador {
    public abstract void create(Object Persona);
    public abstract Persona read(Object Persona);
    public abstract void update(Object Persona);
    public abstract void delete(Object Persona);
    public abstract void list();
    
}