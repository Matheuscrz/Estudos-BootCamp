package Repetition;

import java.util.Scanner;

public class nome {
   public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    while (true) {
        System.out.println("Nome: ");
        String nome = scan.next();
        if (nome.equals("0")) break;
        System.out.println("Idade: ");
        int idade = scan.nextInt();
    }
    }
}
