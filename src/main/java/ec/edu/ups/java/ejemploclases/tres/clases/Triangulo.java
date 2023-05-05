/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemploclases.tres.clases;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String tipo) {
        super(tipo);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.base*this.altura/2;
    }
    
    
}
