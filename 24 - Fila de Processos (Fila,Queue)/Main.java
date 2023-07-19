import java.util.*;
public class Main {
    public static void main(String[] args) {
        Queue<Processo> filaProcessos = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Incluir novo processo");
            System.out.println("2. Retirar processo com maior tempo de espera");
            System.out.println("3. Imprimir conteúdo da lista de processos");
            System.out.println("4. Buscar processo com maior tempo de espera");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do processo: ");
                    int id = scanner.nextInt();
                    System.out.print("Digite o tempo de espera do processo: ");
                    int tempoEspera = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()
                    System.out.print("Digite a descrição do processo: ");
                    String descricao = scanner.nextLine();
                    Processo novoProcesso = new Processo(id, tempoEspera, descricao);
                    filaProcessos.offer(novoProcesso);
                    System.out.println("Processo adicionado à fila.");
                    break;

                case 2:
                    Processo processoRemovido = filaProcessos.remove();
                    System.out.println("Processo removido: ID " + processoRemovido.getId() + ", Tempo de Espera " + processoRemovido.getTempoEspera() + ", Descrição: " + processoRemovido.getDescricao());
                    break;

                case 3:
                    System.out.println("Conteúdo da fila de processos:");
                    for (Processo processo : filaProcessos) {
                        System.out.println("ID: " + processo.getId() + ", Tempo de Espera: " + processo.getTempoEspera() + ", Descrição: " + processo.getDescricao());
                    }
                    break;

                case 4:
                    if (!filaProcessos.isEmpty()) {
                        Processo processoMaiorTempoEspera = filaProcessos.element();
                        for (Processo processo : filaProcessos) {
                            if (processo.getTempoEspera() > processoMaiorTempoEspera.getTempoEspera()) {
                                processoMaiorTempoEspera = processo;
                            }
                        }
                        System.out.println("Processo com maior tempo de espera: ID " + processoMaiorTempoEspera.getId() + ", Tempo de Espera " + processoMaiorTempoEspera.getTempoEspera() + ", Descrição: " + processoMaiorTempoEspera.getDescricao());
                    } else {
                        System.out.println("Fila de processos vazia.");
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println(); // Linha em branco para melhorar a visualização do menu
        } while (opcao != 5);

        scanner.close();
    }
}
