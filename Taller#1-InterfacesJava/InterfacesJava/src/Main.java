import clases.derecho;
import clases.estudiante;
import clases.ing_mecanica;
import clases.profesor;
import interfaces.persona;
import interfaces.programa_academico;

public class Main {
    public static void main(String[] args) {
        //Personas
        estudiante juan = new estudiante("juan","Perez",3);
        profesor pedro = new profesor("Pedro","Perez",1000);
        juan.activarse();
        pedro.desactivarse();
        juan.decirnombre();
        pedro.decirnombre();
        //Programas
        derecho derecho = new derecho("derecho","Por el derecho de la gente",10000,300);
        ing_mecanica ingm = new ing_mecanica("ingeniería mecanica","Por los metales",2000,500);
        derecho.ver_lema();
        ingm.ver_lema();
    }
}