/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.practica02.abadjose.suquilandasamantha.Main;

import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Cantante;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Persona;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Compositor;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Controladores.ControladorPersona;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Controladores.IControlador;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Principal {
    
    
   
    public static void main(String[] args) {
        //instanciamos una sola vez el controlador, ademas de objetos de tipo cantante y compositor
        IControlador controladorPersona = new ControladorPersona();
        ControladorPersona controladorPersonaCast = (ControladorPersona) controladorPersona;
        Scanner teclado = new Scanner(System.in);
        
        /*
            Generamos un menu que permita al usario observar las opciones 
            que tiene e ingrese lo que desea realizar
        */
        
        int opcion = 0;
        do {           
            System.out.println("\n Menu de Opciones \n1. Ingreso de Cantante \n2. Ingreso de Compositor \n3. Agregar Clientes "
                    + "\n4. Imprimir persona \n5. Búsqueda de cantante por nombre de disco \n6. Búsqueda de compositor por nombre de canción \n7. Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                //En el caso 1 del menu se ingresa todos los atributos que le pertenecen, por medio del usuario
                case 1:
                    teclado.nextLine();
                    System.out.println("Ingrese el nombre del cantante: ");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el apellido del cantante: ");
                    String apellido = teclado.nextLine();
                    System.out.println("Ingrese la edad del cantante: ");
                    int edad = teclado.nextInt();
                    teclado.nextLine();//Aqui hay un salto de nextInt
                    System.out.println("Ingrese la nacionalidad del cantante: ");
                    String nacionalidad = teclado.nextLine();
                    System.out.println("Ingrese el salario del cantante: ");
                    double salario = Double.parseDouble(teclado.nextLine());
                    System.out.println("Ingrese el codigo del cantante: ");
                    int codigo = teclado.nextInt();
                    teclado.nextLine();//Aqui hay un salto de nextInt
                    System.out.println("Ingrese el nombre artistico del cantante: ");
                    String nombreArtistico = teclado.nextLine();
                    System.out.println("Ingrese el genero musical del cantante: ");
                    String generoMusical = teclado.nextLine();
                    System.out.println("Ingrese el numero de sensillos: ");
                    int numeroDeSencillos = Integer.parseInt(teclado.nextLine());
                    System.out.println("Ingrese el numero de conciertos del cantante: ");
                    int numeroDeConciertos = Integer.parseInt(teclado.nextLine());
                    System.out.println("Ingrese el numero de giras del cantante: ");
                    int numeroDeGiras = teclado.nextInt();
                    Persona cantante = new Cantante(nombreArtistico, generoMusical, numeroDeSencillos, numeroDeConciertos, numeroDeGiras, codigo, nombre, apellido, edad, nacionalidad, salario);
                    
                    System.out.println("Ingrese el numero de discos del cantante: ");
                    int cantidad = teclado.nextInt();
                    for (int i = 0; i < cantidad; i++) {
                        Cantante cantanteCast = (Cantante) cantante;
                        System.out.println("Ingrese el codigo del disco: ");
                        int codigoDisc = teclado.nextInt();
                        System.out.println("Ingrese el año de lanzamiento:");
                        int anioDeLanzamiento = teclado.nextInt();
                        teclado.nextLine();
                        System.out.println("Ingrese el nombre del disco: ");
                        String nombreCancion =teclado.nextLine();
                        cantanteCast.agregarDisco(codigoDisc, nombreCancion, anioDeLanzamiento);
                    }
                    //Se llama al metodo calcular salario 
                    cantante.calcularSalario();
                    controladorPersona.create(cantante);
                    break;
                //En el caso 2 del menu se ingresa los datos del compositor, depensiendo de sus atributos, ademas de sus canciones
                case 2:
                    teclado.nextLine();//Un salto de nextInt
                    System.out.println("Ingrese el nombre del compositor: ");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese el apellido del compositor: ");
                    apellido = teclado.nextLine();
                    System.out.println("Ingrese la edad del compositor: ");
                    edad = teclado.nextInt();
                    teclado.nextLine();//Un salto de nextInt
                    System.out.println("Ingrese la nacionalidad del compositor: ");
                    nacionalidad = teclado.nextLine();
                    System.out.println("Ingrese el salario del compositor: ");
                    salario = Double.parseDouble(teclado.nextLine());
                    System.out.println("Ingrese el codigo del compositor: ");
                    codigo = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese el numero de canciones del compositor; ");
                    int numeroDeComposiciones = teclado.nextInt();
                    Persona compositor = new Compositor(numeroDeComposiciones, codigo, nombre, apellido, edad, salario, nacionalidad);
                    System.out.println("Ingrese las cantidades de canciones del compositor: ");
                    cantidad = teclado.nextInt(); //Un salto nextInt
                    teclado.nextLine();
                    for (int i = 0; i < cantidad; i++) {
                        Compositor compositorCast = (Compositor) compositor;
                        System.out.println("Ingrese el codigo de la cancion: ");
                        int codigoCan = teclado.nextInt();
                        teclado.nextLine();
                        System.out.println("Ingrese el titulo de la cancion: ");
                        String titulo = teclado.nextLine();
                        System.out.println("Ingrese la letra de la cancion: ");
                        String letra = teclado.nextLine();
                        System.out.println("Ingrese el tiempo de duracion de la cancion: ");
                        double tiempoEnMinutos = Double.parseDouble(teclado.nextLine());
                        compositorCast.agregarCancion(codigoCan, titulo, letra,tiempoEnMinutos);
                    }
                    compositor.calcularSalario(); // Llamamos al metodo calcular salario
                    controladorPersona.create(compositor);
                    break;
                //
                case 3:
                    teclado.nextLine();//posible salto de de nextInt
                    System.out.println("Ingrese el codigo del cantante(cliente): ");
                    codigo = teclado.nextInt();
                    Cantante cantanteCasting = (Cantante) controladorPersonaCast.buscarPorCodigoCantante(codigo);
                    System.out.println("Ingrese el codigo del compositor: ");
                    codigo = teclado.nextInt();
                    Compositor compositorCast = (Compositor) controladorPersonaCast.buscarPorCodigoCompositor(codigo);
                    if (compositorCast instanceof Persona && compositorCast instanceof Persona ){
                        compositorCast.agregarCliente(cantanteCasting);
                    }
                    
                    break;
                case 4:
                    controladorPersonaCast.imprimir();
                    
                    break;
                case 5:
                    teclado.nextLine();
                    System.out.println("Por favor ingrese el nombre del disco que desea buscar: ");
                    String valor = teclado.nextLine();
                    controladorPersonaCast.buscarPorNombreDeDisco(valor);
                    break;
                    
                case 6:
                    teclado.nextLine();
                    System.out.println("Ingrese el titulo de la cancion que desea buscar: ");
                    String titulo = teclado.nextLine();
                    controladorPersonaCast.buscarPorTituloDeCancion(titulo);
                    break;
                
                case 7:
                    break;
                    
                default:
                    System.out.println("La opcion ingresda no es valida");
                    break;
                    
            }
        } while (opcion != 7);
    }
           
}
        
        
        
   
