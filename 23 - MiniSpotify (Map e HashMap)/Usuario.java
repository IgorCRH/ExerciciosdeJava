import java.util.HashMap;
import java.util.Map;

class Usuario {
    private String nome;
    private Map<String, Integer> musicasEscutadas;

    public Usuario(String nome) {
        this.nome = nome;
        this.musicasEscutadas = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarMusicaEscutada(String musica) {
        musicasEscutadas.put(musica, musicasEscutadas.getOrDefault(musica, 0) + 1);
    }

    public int getQuantidadeEscutada(String musica) {
        return musicasEscutadas.getOrDefault(musica, 0);
    }
    
    public Map<String, Integer> getMusicasEscutadas() {
        return musicasEscutadas;
    }
    
    public void escutarMusica(String chaveMusica, int quantidade) {
        musicasEscutadas.put(chaveMusica, musicasEscutadas.getOrDefault(chaveMusica, 0) + quantidade);
    }
    
    public void removerMusicaEscutada(String musica) {
        musicasEscutadas.remove(musica);
    }

    public void listarMusicasEscutadas() {
        System.out.println("\n----- Músicas Escutadas por " + nome + " -----");
        for (String musica : musicasEscutadas.keySet()) {
            int quantidade = musicasEscutadas.get(musica);
            System.out.println(musica + " - Quantidade de vezes escutada: " + quantidade);
        }
        System.out.println("---------------------------");
    }
}