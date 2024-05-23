package Herencia;

public class Main {
    public static void main(String[] args){
        Equipos equipo1 = new Equipos("Club deportivo El Nacional", "Ecuador", 1967);
        equipo1.imprimirEquipos();
        Basquet equipo2 = new Basquet("Angeles", "Estados Unidos", 5);
        equipo2.imprimirBasquet();
        equipo2.Mensaje();
        Futbol equipo3 = new Futbol("Manchester City", "Inglaterra",
                1292, "Michael Jordan");
        equipo3.imprimirFutbol();
        equipo3.Mensaje();
    }

}
