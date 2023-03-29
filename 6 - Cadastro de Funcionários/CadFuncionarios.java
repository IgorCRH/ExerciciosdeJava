import java.util.Scanner;
public class CadFuncionarios
{
public static void main (String [] args){
Scanner leitura = new Scanner (System.in); // Objeto da classe Scanner para leitura das variáveis.

String nome, cargo;
int matricula, opc;
double salario;
Funcionarios cadastro = new Funcionarios (); // Cria o objeto da classe Funcionarios que será necessário para exibir as informações.

do {
System.out.println("Entre com o nome do funcionario: ");
nome = leitura.next();
System.out.println("Entre com o cargo do funcionario: ");
cargo = leitura.next();
System.out.println("Entre com o matricula do funcionario: ");
matricula = leitura.nextInt();
System.out.println("Entre com o salário do funcionario: ");
salario = leitura.nextDouble();
System.out.println("Digite 4 para sair do cadastro, caso contrário, continue.");   
opc = leitura.nextInt();

// Resgatando as variaveis da classe Funcionarios e alocando elas para o objeto cadastro da classe Funcionarios, após a leitura dos valores de cada uma.
// O objeto cadastro da classe funcionario vai no método set da variável, e joga o valor lido da variável na classe CadFuncionários para dentro da variavel do método 
// set, e então, o this da variável do método set que é referente a da classe Funcionários (e não a do argumento do método set) será igual a esta variável lida.       
cadastro.setNome(nome);
cadastro.setCargo(cargo);
cadastro.setMatricula(matricula);
cadastro.setSalario(salario);
            
System.out.println("Listagem dos Funcionários:");
cadastro.exibir(); // Exibe as informações dos funcionários, reunidas pelo objeto cadastro.
System.out.println("---------------------------");
} while (opc != 4);   
}    
}
