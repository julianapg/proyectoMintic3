package com.mintic.project.models;

import javax.persistence.*;


@Entity
public class MovimientoDinero {

    private @Id @GeneratedValue(strategy= GenerationType.IDENTITY) int id;
    private double monto;
    private String concepto;
    private String tipo;

    @ManyToOne
    @JoinColumn(name="empleado_id")
    private Empleado empleado;

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "id=" + id +
                ", monto=" + monto +
                ", concepto='" + concepto + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
