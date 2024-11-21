package unavarra.is.practica7.ejercicios;

public class Ejercicio2 {
    
    public static Boolean par(int n){
        Boolean resul = false;
        Integer r = n % 2;
        if(r==0){ 
            resul = true; 
        }
        else {
            resul = false;
        }
        return resul;
    }

    public static void main(String[] args) {
        System.out.println(par(2));
        System.out.println(par(3));
    }
    
}
