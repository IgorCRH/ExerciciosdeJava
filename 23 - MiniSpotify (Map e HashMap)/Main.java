import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Usuario> usuarios = new HashMap<>();
        Map<String, Musica> musicas = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n----- Menu -----");
            System.out.println("1 - Inserir um usuário no sistema Spotify");
            System.out.println("2 - Inserir uma Música no sistema Spotify");
            System.out.println("3 - Determinar quantas vezes um usuário ouviu uma determinada música");
            System.out.println("4 - Mostrar a lista de músicas que um usuário escutou");
            System.out.println("5 - Mostrar a quantidade de vezes que uma música foi tocada");
            System.out.println("6 - Retorna qual musica está alocada a uma determinada chave");
            System.out.println("7 - Retorna se um usuário está cadastrado no sistema");
            System.out.println("8 - Remove um usuário do sistema");
            System.out.println("9 - Lista os Usuários");
            System.out.println("10 - Lista as Músicas");
            System.out.println("11 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    inserirUsuario(scanner, usuarios);
                    break;
                case 2:
                    inserirMusica(scanner, musicas);
                    break;
                case 3:
                    quantasVezesUsuarioOuviuMusica(scanner, usuarios);
                    break;
                case 4:
                    listarMusicasEscutadasPorUsuario(scanner, usuarios);
                    break;
                case 5:
                    System.out.print("Digite o título da música: ");
                     String titulo = scanner.nextLine();
                    System.out.print("Digite o nome do artista: ");
                     String artista = scanner.nextLine();
                     String chave = titulo + " - " + artista;

                     Musica musica = musicas.get(chave);
                       if (musica != null) {
                        int quantidadeTotal = musica.mostrarQuantidadeTotalDeVezesTocada(usuarios);
                        System.out.println("A música " + titulo + " de " + artista + " foi tocada " + quantidadeTotal + " vezes no total.");
                       } else {
                        System.out.println("Música não encontrada!");
                       }
                    break;
                case 6:
                    retornaMusicaPorChave(scanner, musicas);
                    break;
                case 7:
                    verificaUsuarioCadastrado(scanner, usuarios);
                    break;
                case 8:
                    removerUsuario(scanner, usuarios, musicas);
                    break;
                case 9:
                    listarUsuarios(usuarios);
                    break;
                case 10:
                    listarMusicas(musicas);
                    break;
                case 11:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void inserirUsuario(Scanner scanner, Map<String, Usuario> usuarios) {
        System.out.print("Digite o nome do usuário: ");
        String nome = scanner.nextLine();

        if (!usuarios.containsKey(nome)) {
            Usuario usuario = new Usuario(nome);
            usuarios.put(nome, usuario);
            System.out.println("Usuário " + nome + " adicionado com sucesso!");
        } else {
            System.out.println("Usuário já cadastrado!");
        }
    }

    private static void inserirMusica(Scanner scanner, Map<String, Musica> musicas) {
        System.out.print("Digite o título da música: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite o nome do artista: ");
        String artista = scanner.nextLine();

        String chave = titulo + " - " + artista;

        if (!musicas.containsKey(chave)) {
            Musica musica = new Musica(titulo, artista);
            musicas.put(chave, musica);
            System.out.println("Música " + chave + " adicionada com sucesso!");
        } else {
            System.out.println("Música já cadastrada!");
        }
    }

    private static void quantasVezesUsuarioOuviuMusica(Scanner scanner, Map<String, Usuario> usuarios) {
        System.out.print("Digite o nome do usuário: ");
    String nomeUsuario = scanner.nextLine();
    System.out.print("Digite o título da música: ");
    String titulo = scanner.nextLine();
    System.out.print("Digite o nome do artista: ");
    String artista = scanner.nextLine();
    System.out.print("Digite a quantidade de vezes que escutou a música: ");
    int quantidade = scanner.nextInt();
    scanner.nextLine(); // Limpar o buffer

    Usuario usuario = usuarios.get(nomeUsuario);
    if (usuario != null) {
        String chave = titulo + " - " + artista;
        usuario.escutarMusica(chave, quantidade);
        System.out.println(nomeUsuario + " ouviu a música " + titulo + " de " + artista + " " + quantidade + " vezes.");
    } else {
        System.out.println("Usuário não encontrado!");
    }
    }

        private static void listarMusicasEscutadasPorUsuario(Scanner scanner, Map<String, Usuario> usuarios) {
        System.out.print("Digite o nome do usuário: ");
        String nomeUsuario = scanner.nextLine();

        Usuario usuario = usuarios.get(nomeUsuario);
        if (usuario != null) {
            usuario.listarMusicasEscutadas();
        } else {
            System.out.println("Usuário não encontrado!");
        }
    }

    private static void retornaMusicaPorChave(Scanner scanner, Map<String, Musica> musicas) {
        System.out.print("Digite a chave da música (título da música - nome do artista): ");
        String chave = scanner.nextLine();

        Musica musica = musicas.get(chave);
        if (musica != null) {
            System.out.println("Música encontrada: " + musica.getTitulo() + " de " + musica.getArtista());
        } else {
            System.out.println("Música não encontrada!");
        }
    }

    private static void verificaUsuarioCadastrado(Scanner scanner, Map<String, Usuario> usuarios) {
        System.out.print("Digite o nome do usuário: ");
        String nomeUsuario = scanner.nextLine();

        if (usuarios.containsKey(nomeUsuario)) {
            System.out.println("Usuário " + nomeUsuario + " está cadastrado no sistema.");
        } else {
            System.out.println("Usuário não cadastrado!");
        }
    }

    private static void removerUsuario(Scanner scanner, Map<String, Usuario> usuarios, Map<String, Musica> musicas) {
            System.out.print("Digite o nome do usuário que deseja remover: ");
    String nomeUsuario = scanner.nextLine();

    Usuario usuario = usuarios.get(nomeUsuario);
    if (usuario != null) {
        usuarios.remove(nomeUsuario);
        for (String musica : usuario.getMusicasEscutadas().keySet()) {
            Musica m = musicas.get(musica);
            if (m != null) {
                m.decrementarQuantidadeEscutada();
            }
        }
        System.out.println("Usuário " + nomeUsuario + " removido do sistema.");
    } else {
        System.out.println("Usuário não encontrado!");
    }
    }

    private static void listarUsuarios(Map<String, Usuario> usuarios) {
        System.out.println("\n----- Usuários Cadastrados -----");
        usuarios.keySet().forEach(System.out::println);
        System.out.println("---------------------------");
    }

    private static void listarMusicas(Map<String, Musica> musicas) {
        System.out.println("\n----- Músicas Cadastradas -----");
        musicas.keySet().forEach(System.out::println);
        System.out.println("---------------------------");
    }
}

