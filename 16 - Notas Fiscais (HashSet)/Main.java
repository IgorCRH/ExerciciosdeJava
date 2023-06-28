import java.util.HashSet;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        HashSet<NotaFiscal> notasFiscais = new HashSet<>(); // Cria a Hashing que vai armazenar as notas fiscais

        // Adicionando 10.000 notas fiscais com códigos variando de 1 a 10.000
        for (int i = 1; i <= 10000; i++) { // For para iterar
            Date dataEmissao = new Date(); // Uso da data para a nota neste caso é usada a data atual
            double valor = Math.random() * 1000; // Valor aleatório entre 0 e 1000
            NotaFiscal notaFiscal = new NotaFiscal(i, dataEmissao, valor);
            notasFiscais.add(notaFiscal); // Adiciona a nota ao hashing
        }

        // Removendo o elemento com código 5.000 e comparando os tempos de remoção do final e do ínicio
        long tempoInicio = System.nanoTime();
        notasFiscais.removeIf(nota -> nota.getCodigo() == 5000);
        long tempoFinal = System.nanoTime();
        // Calcula
        long tempoDecorrido = tempoFinal - tempoInicio;
        System.out.println("Tempo de remoção: " + tempoDecorrido + " nanosegundos");
    }
}