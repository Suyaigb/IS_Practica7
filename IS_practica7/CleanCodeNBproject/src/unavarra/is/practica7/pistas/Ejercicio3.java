package unavarra.is.practica7.pistas;

public class Ejercicio3 {
    
    public static String horaReal(int h, int m, int s){
        String resul = "Correcto";
        if(h<0 || h>24){
                resul="Hora Incorrecta";
        }
        if(m<0 || m>60){
            resul = "Minutos Incorrectos";
        }
        if(s<0 || s>60){
            resul = "Segundos Incorrectos";
        }
        
        return resul;
    }

    public static void main(String[] args) {
        System.out.println(horaReal(9,34,23));
        System.out.println(horaReal(25,34,23));
    }
    
}
