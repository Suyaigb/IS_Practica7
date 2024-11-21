package unavarra.is.practica7.pistas;


public class Ejercicio1 {
    
    public static Boolean condicion(String s){
        return s.startsWith("A") && s.endsWith("S");
    }

    public static void main(String[] args) {
        System.out.println(condicion("HOLA"));
        System.out.println(condicion("ADIOS"));
    }
    
}
