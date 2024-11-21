package unavarra.is.practica7.pistas;

public class Ejercicio6 {
    
    public static String letraDNI(int n){
        Dni dni= new Dni();
        return dni.devolverLetra(n%23);
    }
    
    public static void main(String[] args) {
        System.out.println(letraDNI(72700123));
    }
    
}
