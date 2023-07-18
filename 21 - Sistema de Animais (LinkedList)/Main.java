import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Animal> listaAnimais = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n----- Menu -----");
            System.out.println("1 - Inserir animal");
            System.out.println("2 - Remover animal por índice");
            System.out.println("3 - Quantidade de animais");
            System.out.println("4 - Índice da primeira ocorrência de um animal duplicado por nome");
            System.out.println("5 - Índice da última ocorrência de um animal duplicado por nome");
            System.out.println("6 - Criar sublista de animais");
            System.out.println("7 - Listar animais");
            System.out.println("8 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    inserirAnimal(scanner, listaAnimais);
                    break;
                case 2:
                    removerAnimalPorIndice(scanner, listaAnimais);
                    break;
                case 3:
                    quantidadeAnimais(listaAnimais);
                    break;
                case 4:
                    indicePrimeiraOcorrenciaDuplicado(scanner, listaAnimais);
                    break;
                case 5:
                    indiceUltimaOcorrenciaDuplicado(scanner, listaAnimais);
                    break;
                case 6:
                    criarSublista(scanner, listaAnimais);
                    break;
                case 7:
                    listarAnimais(listaAnimais);
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

    private static void inserirAnimal(Scanner scanner, List<Animal> listaAnimais) {
        System.out.print("Digite o ID do animal: ");
        int id = scanner.nextInt();
        System.out.print("Digite a idade do animal: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        System.out.print("Digite a raça do animal: ");
        String raca = scanner.nextLine();

        Animal animal = new Animal(id, idade, raca);
        listaAnimais.add(animal);

        System.out.println("Animal adicionado com sucesso!");
    }

    private static void removerAnimalPorIndice(Scanner scanner, List<Animal> listaAnimais) {
        System.out.print("Digite o índice do animal que deseja remover: ");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < listaAnimais.size()) {
            listaAnimais.remove(indice);
            System.out.println("Animal removido com sucesso!");
        } else {
            System.out.println("Índice inválido! Tente novamente.");
        }
    }

    private static void quantidadeAnimais(List<Animal> listaAnimais) {
        System.out.println("Quantidade de animais: " + listaAnimais.size());
    }

    private static void indicePrimeiraOcorrenciaDuplicado(Scanner scanner, List<Animal> listaAnimais) {
        System.out.print("Digite o nome do animal para verificar duplicados: ");
        String nome = scanner.next();

        int indice = -1;
        Iterator<Animal> iterator = listaAnimais.iterator();
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            if (animal.getRaca().equalsIgnoreCase(nome)) {
                indice = listaAnimais.indexOf(animal);
                break;
            }
        }

        if (indice != -1) {
            System.out.println("Índice da primeira ocorrência do animal duplicado: " + indice);
        } else {
            System.out.println("Animal não encontrado ou não possui duplicados.");
        }
    }

    private static void indiceUltimaOcorrenciaDuplicado(Scanner scanner, List<Animal> listaAnimais) {
        System.out.print("Digite o nome do animal para verificar duplicados: ");
        String nome = scanner.next();

        int indice = -1;
        Iterator<Animal> iterator = listaAnimais.iterator();
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            if (animal.getRaca().equalsIgnoreCase(nome)) {
                indice = listaAnimais.lastIndexOf(animal);
            }
        }

        if (indice != -1) {
            System.out.println("Índice da última ocorrência do animal duplicado: " + indice);
        } else {
            System.out.println("Animal não encontrado ou não possui duplicados.");
        }
    }

    private static void criarSublista(Scanner scanner, List<Animal> listaAnimais) {
        System.out.print("Digite o índice inicial da sublista: ");
        int indiceInicial = scanner.nextInt();
        System.out.print("Digite o índice final da sublista: ");
        int indiceFinal = scanner.nextInt();

        if (indiceInicial >= 0 && indiceInicial < listaAnimais.size()
                && indiceFinal >= 0 && indiceFinal < listaAnimais.size()
                && indiceInicial <= indiceFinal) {
            List<Animal> subLista = listaAnimais.subList(indiceInicial, indiceFinal + 1);
            System.out.println("Sublista de animais: " + subLista);
        } else {
            System.out.println("Índices inválidos! Tente novamente.");
        }
    }

    private static void listarAnimais(List<Animal> listaAnimais) {
        System.out.println("----- Lista de Animais -----");
        for (Animal animal : listaAnimais) {
            System.out.println(animal);
        }
        System.out.println("---------------------------");
    }
}
