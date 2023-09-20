/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author leoda
 */
class Menu {
    private ArrayList<Producto> productos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    

    public void registrarDatos() {
        System.out.println("Seleccione el tipo de producto: ");
        System.out.println("1. Correa");
        System.out.println("2. Reloj");
        System.out.println("3. Bolso de Mujer");
        System.out.println("4. Gafas de Sol");
        System.out.println("5. Lenceria");
        System.out.println("6. Gorra");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consume la nueva línea

        System.out.println("Ingrese el precio de referencia: ");
        double precioReferencia = scanner.nextDouble();
        scanner.nextLine(); // Consume la nueva línea

        System.out.println("Ingrese el precio de venta: ");
        double precioVenta = scanner.nextDouble();
        scanner.nextLine(); // Consume la nueva línea

        System.out.println("Ingrese la marca: ");
        String marca = scanner.nextLine();

        System.out.println("Ingrese el material: ");
        String material = scanner.nextLine();

        System.out.println("Ingrese la unidad: ");
        int unidad = scanner.nextInt();
        scanner.nextLine(); // Consume la nueva línea

        System.out.println("Ingrese el código: ");
        String codigo = scanner.nextLine();

        switch (opcion) {
            case 1 -> {
                System.out.println("Ingrese el género: ");
                String genero = scanner.nextLine();
                System.out.println("Ingrese el color: ");
                String color = scanner.nextLine();
                System.out.println("Ingrese la talla: ");
                String talla = scanner.nextLine();

                Correa correa = new Correa(precioReferencia, precioVenta, marca, material, unidad, genero, color, talla, codigo);
                productos.add(correa);
            }
            case 2 -> {
                System.out.println("Ingrese el tamaño de la caja: ");
                double tamañoCaja = scanner.nextDouble();
                scanner.nextLine(); // Consume la nueva línea
                System.out.println("Ingrese el tamaño de la banda: ");
                double tamañoBanda = scanner.nextDouble();
                scanner.nextLine(); // Consume la nueva línea
                System.out.println("Ingrese el ancho de la banda: ");
                double anchoBanda = scanner.nextDouble();
                scanner.nextLine(); // Consume la nueva línea
                System.out.println("Ingrese el color de la correa: ");
                String colorCorrea = scanner.nextLine();
                System.out.println("Ingrese el color de la caja: ");
                String colorCaja = scanner.nextLine();
                System.out.println("Ingrese el color del tablero: ");
                String colorTablero = scanner.nextLine();
                System.out.println("Ingrese el género: ");
                String genero = scanner.nextLine();
                System.out.println("Ingrese el calendario: ");
                String calendario = scanner.nextLine();
                Reloj reloj = new Reloj(precioReferencia, precioVenta, marca, material, unidad, tamañoCaja, tamañoBanda, anchoBanda, colorCorrea, colorCaja, colorTablero, genero, calendario, codigo);
                productos.add(reloj);
            }
            case 3 -> {
                System.out.println("Ingrese el color: ");
                String color = scanner.nextLine();
                System.out.println("Ingrese la profundidad: ");
                double profundidad = scanner.nextDouble();
                scanner.nextLine(); // Consume la nueva línea
                System.out.println("Ingrese el tamaño: ");
                double tamano = scanner.nextDouble();
                scanner.nextLine(); // Consume la nueva línea
                System.out.println("Ingrese el ancho: ");
                double ancho = scanner.nextDouble();
                scanner.nextLine(); // Consume la nueva línea
                BolsoMujer bolsoMujer = new BolsoMujer(precioReferencia, precioVenta, marca, material, unidad, color, profundidad, tamano, ancho, codigo);
                productos.add(bolsoMujer);
            }
            case 4 -> {
                System.out.println("Ingrese el color del marco: ");
                String colorMarco = scanner.nextLine();

                System.out.println("Ingrese el color de la lente: ");
                String colorLente = scanner.nextLine();

                System.out.println("Ingrese el modelo: ");
                String modelo = scanner.nextLine();

                System.out.println("Ingrese la forma de la lente: ");
                String formaLente = scanner.nextLine();

                GafasDeSol gafasDeSol = new GafasDeSol(precioReferencia, precioVenta, marca, material, unidad, colorMarco, colorLente, modelo, formaLente, codigo);
                productos.add(gafasDeSol);
            }
            case 5 -> {
                System.out.println("Ingrese el color: ");
                String color = scanner.nextLine();
                System.out.println("Ingrese la talla: ");
                String talla = scanner.nextLine();
                Lenceria lenceria = new Lenceria(precioReferencia, precioVenta, marca, material, unidad, color, talla, codigo);
                productos.add(lenceria);
            }
            case 6 -> {
                System.out.println("Ingrese el color: ");
                String color = scanner.nextLine();
                System.out.println("Ingrese el modelo: ");
                String modelo = scanner.nextLine();
                Gorra gorra = new Gorra(precioReferencia, precioVenta, marca, material, unidad, color, modelo, codigo);
                productos.add(gorra);
            }
            default -> System.out.println("Opción no válida.");
        }
    }

    public void informe() {
        for (Producto producto : productos) {
            System.out.println(producto.toString());
        }
    }

    public void buscarProducto() {
        System.out.println("Ingrese el código del producto que desea buscar: ");
        String codigo = scanner.nextLine();

        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                System.out.println(producto.toString());
                return;
            }
        }

        System.out.println("Producto no encontrado.");
    }

    public void modificar() {
        System.out.println("Ingrese el código del producto que desea modificar: ");
        String codigo = scanner.nextLine();

        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                System.out.println("Ingrese el nuevo precio de referencia: ");
                double precioReferencia = scanner.nextDouble();
                scanner.nextLine(); // Consume la nueva línea

                System.out.println("Ingrese el nuevo precio de venta: ");
                double precioVenta = scanner.nextDouble();
                scanner.nextLine(); // Consume la nueva línea

                System.out.println("Ingrese la nueva marca: ");
                String marca = scanner.nextLine();

                System.out.println("Ingrese el nuevo material: ");
                String material = scanner.nextLine();

                System.out.println("Ingrese la nueva unidad: ");
                int unidad = scanner.nextInt();
                scanner.nextLine(); // Consume la nueva línea

                producto.setPrecioReferencia(precioReferencia);
                producto.setPrecioVenta(precioVenta);
                producto.setMarca(marca);
                producto.setMaterial(material);
                producto.setUnidad(unidad);

                if (producto instanceof Correa) {
                    Correa correa = (Correa) producto;
                    System.out.println("Ingrese el nuevo género: ");
                    String genero = scanner.nextLine();
                    System.out.println("Ingrese el nuevo color: ");
                    String color = scanner.nextLine();
                    System.out.println("Ingrese la nueva talla: ");
                    String talla = scanner.nextLine();
                    correa.setGenero(genero);
                    correa.setColor(color);
                    correa.setTalla(talla);
                } else if (producto instanceof Reloj) {
                    Reloj reloj = (Reloj) producto;
                    System.out.println("Ingrese el nuevo tamaño de la caja: ");
                    double tamañoCaja = scanner.nextDouble();
                    scanner.nextLine(); // Consume la nueva línea

                    System.out.println("Ingrese el nuevo tamaño de la banda: ");
                    double tamañoBanda = scanner.nextDouble();
                    scanner.nextLine(); // Consume la nueva línea

                    System.out.println("Ingrese el nuevo ancho de la banda: ");
                    double anchoBanda = scanner.nextDouble();
                    scanner.nextLine(); // Consume la nueva línea

                    System.out.println("Ingrese el nuevo color de la correa: ");
                    String colorCorrea = scanner.nextLine();

                    System.out.println("Ingrese el nuevo color de la caja: ");
                    String colorCaja = scanner.nextLine();

                    System.out.println("Ingrese el nuevo color del tablero: ");
                    String colorTablero = scanner.nextLine();

                    System.out.println("Ingrese el nuevo género: ");
                    String genero = scanner.nextLine();

                    System.out.println("Ingrese el nuevo calendario: ");
                    String calendario = scanner.nextLine();

                    reloj.setTamañoCaja(tamañoCaja);
                    reloj.setTamañoBanda(tamañoBanda);
                    reloj.setAnchoBanda(anchoBanda);
                    reloj.setColorCorrea(colorCorrea);
                    reloj.setColorCaja(colorCaja);
                    reloj.setColorTablero(colorTablero);
                    reloj.setGenero(genero);
                    reloj.setCalendario(calendario);
                } else if (producto instanceof BolsoMujer) {
                    BolsoMujer bolsoMujer = (BolsoMujer) producto;
                    System.out.println("Ingrese el nuevo color: ");
                    String color = scanner.nextLine();
                    System.out.println("Ingrese la nueva profundidad: ");
                    double profundidad = scanner.nextDouble();
                    scanner.nextLine(); // Consume la nueva línea
                    System.out.println("Ingrese el nuevo tamaño: ");
                    double tamaño = scanner.nextDouble();
                    scanner.nextLine(); // Consume la nueva línea
                    System.out.println("Ingrese el nuevo ancho: ");
                    double ancho = scanner.nextDouble();
                    scanner.nextLine(); // Consume la nueva línea
                    bolsoMujer.setColor(color);
                    bolsoMujer.setProfundidad(profundidad);
                    bolsoMujer.setTamaño(tamaño);
                    bolsoMujer.setAncho(ancho);
                } else if (producto instanceof GafasDeSol) {
                    GafasDeSol gafasDeSol = (GafasDeSol) producto;
                    System.out.println("Ingrese el nuevo color del marco: ");
                    String colorMarco = scanner.nextLine();
                    System.out.println("Ingrese el nuevo color de la lente: ");
                    String colorLente = scanner.nextLine();
                    System.out.println("Ingrese el nuevo modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.println("Ingrese la nueva forma de la lente: ");
                    String formaLente = scanner.nextLine();
                    gafasDeSol.setColorMarco(colorMarco);
                    gafasDeSol.setColorLente(colorLente);
                    gafasDeSol.setModelo(modelo);
                    gafasDeSol.setFormaLente(formaLente);
                } else if (producto instanceof Lenceria) {
                    Lenceria lenceria = (Lenceria) producto;
                    System.out.println("Ingrese el nuevo color: ");
                    String color = scanner.nextLine();
                    System.out.println("Ingrese la nueva talla: ");
                    String talla = scanner.nextLine();
                    lenceria.setColor(color);
                    lenceria.setTalla(talla);
                } else if (producto instanceof Gorra) {
                    Gorra gorra = (Gorra) producto;
                    System.out.println("Ingrese el nuevo color: ");
                    String color = scanner.nextLine();
                    System.out.println("Ingrese el nuevo modelo: ");
                    String modelo = scanner.nextLine();
                    gorra.setColor(color);
                    gorra.setModelo(modelo);
                }

                System.out.println("Producto modificado exitosamente.");
                return;
            }
        }

        System.out.println("Producto no encontrado.");
    }

    public void borrar() {
        System.out.println("Ingrese el código del producto que desea borrar: ");
        String codigo = scanner.nextLine();

        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                System.out.println("¿Está seguro de que desea borrar este producto? (S/N)");
                String confirmacion = scanner.nextLine().toUpperCase();

                if (confirmacion.equals("S")) {
                    productos.remove(producto);
                    System.out.println("Producto borrado exitosamente.");
                } else {
                    System.out.println("Operación de borrado cancelada.");
                }
                return;
            }
        }

        System.out.println("Producto no encontrado.");
    }

    public int calcularUnidadTotal() {
        int unidadTotal = 0;
        for (Producto producto : productos) {
            unidadTotal += producto.calcularUnidadProducto();
        }
        return unidadTotal;
    }

    public double calcularInversionTotal() {
        double inversionTotal = 0;
        for (Producto producto : productos) {
            inversionTotal += producto.calcularInversion();
        }
        return inversionTotal;
    }

}