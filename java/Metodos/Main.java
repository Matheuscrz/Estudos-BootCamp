package Metodos;

public class Main {
    public static void main(String[] args){
        System.out.println("Calculadora");
        Calculadora.soma(1,1);
        Calculadora.subtracao(2,1);
        Calculadora.multiplicacao(5,5);
        Calculadora.divisao(21,7);
        System.out.println("Mensagem");
        Mensagem.textoMensagem(5);
        Mensagem.textoMensagem(17);
        Mensagem.textoMensagem(4);
        System.out.println("Empréstimo");
        Emprestimo.calcula(1000,12,0.25);
        System.out.println("Sobrecarga");
        Quadrilatero.area(10);
        Quadrilatero.area(10, 2);
        Quadrilatero.area(2, 2, 5);
    }
}
