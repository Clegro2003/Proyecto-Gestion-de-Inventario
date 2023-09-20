/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author leoda
 */
class Gorra extends Producto {
    private String color;
    private String modelo;

    public Gorra(double precioReferencia, double precioVenta, String marca, String material, int unidad,
                 String color, String modelo, String codigo) {
        super(precioReferencia, precioVenta, marca, material, unidad, codigo);
        this.color = color;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    

    @Override
    public String toString() {
        return "Gorra{" +
                "codigo='" + getCodigo() + '\'' +
                ", precioReferencia=" + getPrecioReferencia() +
                ", precioVenta=" + getPrecioVenta() +
                ", marca='" + getMarca() + '\'' +
                ", material='" + getMaterial() + '\'' +
                ", unidad=" + getUnidad() +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}