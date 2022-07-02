/*Dadas as seguintes informações, crie uma lista e ordene esta lista exibindo */
package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ordenacao {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Madruginha", 4, "preto"));
            add(new Gato("Phoenix", 1, "cinza"));
            add(new Gato("Math", 1, "branco"));
        }};
        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);
        System.out.println("--\tOrdem Aleatória\t---");
        Collections.shuffle(meusGatos); //ALtera dados da lista de forma aleatória
        System.out.println(meusGatos);
        System.out.println("--\tOrdem Natural (Nome)\t---");
        Collections.sort(meusGatos); //Organiza a lista de acordo com o compareTo
        System.out.println("--\tOrdem de Idade\t---");
        Collections.sort(meusGatos,new ComparatorIdade());
        // meusGatos.sort(new ComparatorIdade()); - Outra forma de fazer
        System.out.println(meusGatos);
        System.out.println("--\tOrdem de cor\t---");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);
        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
        Collections.sort(meusGatos,new ComparatorNCI());
        System.out.println(meusGatos);
    }
}
class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome(){
        return nome;
    }
    public Integer getIdade(){
        return idade;
    }
    public String getCor(){
        return cor;
    }
    @Override
    public String toString() {
        return "{" + "nome='" + nome + '\'' + ", idade=" + idade + ", cor='" + cor + '\'' + '}';
    }
    //Criado automaticamente para comparar dados do tipo String retornando int (0 - Nomes iguais; 1 - Deve se colocar o gato como prox; -1 - Gato deve ser antes)
    @Override
    public int compareTo(Gato gato) {
        // TODO Auto-generated method stub
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}
//Criando classe para comparar dados
class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        // TODO Auto-generated method stub
        return Integer.compare(g1.getIdade(),g2.getIdade());
    }
    
}
class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        // TODO Auto-generated method stub
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
    
}
class ComparatorNCI implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
    
}