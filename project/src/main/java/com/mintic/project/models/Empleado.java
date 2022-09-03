package com.mintic.project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empleado {

    private @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) int id;
    private String nombre;
    private String correo;
    private String rol;
    private String tipoDocumento;

    private int numeroDocumento;

    @Override
    public String toString() {
        return "Empleado{ \n" +
                "\t id=" + id + "\n"+
                "\t nombre= " + nombre + "\n" +
                "\t correo= "+ correo + "\n"+
                "\t Rol= "+rol + "\n"+
                "\t Tipo Documento= "+ tipoDocumento+"\n"
                +"\t Numero documento= "+ numeroDocumento+ "\n"+'}';
    }

    public String getCorreo() {
        return correo;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumeto) {
        this.numeroDocumento = numeroDocumeto;
    }
}
