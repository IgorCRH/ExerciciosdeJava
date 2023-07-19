import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListaTarefas {
    public static void main(String[] args) {
        List<Tarefa> listaTarefas = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n----- Menu -----");
            System.out.println("1 - Inserir tarefa");
            System.out.println("2 - Remover tarefa por índice");
            System.out.println("3 - Quantidade de tarefas");
            System.out.println("4 - Criar sublista de tarefas");
            System.out.println("5 - Marcar tarefa como concluída");
            System.out.println("6 - Marcar tarefa como não concluída");
            System.out.println("7 - Listar tarefas");
            System.out.println("8 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    inserirTarefa(scanner, listaTarefas);
                    break;
                case 2:
                    removerTarefaPorIndice(scanner, listaTarefas);
                    break;
                case 3:
                    quantidadeTarefas(listaTarefas);
                    break;
                case 4:
                    criarSublista(scanner, listaTarefas);
                    break;
                case 5:
                    marcarTarefaConcluida(scanner, listaTarefas);
                    break;
                case 6:
                    marcarTarefaNaoConcluida(scanner, listaTarefas);
                    break;
                case 7:
                    listarTarefas(listaTarefas);
                    break;
                case 8:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void inserirTarefa(Scanner scanner, List<Tarefa> listaTarefas) {
        System.out.print("Digite o ID da tarefa: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        System.out.print("Digite a descrição da tarefa: ");
        String descricao = scanner.nextLine();

        Tarefa tarefa = new Tarefa(id, descricao);
        listaTarefas.add(tarefa);

        System.out.println("Tarefa adicionada com sucesso!");
    }

    private static void removerTarefaPorIndice(Scanner scanner, List<Tarefa> listaTarefas) {
        System.out.print("Digite o índice da tarefa que deseja remover: ");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < listaTarefas.size()) {
            listaTarefas.remove(indice);
            System.out.println("Tarefa removida com sucesso!");
        } else {
            System.out.println("Índice inválido! Tente novamente.");
        }
    }

    private static void quantidadeTarefas(List<Tarefa> listaTarefas) {
        System.out.println("Quantidade de tarefas: " + listaTarefas.size());
    }
    
        private static void criarSublista(Scanner scanner, List<Tarefa> listaTarefas) {
        System.out.print("Digite o índice inicial da sublista: ");
        int indiceInicial = scanner.nextInt();
        System.out.print("Digite o índice final da sublista: ");
        int indiceFinal = scanner.nextInt();

        if (indiceInicial >= 0 && indiceInicial < listaTarefas.size()
                && indiceFinal >= 0 && indiceFinal < listaTarefas.size()
                && indiceInicial <= indiceFinal) {
            List<Tarefa> subLista = listaTarefas.subList(indiceInicial, indiceFinal + 1);
            System.out.println("Sublista de tarefas: " + subLista);
        } else {
            System.out.println("Índices inválidos! Tente novamente.");
        }
    }
    
        private static void marcarTarefaConcluida(Scanner scanner, List<Tarefa> listaTarefas) {
        System.out.print("Digite o índice da tarefa que deseja marcar como concluída: ");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < listaTarefas.size()) {
            Tarefa tarefa = listaTarefas.get(indice);
            tarefa.marcarComoConcluida();
            System.out.println("Tarefa marcada como concluída!");
        } else {
            System.out.println("Índice inválido! Tente novamente.");
        }
    }
    
        private static void marcarTarefaNaoConcluida(Scanner scanner, List<Tarefa> listaTarefas) {
        System.out.print("Digite o índice da tarefa que deseja marcar como não concluída: ");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < listaTarefas.size()) {
            Tarefa tarefa = listaTarefas.get(indice);
            tarefa.marcarComoNaoConcluida();
            System.out.println("Tarefa marcada como não concluída!");
        } else {
            System.out.println("Índice inválido! Tente novamente.");
        }
    }
    
        private static void listarTarefas(List<Tarefa> listaTarefas) {
        System.out.println("----- Lista de Tarefas -----");
        for (Tarefa tarefa : listaTarefas) {
            System.out.println(tarefa);
        }
        System.out.println("---------------------------");
    }
}
