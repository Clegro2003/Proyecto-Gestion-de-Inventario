/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modelo;
import java.util.Scanner;


/**
 *
 * @author leoda
 */
public class Principal {
    public static void main(String[] args) {
        Menu menu = new Menu();
        int opcion;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("----- Menú de Productos -----");
            System.out.println("1. Registrar Producto");
            System.out.println("2. Mostrar Informe");
            System.out.println("3. Buscar Producto");
            System.out.println("4. Modificar Producto");
            System.out.println("5. Borrar Producto");
            System.out.println("6. Calcular Unidad Total");
            System.out.println("7. Calcular Inversión Total");
            System.out.println("8. Salir");
            System.out.println("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> menu.registrarDatos();
                case 2 -> menu.informe();
                case 3 -> menu.buscarProducto();
                case 4 -> menu.modificar();
                case 5 -> menu.borrar();
                case 6 -> {
                    int unidadTotal = menu.calcularUnidadTotal();
                    System.out.println("Unidad Total: " + unidadTotal);
                }
                case 7 -> {
                    double inversionTotal = menu.calcularInversionTotal();
                    System.out.println("Inversión Total: $" + inversionTotal);
                }
                case 8 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción no válida.");
            }
            break;
        } while (opcion != 8);
    }
}

