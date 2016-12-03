
public class NodoArbol
{
    int dato;
    String nombre;
    String apellido;
    String correo;
    NodoArbol hijoIzquierdo, hijoDerecho;
    
    public NodoArbol(int d, String nom, String apell, String corr){
        this.dato=d;
        this.nombre=nom;
        this.apellido=apell;
        this.correo=corr;
        this.hijoIzquierdo=null;
        this.hijoDerecho=null;
    }
    
    public String toString(){
        return nombre + " " + apellido + "  tel.: " + dato + " " + correo;
    }
}
