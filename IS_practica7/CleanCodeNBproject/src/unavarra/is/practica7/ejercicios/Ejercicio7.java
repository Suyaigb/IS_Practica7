package unavarra.is.practica7.ejercicios;

import java.time.LocalDate;

public class Ejercicio7 {
    
    public static void procesar(String[] a){
        for(int i=0; i<a.length ; i++){ // recorro la colección
            String[] t = a[i].split(",");  // "nombre,peso,altura,año"
            float m = Float.parseFloat(t[1]); // peso
            float e = Float.parseFloat(t[2]); // altura
            float imc = (float) (m/Math.pow(e,2)); 
            if(imc>=25.00f){  // tiene sobrepeso
                int n = Integer.parseInt(t[3]); // año de nacimiento
                int ed= LocalDate.now().getYear() - n; // edad
                if(ed>65){  // es anciano
                    System.out.println(t[0] + " tiene riesgo cardiovascular"); // t[0] es el nombre
                }
            }
        }
    }

    public static void main(String[] args) {  
        procesar(new String[]{
            "paciente1,80.2,1.84,2001",
            "paciente2,90.2,1.75,1940",
            "paciente3,89.2,1.75,2001"
        });
    }
    
}
