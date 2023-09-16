/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogestordeinventario;

/**
 *
 * @author carlo
 */
public class Producto {
    private double preRef;//Precio de referencia
    private double preVent;//Precio de venta
    private String marca;
    private String material;
    private int unidad;

    public Producto(double preRef, double preVent, String marca, String material, int unidad) {
        this.preRef = preRef;
        this.preVent = preVent;
        this.marca = marca;
        this.material = material;
        this.unidad = unidad;
    }

    public double getPreRef() {
        return preRef;
    }

    public void setPreRef(double preRef) {
        this.preRef = preRef;
    }

    public double getPreVent() {
        return preVent;
    }

    public void setPreVent(double preVent) {
        this.preVent = preVent;
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
    
    public void CalcularUnidadMarca(){}
    public void CalcularUnidadProducto(){}
    public void CalcularRefereciaMarca(){}
    public void CalcularReferecniaProducto(){}
    
}