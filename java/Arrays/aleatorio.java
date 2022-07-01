/*Faça um programa que leia 20 números inteiros aleatórios(entre 0 e 100) armazene-os em um vetor.
 *Ao final mostre os números e seus sucessores.
*/
package Arrays;

import java.util.Random;

public class aleatorio {
    public static void main(String[] args){
        Random rand = new Random();
        int[] numerosAleatorios = new int[20];
        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = rand.nextInt(100);
        }
        System.out.println("Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.println(numero);
        }
        System.out.println("SUcessores: ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero + 1));
        }

    }
}
