import java.util.Scanner;
import java.util.TreeSet;

class Contato implements Comparable<Contato> {
    private String nome;

    public Contato(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Contato outro) {
        return this.nome.compareTo(outro.nome);
    }

    @Override
    public String toString() {
        return nome;
    }
}