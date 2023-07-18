import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empresa empresa = new Empresa();

        int opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Inserir Funcionário");
            System.out.println("2 - Primeiro funcionário da lista em ordem alfabetica");
            System.out.println("3 - Ultimo funcionário da lista em ordem alfabetica");
            System.out.println("4 - Funcionários com salário maior que o especificado");
            System.out.println("5 - Funcionários com salário menor que o especificado");
            System.out.println("6 - Imprimir Funcionarios");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Funcionário: ");
                    String nome = scanner.nextLine();
                    System.out.print("Salário do Funcionário: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer do teclado
                    System.out.print("Cargo do Funcionário: ");
                    String cargo = scanner.nextLine();

                    Funcionario funcionario = new Funcionario(nome, salario, cargo);
                    empresa.inserirFuncionario(funcionario);
                    break;

                case 2:
                    System.out.println("Primeiro Funcionário:");
                    System.out.println(empresa.funcionarioMaisNovo());
                    break;

                case 3:
                    System.out.println("Ultimo Funcionário:");
                    System.out.println(empresa.funcionarioMaisVelho());
                    break;

                case 4:
                    System.out.print("Digite o valor do salário: ");
                    double salarioMaiorQue = scanner.nextDouble();
                    int qtdFuncionariosSalarioMaior = empresa.funcionariosComSalarioMaiorQue(salarioMaiorQue);
                    System.out.println("Quantidade de funcionários com salário maior que " + salarioMaiorQue + ": " + qtdFuncionariosSalarioMaior);
                    break;

                case 5:
                    System.out.print("Digite o valor do salário: ");
                    double salarioMenorQue = scanner.nextDouble();
                    int qtdFuncionariosSalarioMenor = empresa.funcionariosComSalarioMenorQue(salarioMenorQue);
                    System.out.println("Quantidade de funcionários com salário menor que " + salarioMenorQue + ": " + qtdFuncionariosSalarioMenor);
                    break;
                    
                case 6: // Adicionando a opção para imprimir informações de todos os funcionários
                System.out.println("Informações de todos os funcionários:");
                System.out.println(empresa);
                break;    

                case 0:
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
