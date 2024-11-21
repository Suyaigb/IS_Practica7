package unavarra.is.practica7.pistas;

public class Ejercicio5 {
    
    public static String Mes(int mes){
        if(mes==1||mes==4||mes==6||mes==9||mes==11){
            return "Es un mes de 30 dias";
        }
        if(mes==3||mes==5||mes==7||mes==8||mes==10||mes==12){
            return "Es un mes de 31 dias";
        }
        if(mes==2){
            return "Es un mes de 28 o 29 dias";
        }
        return "Mes incorrecto";
    }
    
    public static void main(String[] args) {
        System.out.println(Mes(11));
    }
    
}
