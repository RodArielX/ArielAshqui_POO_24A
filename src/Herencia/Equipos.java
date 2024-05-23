package Herencia;

public class Equipos {
    String nombre;
    String pais;
    int anioFundacion;

    public Equipos(String nombre, String pais , int anioFundacion){
        this.nombre = nombre;
        this.pais = pais;
        this.anioFundacion = anioFundacion;
    }
    public void imprimirEquipos(){
        System.out.println("El equipo " + nombre + " del pais "
                + pais + " se fundo en el año " + anioFundacion);
    }
}
class Basquet extends Equipos {
    int campeonato;

    public Basquet(String nombre, String pais, int campeonato){
        super(nombre, pais, campeonato);
        this.campeonato = campeonato;
    }
    public void Mensaje(){
        System.out.println("Equipo campeon Basquet");
    }
    public void imprimirBasquet(){
        System.out.println("El equipo " + nombre + " del pais "
                + pais + " tiene" + campeonato + " campeonatos");
    }
}
class Futbol extends Equipos {
    String presidente;

    public Futbol(String nombre, String pais, int anioFundacion, String presidente){
        super(nombre, pais, anioFundacion);
        this.presidente= presidente;
    }
    public void Mensaje(){
        System.out.println("Equipo campeon de futbol");
    }
    public void imprimirFutbol(){
        System.out.println("El equipo " + nombre + " del pais "
                + pais + " se fundo en el año " + anioFundacion
                + " con la presidencia de " + presidente);
    }
}
