/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author leoda
 */
class Reloj extends Producto {
    private double tamañoCaja;
    private double tamañoBanda;
    private double anchoBanda;
    private String colorCorrea;
    private String colorCaja;
    private String colorTablero;
    private String genero;
    private String calendario;

    public Reloj(double precioReferencia, double precioVenta, String marca, String material, int unidad,
                 double tamañoCaja, double tamañoBanda, double anchoBanda, String colorCorrea,
                 String colorCaja, String colorTablero, String genero, String calendario, String codigo) {
        super(precioReferencia, precioVenta, marca, material, unidad, codigo);
        this.tamañoCaja = tamañoCaja;
        this.tamañoBanda = tamañoBanda;
        this.anchoBanda = anchoBanda;
        this.colorCorrea = colorCorrea;
        this.colorCaja = colorCaja;
        this.colorTablero = colorTablero;
        this.genero = genero;
        this.calendario = calendario;
    }

    public double getTamañoCaja() {
        return tamañoCaja;
    }

    public void setTamañoCaja(double tamañoCaja) {
        this.tamañoCaja = tamañoCaja;
    }

    public double getTamañoBanda() {
        return tamañoBanda;
    }

    public void setTamañoBanda(double tamañoBanda) {
        this.tamañoBanda = tamañoBanda;
    }

    public double getAnchoBanda() {
        return anchoBanda;
    }

    public void setAnchoBanda(double anchoBanda) {
        this.anchoBanda = anchoBanda;
    }

    public String getColorCorrea() {
        return colorCorrea;
    }

    public void setColorCorrea(String colorCorrea) {
        this.colorCorrea = colorCorrea;
    }

    public String getColorCaja() {
        return colorCaja;
    }

    public void setColorCaja(String colorCaja) {
        this.colorCaja = colorCaja;
    }

    public String getColorTablero() {
        return colorTablero;
    }

    public void setColorTablero(String colorTablero) {
        this.colorTablero = colorTablero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCalendario() {
        return calendario;
    }

    public void setCalendario(String calendario) {
        this.calendario = calendario;
    }

    

    
    @Override
    public String toString() {
        return "Reloj{" +
                "codigo='" + getCodigo() + '\'' +
                ", precioReferencia=" + getPrecioReferencia() +
                ", precioVenta=" + getPrecioVenta() +
                ", marca='" + getMarca() + '\'' +
                ", material='" + getMaterial() + '\'' +
                ", unidad=" + getUnidad() +
                ", tamañoCaja=" + tamañoCaja +
                ", tamañoBanda=" + tamañoBanda +
                ", anchoBanda=" + anchoBanda +
                ", colorCorrea='" + colorCorrea + '\'' +
                ", colorCaja='" + colorCaja + '\'' +
                ", colorTablero='" + colorTablero + '\'' +
                ", genero='" + genero + '\'' +
                ", calendario='" + calendario + '\'' +
                '}';
    }
}