/* Faça um programa que ler um vetor de 6 caracteres,
 * e informe quantas consoantes foram lidas.
 * Imprima as consoantes.
 */
package Arrays;

import java.util.Scanner;

public class consoante {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] consoantes = new String[6];
        int quant = 0;
        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scanner.next();
            if (!(letra.equalsIgnoreCase("a") || 
            letra.equalsIgnoreCase("e")|| 
            letra.equalsIgnoreCase("i") || 
            letra.equalsIgnoreCase("o") || 
            letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;
                quant++;
            }
            count++;
        } while(count < consoantes.length);
        System.out.println("Consoantes: ");
        for (String consoante: consoantes) {
            if (consoante != null) {
                System.out.println(consoante); 
            }           
        }
        System.out.println("Quantidade de Consoantes: " + quant);
    }
}
