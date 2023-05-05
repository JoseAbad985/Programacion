/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.java.ejemploclases.tres;

import ec.edu.ups.java.ejemploclases.tres.clases.Circulo;
import ec.edu.ups.java.ejemploclases.tres.clases.Cuadrado;
import ec.edu.ups.java.ejemploclases.tres.clases.Figura;
import ec.edu.ups.java.ejemploclases.tres.clases.Polimorfismo;
import ec.edu.ups.java.ejemploclases.tres.clases.Rectangulo;
import ec.edu.ups.java.ejemploclases.tres.clases.Triangulo;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class JavaEjemploClasesTres {

    public static void main(String[] args) {
        Triangulo t = new Triangulo (3.45, 5.5, "Triangulo");
        Cuadrado c = new Cuadrado (4.4, "Cuadrado");
        Circulo circu = new Circulo (5, "Circulo");
        Rectangulo r = new Rectangulo (5, 7, "Rectangulo");
        
        Polimorfismo p = new Polimorfismo ();
        p.polimorfismo(c);
        p.polimorfismo(t);
        p.polimorfismo(r);
        p.polimorfismo(circu);

}
}
