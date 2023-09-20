/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author leoda
 */
class Lenceria extends Producto {
    private String color;
    private String talla;

    public Lenceria(double precioReferencia, double precioVenta, String marca, String material, int unidad,
                    String color, String talla, String codigo) {
        super(precioReferencia, precioVenta, marca, material, unidad, codigo);
        this.color = color;
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    
   

    @Override
    public String toString() {
        return "Lenceria{" +
                "codigo='" + getCodigo() + '\'' +
                ", precioReferencia=" + getPrecioReferencia() +
                ", precioVenta=" + getPrecioVenta() +
                ", marca='" + getMarca() + '\'' +
                ", material='" + getMaterial() + '\'' +
                ", unidad=" + getUnidad() +
                ", color='" + color + '\'' +
                ", talla='" + talla + '\'' +
                '}';
    }
}
