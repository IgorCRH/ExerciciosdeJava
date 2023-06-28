import java.util.HashSet;
import java.util.Scanner;

public class NomesHashSet {

    public static void main(String[] args) {
        // Criando um HashSet de strings
        HashSet<String> nomes = new HashSet<>();

        Scanner scanner = new Scanner(System.in); // Declara o Scanner de leitura

        // Solicitando ao usuário os valores a serem adicionados
        System.out.print("Digite os nomes a serem adicionados (digite 'fim' para parar): ");
        String nome = scanner.nextLine();

        while (!nome.equalsIgnoreCase("fim")) {
            // Adicionando o nome ao HashSet
            nomes.add(nome);

            // Solicitando o próximo nome
            System.out.print("Digite outro nome (ou 'fim' para parar): ");
            nome = scanner.nextLine();
        }

        // Exibindo os nomes adicionados
        System.out.println("Nomes adicionados:");
        for (String nomeAdicionado : nomes) { // For each que percorre o hash de strings do começo ao final
            System.out.println(nomeAdicionado);
        }

        // Verificando se um nome existe no conjunto
        System.out.print("Digite um nome para verificar se existe no conjunto: ");
        String nomeProcurado = scanner.nextLine();
        if (nomes.contains(nomeProcurado)) {
            System.out.println(nomeProcurado + " existe no conjunto.");
        } else {
            System.out.println(nomeProcurado + " não existe no conjunto.");
        }

        scanner.close();
    }
}
