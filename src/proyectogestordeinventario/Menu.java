/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogestordeinventario;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Menu {

    Scanner Datos,Ref = new Scanner(System.in);
    int s, nel; String refc;

    public void Registrar() {
        System.out.println("Digite el numero de valores a ingresar: ");
        nel = Datos.nextInt();
        char mas = 'S';
        if (nel <= 0 || nel > 100) {
            System.out.println("ERROR, El rango debe estar entre 1 y 100");
        } else {
            do {
                /*  System.out.println("-----CAPTURA DE DATOS HUPA-----");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                 */
            } while (mas == 'S');
        }

    }

    public void Informe() {
        System.out.println("-----INFORME PRODUCTOS HUPA-----");
        if (nel < 1) {
            System.out.println("no hay datos para mostrar");
        } else {
            for (int i = 1; i == nel - 1; i++) {
                //Mostrar datos
            }
        }
    }

    public void Borrar() {

    }

    public void Buscar() {
char Mas='S'; 
boolean Encontro=false;
int i=1;
        
do{
System.out.println("Digite la referencia del producto a consultar: ");
        refc = Ref.nextLine();
while(i<=nel || Encontro){
if(refc.equals(/*Valor de referencia*/))
    
    i++;
}
        
}while(Mas=='S');
    }

    public void Modificar() {
    }

    public void RefTotal() {
    }

    public void UniTotal() {
    }

    public void Switch() {
        System.out.println("1. Registrar datos.");
        System.out.println("2. Mostrar informe.");
        System.out.println("3. Borrar datos.");
        System.out.println("4. Buscar datos.");
        System.out.println("5. Modificar dato.");
        System.out.println("6. Calcular referencia total.");
        System.out.println("7. Calcular unidad total.");
        System.out.println("Digite la opcion a realizar: ");

        switch (s) {
            case 1 -> {
                Registrar();
            }

            case 2 -> {
                Informe();
            }

            case 3 -> {
                Borrar();
            }

            case 4 -> {
                Buscar();
            }

            case 5 -> {
                Modificar();
            }

            case 6 -> {
                RefTotal();
            }

            case 7 -> {
                UniTotal();
            }

        }
    }
}
