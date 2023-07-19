import java.util.Map;
class Musica {
    private String titulo;
    private String artista;
    private int quantidadeEscutada;

    public Musica(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
        this.quantidadeEscutada = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getQuantidadeEscutada() {
        return quantidadeEscutada;
    }

    public void incrementarQuantidadeEscutada() {
        quantidadeEscutada++;
    }

    public void decrementarQuantidadeEscutada() {
        quantidadeEscutada--;
    }
    
        public String getChave() {
        return titulo + " - " + artista;
    }
    
        public int mostrarQuantidadeTotalDeVezesTocada(Map<String, Usuario> usuarios) {
        String chave = this.getChave(); // Se a classe Musica tem um método getChave()
        int quantidadeTotal = 0;

        for (Usuario usuario : usuarios.values()) {
            quantidadeTotal += usuario.getQuantidadeEscutada(chave);
        }

        return quantidadeTotal;
    }
}