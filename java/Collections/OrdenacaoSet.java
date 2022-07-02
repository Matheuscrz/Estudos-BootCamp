
package Collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class OrdenacaoSet {
    public static void main(String[] args) {
        System.out.println("---\tOrdem aleatória\t---");
        Set<Serie> minhasSerie = new HashSet<Serie>(){{
            add(new Serie("Arcane", "Fantasia", 55));
            add(new Serie("The Witcher", "Fantasia", 75));
            add(new Serie("Cavaleiro da Lua", "Ficção Cientifica", 60));
        }};
        for (Serie serie : minhasSerie) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        System.out.println("---\tOrdem de Inserção\t---");
        Set<Serie> minhasSerie1 = new LinkedHashSet<Serie>(){{
            add(new Serie("Arcane", "Fantasia", 55));
            add(new Serie("The Witcher", "Fantasia", 75));
            add(new Serie("Cavaleiro da Lua", "Ficção Cientifica", 60));
        }};
        for (Serie serie : minhasSerie1) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        System.out.println("---\tOrdem Natural (tempo de episodio\t---");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSerie1);
        System.out.println(minhasSeries2);
        System.out.println("---\tOrdem Nome/Gênero/Tempo de episodio\t---");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNGI());
        minhasSeries3.addAll(minhasSerie); //Adicionando elementos no set.
        for (Serie serie : minhasSeries3) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        //Exercício
        //Ordenar por gênero e por tempo de episodio.
    }
}
class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;
    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }
    public String getNome() {
        return nome;
    }
    public String getGenero() {
        return genero;
    }
    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }
    @Override
    public String toString() {
        return "{" + "nome='" + nome + '\'' + ", genero='" + genero + '\'' + ", tempoEpisodio=" + tempoEpisodio + '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null | getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }
    @Override
    public int compareTo(Serie serie) {
        // TODO Auto-generated method stub
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;
        return this.getGenero().compareTo(serie.getGenero());
    }
}
class ComparatorNGI implements Comparator <Serie> {
    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if(nome != 0) return nome;
        int genero = s1.getGenero().compareTo(s2.getGenero());
        if(genero != 0) return genero;
        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}