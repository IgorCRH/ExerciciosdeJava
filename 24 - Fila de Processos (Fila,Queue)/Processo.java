import java.util.*;

class Processo {
    private int id;
    private int tempoEspera;
    private String descricao;

    public Processo(int id, int tempoEspera, String descricao) {
        this.id = id;
        this.tempoEspera = tempoEspera;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }

    public String getDescricao() {
        return descricao;
    }
}