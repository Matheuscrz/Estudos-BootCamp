package Repetition;

import java.util.Scanner;

public class Impar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantNumeros;
        int count = 0;
        int numero;
        System.out.println("Informe a quantidade de números:");
        quantNumeros = scanner.nextInt();
        int impar = 0;
        int par = 0;
        do {
            System.out.println("Informe o número: ");
            numero = scanner.nextInt();
            if (numero%2 == 0) par++;
            else impar++;
            count ++;
        } while (count < quantNumeros);
        System.out.println("Números pares: " + par);
        System.out.println("Números impares: " + impar);
    }
}
