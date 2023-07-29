package clases;

import interfaces.programa_academico;

public class derecho implements programa_academico {
    private String nombre;
    private String lema;
    private double costo;
    private int estudiantes;

    public derecho(String nombre, String lema, double costo, int estudiantes) {
        this.nombre = nombre;
        this.lema = lema;
        this.costo = costo;
        this.estudiantes = estudiantes;
    }

    @Override
    public void ver_estudiantes() {
        System.out.println(this.estudiantes);
    }

    @Override
    public void ver_nombre() {
        System.out.println(this.nombre);
    }

    @Override
    public void cambiar_nombre(String nombre) {
        this.nombre = nombre;
        System.out.println("Se ha cambiado el nombre");
    }

    @Override
    public void ver_costo() {
        System.out.println(this.costo);
    }

    @Override
    public void cambiar_costo(double costo) {
        this.costo = costo;
        System.out.println("Cambiar costo");
    }

    @Override
    public void ver_programa() {
        System.out.println("Hola esto es un lema");
    }

    @Override
    public void ver_lema() {
        System.out.println(this.lema);
    }

    @Override
    public void cambiar_lema(String lema) {
        this.lema = lema;
        System.out.println("Se ha cambiado el lema");
    }
    public void ver_demandas(){
        System.out.println("Demandas");
    }

    public void ver_peticiones(){
        System.out.println("Peticiones");
    }

}
