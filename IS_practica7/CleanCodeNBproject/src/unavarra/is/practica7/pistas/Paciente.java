package unavarra.is.practica7.pistas;
import java.time.LocalDate;

public class Paciente {
    private String nombre;
    private float peso;
    private float altura;
    private int annoNacimiento;

    public String getNombre() {
        return nombre;
    }

    public Paciente(String nombre, float peso, float altura, int annoNacimiento) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.annoNacimiento = annoNacimiento;
    }
    
    private int calcularEdad(){ 
        return LocalDate.now().getYear() - annoNacimiento;
    }
    
    private float calcularImc(){
        return (float) (peso /altura*altura);
    }
    
    public boolean problema(){
        if(calcularImc() >= 25){
           if(calcularEdad() > 65){
               return true;
           }    
        }  
        return false;
    }
}
