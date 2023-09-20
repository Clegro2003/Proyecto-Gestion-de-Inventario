/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author leoda
 */
class BolsoMujer extends Producto {
    private String color;
    private double profundidad;
    private double tamaño;
    private double ancho;

    public BolsoMujer(double precioReferencia, double precioVenta, String marca, String material, int unidad,
                      String color, double profundidad, double tamaño, double ancho, String codigo) {
        super(precioReferencia, precioVenta, marca, material, unidad, codigo);
        this.color = color;
        this.profundidad = profundidad;
        this.tamaño = tamaño;
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

   
    

    @Override
    public String toString() {
        return "BolsoMujer{" +
                "codigo='" + getCodigo() + '\'' +
                ", precioReferencia=" + getPrecioReferencia() +
                ", precioVenta=" + getPrecioVenta() +
                ", marca='" + getMarca() + '\'' +
                ", material='" + getMaterial() + '\'' +
                ", unidad=" + getUnidad() +
                ", color='" + color + '\'' +
                ", profundidad=" + profundidad +
                ", tamaño=" + tamaño +
                ", ancho=" + ancho +
                '}';
    }
}