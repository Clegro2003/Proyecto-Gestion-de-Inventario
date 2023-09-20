/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author leoda
 */
class GafasDeSol extends Producto {
    private String colorMarco;
    private String colorLente;
    private String modelo;
    private String formaLente;

    public GafasDeSol(double precioReferencia, double precioVenta, String marca, String material, int unidad,
                      String colorMarco, String colorLente, String modelo, String formaLente, String codigo) {
        super(precioReferencia, precioVenta, marca, material, unidad, codigo);
        this.colorMarco = colorMarco;
        this.colorLente = colorLente;
        this.modelo = modelo;
        this.formaLente = formaLente;
    }

    public String getColorMarco() {
        return colorMarco;
    }

    public void setColorMarco(String colorMarco) {
        this.colorMarco = colorMarco;
    }

    public String getColorLente() {
        return colorLente;
    }

    public void setColorLente(String colorLente) {
        this.colorLente = colorLente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFormaLente() {
        return formaLente;
    }

    public void setFormaLente(String formaLente) {
        this.formaLente = formaLente;
    }

   

    @Override
    public String toString() {
        return "GafasDeSol{" +
                "codigo='" + getCodigo() + '\'' +
                ", precioReferencia=" + getPrecioReferencia() +
                ", precioVenta=" + getPrecioVenta() +
                ", marca='" + getMarca() + '\'' +
                ", material='" + getMaterial() + '\'' +
                ", unidad=" + getUnidad() +
                ", colorMarco='" + colorMarco + '\'' +
                ", colorLente='" + colorLente + '\'' +
                ", modelo='" + modelo + '\'' +
                ", formaLente='" + formaLente + '\'' +
                '}';
    }
}
