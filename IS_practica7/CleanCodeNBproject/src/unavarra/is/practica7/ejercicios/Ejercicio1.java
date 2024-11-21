package unavarra.is.practica7.ejercicios;

public class Ejercicio1 {
    
    public static Boolean linea(String s){
        if(s.startsWith("A")){
            if(s.endsWith("S")) {
                return true;
            }
            return false;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        // Ejercicio 1
        System.out.println(linea("HOLA"));
        System.out.println(linea("ADIOS"));
    }
    
}
