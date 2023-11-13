package cd2023.ud5;

import java.util.Scanner;

public class Menu {
    private int seleccion = -1;
    private Scanner sc = new Scanner(System.in);

    public int getSeleccion() {
        return seleccion;
    }

    public void resetSeleccion() {
        this.seleccion = -1;
    }

    private void imprimir() {
        
        System.out.println("Seleccione una opción");
        System.out.println("0 - Reset");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        
        int valorLeido = sc.nextInt();

        if (valorLeido >= 0 && valorLeido <= 4) {
            this.seleccion = valorLeido;
        } else {
            this.seleccion = -1;
        }
    }

    public int getSeleccionValida() {
        while (seleccion == -1){
            imprimir();
        }
        return seleccion;
    }

    public double getNumeroValido(){
        
        do {
            sc.nextLine();
            System.out.println("Número: ");
            boolean numeroCorrecto = sc.hasNextDouble();
        } while (!numeroCorrecto);

        return sc.nextDouble();
    }
}
