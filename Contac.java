/**
 * @author Erick Lopez
 * @author UDEO Montesquieu
 * @version 1.0.0
 * @since Octubre 2016
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

    
public class Contac
{
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) {
        int opcion=0, elemento;
        String nombre;
        String apellido;
        String correo;
        ArbolBinario arbolito = new ArbolBinario();
        do{
            try{
                p("\n......................");
                p("\nAGENDA");
                p("\n......................");
                p("\n1-Nuevo contacto");
                p("\n2-Buscar contacto");
                p("\n3-Listado de contactos");
                p("\n4-Salir");
                p("\n......................");
                
                p("\nOpción: ");
                opcion = Integer.parseInt(br.readLine());
                p("\n......................");
                
                switch(opcion){
                    case 1:
                        borrarPantalla();
                        p("Ingrese el número de telefono:  \t");
                        elemento = Integer.parseInt(br.readLine());
                        p("Ingrese el nombre:              \t");
                        nombre = br.readLine();
                        p("Ingrese el apellido:            \t");
                        apellido = br.readLine();
                        p("Ingrese el correo electronico:  \t");
                        correo = br.readLine();
                        
                        arbolito.agregarNodo(elemento, nombre, apellido, correo );
                        borrarPantalla();
                        break;
                    case 2:
                        borrarPantalla();
                        if(!arbolito.estaVacio()){
                            p("Ingrese el número de telefono: \t");
                            elemento = Integer.parseInt(br.readLine());
                            if(arbolito.buscarNodo(elemento)==null){
                               p("\n El numero no se encuentra en el arbol");
                               p("\nNumero no encontrado");
                            }else{
                                p("\nNumero encontrado, sus datos son: \n" + arbolito.buscarNodo(elemento));
                            }
                        }else{
                            p("El arbol esta vacio!!!");
                        }
                        p("\nPresione ENTER para regresar al menú");
                        br.readLine();
                        borrarPantalla();
                        break;
                    case 3:
                        borrarPantalla();
                        p("Recorrido del Árbol InOrden\n");
                        if(!arbolito.estaVacio()){
                            arbolito.inOrden(arbolito.raiz);
                            //p("\nNumero encontrado, sus datos son: \n" + arbolito.buscarNodo());
                        }else{
                            p("El arbol esta vacio!!!");
                        }
                        p("\nRecorrido del Árbol PreOrden\n");
                        if(!arbolito.estaVacio()){
                            arbolito.preOrden(arbolito.raiz);
                        }else{
                            p("El arbol esta vacio!!!");
                        }
                        p("\nRecorrido del Árbol PostOrden\n");
                        if(!arbolito.estaVacio()){
                            arbolito.postOrden(arbolito.raiz);
                        }else{
                            p("El arbol esta vacio!!!");
                        }
                        break;
                    case 4:
                        borrarPantalla();    
                        p("\nCerrando la aplicacion");
                        System.exit(0);
                        borrarPantalla();
                        break;
                    default:
                        p("\nOpción Incorrecta");
                        
                }
            }catch(Exception e){
                p("\nError ");
                p("\nIngrese una opción de tipo número entero");
            }
        }while(opcion!=4);
    }
    
    public static void p(String s){
        System.out.print(s);
    }
    
    public static void borrarPantalla(){
        p("\u000c");
    }
}
