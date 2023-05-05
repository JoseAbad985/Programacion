/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases;
import java.security.Guard;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author ESTUDIANTE
 */
public class Compositor extends Persona{
    // Atributos de la clase
    private int numeroDeComposiciones;
    //Atributos de la relacion de composición
    private List<Cancion> cancionesTop100Billboard;
    private List<Cantante> clientes;
    
    
    //Constructor con todos los parametros
    public Compositor(int numeroDeComposiciones, List<Cancion> cancionesTop100Billboard, List<Cantante> clientes, int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario) {
        super(codigo, nombre, apellido, edad, nacionalidad, salario);
        this.numeroDeComposiciones = numeroDeComposiciones;
        this.cancionesTop100Billboard = cancionesTop100Billboard;
        this.clientes = clientes;
    }
    
    
    //Getters y Setters
    public int getNumeroDeComposiciones() {
        return numeroDeComposiciones;
    }

    public void setNumeroDeComposiciones(int numeroDeComposiciones) {
        this.numeroDeComposiciones = numeroDeComposiciones;
    }

    public List<Cancion> getCancionesTop100Billboard() {
        return cancionesTop100Billboard;
    }

    public void setCancionesTop100Billboard(List<Cancion> cancionesTop100Billboard) {
        this.cancionesTop100Billboard = cancionesTop100Billboard;
    }

    public List<Cantante> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cantante> clientes) {
        this.clientes = clientes;
    }
    //Sobreescritura del metodo hashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.numeroDeComposiciones;
        hash = 83 * hash + Objects.hashCode(this.cancionesTop100Billboard);
        hash = 83 * hash + Objects.hashCode(this.clientes);
        return hash;
    }
    //Sobreescritura del metodo equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Compositor other = (Compositor) obj;
        if (this.numeroDeComposiciones != other.numeroDeComposiciones) {
            return false;
        }
        if (!Objects.equals(this.cancionesTop100Billboard, other.cancionesTop100Billboard)) {
            return false;
        }
        return Objects.equals(this.clientes, other.clientes);
    }
    //toString
    @Override
    public String toString() {
        return "Compositor{" + "numeroDeComposiciones=" + numeroDeComposiciones + ", cancionesTop100Billboard=" + cancionesTop100Billboard + ", clientes=" + clientes + '}';
    }
    //sobreescritura del metodo abstracto de la clase Persona
    @Override
    public double calcularSalario() {
        return 0.00;
    }
    //Metodo agregarCanción
    public void agregarCancion(int codigo, String titulo, String letra, double tiempoEnMinutos){
        Cancion cancion = new Cancion(codigo, titulo, letra, tiempoEnMinutos);
        cancionesTop100Billboard.add(cancion);
    }
    
    public void agregarCliente(){
        Cantante cliente = new Cantante(nombreArtistico, generoMusical, numeroDeSencillos, numeroDeConciertos, numeroDeGiras, discografia, codigo, nombre, apellido, edad, nacionalidad, salario);
        
    }
}