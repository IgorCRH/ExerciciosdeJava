import java.io.BufferedReader; // Importação para a leitura do .txt, tratamento de exceções, Set e Hash e Scanner
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DDDProgram {
    public static void main(String[] args) {
        Set<String> ddds = new HashSet<>(); // Cria um conjunto para armazenar os DDDs, Estados e Cidades
        Set<String> estados = new HashSet<>();
        Set<String> cidades = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader("dds.txt"))) { // Tenta abrir e ler o arquivo "dds.txt"
            String line; // Cria uma string, e em seguida, lê cada linha do arquivo com o BufferedReader e aloca nela as informações
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(","); // Divide a linha em partes separadas por vírgula
                if (parts.length >= 3) { // Se haver pelo menos três partes separadas
                    String ddd = parts[0].trim(); // Aloca um índice pra cada uma das partes dentro do vetor de strings
                    String cidade = parts[1].trim();
                    String estado = parts[2].trim();

                    ddds.add(ddd); // Adiciona cada uma das partes separadas e alocadas no vetor de strings aos Hashs
                    estados.add(estado);
                    cidades.add(cidade);
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Trata qualquer exceção de entrada e Saída que ocorra
        }

        Scanner scanner = new Scanner(System.in); // Declara o objeto da classe Scanner para leitura

        // Verificando se um DDD existe no arquivo e retornando o Estado e Cidade correspondentes
        System.out.print("Digite o DDD desejado: ");
        String inputDDD = scanner.nextLine(); // Lê o ddd desejado pelo usuário
        if (ddds.contains(inputDDD)) { // Checa se no Hash dos DDs existe o DDD informado por meio de comparação por strings
            for (String line : lerlinhaArquivo("dds.txt")) { // Lê cada linha do arquivo novamente com o uso do método que obtém as linhas do arquivo
                String[] parts = line.split(","); // Separa novamente
                if (parts.length >= 3 && parts[0].trim().equals(inputDDD)) {
                // Verifica se a linha possui pelo menos 3 partes e se o DDD corresponde ao fornecido pelo usuário
                    String cidade = parts[1].trim();
                    String estado = parts[2].trim();
                    System.out.println("DDD " + inputDDD + " pertence a " + cidade + ", " + estado); // Imprime os dados
                    break;
                }
            }
        } else {
            System.out.println("DDD não encontrado");
        }

        // Listar DDDs, Estados ou Cidades
        System.out.println("\nOpções:");
        System.out.println("1 - Listar DDDs");
        System.out.println("2 - Listar Estados");
        System.out.println("3 - Listar Cidades");
        System.out.println("4 - Encerrar o programa");

        int opcao;
        do {
            System.out.print("\nDigite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nLista de DDDs:");
                    for (String ddd : ddds) {
                        System.out.println(ddd);
                    }
                    break;
                case 2:
                    System.out.println("\nLista de Estados:");
                    for (String estado : estados) {
                        System.out.println(estado);
                    }
                    break;
                case 3:
                    System.out.println("\nLista de Cidades:");
                    for (String cidade : cidades) {
                        System.out.println(cidade);
                    }
                    break;
                case 4:
                    System.out.println("\nEncerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }

    // Método para obter todas as linhas do arquivo, para posteriormente ser usado pelo BufferedReader passando o arquivo como argumento
    private static Set<String> lerlinhaArquivo(String filePath) {
        Set<String> linhashash = new HashSet<>(); // Cria um conjunto para armazenar as linhas do arquivo
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) { // BufferedReader para ler o arquivo
            String linha; // Cria a string para em seguida, ler cada linha do arquivo e alocar nela a informação
            while ((linha = br.readLine()) != null) {
                linhashash.add(linha); // Adiciona a linha ao conjunto de linhas
            }
        } catch (IOException e) {
            e.printStackTrace(); // Trata as exceções
        }
        return linhashash; // Retorna o conjunto de linhas do arquivo
    }
}
