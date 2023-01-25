package org.example;

public class Empresa extends Cliente{
    String nit;
    String representate;

    public Empresa(String nombre) {
        super(nombre);
    }

    public Empresa(String nombre, String nit, String representate) {
        super(nombre);
        this.nit = nit;
        this.representate = representate;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getRepresentate() {
        return representate;
    }

    public void setRepresentate(String representate) {
        this.representate = representate;
    }
}
