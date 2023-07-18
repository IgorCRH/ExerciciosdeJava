import java.util.Scanner;
import java.util.TreeSet;
public class ListaContatos {
    public static void main(String[] args) {
        TreeSet<Contato> listaContatos = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        boolean continuarAdicionando = true;

        while (continuarAdicionando) {
            System.out.print("Digite o nome do novo contato (ou digite 'sair' para encerrar): ");
            String novoContatoNome = scanner.nextLine();

            if (novoContatoNome.equalsIgnoreCase("sair")) {
                continuarAdicionando = false;
                break;
            } else {
                Contato novoContato = new Contato(novoContatoNome);
                listaContatos.add(novoContato);
            }
        }

        System.out.println("Lista de contatos: " + listaContatos);

        // Pesquisar um contato
        System.out.print("Digite o nome do contato que deseja pesquisar: ");
        String nomeContatoPesquisa = scanner.nextLine();
        Contato contatoPesquisado = new Contato(nomeContatoPesquisa);

        Contato contatoAntes = listaContatos.lower(contatoPesquisado);
        TreeSet<Contato> contatosDepois = new TreeSet<>(listaContatos.tailSet(contatoPesquisado));

        System.out.println("Contatos antes de " + nomeContatoPesquisa + ": " + contatoAntes);
        System.out.println("Contatos depois de " + nomeContatoPesquisa + ": " + contatosDepois);

        scanner.close();
    }
}
