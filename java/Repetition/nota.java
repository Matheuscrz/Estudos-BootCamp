package Repetition;

import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nota: ");
        int nota = scanner.nextInt();
        while(nota < 0 | nota > 10) {
            System.out.println("Nota Inválida! Digite novamente");
            nota = scanner.nextInt();
        }

    }
}
