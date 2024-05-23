public class Principal {
    public static void main(String[] args){
        Vivienda vivienda1 = new Vivienda(123,"Fernando");
        vivienda1.imprimir();
        Departamento vivienda2 = new Departamento(120, "Ariel", 10);
        vivienda2.imprimirD();
        vivienda2.Anuncio();
        Casa vivienda3 = new Casa(100, "Bandiel", 21, "Quito");
        vivienda3.Mensaje();
        vivienda3.imprimirCasa();
    }
}
