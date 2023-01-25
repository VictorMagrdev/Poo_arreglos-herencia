package org.example;

public class Persona extends Cliente{
    String cedula;
    int edad;

    public Persona(String nombre, String cedula, int edad) {
        super(nombre);
        this.cedula = cedula;
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
