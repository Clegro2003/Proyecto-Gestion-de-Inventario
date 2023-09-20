/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author leoda
 */
class Producto {
    protected double precioReferencia;
    protected double precioVenta;
    protected String marca;
    protected String material;
    protected int unidad;
    protected String codigo;

    public Producto(double precioReferencia, double precioVenta, String marca, String material, int unidad, String codigo) {
        this.precioReferencia = precioReferencia;
        this.precioVenta = precioVenta;
        this.marca = marca;
        this.material = material;
        this.unidad = unidad;
        this.codigo = codigo;
    }

    public double getPrecioReferencia() {
        return precioReferencia;
    }

    public void setPrecioReferencia(double precioReferencia) {
        this.precioReferencia = precioReferencia;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

 

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", precioReferencia=" + precioReferencia +
                ", precioVenta=" + precioVenta +
                ", marca='" + marca + '\'' +
                ", material='" + material + '\'' +
                ", unidad=" + unidad +
                '}';
    }
    
    public double calcularReferenciaProducto() {
        return precioReferencia;
    }

    public int calcularUnidadProducto() {
        return unidad;
    }

    public double calcularInversion() {
        return calcularReferenciaProducto() * calcularUnidadProducto();
    }
}
