package Tratamento;

import javax.swing.*;

//Divisão de 2 valores inteiros
public class Unchecked {
    public static void main(String[] args) {
        boolean continueLoop = true;
        do{
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");
            //Tratando erro com try catch - Try colocamos a parte funcional do código onde pode gerar o erro, catch podemos informamos o erro.
            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLoop = false; //Encerra o loop caso os valores informados não gerem erro.
            } 
            //Erro: String que não era numero informado.
            catch (NumberFormatException e) { 
                JOptionPane.showMessageDialog(null,"Entrada invalida, informe apenas numero inteiros! " + e.getMessage()); 
                e.printStackTrace(); //Printa o erro mas o código continua.
            } 
            //Erro: Erro de aritmética, valores informados não podem executar esta operação. Ex: Divisão por 0.
            catch(ArithmeticException e){
                JOptionPane.showMessageDialog(null,"Impossível dividir um numero por 0! "); 
                e.printStackTrace();
            } finally {
                System.out.println("Chegou no finally! Finally e opcional"); //Finally sempre roda mesmo com erros no loop
            }
        } while(continueLoop);
        System.out.println("O código continua...");
    }
    public static int dividir(int a, int b) {return a/b;}
}