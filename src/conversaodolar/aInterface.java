package conversaodolar;

import java.text.DecimalFormat;
import java.util.Scanner;

public class aInterface {
    
    public aInterface(){
        System.out.println("=== CONVERTA SEUS REAIS EM DÓLARES ===");
    }

    public double pegueValorReal() {
        System.out.println("\nInforme o valor disponível em reais (para comprar dólares): ");
        System.out.println("OBS: Digite 0 para sair");
        Scanner leia = new Scanner(System.in);
        double real = leia.nextDouble();
        return real;
    }
    
    public double pegueCotacao() {
        System.out.println("\nInforme o valor da cotação do dólar do dia: ");
        System.out.println("OBS: Use vírgula");
        Scanner leia= new Scanner(System.in);
        double dol = leia.nextDouble();
        return dol;
    }

    public void mostrarDolar(double dolar) {
        System.out.printf("\nCom essa quantia é possível comprar " + (new DecimalFormat("####.00").format(dolar)) + " dólares\n");
    }

    void mostrarSaida(int i) {
        System.out.println("== EXIT ==");    
    }

}
