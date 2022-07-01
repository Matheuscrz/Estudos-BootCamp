package Arrays;

public class Inversao {
    public static void main(String[] args){
        int[] vetor = {0, -5, 1, 25, -12, 8};
        // int count = 0;
        // while(count < vetor.length) {
        //     System.out.print(vetor[count]+ " ");
        //     count++;
        // }
        for (int i = vetor.length-1; i >= 0 ; i--) {
            System.out.print(vetor[i]+ " ");
        }
    }
}
