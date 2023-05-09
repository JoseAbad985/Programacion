/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.practica02.abadjose.suquilandasamantha.Main;

import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Cantante;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Disco;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Controladores.ControladorPersona;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Controladores.IControlador;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Practica02AbadJoseSuquilandaSamantha {

    public static void main(String[] args) {
        IControlador controlador = new ControladorPersona();
        int opcion = 0;
        do {          
            System.out.println("1.Ingreso de Cantante \n2.Ingreso de Compositor \n3. Agregar Clientes \n4.Imprimir persona \n5. Búsqueda de cantante por nombre de disco \n6. Búsqueda de compositor por nombre de canción \n7. Salir");
            Scanner scanner = new Scanner(System.in);
            switch (opcion) {
                case 1:
                    Cantante c1 = new Cantante("Dpñ", 2, "sde", "sadwa", 2, "", 467);
                    controlador.create(c1);
                    break;
                case 2:
                    
                    break;
                case 3:
                 
                    break;
                case 4:
                    
                    break;
                case 5:
                   
                case 6:
               
                case 7:
            }
        } while (opcion != 0);
    }
    }
