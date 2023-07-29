package clases;

import interfaces.persona;

import java.util.ArrayList;

public class profesor implements persona {

    private String nombre;
    private String apellido;
    private int antiguedad;
    private double saldo;
    private ArrayList<String> sanciones;
    private boolean activo;

    public profesor(String nombre, String apellido, double saldo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.saldo = saldo;
        this.sanciones = new ArrayList<>();
        this.antiguedad = 0;
        this.activo = true;
    }

    @Override
    public void decirnombre() {
        nombre = this.nombre;
        System.out.println("Hola mi nombre es" + nombre);
    }

    @Override
    public void cambiarnombre(String nombre) {
        this.nombre = nombre;
        System.out.println("Se ha cambiado el nombre");
    }

    @Override
    public void agregarsancion(String sancion) {
        this.sanciones.add(sancion);
        System.out.println("Se ha agregado la sancion");
    }

    @Override
    public void decirapellido() {
        apellido = this.apellido;
        System.out.println("Hola mi nombre es" + apellido);
    }

    @Override
    public void cambiarapellido(String apellido) {
        this.apellido = apellido;
        System.out.println("Se ha cambiado el apellido");
    }

    @Override
    public void sumarmeses(int meses) {
        this.antiguedad= this.antiguedad + 1;
        System.out.println("Se ha agregado el mes al usuario" + this.nombre);
    }

    @Override
    public void activarse() {
        this.activo = true;
    }

    @Override
    public void desactivarse() {
        this.activo = false;
    }

    public void añadir_saldo(double dinero){
        this.saldo = this.saldo + dinero;
    }

    public void restar_saldo(double dinero){
        this.saldo = this.saldo -dinero;
    }

}
