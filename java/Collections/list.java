// Dada uma Lista com 7 notas de um aluno:

package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class list {
    public static void main(String[] args) {
        //Outras formas de iniciar o ArrayList:
        /*
         * List notas = new ArrayList();
         * ArrayList<Double> notas = new ArrayList<>();
         * List<Double> notas = new ArrayList<>(Array.asList(7d, 8.5, 9.3, 5d));
         * List<Double> notas = new Array.asList(7d, 8.5, 9.3, 5d); -> Este método não permite adicionar dados.
         */
        List<Double> notas = new ArrayList<>(); //Criando Lista
        notas.add(7.0 /*7d*/);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString()); //Imprime os dados
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d)); //Imprime a posição do dado
        System.out.println("Adicione na lista a nota 8.0 na posição 4: "); 
        notas.add(4, 8d); //Adiciona dados ne posição especifica 
        System.out.println(notas);
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0); //Substitui dados
        System.out.println(notas);
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d)); //Confere se dado esta na lista
        for (Double nota : notas) System.out.println(nota);
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2)); //Exibe dado especifico
        System.out.println(notas.toString());
        System.out.println("Exiba a menor nota: " + Collections.min(notas)); //Imprime menor valor da lista
        System.out.println("Exiba a maior nota: " + Collections.max(notas)); //Imprime maior valor da lista
        //Executando a soma dos valores da lista
        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();  //Chamada do método iterator iterando ele dentro da lista
        Double soma = 0d;
        while(iterator.hasNext()) { //Verifica se tem algum elemento após ele, se tiver executa o que estiver no loop.
            Double next = iterator.next();
            soma += next;
        }
        //Fim
        System.out.println("Exiba a média das notas: " + (soma/notas.size())); //Imprime a média das notas pegando a soma dividido pelo numero de dados.
        System.out.println("Remova a nota 0: ");
        notas.remove(0d); //Se não colocar o 'd' para double ele removera índice da posição 0.
        System.out.println("Remova a nota na posição 0:" );
        notas.remove(0);
        //Removendo notas menores que 7
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println("notas");
        //Fim
        System.out.println("Apague toda a lista: ");
        notas.clear();  //Limpa dados da lista
        System.out.println(notas);
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty()); //Retorna true se a lista estiver vazia.
        //Aplique tudo para LinkedList
    }
}