package org.example;

public class Banco {
    String nombre;
    Cliente clientes[];
    int numeroDeClientes;

    public Banco(String nombre, Cliente[] clientes, int numeroDeClientes) {
        this.nombre = nombre;
        this.clientes = clientes;
        this.numeroDeClientes = numeroDeClientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public int getNumeroDeClientes() {
        return numeroDeClientes;
    }

    public void setNumeroDeClientes(int numeroDeClientes) {
        this.numeroDeClientes = numeroDeClientes;
    }
}
