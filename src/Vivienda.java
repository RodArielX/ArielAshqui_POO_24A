//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Vivienda {
    int numero;
    String propietario;

    public Vivienda(int numero, String propietario){
        this.numero = numero;
        this.propietario = propietario;
    }
    public void imprimir(){
        System.out.println("Numero: " + numero + " Propietario: " + propietario);
    }
}
class Departamento extends Vivienda{
    int piso;

    public Departamento(int numero, String propietario, int piso){
        super(numero, propietario);
        this.piso = piso;
    }
    public void Anuncio(){
        System.out.println("Departamento arrendado");
    }
    public void imprimirD(){
        System.out.println("Numero: " + numero + " Propietario: " + propietario + " Piso: " + piso);
    }
}
class Casa extends Vivienda{
    int numeroHabitacion;
    String ubicacion;

    public Casa(int numero, String propietario, int numeroHabitacion, String ubicacion){
        super(numero, propietario);
        this.numeroHabitacion = numeroHabitacion;
        this.ubicacion = ubicacion;
    }
    public void Mensaje(){
        System.out.println("Casa disponible");
    }
    public void imprimirCasa(){
        System.out.println("Numero: " + numero + " Propietario: " + propietario
                + " Numero de habitaciones: " + numeroHabitacion + " Ubicacion: " + ubicacion);
    }
}
