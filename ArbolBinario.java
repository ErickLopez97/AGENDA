/**
 * @author Erick Lopez & Carlos Boror
 * @author UDEO Montesquieu
 * @version 1.0.0
 * @since Noviembre 2016
 */

public class ArbolBinario
{
    NodoArbol raiz;
    public ArbolBinario(){
        raiz = null;
    }
    
    //Metodo para insertar un Nodo en el Árbol
    public void agregarNodo(int d, String nom, String apell, String corr){
        NodoArbol nuevo = new NodoArbol(d,nom,apell,corr);
        if(raiz==null){
            raiz=nuevo;
        }else{
            NodoArbol auxiliar=raiz;
            NodoArbol padre;
            while(true){
                padre=auxiliar;
                if(d<auxiliar.dato){
                    auxiliar=auxiliar.hijoIzquierdo;
                    if(auxiliar==null){
                        padre.hijoIzquierdo=nuevo;
                        return;
                    }
                }else{
                    auxiliar=auxiliar.hijoDerecho;
                    if(auxiliar==null){
                        padre.hijoDerecho=nuevo;
                        return;
                    }
                }
            }
        }
    }
    //Metodo para sabe cuando el arbol esta vacio
    
    public boolean estaVacio(){
        return raiz==null;
    }
    
    //Metodo para buscar un nodo en el Arbol
    public NodoArbol buscarNodo(int d){
        NodoArbol aux=raiz;
        while(aux.dato!=d){
            if(d<aux.dato){
                aux=aux.hijoIzquierdo;
            }else{
                aux=aux.hijoDerecho;
            }
            if (aux==null){
                return null;
            }
        }
        return aux;
    }
    
    //Metodo para recorrer el Árbol InOrden
    public void inOrden(NodoArbol r){
        if(r!=null){
            inOrden(r.hijoIzquierdo);
            System.out.print(r.dato + "\n");
            inOrden(r.hijoDerecho);
        }
    }
    
    //Metodo para recorrer el Árbol PreOrden
    public void preOrden(NodoArbol r){
        if(r!=null){
            System.out.print(r.dato + "\n");            
            preOrden(r.hijoIzquierdo);
            preOrden(r.hijoDerecho);
        }
    }
    
    //Metodo para recorrer el Árbol PostOrden
    public void postOrden(NodoArbol r){
        if(r!=null){
            postOrden(r.hijoIzquierdo);
            postOrden(r.hijoDerecho);
            System.out.print(r.dato + "\n");
        }
    }
}
