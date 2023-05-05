/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemploclases.tres.clases;

/**
 *
 * @author samanthasuquilandaquilli
 */
public abstract class Figura {
    String tipo;

    public Figura(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    public abstract double calcularArea();

    @Override
    public String toString() {
        return "Figura{" + "tipo=" + tipo + '}';
    }
    
    
}
