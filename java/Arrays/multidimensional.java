/*Gere e Imprima uma matriz M 4x4 com valores aleatórios entre 0-9 */
package Arrays;

import java.util.Random;

public class multidimensional {
    public static void main(String[] args){
        Random rand = new Random();

        int[][] M = new int[4][4]; 

        for (int i = 0; i < M.length; i++) { //Pegando a primeira linha da matriz
            for (int j = 0; j < M[i].length; j++) { //Pegando cada elemento da linha da matriz
                M[i][j] = rand.nextInt(9); //Preenchendo dados da matriz com valores aleatórios
            }
        }
        System.out.println("Matriz: ");
        for (int[] linha : M) { //Pegando cada linha do array 
            for (int elemento : linha) { //Pegando os elementos da linha
                System.out.print(elemento + " ");
            }
        }
    }
}
